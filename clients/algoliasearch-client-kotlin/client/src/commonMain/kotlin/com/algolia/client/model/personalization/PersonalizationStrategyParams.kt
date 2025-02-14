/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.personalization

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * PersonalizationStrategyParams
 *
 * @param eventScoring Scores associated with the events.
 * @param facetScoring Scores associated with the facets.
 * @param personalizationImpact The impact that personalization has on search results: a number between 0 (personalization disabled) and 100 (personalization fully enabled).
 */
@Serializable
public data class PersonalizationStrategyParams(

  /** Scores associated with the events. */
  @SerialName(value = "eventScoring") val eventScoring: List<EventScoring>,

  /** Scores associated with the facets. */
  @SerialName(value = "facetScoring") val facetScoring: List<FacetScoring>,

  /** The impact that personalization has on search results: a number between 0 (personalization disabled) and 100 (personalization fully enabled). */
  @SerialName(value = "personalizationImpact") val personalizationImpact: Int,
)
