/** Ingestion API API powering the Data Ingestion connectors of Algolia.
  *
  * The version of the OpenAPI document: 1.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.ingestion

/** The input for an `onDemand` task whose source is of type `bigquery` and for which extracted data spans a given time
  * range.
  *
  * @param startDate
  *   The start date of the extraction (RFC3339 format).
  * @param endDate
  *   The end date of the extraction (RFC3339 format).
  */
case class OnDemandDateUtilsInput(
    startDate: String,
    endDate: String
) extends TaskInputTrait
