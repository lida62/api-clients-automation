/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

/** SourceCreateResponse
  *
  * @param sourceID
  *   The source UUID.
  * @param createdAt
  *   Date of creation (RFC3339 format).
  */
case class SourceCreateResponse(
    sourceID: String,
    name: String,
    createdAt: String
)
