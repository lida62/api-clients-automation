/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.insights

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * ConvertedFilters
 *
 * @param eventName Can contain up to 64 ASCII characters.   Consider naming events consistently—for example, by adopting Segment's [object-action](https://segment.com/academy/collecting-data/naming-conventions-for-clean-data/#the-object-action-framework) framework.
 * @param eventType
 * @param index Name of the Algolia index.
 * @param filters Facet filters.  Each facet filter string must be URL-encoded, such as, `discount:10%25`.
 * @param userToken Anonymous or pseudonymous user identifier.   > **Note**: Never include personally identifiable information in user tokens.
 * @param timestamp Time of the event in milliseconds in [Unix epoch time](https://wikipedia.org/wiki/Unix_time). By default, the Insights API uses the time it receives an event as its timestamp.
 * @param authenticatedUserToken User token for authenticated users.
 */
@Serializable
public data class ConvertedFilters(

  /** Can contain up to 64 ASCII characters.   Consider naming events consistently—for example, by adopting Segment's [object-action](https://segment.com/academy/collecting-data/naming-conventions-for-clean-data/#the-object-action-framework) framework.  */
  @SerialName(value = "eventName") val eventName: String,

  @SerialName(value = "eventType") val eventType: ConversionEvent,

  /** Name of the Algolia index. */
  @SerialName(value = "index") val index: String,

  /** Facet filters.  Each facet filter string must be URL-encoded, such as, `discount:10%25`.  */
  @SerialName(value = "filters") val filters: List<String>,

  /** Anonymous or pseudonymous user identifier.   > **Note**: Never include personally identifiable information in user tokens.  */
  @SerialName(value = "userToken") val userToken: String,

  /** Time of the event in milliseconds in [Unix epoch time](https://wikipedia.org/wiki/Unix_time). By default, the Insights API uses the time it receives an event as its timestamp.  */
  @SerialName(value = "timestamp") val timestamp: Long? = null,

  /** User token for authenticated users. */
  @SerialName(value = "authenticatedUserToken") val authenticatedUserToken: String? = null,
) : EventsItems
