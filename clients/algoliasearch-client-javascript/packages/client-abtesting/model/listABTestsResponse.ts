// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import type { ABTest } from './aBTest';

export type ListABTestsResponse = {
  /**
   * A/B tests.
   */
  abtests: ABTest[];

  /**
   * Number of A/B tests implemented.
   */
  count: number;

  /**
   * Number of retrievable A/B tests.
   */
  total: number;
};
