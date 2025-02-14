/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

import algoliasearch.ingestion.DestinationType._

/** The payload when creating a destination.
  *
  * @param name
  *   An human readable name describing the object.
  * @param authenticationID
  *   The authentication UUID.
  */
case class DestinationCreate(
    `type`: DestinationType,
    name: String,
    input: DestinationInput,
    authenticationID: Option[String] = scala.None
)
