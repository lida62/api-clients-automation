/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
  * https://github.com/algolia/api-clients-automation. DO NOT EDIT.
  */
package algoliasearch.api

import algoliasearch.insights.ErrorBase
import algoliasearch.insights.EventsResponse
import algoliasearch.insights.InsightsEvents
import algoliasearch.insights._
import algoliasearch.ApiClient
import algoliasearch.api.InsightsClient.hosts
import algoliasearch.config._
import algoliasearch.internal.util._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.Random

object InsightsClient {

  /** Creates a new SearchApi instance using default hosts.
    *
    * @param appId
    *   application ID
    * @param apiKey
    *   api key
    * @param region
    *   region
    * @param clientOptions
    *   client options
    */
  def apply(
      appId: String,
      apiKey: String,
      region: Option[String] = None,
      clientOptions: ClientOptions = ClientOptions()
  ) = new InsightsClient(
    appId = appId,
    apiKey = apiKey,
    region = region,
    clientOptions = clientOptions
  )

  private def hosts(region: Option[String] = None): Seq[Host] = {
    val allowedRegions = Seq("de", "us")
    if (region.isDefined && !allowedRegions.contains(region.get)) {
      throw new IllegalArgumentException(s"`region` must be one of the following: ${allowedRegions.mkString(", ")}")
    }
    val url =
      if (region.isEmpty) "insights.algolia.io" else "insights.{region}.algolia.io".replace("{region}", region.get)
    Seq(Host(url = url, callTypes = Set(CallType.Read, CallType.Write)))
  }
}

class InsightsClient(
    appId: String,
    apiKey: String,
    region: Option[String] = None,
    clientOptions: ClientOptions = ClientOptions()
) extends ApiClient(
      appId = appId,
      apiKey = apiKey,
      clientName = "Insights",
      defaultHosts = hosts(region),
      formats = JsonSupport.format,
      options = clientOptions
    ) {

  /** This method allow you to send requests to the Algolia REST API.
    *
    * @param path
    *   Path of the endpoint, anything after \"/1\" must be specified.
    * @param parameters
    *   Query parameters to apply to the current query.
    */
  def customDelete[T: Manifest](
      path: String,
      parameters: Option[Map[String, Any]] = None,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[T] = Future {
    requireNotNull(path, "Parameter `path` is required when calling `customDelete`.")

    val request = HttpRequest
      .builder()
      .withMethod("DELETE")
      .withPath(s"/1${path}")
      .withQueryParameters(parameters)
      .build()
    execute[T](request, requestOptions)
  }

  /** This method allow you to send requests to the Algolia REST API.
    *
    * @param path
    *   Path of the endpoint, anything after \"/1\" must be specified.
    * @param parameters
    *   Query parameters to apply to the current query.
    */
  def customGet[T: Manifest](
      path: String,
      parameters: Option[Map[String, Any]] = None,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[T] = Future {
    requireNotNull(path, "Parameter `path` is required when calling `customGet`.")

    val request = HttpRequest
      .builder()
      .withMethod("GET")
      .withPath(s"/1${path}")
      .withQueryParameters(parameters)
      .build()
    execute[T](request, requestOptions)
  }

  /** This method allow you to send requests to the Algolia REST API.
    *
    * @param path
    *   Path of the endpoint, anything after \"/1\" must be specified.
    * @param parameters
    *   Query parameters to apply to the current query.
    * @param body
    *   Parameters to send with the custom request.
    */
  def customPost[T: Manifest](
      path: String,
      parameters: Option[Map[String, Any]] = None,
      body: Option[Any] = None,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[T] = Future {
    requireNotNull(path, "Parameter `path` is required when calling `customPost`.")

    val request = HttpRequest
      .builder()
      .withMethod("POST")
      .withPath(s"/1${path}")
      .withBody(body)
      .withQueryParameters(parameters)
      .build()
    execute[T](request, requestOptions)
  }

  /** This method allow you to send requests to the Algolia REST API.
    *
    * @param path
    *   Path of the endpoint, anything after \"/1\" must be specified.
    * @param parameters
    *   Query parameters to apply to the current query.
    * @param body
    *   Parameters to send with the custom request.
    */
  def customPut[T: Manifest](
      path: String,
      parameters: Option[Map[String, Any]] = None,
      body: Option[Any] = None,
      requestOptions: Option[RequestOptions] = None
  )(implicit ec: ExecutionContext): Future[T] = Future {
    requireNotNull(path, "Parameter `path` is required when calling `customPut`.")

    val request = HttpRequest
      .builder()
      .withMethod("PUT")
      .withPath(s"/1${path}")
      .withBody(body)
      .withQueryParameters(parameters)
      .build()
    execute[T](request, requestOptions)
  }

  /** Send a list of events to the Insights API. You can include up to 1,000 events in a single request, but the request
    * body must be smaller than 2&nbsp;MB.
    */
  def pushEvents(insightsEvents: InsightsEvents, requestOptions: Option[RequestOptions] = None)(implicit
      ec: ExecutionContext
  ): Future[EventsResponse] = Future {
    requireNotNull(insightsEvents, "Parameter `insightsEvents` is required when calling `pushEvents`.")

    val request = HttpRequest
      .builder()
      .withMethod("POST")
      .withPath(s"/1/events")
      .withBody(insightsEvents)
      .build()
    execute[EventsResponse](request, requestOptions)
  }

}
