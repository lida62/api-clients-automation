/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * UserHit
 *
 * @param userID userID of the user.
 * @param clusterName Cluster name.
 * @param nbRecords Number of records in the cluster.
 * @param dataSize Data size taken by all the users assigned to the cluster.
 * @param objectID userID of the requested user. Same as userID.
 * @param highlightResult
 */
@Serializable
public data class UserHit(

  /** userID of the user. */
  @SerialName(value = "userID") val userID: String,

  /** Cluster name. */
  @SerialName(value = "clusterName") val clusterName: String,

  /** Number of records in the cluster. */
  @SerialName(value = "nbRecords") val nbRecords: Int,

  /** Data size taken by all the users assigned to the cluster. */
  @SerialName(value = "dataSize") val dataSize: Int,

  /** userID of the requested user. Same as userID. */
  @SerialName(value = "objectID") val objectID: String,

  @SerialName(value = "_highlightResult") val highlightResult: UserHighlightResult,
)
