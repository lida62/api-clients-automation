import { DOCKER, run, runComposerInstall } from '../common.js';
import { createSpinner } from '../spinners.js';

async function runCtsOne(language: string): Promise<void> {
  const spinner = createSpinner(`running cts for '${language}'`);
  switch (language) {
    case 'javascript':
      await run('YARN_ENABLE_IMMUTABLE_INSTALLS=false yarn install && yarn test', {
        cwd: 'tests/output/javascript',
      });
      break;
    case 'java':
      await run('./gradle/gradlew --no-daemon -p tests/output/java test');
      break;
    case 'php': {
      await runComposerInstall();
      await run(`php ./clients/algoliasearch-client-php/vendor/bin/phpunit tests/output/php`);
      break;
    }
    case 'kotlin':
      await run('./gradle/gradlew --no-daemon -p tests/output/kotlin allTests');
      break;
    case 'go':
      if (DOCKER) {
        await run('/usr/local/go/bin/go test -count 1 ./...', {
          cwd: 'tests/output/go',
        });
      } else {
        await run('go test -count 1 ./...', {
          cwd: 'tests/output/go',
        });
      }
      break;
    case 'dart':
      await run('(cd tests/output/dart && dart test)');
      break;
    case 'python':
      await run('poetry lock --no-update && poetry install --sync && poetry run pytest -vv', {
        cwd: 'tests/output/python',
      });
      break;
    case 'ruby':
      await run(`bundle install && bundle exec rake test`, { cwd: 'tests/output/ruby' });
      break;
    case 'scala':
      await run('sbt test', { cwd: 'tests/output/scala' });
      break;
    default:
      spinner.warn(`skipping unknown language '${language}' to run the CTS`);
      return;
  }
  spinner.succeed();
}

export async function runCts(languages: string[]): Promise<void> {
  for (const lang of languages) {
    await runCtsOne(lang);
  }
}
