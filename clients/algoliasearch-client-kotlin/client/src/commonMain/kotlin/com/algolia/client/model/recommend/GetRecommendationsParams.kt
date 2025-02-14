/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * Recommend parameters.
 *
 * @param requests Request parameters depend on the model (recommendations or trending).
 */
@Serializable
public data class GetRecommendationsParams(

  /** Request parameters depend on the model (recommendations or trending). */
  @SerialName(value = "requests") val requests: List<RecommendationsRequest>,
)
