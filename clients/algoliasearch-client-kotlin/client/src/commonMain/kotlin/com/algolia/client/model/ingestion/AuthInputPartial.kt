/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.ingestion

import com.algolia.client.exception.AlgoliaClientException
import com.algolia.client.extensions.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

/**
 * AuthInputPartial
 *
 * Implementations:
 * - [AuthAPIKeyPartial]
 * - [AuthAlgoliaPartial]
 * - [AuthBasicPartial]
 * - [AuthGoogleServiceAccountPartial]
 * - [AuthOAuthPartial]
 */
@Serializable(AuthInputPartialSerializer::class)
public sealed interface AuthInputPartial {

  public companion object {
  }
}

internal class AuthInputPartialSerializer : JsonContentPolymorphicSerializer<AuthInputPartial>(AuthInputPartial::class) {
  override fun selectDeserializer(element: JsonElement): DeserializationStrategy<AuthInputPartial> {
    return when {
      element is JsonObject -> AuthGoogleServiceAccountPartial.serializer()
      element is JsonObject -> AuthBasicPartial.serializer()
      element is JsonObject -> AuthAPIKeyPartial.serializer()
      element is JsonObject -> AuthOAuthPartial.serializer()
      element is JsonObject -> AuthAlgoliaPartial.serializer()
      else -> throw AlgoliaClientException("Failed to deserialize json element: $element")
    }
  }
}
