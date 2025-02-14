// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import type { ClickEvent } from './clickEvent';

/**
 * Use this event to track when users click items unrelated to a previous Algolia request. For example, if you don\'t use Algolia to build your category pages, use this event.  To track click events related to Algolia requests, use the \"Clicked object IDs after search\" event.
 */
export type ClickedObjectIDs = {
  /**
   * Can contain up to 64 ASCII characters.   Consider naming events consistently—for example, by adopting Segment\'s [object-action](https://segment.com/academy/collecting-data/naming-conventions-for-clean-data/#the-object-action-framework) framework.
   */
  eventName: string;

  eventType: ClickEvent;

  /**
   * Name of the Algolia index.
   */
  index: string;

  /**
   * List of object identifiers for items of an Algolia index.
   */
  objectIDs: string[];

  /**
   * Anonymous or pseudonymous user identifier.   > **Note**: Never include personally identifiable information in user tokens.
   */
  userToken: string;

  /**
   * Time of the event in milliseconds in [Unix epoch time](https://wikipedia.org/wiki/Unix_time). By default, the Insights API uses the time it receives an event as its timestamp.
   */
  timestamp?: number;
};
