/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.recommend

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * SearchParamsObject
 *
 * @param query Text to search for in an index.
 * @param similarQuery Overrides the query parameter and performs a more generic search.
 * @param filters [Filter](https://www.algolia.com/doc/guides/managing-results/refine-results/filtering/) the query with numeric, facet, or tag filters.
 * @param facetFilters
 * @param optionalFilters
 * @param numericFilters
 * @param tagFilters
 * @param sumOrFiltersScores Determines how to calculate [filter scores](https://www.algolia.com/doc/guides/managing-results/refine-results/filtering/in-depth/filter-scoring/#accumulating-scores-with-sumorfiltersscores). If `false`, maximum score is kept. If `true`, score is summed.
 * @param restrictSearchableAttributes Restricts a query to only look at a subset of your [searchable attributes](https://www.algolia.com/doc/guides/managing-results/must-do/searchable-attributes/).
 * @param facets Returns [facets](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#contextual-facet-values-and-counts), their facet values, and the number of matching facet values.
 * @param facetingAfterDistinct Forces faceting to be applied after [de-duplication](https://www.algolia.com/doc/guides/managing-results/refine-results/grouping/) (with the distinct feature). Alternatively, the `afterDistinct` [modifier](https://www.algolia.com/doc/api-reference/api-parameters/attributesForFaceting/#modifiers) of `attributesForFaceting` allows for more granular control.
 * @param page Page to retrieve (the first page is `0`, not `1`).
 * @param offset Specifies the offset of the first hit to return. > **Note**: Using `page` and `hitsPerPage` is the recommended method for [paging results](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/). However, you can use `offset` and `length` to implement [an alternative approach to paging](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/#retrieving-a-subset-of-records-with-offset-and-length).
 * @param length Sets the number of hits to retrieve (for use with `offset`). > **Note**: Using `page` and `hitsPerPage` is the recommended method for [paging results](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/). However, you can use `offset` and `length` to implement [an alternative approach to paging](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/#retrieving-a-subset-of-records-with-offset-and-length).
 * @param aroundLatLng Search for entries [around a central location](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filter-around-a-central-point), enabling a geographical search within a circular area.
 * @param aroundLatLngViaIP Search for entries around a location. The location is automatically computed from the requester's IP address.
 * @param aroundRadius
 * @param aroundPrecision
 * @param minimumAroundRadius Minimum radius (in meters) used for a geographical search when `aroundRadius` isn't set.
 * @param insideBoundingBox Search inside a [rectangular area](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filtering-inside-rectangular-or-polygonal-areas) (in geographical coordinates).
 * @param insidePolygon Search inside a [polygon](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filtering-inside-rectangular-or-polygonal-areas) (in geographical coordinates).
 * @param naturalLanguages Changes the default values of parameters that work best for a natural language query, such as `ignorePlurals`, `removeStopWords`, `removeWordsIfNoResults`, `analyticsTags`, and `ruleContexts`. These parameters work well together when the query consists of fuller natural language strings instead of keywords, for example when processing voice search queries.
 * @param ruleContexts Assigns [rule contexts](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/how-to/customize-search-results-by-platform/#whats-a-context) to search queries.
 * @param personalizationImpact Defines how much [Personalization affects results](https://www.algolia.com/doc/guides/personalization/personalizing-results/in-depth/configuring-personalization/#understanding-personalization-impact).
 * @param userToken Associates a [user token](https://www.algolia.com/doc/guides/sending-events/concepts/usertoken/) with the current search.
 * @param getRankingInfo Incidates whether the search response includes [detailed ranking information](https://www.algolia.com/doc/guides/building-search-ui/going-further/backend-search/in-depth/understanding-the-api-response/#ranking-information).
 * @param explain Enriches the API's response with information about how the query was processed.
 * @param synonyms Whether to take into account an index's synonyms for a particular search.
 * @param clickAnalytics Indicates whether a query ID parameter is included in the search response. This is required for [tracking click and conversion events](https://www.algolia.com/doc/guides/sending-events/concepts/event-types/#events-related-to-algolia-requests).
 * @param analytics Indicates whether this query will be included in [analytics](https://www.algolia.com/doc/guides/search-analytics/guides/exclude-queries/).
 * @param analyticsTags Tags to apply to the query for [segmenting analytics data](https://www.algolia.com/doc/guides/search-analytics/guides/segments/).
 * @param percentileComputation Whether to include or exclude a query from the processing-time percentile computation.
 * @param enableABTest Incidates whether this search will be considered in A/B testing.
 * @param attributesForFaceting Attributes used for [faceting](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/) and the [modifiers](https://www.algolia.com/doc/api-reference/api-parameters/attributesForFaceting/#modifiers) that can be applied: `filterOnly`, `searchable`, and `afterDistinct`.
 * @param attributesToRetrieve Attributes to include in the API response. To reduce the size of your response, you can retrieve only some of the attributes. By default, the response includes all attributes.
 * @param ranking Determines the order in which Algolia [returns your results](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/).
 * @param customRanking Specifies the [Custom ranking criterion](https://www.algolia.com/doc/guides/managing-results/must-do/custom-ranking/). Use the `asc` and `desc` modifiers to specify the ranking order: ascending or descending.
 * @param relevancyStrictness Relevancy threshold below which less relevant results aren't included in the results.
 * @param attributesToHighlight Attributes to highlight. Strings that match the search query in the attributes are highlighted by surrounding them with HTML tags (`highlightPreTag` and `highlightPostTag`).
 * @param attributesToSnippet Attributes to _snippet_. 'Snippeting' is shortening the attribute to a certain number of words. If not specified, the attribute is shortened to the 10 words around the matching string but you can specify the number. For example: `body:20`.
 * @param highlightPreTag HTML string to insert before the highlighted parts in all highlight and snippet results.
 * @param highlightPostTag HTML string to insert after the highlighted parts in all highlight and snippet results.
 * @param snippetEllipsisText String used as an ellipsis indicator when a snippet is truncated.
 * @param restrictHighlightAndSnippetArrays Restrict highlighting and snippeting to items that matched the query.
 * @param hitsPerPage Number of hits per page.
 * @param minWordSizefor1Typo Minimum number of characters a word in the query string must contain to accept matches with [one typo](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos).
 * @param minWordSizefor2Typos Minimum number of characters a word in the query string must contain to accept matches with [two typos](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos).
 * @param typoTolerance
 * @param allowTyposOnNumericTokens Whether to allow typos on numbers (\"numeric tokens\") in the query string.
 * @param disableTypoToleranceOnAttributes Attributes for which you want to turn off [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/).
 * @param ignorePlurals
 * @param removeStopWords
 * @param keepDiacriticsOnCharacters Characters that the engine shouldn't automatically [normalize](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/).
 * @param queryLanguages Sets your user's search language. This adjusts language-specific settings and features such as `ignorePlurals`, `removeStopWords`, and [CJK](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/#normalization-for-logogram-based-languages-cjk) word detection.
 * @param decompoundQuery [Splits compound words](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/#splitting-compound-words) into their component word parts in the query.
 * @param enableRules Incidates whether [Rules](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/) are enabled.
 * @param enablePersonalization Incidates whether [Personalization](https://www.algolia.com/doc/guides/personalization/what-is-personalization/) is enabled.
 * @param queryType
 * @param removeWordsIfNoResults
 * @param mode
 * @param semanticSearch
 * @param advancedSyntax Enables the [advanced query syntax](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/#advanced-syntax).
 * @param optionalWords Words which should be considered [optional](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/empty-or-insufficient-results/#creating-a-list-of-optional-words) when found in a query.
 * @param disableExactOnAttributes Attributes for which you want to [turn off the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes).
 * @param exactOnSingleWordQuery
 * @param alternativesAsExact Alternatives that should be considered an exact match by [the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes).
 * @param advancedSyntaxFeatures Allows you to specify which advanced syntax features are active when `advancedSyntax` is enabled.
 * @param distinct
 * @param replaceSynonymsInHighlight Whether to highlight and snippet the original word that matches the synonym or the synonym itself.
 * @param minProximity Precision of the [proximity ranking criterion](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#proximity).
 * @param responseFields Attributes to include in the API response for search and browse queries.
 * @param maxFacetHits Maximum number of facet hits to return when [searching for facet values](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#search-for-facet-values).
 * @param maxValuesPerFacet Maximum number of facet values to return for each facet.
 * @param sortFacetValuesBy Controls how facet values are fetched.
 * @param attributeCriteriaComputedByMinProximity When the [Attribute criterion is ranked above Proximity](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#attribute-and-proximity-combinations) in your ranking formula, Proximity is used to select which searchable attribute is matched in the Attribute ranking stage.
 * @param renderingContent
 * @param enableReRanking Indicates whether this search will use [Dynamic Re-Ranking](https://www.algolia.com/doc/guides/algolia-ai/re-ranking/).
 * @param reRankingApplyFilter
 */
@Serializable
public data class SearchParamsObject(

  /** Text to search for in an index. */
  @SerialName(value = "query") val query: String? = null,

  /** Overrides the query parameter and performs a more generic search. */
  @SerialName(value = "similarQuery") val similarQuery: String? = null,

  /** [Filter](https://www.algolia.com/doc/guides/managing-results/refine-results/filtering/) the query with numeric, facet, or tag filters.  */
  @SerialName(value = "filters") val filters: String? = null,

  @SerialName(value = "facetFilters") val facetFilters: FacetFilters? = null,

  @SerialName(value = "optionalFilters") val optionalFilters: OptionalFilters? = null,

  @SerialName(value = "numericFilters") val numericFilters: NumericFilters? = null,

  @SerialName(value = "tagFilters") val tagFilters: TagFilters? = null,

  /** Determines how to calculate [filter scores](https://www.algolia.com/doc/guides/managing-results/refine-results/filtering/in-depth/filter-scoring/#accumulating-scores-with-sumorfiltersscores). If `false`, maximum score is kept. If `true`, score is summed.  */
  @SerialName(value = "sumOrFiltersScores") val sumOrFiltersScores: Boolean? = null,

  /** Restricts a query to only look at a subset of your [searchable attributes](https://www.algolia.com/doc/guides/managing-results/must-do/searchable-attributes/). */
  @SerialName(value = "restrictSearchableAttributes") val restrictSearchableAttributes: List<String>? = null,

  /** Returns [facets](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#contextual-facet-values-and-counts), their facet values, and the number of matching facet values. */
  @SerialName(value = "facets") val facets: List<String>? = null,

  /** Forces faceting to be applied after [de-duplication](https://www.algolia.com/doc/guides/managing-results/refine-results/grouping/) (with the distinct feature). Alternatively, the `afterDistinct` [modifier](https://www.algolia.com/doc/api-reference/api-parameters/attributesForFaceting/#modifiers) of `attributesForFaceting` allows for more granular control.  */
  @SerialName(value = "facetingAfterDistinct") val facetingAfterDistinct: Boolean? = null,

  /** Page to retrieve (the first page is `0`, not `1`). */
  @SerialName(value = "page") val page: Int? = null,

  /** Specifies the offset of the first hit to return. > **Note**: Using `page` and `hitsPerPage` is the recommended method for [paging results](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/). However, you can use `offset` and `length` to implement [an alternative approach to paging](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/#retrieving-a-subset-of-records-with-offset-and-length).  */
  @SerialName(value = "offset") val offset: Int? = null,

  /** Sets the number of hits to retrieve (for use with `offset`). > **Note**: Using `page` and `hitsPerPage` is the recommended method for [paging results](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/). However, you can use `offset` and `length` to implement [an alternative approach to paging](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/#retrieving-a-subset-of-records-with-offset-and-length).  */
  @SerialName(value = "length") val length: Int? = null,

  /** Search for entries [around a central location](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filter-around-a-central-point), enabling a geographical search within a circular area. */
  @SerialName(value = "aroundLatLng") val aroundLatLng: String? = null,

  /** Search for entries around a location. The location is automatically computed from the requester's IP address. */
  @SerialName(value = "aroundLatLngViaIP") val aroundLatLngViaIP: Boolean? = null,

  @SerialName(value = "aroundRadius") val aroundRadius: AroundRadius? = null,

  @SerialName(value = "aroundPrecision") val aroundPrecision: AroundPrecision? = null,

  /** Minimum radius (in meters) used for a geographical search when `aroundRadius` isn't set. */
  @SerialName(value = "minimumAroundRadius") val minimumAroundRadius: Int? = null,

  /** Search inside a [rectangular area](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filtering-inside-rectangular-or-polygonal-areas) (in geographical coordinates). */
  @SerialName(value = "insideBoundingBox") val insideBoundingBox: List<List<Double>>? = null,

  /** Search inside a [polygon](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filtering-inside-rectangular-or-polygonal-areas) (in geographical coordinates). */
  @SerialName(value = "insidePolygon") val insidePolygon: List<List<Double>>? = null,

  /** Changes the default values of parameters that work best for a natural language query, such as `ignorePlurals`, `removeStopWords`, `removeWordsIfNoResults`, `analyticsTags`, and `ruleContexts`. These parameters work well together when the query consists of fuller natural language strings instead of keywords, for example when processing voice search queries. */
  @SerialName(value = "naturalLanguages") val naturalLanguages: List<String>? = null,

  /** Assigns [rule contexts](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/how-to/customize-search-results-by-platform/#whats-a-context) to search queries. */
  @SerialName(value = "ruleContexts") val ruleContexts: List<String>? = null,

  /** Defines how much [Personalization affects results](https://www.algolia.com/doc/guides/personalization/personalizing-results/in-depth/configuring-personalization/#understanding-personalization-impact). */
  @SerialName(value = "personalizationImpact") val personalizationImpact: Int? = null,

  /** Associates a [user token](https://www.algolia.com/doc/guides/sending-events/concepts/usertoken/) with the current search. */
  @SerialName(value = "userToken") val userToken: String? = null,

  /** Incidates whether the search response includes [detailed ranking information](https://www.algolia.com/doc/guides/building-search-ui/going-further/backend-search/in-depth/understanding-the-api-response/#ranking-information). */
  @SerialName(value = "getRankingInfo") val getRankingInfo: Boolean? = null,

  /** Enriches the API's response with information about how the query was processed. */
  @SerialName(value = "explain") val explain: List<String>? = null,

  /** Whether to take into account an index's synonyms for a particular search. */
  @SerialName(value = "synonyms") val synonyms: Boolean? = null,

  /** Indicates whether a query ID parameter is included in the search response. This is required for [tracking click and conversion events](https://www.algolia.com/doc/guides/sending-events/concepts/event-types/#events-related-to-algolia-requests). */
  @SerialName(value = "clickAnalytics") val clickAnalytics: Boolean? = null,

  /** Indicates whether this query will be included in [analytics](https://www.algolia.com/doc/guides/search-analytics/guides/exclude-queries/). */
  @SerialName(value = "analytics") val analytics: Boolean? = null,

  /** Tags to apply to the query for [segmenting analytics data](https://www.algolia.com/doc/guides/search-analytics/guides/segments/). */
  @SerialName(value = "analyticsTags") val analyticsTags: List<String>? = null,

  /** Whether to include or exclude a query from the processing-time percentile computation. */
  @SerialName(value = "percentileComputation") val percentileComputation: Boolean? = null,

  /** Incidates whether this search will be considered in A/B testing. */
  @SerialName(value = "enableABTest") val enableABTest: Boolean? = null,

  /** Attributes used for [faceting](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/) and the [modifiers](https://www.algolia.com/doc/api-reference/api-parameters/attributesForFaceting/#modifiers) that can be applied: `filterOnly`, `searchable`, and `afterDistinct`.  */
  @SerialName(value = "attributesForFaceting") val attributesForFaceting: List<String>? = null,

  /** Attributes to include in the API response. To reduce the size of your response, you can retrieve only some of the attributes. By default, the response includes all attributes. */
  @SerialName(value = "attributesToRetrieve") val attributesToRetrieve: List<String>? = null,

  /** Determines the order in which Algolia [returns your results](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/). */
  @SerialName(value = "ranking") val ranking: List<String>? = null,

  /** Specifies the [Custom ranking criterion](https://www.algolia.com/doc/guides/managing-results/must-do/custom-ranking/). Use the `asc` and `desc` modifiers to specify the ranking order: ascending or descending.  */
  @SerialName(value = "customRanking") val customRanking: List<String>? = null,

  /** Relevancy threshold below which less relevant results aren't included in the results. */
  @SerialName(value = "relevancyStrictness") val relevancyStrictness: Int? = null,

  /** Attributes to highlight. Strings that match the search query in the attributes are highlighted by surrounding them with HTML tags (`highlightPreTag` and `highlightPostTag`). */
  @SerialName(value = "attributesToHighlight") val attributesToHighlight: List<String>? = null,

  /** Attributes to _snippet_. 'Snippeting' is shortening the attribute to a certain number of words. If not specified, the attribute is shortened to the 10 words around the matching string but you can specify the number. For example: `body:20`.  */
  @SerialName(value = "attributesToSnippet") val attributesToSnippet: List<String>? = null,

  /** HTML string to insert before the highlighted parts in all highlight and snippet results. */
  @SerialName(value = "highlightPreTag") val highlightPreTag: String? = null,

  /** HTML string to insert after the highlighted parts in all highlight and snippet results. */
  @SerialName(value = "highlightPostTag") val highlightPostTag: String? = null,

  /** String used as an ellipsis indicator when a snippet is truncated. */
  @SerialName(value = "snippetEllipsisText") val snippetEllipsisText: String? = null,

  /** Restrict highlighting and snippeting to items that matched the query. */
  @SerialName(value = "restrictHighlightAndSnippetArrays") val restrictHighlightAndSnippetArrays: Boolean? = null,

  /** Number of hits per page. */
  @SerialName(value = "hitsPerPage") val hitsPerPage: Int? = null,

  /** Minimum number of characters a word in the query string must contain to accept matches with [one typo](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos). */
  @SerialName(value = "minWordSizefor1Typo") val minWordSizefor1Typo: Int? = null,

  /** Minimum number of characters a word in the query string must contain to accept matches with [two typos](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos). */
  @SerialName(value = "minWordSizefor2Typos") val minWordSizefor2Typos: Int? = null,

  @SerialName(value = "typoTolerance") val typoTolerance: TypoTolerance? = null,

  /** Whether to allow typos on numbers (\"numeric tokens\") in the query string. */
  @SerialName(value = "allowTyposOnNumericTokens") val allowTyposOnNumericTokens: Boolean? = null,

  /** Attributes for which you want to turn off [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/). */
  @SerialName(value = "disableTypoToleranceOnAttributes") val disableTypoToleranceOnAttributes: List<String>? = null,

  @SerialName(value = "ignorePlurals") val ignorePlurals: IgnorePlurals? = null,

  @SerialName(value = "removeStopWords") val removeStopWords: RemoveStopWords? = null,

  /** Characters that the engine shouldn't automatically [normalize](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/). */
  @SerialName(value = "keepDiacriticsOnCharacters") val keepDiacriticsOnCharacters: String? = null,

  /** Sets your user's search language. This adjusts language-specific settings and features such as `ignorePlurals`, `removeStopWords`, and [CJK](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/#normalization-for-logogram-based-languages-cjk) word detection. */
  @SerialName(value = "queryLanguages") val queryLanguages: List<String>? = null,

  /** [Splits compound words](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/#splitting-compound-words) into their component word parts in the query.  */
  @SerialName(value = "decompoundQuery") val decompoundQuery: Boolean? = null,

  /** Incidates whether [Rules](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/) are enabled. */
  @SerialName(value = "enableRules") val enableRules: Boolean? = null,

  /** Incidates whether [Personalization](https://www.algolia.com/doc/guides/personalization/what-is-personalization/) is enabled. */
  @SerialName(value = "enablePersonalization") val enablePersonalization: Boolean? = null,

  @SerialName(value = "queryType") val queryType: QueryType? = null,

  @SerialName(value = "removeWordsIfNoResults") val removeWordsIfNoResults: RemoveWordsIfNoResults? = null,

  @SerialName(value = "mode") val mode: Mode? = null,

  @SerialName(value = "semanticSearch") val semanticSearch: SemanticSearch? = null,

  /** Enables the [advanced query syntax](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/#advanced-syntax). */
  @SerialName(value = "advancedSyntax") val advancedSyntax: Boolean? = null,

  /** Words which should be considered [optional](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/empty-or-insufficient-results/#creating-a-list-of-optional-words) when found in a query. */
  @SerialName(value = "optionalWords") val optionalWords: List<String>? = null,

  /** Attributes for which you want to [turn off the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes). */
  @SerialName(value = "disableExactOnAttributes") val disableExactOnAttributes: List<String>? = null,

  @SerialName(value = "exactOnSingleWordQuery") val exactOnSingleWordQuery: ExactOnSingleWordQuery? = null,

  /** Alternatives that should be considered an exact match by [the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes). */
  @SerialName(value = "alternativesAsExact") val alternativesAsExact: List<AlternativesAsExact>? = null,

  /** Allows you to specify which advanced syntax features are active when `advancedSyntax` is enabled. */
  @SerialName(value = "advancedSyntaxFeatures") val advancedSyntaxFeatures: List<AdvancedSyntaxFeatures>? = null,

  @SerialName(value = "distinct") val distinct: Distinct? = null,

  /** Whether to highlight and snippet the original word that matches the synonym or the synonym itself. */
  @SerialName(value = "replaceSynonymsInHighlight") val replaceSynonymsInHighlight: Boolean? = null,

  /** Precision of the [proximity ranking criterion](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#proximity). */
  @SerialName(value = "minProximity") val minProximity: Int? = null,

  /** Attributes to include in the API response for search and browse queries. */
  @SerialName(value = "responseFields") val responseFields: List<String>? = null,

  /** Maximum number of facet hits to return when [searching for facet values](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#search-for-facet-values). */
  @SerialName(value = "maxFacetHits") val maxFacetHits: Int? = null,

  /** Maximum number of facet values to return for each facet. */
  @SerialName(value = "maxValuesPerFacet") val maxValuesPerFacet: Int? = null,

  /** Controls how facet values are fetched. */
  @SerialName(value = "sortFacetValuesBy") val sortFacetValuesBy: String? = null,

  /** When the [Attribute criterion is ranked above Proximity](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#attribute-and-proximity-combinations) in your ranking formula, Proximity is used to select which searchable attribute is matched in the Attribute ranking stage. */
  @SerialName(value = "attributeCriteriaComputedByMinProximity") val attributeCriteriaComputedByMinProximity: Boolean? = null,

  @SerialName(value = "renderingContent") val renderingContent: RenderingContent? = null,

  /** Indicates whether this search will use [Dynamic Re-Ranking](https://www.algolia.com/doc/guides/algolia-ai/re-ranking/). */
  @SerialName(value = "enableReRanking") val enableReRanking: Boolean? = null,

  @SerialName(value = "reRankingApplyFilter") val reRankingApplyFilter: ReRankingApplyFilter? = null,
)
