/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * Snippeted attributes show parts of the matched attributes. Only returned when attributesToSnippet is non-empty.
 *
 * @param `value` Markup text with `facetQuery` matches highlighted.
 * @param matchLevel
 */
@Serializable
public data class SnippetResultOption(

  /** Markup text with `facetQuery` matches highlighted. */
  @SerialName(value = "value") val `value`: String,

  @SerialName(value = "matchLevel") val matchLevel: MatchLevel,
) : SnippetResult
