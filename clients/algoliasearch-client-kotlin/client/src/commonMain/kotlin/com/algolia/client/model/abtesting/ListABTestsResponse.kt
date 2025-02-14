/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.abtesting

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * ListABTestsResponse
 *
 * @param abtests A/B tests.
 * @param count Number of A/B tests implemented.
 * @param total Number of retrievable A/B tests.
 */
@Serializable
public data class ListABTestsResponse(

  /** A/B tests. */
  @SerialName(value = "abtests") val abtests: List<ABTest>,

  /** Number of A/B tests implemented. */
  @SerialName(value = "count") val count: Int,

  /** Number of retrievable A/B tests. */
  @SerialName(value = "total") val total: Int,
)
