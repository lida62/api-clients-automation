/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

/** The window parameter represents the holds the dates used to query the Observability data from the database in a
  * given window.
  *
  * @param startDate
  *   A date in format RFC3339 representing the oldest possible data in query window.
  * @param endDate
  *   A date in format RFC3339 representing the newest possible data in query window.
  */
case class Window(
    startDate: String,
    endDate: String
)
