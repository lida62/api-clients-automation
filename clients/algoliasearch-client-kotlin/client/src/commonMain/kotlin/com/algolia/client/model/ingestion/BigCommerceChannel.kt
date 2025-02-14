/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * BigCommerceChannel
 *
 * @param id The ID of the bigcommerce channel.
 * @param currencies An array of currencies for the given channel `ID`, a currency is a trigram string that represents the currency code.
 */
@Serializable
public data class BigCommerceChannel(

  /** The ID of the bigcommerce channel. */
  @SerialName(value = "id") val id: Int,

  /** An array of currencies for the given channel `ID`, a currency is a trigram string that represents the currency code. */
  @SerialName(value = "currencies") val currencies: List<String>? = null,
)
