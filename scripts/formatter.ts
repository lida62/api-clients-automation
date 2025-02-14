import { run, runComposerInstall } from './common.js';
import { createSpinner } from './spinners.js';

export async function formatter(language: string, folder: string): Promise<void> {
  const spinner = createSpinner(`running formatter for '${language}' in '${folder}'`);
  let cmd = '';
  switch (language) {
    case 'javascript':
      cmd = `yarn eslint --ext=ts,json ${folder} --fix --no-error-on-unmatched-pattern`;
      break;
    case 'java':
      cmd = `find ${folder} -type f -name "*.java" | xargs java --add-exports jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED \
        --add-exports jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED \
        --add-exports jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED \
        --add-exports jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED \
        --add-exports jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED \
        -jar /tmp/java-formatter.jar -r \
        && yarn prettier --no-error-on-unmatched-pattern --write ${folder}/**/*.java`;
      break;
    case 'php':
      await runComposerInstall();
      cmd = `PHP_CS_FIXER_IGNORE_ENV=1 php clients/algoliasearch-client-php/vendor/bin/php-cs-fixer fix ${folder} --rules=@PhpCsFixer --using-cache=no --allow-risky=yes`;
      break;
    case 'go':
      cmd = `cd ${folder} && goimports -w . && golangci-lint run --fix`;
      break;
    case 'kotlin':
      cmd = `./gradle/gradlew -p ${folder} spotlessApply`;
      break;
    case 'csharp':
      cmd = `cd ${folder} && dotnet format`;
      break;
    case 'dart':
      if (folder.includes('tests')) {
        cmd = `(cd ${folder} && dart pub get && dart fix --apply && dart format .)`;
      } else {
        cmd = `(cd ${folder} && dart pub get && melos bs && melos build --no-select && melos lint)`;
      }
      break;
    case 'python':
      cmd = `(cd ${folder} && poetry lock --no-update && poetry install --sync && pip freeze > requirements.txt && poetry run autopep8 -r --in-place --aggressive . && poetry run autoflake -r --remove-unused-variables --remove-all-unused-imports --in-place . && poetry run isort . && poetry run black . && poetry run flake8 --ignore=E501,W503 .)`;
      break;
    case 'ruby':
      cmd = `cd ${folder} && bundle install && bundle exec rubocop -a --fail-level W`;
      break;
    case 'scala':
      cmd = `(cd ${folder} && sbt -Dsbt.server.forcestart=true scalafmtAll scalafmtSbt)`;
      break;
    default:
      spinner.warn(`no formatter for '${language}'`);
      return;
  }
  await run(cmd);
  spinner.succeed();
}
