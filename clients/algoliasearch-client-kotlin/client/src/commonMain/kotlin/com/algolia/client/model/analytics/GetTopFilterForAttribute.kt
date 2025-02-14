/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.analytics

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * GetTopFilterForAttribute
 *
 * @param attribute Attribute name.
 * @param `operator` Operator.
 * @param `value` Attribute value.
 * @param count Number of occurrences.
 */
@Serializable
public data class GetTopFilterForAttribute(

  /** Attribute name. */
  @SerialName(value = "attribute") val attribute: String,

  /** Operator. */
  @SerialName(value = "operator") val `operator`: String,

  /** Attribute value. */
  @SerialName(value = "value") val `value`: String,

  /** Number of occurrences. */
  @SerialName(value = "count") val count: Int,
)
