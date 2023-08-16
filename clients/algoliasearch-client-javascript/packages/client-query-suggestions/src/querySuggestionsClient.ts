// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import {
  createAuth,
  createTransporter,
  getAlgoliaAgent,
} from '@algolia/client-common';
import type {
  CreateClientOptions,
  Headers,
  Host,
  Request,
  RequestOptions,
  QueryParameters,
} from '@algolia/client-common';

import type { BaseResponse } from '../model/baseResponse';
import type {
  DelProps,
  DeleteConfigProps,
  GetProps,
  GetConfigProps,
  GetConfigStatusProps,
  GetLogFileProps,
  PostProps,
  PutProps,
  UpdateConfigProps,
} from '../model/clientMethodProps';
import type { GetConfigStatus200Response } from '../model/getConfigStatus200Response';
import type { GetLogFile200Response } from '../model/getLogFile200Response';
import type { QuerySuggestionsConfigurationResponse } from '../model/querySuggestionsConfigurationResponse';
import type { QuerySuggestionsConfigurationWithIndex } from '../model/querySuggestionsConfigurationWithIndex';

export const apiClientVersion = '5.0.0-alpha.78';

export const REGIONS = ['eu', 'us'] as const;
export type Region = (typeof REGIONS)[number];

function getDefaultHosts(region: Region): Host[] {
  const url = 'query-suggestions.{region}.algolia.com'.replace(
    '{region}',
    region
  );

  return [{ url, accept: 'readWrite', protocol: 'https' }];
}

// eslint-disable-next-line @typescript-eslint/explicit-function-return-type
export function createQuerySuggestionsClient({
  appId: appIdOption,
  apiKey: apiKeyOption,
  authMode,
  algoliaAgents,
  region: regionOption,
  ...options
}: CreateClientOptions & { region: Region }) {
  const auth = createAuth(appIdOption, apiKeyOption, authMode);
  const transporter = createTransporter({
    hosts: getDefaultHosts(regionOption),
    ...options,
    algoliaAgent: getAlgoliaAgent({
      algoliaAgents,
      client: 'QuerySuggestions',
      version: apiClientVersion,
    }),
    baseHeaders: {
      'content-type': 'text/plain',
      ...auth.headers(),
      ...options.baseHeaders,
    },
    baseQueryParameters: {
      ...auth.queryParameters(),
      ...options.baseQueryParameters,
    },
  });

  return {
    transporter,

    /**
     * The `appId` currently in use.
     */
    appId: appIdOption,

    /**
     * Clears the cache of the transporter for the `requestsCache` and `responsesCache` properties.
     */
    clearCache(): Promise<void> {
      return Promise.all([
        transporter.requestsCache.clear(),
        transporter.responsesCache.clear(),
      ]).then(() => undefined);
    },

    /**
     * Get the value of the `algoliaAgent`, used by our libraries internally and telemetry system.
     */
    get _ua(): string {
      return transporter.algoliaAgent.value;
    },

    /**
     * Adds a `segment` to the `x-algolia-agent` sent with every requests.
     *
     * @param segment - The algolia agent (user-agent) segment to add.
     * @param version - The version of the agent.
     */
    addAlgoliaAgent(segment: string, version?: string): void {
      transporter.algoliaAgent.add({ segment, version });
    },

    /**
     * Create a new Query Suggestions configuration.  You can have up to 100 configurations per Algolia application.
     *
     * @summary Create a configuration.
     * @param querySuggestionsConfigurationWithIndex - The querySuggestionsConfigurationWithIndex object.
     * @param requestOptions - The requestOptions to send along with the query, they will be merged with the transporter requestOptions.
     */
    createConfig(
      querySuggestionsConfigurationWithIndex: QuerySuggestionsConfigurationWithIndex,
      requestOptions?: RequestOptions
    ): Promise<BaseResponse> {
      if (!querySuggestionsConfigurationWithIndex) {
        throw new Error(
          'Parameter `querySuggestionsConfigurationWithIndex` is required when calling `createConfig`.'
        );
      }

      const requestPath = '/1/configs';
      const headers: Headers = {};
      const queryParameters: QueryParameters = {};

      const request: Request = {
        method: 'POST',
        path: requestPath,
        queryParameters,
        headers,
        data: querySuggestionsConfigurationWithIndex,
      };

      return transporter.request(request, requestOptions);
    },

    /**
     * This method allow you to send requests to the Algolia REST API.
     *
     * @summary Send requests to the Algolia REST API.
     * @param del - The del object.
     * @param del.path - Path of the endpoint, anything after \"/1\" must be specified.
     * @param del.parameters - Query parameters to apply to the current query.
     * @param requestOptions - The requestOptions to send along with the query, they will be merged with the transporter requestOptions.
     */
    del(
      { path, parameters }: DelProps,
      requestOptions?: RequestOptions
    ): Promise<Record<string, any>> {
      if (!path) {
        throw new Error('Parameter `path` is required when calling `del`.');
      }

      const requestPath = '/1{path}'.replace('{path}', path);
      const headers: Headers = {};
      const queryParameters: QueryParameters = parameters ? parameters : {};

      const request: Request = {
        method: 'DELETE',
        path: requestPath,
        queryParameters,
        headers,
      };

      return transporter.request(request, requestOptions);
    },

    /**
     * Delete a Query Suggestions configuration.  Deleting only removes the configuration and stops updates to the Query Suggestions index. The Query Suggestions index itself is not deleted.
     *
     * @summary Delete a configuration.
     * @param deleteConfig - The deleteConfig object.
     * @param deleteConfig.indexName - Query Suggestions index name.
     * @param requestOptions - The requestOptions to send along with the query, they will be merged with the transporter requestOptions.
     */
    deleteConfig(
      { indexName }: DeleteConfigProps,
      requestOptions?: RequestOptions
    ): Promise<BaseResponse> {
      if (!indexName) {
        throw new Error(
          'Parameter `indexName` is required when calling `deleteConfig`.'
        );
      }

      const requestPath = '/1/configs/{indexName}'.replace(
        '{indexName}',
        encodeURIComponent(indexName)
      );
      const headers: Headers = {};
      const queryParameters: QueryParameters = {};

      const request: Request = {
        method: 'DELETE',
        path: requestPath,
        queryParameters,
        headers,
      };

      return transporter.request(request, requestOptions);
    },

    /**
     * This method allow you to send requests to the Algolia REST API.
     *
     * @summary Send requests to the Algolia REST API.
     * @param get - The get object.
     * @param get.path - Path of the endpoint, anything after \"/1\" must be specified.
     * @param get.parameters - Query parameters to apply to the current query.
     * @param requestOptions - The requestOptions to send along with the query, they will be merged with the transporter requestOptions.
     */
    get(
      { path, parameters }: GetProps,
      requestOptions?: RequestOptions
    ): Promise<Record<string, any>> {
      if (!path) {
        throw new Error('Parameter `path` is required when calling `get`.');
      }

      const requestPath = '/1{path}'.replace('{path}', path);
      const headers: Headers = {};
      const queryParameters: QueryParameters = parameters ? parameters : {};

      const request: Request = {
        method: 'GET',
        path: requestPath,
        queryParameters,
        headers,
      };

      return transporter.request(request, requestOptions);
    },

    /**
     * List all Query Suggestions configurations of your Algolia application.
     *
     * @summary List configurations.
     * @param requestOptions - The requestOptions to send along with the query, they will be merged with the transporter requestOptions.
     */
    getAllConfigs(
      requestOptions?: RequestOptions
    ): Promise<QuerySuggestionsConfigurationResponse[]> {
      const requestPath = '/1/configs';
      const headers: Headers = {};
      const queryParameters: QueryParameters = {};

      const request: Request = {
        method: 'GET',
        path: requestPath,
        queryParameters,
        headers,
      };

      return transporter.request(request, requestOptions);
    },

    /**
     * Get a single Query Suggestions configuration.
     *
     * @summary Get a configuration.
     * @param getConfig - The getConfig object.
     * @param getConfig.indexName - Query Suggestions index name.
     * @param requestOptions - The requestOptions to send along with the query, they will be merged with the transporter requestOptions.
     */
    getConfig(
      { indexName }: GetConfigProps,
      requestOptions?: RequestOptions
    ): Promise<QuerySuggestionsConfigurationResponse> {
      if (!indexName) {
        throw new Error(
          'Parameter `indexName` is required when calling `getConfig`.'
        );
      }

      const requestPath = '/1/configs/{indexName}'.replace(
        '{indexName}',
        encodeURIComponent(indexName)
      );
      const headers: Headers = {};
      const queryParameters: QueryParameters = {};

      const request: Request = {
        method: 'GET',
        path: requestPath,
        queryParameters,
        headers,
      };

      return transporter.request(request, requestOptions);
    },

    /**
     * Report the status of a Query Suggestions index.
     *
     * @summary Get configuration status.
     * @param getConfigStatus - The getConfigStatus object.
     * @param getConfigStatus.indexName - Query Suggestions index name.
     * @param requestOptions - The requestOptions to send along with the query, they will be merged with the transporter requestOptions.
     */
    getConfigStatus(
      { indexName }: GetConfigStatusProps,
      requestOptions?: RequestOptions
    ): Promise<GetConfigStatus200Response> {
      if (!indexName) {
        throw new Error(
          'Parameter `indexName` is required when calling `getConfigStatus`.'
        );
      }

      const requestPath = '/1/configs/{indexName}/status'.replace(
        '{indexName}',
        encodeURIComponent(indexName)
      );
      const headers: Headers = {};
      const queryParameters: QueryParameters = {};

      const request: Request = {
        method: 'GET',
        path: requestPath,
        queryParameters,
        headers,
      };

      return transporter.request(request, requestOptions);
    },

    /**
     * Get the logs for a single Query Suggestions index.
     *
     * @summary Get logs.
     * @param getLogFile - The getLogFile object.
     * @param getLogFile.indexName - Query Suggestions index name.
     * @param requestOptions - The requestOptions to send along with the query, they will be merged with the transporter requestOptions.
     */
    getLogFile(
      { indexName }: GetLogFileProps,
      requestOptions?: RequestOptions
    ): Promise<GetLogFile200Response> {
      if (!indexName) {
        throw new Error(
          'Parameter `indexName` is required when calling `getLogFile`.'
        );
      }

      const requestPath = '/1/logs/{indexName}'.replace(
        '{indexName}',
        encodeURIComponent(indexName)
      );
      const headers: Headers = {};
      const queryParameters: QueryParameters = {};

      const request: Request = {
        method: 'GET',
        path: requestPath,
        queryParameters,
        headers,
      };

      return transporter.request(request, requestOptions);
    },

    /**
     * This method allow you to send requests to the Algolia REST API.
     *
     * @summary Send requests to the Algolia REST API.
     * @param post - The post object.
     * @param post.path - Path of the endpoint, anything after \"/1\" must be specified.
     * @param post.parameters - Query parameters to apply to the current query.
     * @param post.body - Parameters to send with the custom request.
     * @param requestOptions - The requestOptions to send along with the query, they will be merged with the transporter requestOptions.
     */
    post(
      { path, parameters, body }: PostProps,
      requestOptions?: RequestOptions
    ): Promise<Record<string, any>> {
      if (!path) {
        throw new Error('Parameter `path` is required when calling `post`.');
      }

      const requestPath = '/1{path}'.replace('{path}', path);
      const headers: Headers = {};
      const queryParameters: QueryParameters = parameters ? parameters : {};

      const request: Request = {
        method: 'POST',
        path: requestPath,
        queryParameters,
        headers,
        data: body ? body : {},
      };

      return transporter.request(request, requestOptions);
    },

    /**
     * This method allow you to send requests to the Algolia REST API.
     *
     * @summary Send requests to the Algolia REST API.
     * @param put - The put object.
     * @param put.path - Path of the endpoint, anything after \"/1\" must be specified.
     * @param put.parameters - Query parameters to apply to the current query.
     * @param put.body - Parameters to send with the custom request.
     * @param requestOptions - The requestOptions to send along with the query, they will be merged with the transporter requestOptions.
     */
    put(
      { path, parameters, body }: PutProps,
      requestOptions?: RequestOptions
    ): Promise<Record<string, any>> {
      if (!path) {
        throw new Error('Parameter `path` is required when calling `put`.');
      }

      const requestPath = '/1{path}'.replace('{path}', path);
      const headers: Headers = {};
      const queryParameters: QueryParameters = parameters ? parameters : {};

      const request: Request = {
        method: 'PUT',
        path: requestPath,
        queryParameters,
        headers,
        data: body ? body : {},
      };

      return transporter.request(request, requestOptions);
    },

    /**
     * Update a QuerySuggestions configuration.
     *
     * @summary Update a configuration.
     * @param updateConfig - The updateConfig object.
     * @param updateConfig.indexName - Query Suggestions index name.
     * @param updateConfig.querySuggestionsConfiguration - The querySuggestionsConfiguration object.
     * @param requestOptions - The requestOptions to send along with the query, they will be merged with the transporter requestOptions.
     */
    updateConfig(
      { indexName, querySuggestionsConfiguration }: UpdateConfigProps,
      requestOptions?: RequestOptions
    ): Promise<BaseResponse> {
      if (!indexName) {
        throw new Error(
          'Parameter `indexName` is required when calling `updateConfig`.'
        );
      }

      if (!querySuggestionsConfiguration) {
        throw new Error(
          'Parameter `querySuggestionsConfiguration` is required when calling `updateConfig`.'
        );
      }

      if (!querySuggestionsConfiguration.sourceIndices) {
        throw new Error(
          'Parameter `querySuggestionsConfiguration.sourceIndices` is required when calling `updateConfig`.'
        );
      }

      const requestPath = '/1/configs/{indexName}'.replace(
        '{indexName}',
        encodeURIComponent(indexName)
      );
      const headers: Headers = {};
      const queryParameters: QueryParameters = {};

      const request: Request = {
        method: 'PUT',
        path: requestPath,
        queryParameters,
        headers,
        data: querySuggestionsConfiguration,
      };

      return transporter.request(request, requestOptions);
    },
  };
}

/**
 * The client type.
 */
export type QuerySuggestionsClient = ReturnType<
  typeof createQuerySuggestionsClient
>;
