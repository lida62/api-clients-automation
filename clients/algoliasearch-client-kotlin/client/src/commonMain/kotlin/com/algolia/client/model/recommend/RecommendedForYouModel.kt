/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import kotlinx.serialization.*

/**
 * Recommended for you model.
 */
@Serializable
public enum class RecommendedForYouModel(public val value: kotlin.String) {

  @SerialName(value = "recommended-for-you")
  RecommendedForYou("recommended-for-you");

  override fun toString(): kotlin.String = value
}
