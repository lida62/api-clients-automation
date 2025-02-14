/** Search API Use the Search REST API to manage your data (indices and records), implement search, and improve
  * relevance (with Rules, synonyms, and language dictionaries). Although Algolia provides a REST API, you should use
  * the official open source API [clients, libraries, and
  * tools](https://www.algolia.com/doc/guides/getting-started/how-algolia-works/in-depth/ecosystem/) instead. There's no
  * [SLA](https://www.algolia.com/policies/sla/) if you use the REST API directly.
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.search

/** Cursor
  *
  * @param cursor
  *   Cursor indicating the location to resume browsing from. Must match the value returned by the previous call. Pass
  *   this value to the subsequent browse call to get the next page of results. When the end of the index has been
  *   reached, `cursor` is absent from the response.
  */
case class Cursor(
    cursor: Option[String] = scala.None
)
