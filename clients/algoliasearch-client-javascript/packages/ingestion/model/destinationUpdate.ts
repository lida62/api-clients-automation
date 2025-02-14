// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import type { DestinationInput } from './destinationInput';
import type { DestinationType } from './destinationType';

/**
 * Payload to partially update a Destination.
 */
export type DestinationUpdate = {
  type?: DestinationType;

  /**
   * An human readable name describing the object.
   */
  name?: string;

  input?: DestinationInput;

  authenticationID?: string;
};
