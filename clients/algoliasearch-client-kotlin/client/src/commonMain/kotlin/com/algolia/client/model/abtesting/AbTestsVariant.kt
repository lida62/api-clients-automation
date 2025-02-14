/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.abtesting

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * AbTestsVariant
 *
 * @param index A/B test index.
 * @param trafficPercentage A/B test traffic percentage.
 * @param description A/B test description.
 */
@Serializable
public data class AbTestsVariant(

  /** A/B test index. */
  @SerialName(value = "index") val index: String,

  /** A/B test traffic percentage. */
  @SerialName(value = "trafficPercentage") val trafficPercentage: Int,

  /** A/B test description. */
  @SerialName(value = "description") val description: String? = null,
) : AddABTestsVariant
