/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * UpdatedRuleResponse
 *
 * @param objectID Unique object identifier.
 * @param updatedAt Timestamp of the last update in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
 * @param taskID Unique identifier of a task. A successful API response means that a task was added to a queue. It might not run immediately. You can check the task's progress with the `task` operation and this `taskID`.
 */
@Serializable
public data class UpdatedRuleResponse(

  /** Unique object identifier. */
  @SerialName(value = "objectID") val objectID: String,

  /** Timestamp of the last update in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format. */
  @SerialName(value = "updatedAt") val updatedAt: String,

  /** Unique identifier of a task. A successful API response means that a task was added to a queue. It might not run immediately. You can check the task's progress with the `task` operation and this `taskID`.  */
  @SerialName(value = "taskID") val taskID: Long,
)
