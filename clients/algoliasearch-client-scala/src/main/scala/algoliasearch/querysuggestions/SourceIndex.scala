/** Query Suggestions API The Query Suggestions API lets you manage Algolia's Query Suggestions configurations. Query
  * Suggestions add new indices with popular search queries, external suggestions, or facet values to your Algolia
  * application. In your user interface, you can query the Query Suggestions indices like regular indices and add
  * [suggested searches](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/query-suggestions/js/)
  * to guide users and speed up their search.
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.querysuggestions

/** Configuration of an Algolia index for Query Suggestions.
  *
  * @param indexName
  *   Name of the Algolia index to use as source for query suggestions.
  * @param replicas
  *   If true, Query Suggestions uses all replicas of the primary index to find popular searches. If false, only the
  *   primary index is used.
  * @param analyticsTags
  *   [Analytics tags](https://www.algolia.com/doc/api-reference/api-parameters/analyticsTags/) for filtering the
  *   popular searches.
  * @param facets
  *   Facets to use as top categories with your suggestions. If provided, Query Suggestions adds the top facet values to
  *   each suggestion.
  * @param minHits
  *   Minimum number of hits required to be included as a suggestion. A search query must at least generate `minHits`
  *   hits to be included in the Query Suggestions index.
  * @param minLetters
  *   Minimum letters required to be included as a suggestion. A search query must be at least `minLetters` long to be
  *   included in the Query Suggestions index.
  * @param external
  *   Algolia indices with popular searches to use as query suggestions. Records of these indices must have these
  *   attributes: - `query`: search query which will be added as a suggestion - `count`: measure of popularity of that
  *   search query For example, you can export popular searches from an external analytics tool, such as Google
  *   Analytics or Adobe Analytics, and feed this data into an external Algolia index. You can use this external index
  *   to generate query suggestions until your Algolia analytics has collected enough data.
  */
case class SourceIndex(
    indexName: String,
    replicas: Option[Boolean] = scala.None,
    analyticsTags: Option[Seq[String]] = scala.None,
    facets: Option[Seq[Facet]] = scala.None,
    minHits: Option[Int] = scala.None,
    minLetters: Option[Int] = scala.None,
    generate: Option[Seq[Seq[String]]] = scala.None,
    external: Option[Seq[String]] = scala.None
)
