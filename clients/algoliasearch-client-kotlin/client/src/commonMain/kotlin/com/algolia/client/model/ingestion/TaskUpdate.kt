/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * The payload for a task update.
 *
 * @param destinationID The destination UUID.
 * @param trigger
 * @param input
 * @param enabled Whether the task is enabled or not.
 */
@Serializable
public data class TaskUpdate(

  /** The destination UUID. */
  @SerialName(value = "destinationID") val destinationID: String? = null,

  @SerialName(value = "trigger") val trigger: TriggerInput? = null,

  @SerialName(value = "input") val input: TaskInput? = null,

  /** Whether the task is enabled or not. */
  @SerialName(value = "enabled") val enabled: Boolean? = null,
)
