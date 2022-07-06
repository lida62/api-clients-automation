import fsp from 'fs/promises';

import dotenv from 'dotenv';
import semver from 'semver';

import clientsConfig from '../../config/clients.config.json';
import openapiConfig from '../../config/openapitools.json';
import {
  ROOT_ENV_PATH,
  toAbsolutePath,
  run,
  exists,
  GENERATORS,
  LANGUAGES,
  CI,
} from '../common';
import {
  getClientsConfigField,
  getGitHubUrl,
  getLanguageFolder,
} from '../config';
import type { Language } from '../types';

import { writeJsonFile } from './common';
import type { Changelog, Versions, VersionsToRelease } from './types';

dotenv.config({ path: ROOT_ENV_PATH });

/**
 * Bump each client version of the JavaScript client in workspace places and config files.
 *
 * We don't use the pre-computed `next` version for JavaScript, because the packages have independent versioning.
 */
async function updateVersionForJavascript(
  jsVersion: NonNullable<VersionsToRelease['javascript']>
): Promise<void> {
  // Sets the new version of the utils package
  const utilsPackageVersion = getClientsConfigField(
    'javascript',
    'utilsPackageVersion'
  );
  const nextUtilsPackageVersion = semver.inc(
    utilsPackageVersion,
    jsVersion.releaseType
  );

  if (!nextUtilsPackageVersion) {
    throw new Error(
      `Failed to bump version ${utilsPackageVersion} by ${jsVersion.releaseType}.`
    );
  }

  clientsConfig.javascript.utilsPackageVersion = nextUtilsPackageVersion;

  // Sets the new version of the JavaScript client
  Object.values(GENERATORS)
    .filter((gen) => gen.language === 'javascript')
    .forEach((gen) => {
      const { additionalProperties } = gen;
      const newVersion = semver.inc(
        additionalProperties.packageVersion,
        jsVersion.releaseType
      );
      const packageName = `${clientsConfig.javascript.npmNamespace}/${additionalProperties.packageName}`;

      if (!newVersion) {
        throw new Error(
          `Failed to bump '${packageName}' by '${jsVersion.releaseType}'.`
        );
      }

      additionalProperties.packageVersion = newVersion;
      // We don't want this field to be in the final file, it only exists in the scripts.
      additionalProperties.packageName = undefined;
    });

  // update `openapitools.json` config file
  await writeJsonFile(
    toAbsolutePath('config/openapitools.json'),
    openapiConfig
  );

  // update `clients.config.json` file for the utils version
  await writeJsonFile(
    toAbsolutePath('config/clients.config.json'),
    clientsConfig
  );
}

async function updateConfigFiles(
  versionsToRelease: VersionsToRelease
): Promise<void> {
  if (versionsToRelease.javascript) {
    await updateVersionForJavascript(versionsToRelease.javascript);
  }

  // update the other versions in clients.config.json
  LANGUAGES.forEach((lang) => {
    if (lang === 'javascript' || !versionsToRelease[lang]) {
      return;
    }

    clientsConfig[lang].packageVersion = versionsToRelease[lang]!.next;
  });

  await writeJsonFile(
    toAbsolutePath('config/clients.config.json'),
    clientsConfig
  );
}

async function updateChangelog(
  lang: Language,
  changelog: string,
  current: string,
  next: string
): Promise<void> {
  let content = '';
  const changelogPath = toAbsolutePath(
    `${getLanguageFolder(lang)}/CHANGELOG.md`
  );
  const changelogHeader = `## [${next}](${getGitHubUrl(
    lang
  )}/compare/${current}...${next})`;

  if (await exists(changelogPath)) {
    content = (await fsp.readFile(changelogPath)).toString();
  }

  await fsp.writeFile(
    changelogPath,
    [changelogHeader, changelog, content].join('\n\n')
  );
}

export function getVersionsToRelease(versions: Versions): VersionsToRelease {
  const versionsToRelease: VersionsToRelease = {};

  Object.entries(versions).forEach(
    ([lang, { noCommit, current, skipRelease, releaseType, next }]) => {
      if (noCommit || skipRelease || !current || !next) {
        return;
      }

      if (
        !releaseType ||
        !['major', 'minor', 'patch', 'prerelease'].includes(releaseType)
      ) {
        throw new Error(
          `\`${releaseType}\` is unknown release type. Allowed: major, minor, patch, prerelease`
        );
      }

      versionsToRelease[lang] = {
        current,
        releaseType,
        next,
      };
    }
  );

  return versionsToRelease;
}

/**
 * Updates the changelogs and the config files containing versions of the API clients.
 *
 * @param versions - A summary of the version changes, with their new version and release type.
 * @param changelog - The changelog of all the languages, which is generated by `createReleasePR`.
 */
export async function updateAPIVersions(
  versions: Versions,
  changelog: Changelog
): Promise<void> {
  const versionsToRelease = getVersionsToRelease(versions);

  await updateConfigFiles(versionsToRelease);

  for (const [lang, { current, releaseType, next }] of Object.entries(
    versionsToRelease
  )) {
    /*
      About bumping versions of JS clients:
      
      There are generated clients in JS repo, and non-generated clients like `client-common`, `requester-*`
      Now that the versions of generated clients are updated in `openapitools.json`,
      the generation output will have correct new versions.
      
      However, we need to manually update versions of the non-generated (a.k.a. manually written) clients.
      In order to do that, we run `yarn release:bump <releaseType>` in this monorepo first.
      It will update the versions of the non-generated clients which exists in this monorepo.
      After that, we generate clients with new versions. And then, we copy all of them over to JS repository.
      */
    if (lang === 'javascript') {
      const cwd = getLanguageFolder(lang);

      if (CI) {
        await run('yarn install', { verbose: true, cwd });
      }

      await run(`yarn release:bump ${releaseType}`, {
        verbose: CI,
        cwd,
      });
    }

    await updateChangelog(lang as Language, changelog[lang], current, next);
  }
}
