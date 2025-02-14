/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

/** Payload to search for multiple authentications, based on the given `authenticationIDs`.
  */
case class AuthenticationSearch(
    authenticationIDs: Seq[String]
)
