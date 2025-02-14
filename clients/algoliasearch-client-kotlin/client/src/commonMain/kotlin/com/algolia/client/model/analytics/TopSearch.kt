/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.analytics

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * TopSearch
 *
 * @param search User query.
 * @param count Number of tracked _and_ untracked searches (where the `clickAnalytics` parameter isn't `true`).
 * @param nbHits Number of hits the search query matched.
 */
@Serializable
public data class TopSearch(

  /** User query. */
  @SerialName(value = "search") val search: String,

  /** Number of tracked _and_ untracked searches (where the `clickAnalytics` parameter isn't `true`). */
  @SerialName(value = "count") val count: Int,

  /** Number of hits the search query matched. */
  @SerialName(value = "nbHits") val nbHits: Int,
)
