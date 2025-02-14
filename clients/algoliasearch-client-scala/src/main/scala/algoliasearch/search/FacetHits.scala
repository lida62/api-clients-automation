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

/** FacetHits
  *
  * @param value
  *   Facet value.
  * @param highlighted
  *   Markup text with `facetQuery` matches highlighted.
  * @param count
  *   Number of records containing this facet value. This takes into account the extra search parameters specified in
  *   the query. Like for a regular search query, the [counts may not be
  *   exhaustive](https://support.algolia.com/hc/en-us/articles/4406975248145-Why-are-my-facet-and-hit-counts-not-accurate-).
  */
case class FacetHits(
    value: String,
    highlighted: String,
    count: Int
)
