/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import kotlinx.serialization.*

@Serializable
public enum class MethodType(public val value: kotlin.String) {

  @SerialName(value = "GET")
  GET("GET"),

  @SerialName(value = "POST")
  POST("POST");

  override fun toString(): kotlin.String = value
}
