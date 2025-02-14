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

import algoliasearch.search.SearchTypeFacet._

/** SearchForFacetsOptions
  *
  * @param facet
  *   Facet name.
  * @param indexName
  *   Algolia index name.
  * @param facetQuery
  *   Text to search inside the facet's values.
  * @param maxFacetHits
  *   Maximum number of facet hits to return when [searching for facet
  *   values](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#search-for-facet-values).
  */
case class SearchForFacetsOptions(
    facet: String,
    indexName: String,
    facetQuery: Option[String] = scala.None,
    maxFacetHits: Option[Int] = scala.None,
    `type`: SearchTypeFacet
)
