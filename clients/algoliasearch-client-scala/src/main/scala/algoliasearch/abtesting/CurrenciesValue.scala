/** A/B Testing API API powering the A/B Testing feature of Algolia.
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.abtesting

/** CurrenciesValue
  *
  * @param currency
  *   Currency code.
  * @param revenue
  *   Revenue for this currency.
  * @param mean
  *   Mean for this currency.
  * @param standardDeviation
  *   Standard deviation for this currency.
  */
case class CurrenciesValue(
    currency: Option[String] = scala.None,
    revenue: Option[Double] = scala.None,
    mean: Option[Double] = scala.None,
    standardDeviation: Option[Double] = scala.None
)
