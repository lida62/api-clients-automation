/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import kotlinx.serialization.*

/**
 * Trending items model.
 */
@Serializable
public enum class TrendingItemsModel(public val value: kotlin.String) {

  @SerialName(value = "trending-items")
  TrendingItems("trending-items");

  override fun toString(): kotlin.String = value
}
