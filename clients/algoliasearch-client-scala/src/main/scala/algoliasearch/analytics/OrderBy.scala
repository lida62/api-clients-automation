/** Analytics API The Analytics API lets you review your search, and click and conversion analytics. > **Note**: The API
  * key in the `X-Algolia-API-Key` header requires the [`analytics`
  * ACL](https://www.algolia.com/doc/guides/security/api-keys/#access-control-list-acl).
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.analytics

import org.json4s._

sealed trait OrderBy

/** Method for ordering results. `clickThroughRate`, `conversionRate` and `averageClickPosition` are only available if
  * the `clickAnalytics` parameter is `true`.
  */
object OrderBy {
  case object SearchCount extends OrderBy {
    override def toString = "searchCount"
  }
  case object ClickThroughRate extends OrderBy {
    override def toString = "clickThroughRate"
  }
  case object ConversionRate extends OrderBy {
    override def toString = "conversionRate"
  }
  case object AverageClickPosition extends OrderBy {
    override def toString = "averageClickPosition"
  }
  val values: Seq[OrderBy] = Seq(SearchCount, ClickThroughRate, ConversionRate, AverageClickPosition)

  def withName(name: String): OrderBy = OrderBy.values
    .find(_.toString == name)
    .getOrElse(throw new MappingException(s"Unknown OrderBy value: $name"))
}

class OrderBySerializer
    extends CustomSerializer[OrderBy](_ =>
      (
        {
          case JString(value) => OrderBy.withName(value)
          case JNull          => null
        },
        { case value: OrderBy =>
          JString(value.toString)
        }
      )
    )
