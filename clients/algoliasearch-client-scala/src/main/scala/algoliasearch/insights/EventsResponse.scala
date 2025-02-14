/** Insights API The Algolia Insights API lets you collect events related to your search and discovery experience.
  * Events represent actions that users take on your app or website. They unlock powerful features, such as
  * recommendations, personalization, smarter search results, and analytics that help you optimize your user experience.
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.insights

/** The response of the Insights API.
  *
  * @param message
  *   Details about the response, such as error messages.
  * @param status
  *   The HTTP status code of the response.
  */
case class EventsResponse(
    message: Option[String] = scala.None,
    status: Option[Int] = scala.None
)
