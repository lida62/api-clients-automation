import type { AllLanguage } from './cli/utils.js';
import { createClientName, run } from './common.js';

export async function playground({
  language,
  client,
}: {
  language: AllLanguage;
  client: string;
}): Promise<void> {
  switch (language) {
    case 'javascript':
      await run(`yarn workspace javascript-playground start:${client}`);
      break;
    case 'java':
      await run(
        `./gradle/gradlew -p playground/java -PmainClass=com.algolia.playground.${createClientName(
          client,
          'java'
        )} run`
      );
      break;
    case 'kotlin':
      await run(
        `./gradle/gradlew -p playground/kotlin -PmainClass=com.algolia.playground.${createClientName(
          client,
          'kotlin'
        )}Kt run`
      );
      break;
    case 'php':
      await run(
        `cd clients/algoliasearch-client-php/ && \
       composer install && \
       composer dump-autoload && \
       cd ../../playground/php/src && \
       php ${client}.php`
      );
      break;
    case 'go':
      // eslint-disable-next-line no-console
      console.log(await run(`cd playground/go && /usr/local/go/bin/go run . --client ${client}`));
      break;
    case 'python':
      await run(`poetry install --sync && poetry run ${client}`, { cwd: 'playground/python' });
      break;
    case 'ruby':
      await run(`bundle install && bundle exec ruby ${client}.rb`, { cwd: 'playground/ruby' });
      break;
    case 'scala':
      // run scala playground
      break;
    default:
  }
}
