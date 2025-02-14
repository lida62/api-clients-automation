/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * Automatic facet Filter.
 *
 * @param facet Attribute to filter on. This must match a facet placeholder in the Rule's pattern.
 * @param score Score for the filter. Typically used for optional or disjunctive filters.
 * @param disjunctive Whether the filter is disjunctive (true) or conjunctive (false).
 */
@Serializable
public data class AutomaticFacetFilter(

  /** Attribute to filter on. This must match a facet placeholder in the Rule's pattern. */
  @SerialName(value = "facet") val facet: String,

  /** Score for the filter. Typically used for optional or disjunctive filters. */
  @SerialName(value = "score") val score: Int? = null,

  /** Whether the filter is disjunctive (true) or conjunctive (false). */
  @SerialName(value = "disjunctive") val disjunctive: Boolean? = null,
)
