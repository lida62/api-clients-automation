/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * SourceCSV
 *
 * @param url The URL of the file.
 * @param uniqueIDColumn The name of the column that contains the unique ID, used as `objectID` in Algolia.
 * @param mapping Mapping of type for every column. For example {\"myColumn\": \"boolean\", \"myOtherColumn\": \"json\"}.
 * @param method
 * @param delimiter The character used to split the value on each line, default to a comma (\\r, \\n, 0xFFFD, and space are forbidden).
 */
@Serializable
public data class SourceCSV(

  /** The URL of the file. */
  @SerialName(value = "url") val url: String,

  /** The name of the column that contains the unique ID, used as `objectID` in Algolia. */
  @SerialName(value = "uniqueIDColumn") val uniqueIDColumn: String? = null,

  /** Mapping of type for every column. For example {\"myColumn\": \"boolean\", \"myOtherColumn\": \"json\"}.  */
  @SerialName(value = "mapping") val mapping: Map<kotlin.String, MappingTypeCSV>? = null,

  @SerialName(value = "method") val method: MethodType? = null,

  /** The character used to split the value on each line, default to a comma (\\r, \\n, 0xFFFD, and space are forbidden). */
  @SerialName(value = "delimiter") val delimiter: String? = null,
) : SourceInput, SourceUpdateInput
