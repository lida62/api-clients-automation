/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

/** AuthAlgoliaPartial
  *
  * @param appID
  *   Algolia Application ID.
  * @param apiKey
  *   Algolia API Key, with the correct rights to push to an index and change settings.
  */
case class AuthAlgoliaPartial(
    appID: Option[String] = scala.None,
    apiKey: Option[String] = scala.None
) extends AuthInputPartialTrait
