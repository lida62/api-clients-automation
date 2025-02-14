/** Recommend API The Recommend API lets you generate recommendations with several AI models. > **Note**: You should use
  * Algolia's [libraries and
  * tools](https://www.algolia.com/doc/guides/getting-started/how-algolia-works/in-depth/ecosystem/) to interact with
  * the Recommend API. Using the HTTP endpoints directly is not covered by the
  * [SLA](https://www.algolia.com/policies/sla/).
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.recommend

import algoliasearch.recommend.TrendingFacetsModel._

/** TrendingFacetsQuery
  *
  * @param indexName
  *   Algolia index name.
  * @param threshold
  *   Recommendations with a confidence score lower than `threshold` won't appear in results. > **Note**: Each
  *   recommendation has a confidence score of 0 to 100. The closer the score is to 100, the more relevant the
  *   recommendations are.
  * @param maxRecommendations
  *   Maximum number of recommendations to retrieve. If 0, all recommendations will be returned.
  * @param facetName
  *   Facet name for trending models.
  */
case class TrendingFacetsQuery(
    indexName: String,
    threshold: Option[Int] = scala.None,
    maxRecommendations: Option[Int] = scala.None,
    facetName: String,
    model: Option[TrendingFacetsModel] = scala.None
) extends RecommendationsRequestTrait
