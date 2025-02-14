//
// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
//

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using Algolia.Search.Models;

namespace Algolia.Search.Search.Models
{
  /// <summary>
  /// IndexSettingsAsSearchParams
  /// </summary>
  [DataContract(Name = "indexSettingsAsSearchParams")]
  public partial class IndexSettingsAsSearchParams
  {

    /// <summary>
    /// Gets or Sets QueryType
    /// </summary>
    [DataMember(Name = "queryType", EmitDefaultValue = false)]
    public QueryType? QueryType { get; set; }

    /// <summary>
    /// Gets or Sets RemoveWordsIfNoResults
    /// </summary>
    [DataMember(Name = "removeWordsIfNoResults", EmitDefaultValue = false)]
    public RemoveWordsIfNoResults? RemoveWordsIfNoResults { get; set; }

    /// <summary>
    /// Gets or Sets Mode
    /// </summary>
    [DataMember(Name = "mode", EmitDefaultValue = false)]
    public Mode? Mode { get; set; }

    /// <summary>
    /// Gets or Sets ExactOnSingleWordQuery
    /// </summary>
    [DataMember(Name = "exactOnSingleWordQuery", EmitDefaultValue = false)]
    public ExactOnSingleWordQuery? ExactOnSingleWordQuery { get; set; }
    /// <summary>
    /// Initializes a new instance of the <see cref="IndexSettingsAsSearchParams" /> class.
    /// </summary>
    /// <param name="attributesForFaceting">Attributes used for [faceting](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/) and the [modifiers](https://www.algolia.com/doc/api-reference/api-parameters/attributesForFaceting/#modifiers) that can be applied: &#x60;filterOnly&#x60;, &#x60;searchable&#x60;, and &#x60;afterDistinct&#x60;. .</param>
    /// <param name="attributesToRetrieve">Attributes to include in the API response. To reduce the size of your response, you can retrieve only some of the attributes. By default, the response includes all attributes..</param>
    /// <param name="ranking">Determines the order in which Algolia [returns your results](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/)..</param>
    /// <param name="customRanking">Specifies the [Custom ranking criterion](https://www.algolia.com/doc/guides/managing-results/must-do/custom-ranking/). Use the &#x60;asc&#x60; and &#x60;desc&#x60; modifiers to specify the ranking order: ascending or descending. .</param>
    /// <param name="relevancyStrictness">Relevancy threshold below which less relevant results aren&#39;t included in the results. (default to 100).</param>
    /// <param name="attributesToHighlight">Attributes to highlight. Strings that match the search query in the attributes are highlighted by surrounding them with HTML tags (&#x60;highlightPreTag&#x60; and &#x60;highlightPostTag&#x60;)..</param>
    /// <param name="attributesToSnippet">Attributes to _snippet_. &#39;Snippeting&#39; is shortening the attribute to a certain number of words. If not specified, the attribute is shortened to the 10 words around the matching string but you can specify the number. For example: &#x60;body:20&#x60;. .</param>
    /// <param name="highlightPreTag">HTML string to insert before the highlighted parts in all highlight and snippet results. (default to &quot;&lt;em&gt;&quot;).</param>
    /// <param name="highlightPostTag">HTML string to insert after the highlighted parts in all highlight and snippet results. (default to &quot;&lt;/em&gt;&quot;).</param>
    /// <param name="snippetEllipsisText">String used as an ellipsis indicator when a snippet is truncated. (default to &quot;…&quot;).</param>
    /// <param name="restrictHighlightAndSnippetArrays">Restrict highlighting and snippeting to items that matched the query. (default to false).</param>
    /// <param name="hitsPerPage">Number of hits per page. (default to 20).</param>
    /// <param name="minWordSizefor1Typo">Minimum number of characters a word in the query string must contain to accept matches with [one typo](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos). (default to 4).</param>
    /// <param name="minWordSizefor2Typos">Minimum number of characters a word in the query string must contain to accept matches with [two typos](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos). (default to 8).</param>
    /// <param name="typoTolerance">typoTolerance.</param>
    /// <param name="allowTyposOnNumericTokens">Whether to allow typos on numbers (\&quot;numeric tokens\&quot;) in the query string. (default to true).</param>
    /// <param name="disableTypoToleranceOnAttributes">Attributes for which you want to turn off [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/)..</param>
    /// <param name="ignorePlurals">ignorePlurals.</param>
    /// <param name="removeStopWords">removeStopWords.</param>
    /// <param name="keepDiacriticsOnCharacters">Characters that the engine shouldn&#39;t automatically [normalize](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/). (default to &quot;&quot;).</param>
    /// <param name="queryLanguages">Sets your user&#39;s search language. This adjusts language-specific settings and features such as &#x60;ignorePlurals&#x60;, &#x60;removeStopWords&#x60;, and [CJK](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/#normalization-for-logogram-based-languages-cjk) word detection..</param>
    /// <param name="decompoundQuery">[Splits compound words](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/#splitting-compound-words) into their component word parts in the query.  (default to true).</param>
    /// <param name="enableRules">Incidates whether [Rules](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/) are enabled. (default to true).</param>
    /// <param name="enablePersonalization">Incidates whether [Personalization](https://www.algolia.com/doc/guides/personalization/what-is-personalization/) is enabled. (default to false).</param>
    /// <param name="queryType">queryType.</param>
    /// <param name="removeWordsIfNoResults">removeWordsIfNoResults.</param>
    /// <param name="mode">mode.</param>
    /// <param name="semanticSearch">semanticSearch.</param>
    /// <param name="advancedSyntax">Enables the [advanced query syntax](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/#advanced-syntax). (default to false).</param>
    /// <param name="optionalWords">Words which should be considered [optional](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/empty-or-insufficient-results/#creating-a-list-of-optional-words) when found in a query..</param>
    /// <param name="disableExactOnAttributes">Attributes for which you want to [turn off the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes)..</param>
    /// <param name="exactOnSingleWordQuery">exactOnSingleWordQuery.</param>
    /// <param name="alternativesAsExact">Alternatives that should be considered an exact match by [the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes)..</param>
    /// <param name="advancedSyntaxFeatures">Allows you to specify which advanced syntax features are active when &#x60;advancedSyntax&#x60; is enabled..</param>
    /// <param name="distinct">distinct.</param>
    /// <param name="replaceSynonymsInHighlight">Whether to highlight and snippet the original word that matches the synonym or the synonym itself. (default to false).</param>
    /// <param name="minProximity">Precision of the [proximity ranking criterion](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#proximity). (default to 1).</param>
    /// <param name="responseFields">Attributes to include in the API response for search and browse queries..</param>
    /// <param name="maxFacetHits">Maximum number of facet hits to return when [searching for facet values](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#search-for-facet-values). (default to 10).</param>
    /// <param name="maxValuesPerFacet">Maximum number of facet values to return for each facet. (default to 100).</param>
    /// <param name="sortFacetValuesBy">Controls how facet values are fetched. (default to &quot;count&quot;).</param>
    /// <param name="attributeCriteriaComputedByMinProximity">When the [Attribute criterion is ranked above Proximity](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#attribute-and-proximity-combinations) in your ranking formula, Proximity is used to select which searchable attribute is matched in the Attribute ranking stage. (default to false).</param>
    /// <param name="renderingContent">renderingContent.</param>
    /// <param name="enableReRanking">Indicates whether this search will use [Dynamic Re-Ranking](https://www.algolia.com/doc/guides/algolia-ai/re-ranking/). (default to true).</param>
    /// <param name="reRankingApplyFilter">reRankingApplyFilter.</param>
    public IndexSettingsAsSearchParams(List<string> attributesForFaceting = default(List<string>), List<string> attributesToRetrieve = default(List<string>), List<string> ranking = default(List<string>), List<string> customRanking = default(List<string>), int relevancyStrictness = 100, List<string> attributesToHighlight = default(List<string>), List<string> attributesToSnippet = default(List<string>), string highlightPreTag = @"<em>", string highlightPostTag = @"</em>", string snippetEllipsisText = @"…", bool restrictHighlightAndSnippetArrays = false, int hitsPerPage = 20, int minWordSizefor1Typo = 4, int minWordSizefor2Typos = 8, TypoTolerance typoTolerance = default(TypoTolerance), bool allowTyposOnNumericTokens = true, List<string> disableTypoToleranceOnAttributes = default(List<string>), IgnorePlurals ignorePlurals = default(IgnorePlurals), RemoveStopWords removeStopWords = default(RemoveStopWords), string keepDiacriticsOnCharacters = @"", List<string> queryLanguages = default(List<string>), bool decompoundQuery = true, bool enableRules = true, bool enablePersonalization = false, QueryType? queryType = default(QueryType?), RemoveWordsIfNoResults? removeWordsIfNoResults = default(RemoveWordsIfNoResults?), Mode? mode = default(Mode?), SemanticSearch semanticSearch = default(SemanticSearch), bool advancedSyntax = false, List<string> optionalWords = default(List<string>), List<string> disableExactOnAttributes = default(List<string>), ExactOnSingleWordQuery? exactOnSingleWordQuery = default(ExactOnSingleWordQuery?), List<AlternativesAsExact> alternativesAsExact = default(List<AlternativesAsExact>), List<AdvancedSyntaxFeatures> advancedSyntaxFeatures = default(List<AdvancedSyntaxFeatures>), Distinct distinct = default(Distinct), bool replaceSynonymsInHighlight = false, int minProximity = 1, List<string> responseFields = default(List<string>), int maxFacetHits = 10, int maxValuesPerFacet = 100, string sortFacetValuesBy = @"count", bool attributeCriteriaComputedByMinProximity = false, RenderingContent renderingContent = default(RenderingContent), bool enableReRanking = true, ReRankingApplyFilter reRankingApplyFilter = default(ReRankingApplyFilter))
    {
      this.AttributesForFaceting = attributesForFaceting;
      this.AttributesToRetrieve = attributesToRetrieve;
      this.Ranking = ranking;
      this.CustomRanking = customRanking;
      this.RelevancyStrictness = relevancyStrictness;
      this.AttributesToHighlight = attributesToHighlight;
      this.AttributesToSnippet = attributesToSnippet;
      // use default value if no "highlightPreTag" provided
      this.HighlightPreTag = highlightPreTag ?? @"<em>";
      // use default value if no "highlightPostTag" provided
      this.HighlightPostTag = highlightPostTag ?? @"</em>";
      // use default value if no "snippetEllipsisText" provided
      this.SnippetEllipsisText = snippetEllipsisText ?? @"…";
      this.RestrictHighlightAndSnippetArrays = restrictHighlightAndSnippetArrays;
      this.HitsPerPage = hitsPerPage;
      this.MinWordSizefor1Typo = minWordSizefor1Typo;
      this.MinWordSizefor2Typos = minWordSizefor2Typos;
      this.TypoTolerance = typoTolerance;
      this.AllowTyposOnNumericTokens = allowTyposOnNumericTokens;
      this.DisableTypoToleranceOnAttributes = disableTypoToleranceOnAttributes;
      this.IgnorePlurals = ignorePlurals;
      this.RemoveStopWords = removeStopWords;
      // use default value if no "keepDiacriticsOnCharacters" provided
      this.KeepDiacriticsOnCharacters = keepDiacriticsOnCharacters ?? @"";
      this.QueryLanguages = queryLanguages;
      this.DecompoundQuery = decompoundQuery;
      this.EnableRules = enableRules;
      this.EnablePersonalization = enablePersonalization;
      this.QueryType = queryType;
      this.RemoveWordsIfNoResults = removeWordsIfNoResults;
      this.Mode = mode;
      this.SemanticSearch = semanticSearch;
      this.AdvancedSyntax = advancedSyntax;
      this.OptionalWords = optionalWords;
      this.DisableExactOnAttributes = disableExactOnAttributes;
      this.ExactOnSingleWordQuery = exactOnSingleWordQuery;
      this.AlternativesAsExact = alternativesAsExact;
      this.AdvancedSyntaxFeatures = advancedSyntaxFeatures;
      this.Distinct = distinct;
      this.ReplaceSynonymsInHighlight = replaceSynonymsInHighlight;
      this.MinProximity = minProximity;
      this.ResponseFields = responseFields;
      this.MaxFacetHits = maxFacetHits;
      this.MaxValuesPerFacet = maxValuesPerFacet;
      // use default value if no "sortFacetValuesBy" provided
      this.SortFacetValuesBy = sortFacetValuesBy ?? @"count";
      this.AttributeCriteriaComputedByMinProximity = attributeCriteriaComputedByMinProximity;
      this.RenderingContent = renderingContent;
      this.EnableReRanking = enableReRanking;
      this.ReRankingApplyFilter = reRankingApplyFilter;
    }

    /// <summary>
    /// Attributes used for [faceting](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/) and the [modifiers](https://www.algolia.com/doc/api-reference/api-parameters/attributesForFaceting/#modifiers) that can be applied: &#x60;filterOnly&#x60;, &#x60;searchable&#x60;, and &#x60;afterDistinct&#x60;. 
    /// </summary>
    /// <value>Attributes used for [faceting](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/) and the [modifiers](https://www.algolia.com/doc/api-reference/api-parameters/attributesForFaceting/#modifiers) that can be applied: &#x60;filterOnly&#x60;, &#x60;searchable&#x60;, and &#x60;afterDistinct&#x60;. </value>
    [DataMember(Name = "attributesForFaceting", EmitDefaultValue = false)]
    public List<string> AttributesForFaceting { get; set; }

    /// <summary>
    /// Attributes to include in the API response. To reduce the size of your response, you can retrieve only some of the attributes. By default, the response includes all attributes.
    /// </summary>
    /// <value>Attributes to include in the API response. To reduce the size of your response, you can retrieve only some of the attributes. By default, the response includes all attributes.</value>
    [DataMember(Name = "attributesToRetrieve", EmitDefaultValue = false)]
    public List<string> AttributesToRetrieve { get; set; }

    /// <summary>
    /// Determines the order in which Algolia [returns your results](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/).
    /// </summary>
    /// <value>Determines the order in which Algolia [returns your results](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/).</value>
    [DataMember(Name = "ranking", EmitDefaultValue = false)]
    public List<string> Ranking { get; set; }

    /// <summary>
    /// Specifies the [Custom ranking criterion](https://www.algolia.com/doc/guides/managing-results/must-do/custom-ranking/). Use the &#x60;asc&#x60; and &#x60;desc&#x60; modifiers to specify the ranking order: ascending or descending. 
    /// </summary>
    /// <value>Specifies the [Custom ranking criterion](https://www.algolia.com/doc/guides/managing-results/must-do/custom-ranking/). Use the &#x60;asc&#x60; and &#x60;desc&#x60; modifiers to specify the ranking order: ascending or descending. </value>
    [DataMember(Name = "customRanking", EmitDefaultValue = false)]
    public List<string> CustomRanking { get; set; }

    /// <summary>
    /// Relevancy threshold below which less relevant results aren&#39;t included in the results.
    /// </summary>
    /// <value>Relevancy threshold below which less relevant results aren&#39;t included in the results.</value>
    [DataMember(Name = "relevancyStrictness", EmitDefaultValue = false)]
    public int RelevancyStrictness { get; set; }

    /// <summary>
    /// Attributes to highlight. Strings that match the search query in the attributes are highlighted by surrounding them with HTML tags (&#x60;highlightPreTag&#x60; and &#x60;highlightPostTag&#x60;).
    /// </summary>
    /// <value>Attributes to highlight. Strings that match the search query in the attributes are highlighted by surrounding them with HTML tags (&#x60;highlightPreTag&#x60; and &#x60;highlightPostTag&#x60;).</value>
    [DataMember(Name = "attributesToHighlight", EmitDefaultValue = false)]
    public List<string> AttributesToHighlight { get; set; }

    /// <summary>
    /// Attributes to _snippet_. &#39;Snippeting&#39; is shortening the attribute to a certain number of words. If not specified, the attribute is shortened to the 10 words around the matching string but you can specify the number. For example: &#x60;body:20&#x60;. 
    /// </summary>
    /// <value>Attributes to _snippet_. &#39;Snippeting&#39; is shortening the attribute to a certain number of words. If not specified, the attribute is shortened to the 10 words around the matching string but you can specify the number. For example: &#x60;body:20&#x60;. </value>
    [DataMember(Name = "attributesToSnippet", EmitDefaultValue = false)]
    public List<string> AttributesToSnippet { get; set; }

    /// <summary>
    /// HTML string to insert before the highlighted parts in all highlight and snippet results.
    /// </summary>
    /// <value>HTML string to insert before the highlighted parts in all highlight and snippet results.</value>
    [DataMember(Name = "highlightPreTag", EmitDefaultValue = false)]
    public string HighlightPreTag { get; set; }

    /// <summary>
    /// HTML string to insert after the highlighted parts in all highlight and snippet results.
    /// </summary>
    /// <value>HTML string to insert after the highlighted parts in all highlight and snippet results.</value>
    [DataMember(Name = "highlightPostTag", EmitDefaultValue = false)]
    public string HighlightPostTag { get; set; }

    /// <summary>
    /// String used as an ellipsis indicator when a snippet is truncated.
    /// </summary>
    /// <value>String used as an ellipsis indicator when a snippet is truncated.</value>
    [DataMember(Name = "snippetEllipsisText", EmitDefaultValue = false)]
    public string SnippetEllipsisText { get; set; }

    /// <summary>
    /// Restrict highlighting and snippeting to items that matched the query.
    /// </summary>
    /// <value>Restrict highlighting and snippeting to items that matched the query.</value>
    [DataMember(Name = "restrictHighlightAndSnippetArrays", EmitDefaultValue = true)]
    public bool RestrictHighlightAndSnippetArrays { get; set; }

    /// <summary>
    /// Number of hits per page.
    /// </summary>
    /// <value>Number of hits per page.</value>
    [DataMember(Name = "hitsPerPage", EmitDefaultValue = false)]
    public int HitsPerPage { get; set; }

    /// <summary>
    /// Minimum number of characters a word in the query string must contain to accept matches with [one typo](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos).
    /// </summary>
    /// <value>Minimum number of characters a word in the query string must contain to accept matches with [one typo](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos).</value>
    [DataMember(Name = "minWordSizefor1Typo", EmitDefaultValue = false)]
    public int MinWordSizefor1Typo { get; set; }

    /// <summary>
    /// Minimum number of characters a word in the query string must contain to accept matches with [two typos](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos).
    /// </summary>
    /// <value>Minimum number of characters a word in the query string must contain to accept matches with [two typos](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/in-depth/configuring-typo-tolerance/#configuring-word-length-for-typos).</value>
    [DataMember(Name = "minWordSizefor2Typos", EmitDefaultValue = false)]
    public int MinWordSizefor2Typos { get; set; }

    /// <summary>
    /// Gets or Sets TypoTolerance
    /// </summary>
    [DataMember(Name = "typoTolerance", EmitDefaultValue = false)]
    public TypoTolerance TypoTolerance { get; set; }

    /// <summary>
    /// Whether to allow typos on numbers (\&quot;numeric tokens\&quot;) in the query string.
    /// </summary>
    /// <value>Whether to allow typos on numbers (\&quot;numeric tokens\&quot;) in the query string.</value>
    [DataMember(Name = "allowTyposOnNumericTokens", EmitDefaultValue = true)]
    public bool AllowTyposOnNumericTokens { get; set; }

    /// <summary>
    /// Attributes for which you want to turn off [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/).
    /// </summary>
    /// <value>Attributes for which you want to turn off [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/).</value>
    [DataMember(Name = "disableTypoToleranceOnAttributes", EmitDefaultValue = false)]
    public List<string> DisableTypoToleranceOnAttributes { get; set; }

    /// <summary>
    /// Gets or Sets IgnorePlurals
    /// </summary>
    [DataMember(Name = "ignorePlurals", EmitDefaultValue = false)]
    public IgnorePlurals IgnorePlurals { get; set; }

    /// <summary>
    /// Gets or Sets RemoveStopWords
    /// </summary>
    [DataMember(Name = "removeStopWords", EmitDefaultValue = false)]
    public RemoveStopWords RemoveStopWords { get; set; }

    /// <summary>
    /// Characters that the engine shouldn&#39;t automatically [normalize](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/).
    /// </summary>
    /// <value>Characters that the engine shouldn&#39;t automatically [normalize](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/).</value>
    [DataMember(Name = "keepDiacriticsOnCharacters", EmitDefaultValue = false)]
    public string KeepDiacriticsOnCharacters { get; set; }

    /// <summary>
    /// Sets your user&#39;s search language. This adjusts language-specific settings and features such as &#x60;ignorePlurals&#x60;, &#x60;removeStopWords&#x60;, and [CJK](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/#normalization-for-logogram-based-languages-cjk) word detection.
    /// </summary>
    /// <value>Sets your user&#39;s search language. This adjusts language-specific settings and features such as &#x60;ignorePlurals&#x60;, &#x60;removeStopWords&#x60;, and [CJK](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/#normalization-for-logogram-based-languages-cjk) word detection.</value>
    [DataMember(Name = "queryLanguages", EmitDefaultValue = false)]
    public List<string> QueryLanguages { get; set; }

    /// <summary>
    /// [Splits compound words](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/#splitting-compound-words) into their component word parts in the query. 
    /// </summary>
    /// <value>[Splits compound words](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/#splitting-compound-words) into their component word parts in the query. </value>
    [DataMember(Name = "decompoundQuery", EmitDefaultValue = true)]
    public bool DecompoundQuery { get; set; }

    /// <summary>
    /// Incidates whether [Rules](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/) are enabled.
    /// </summary>
    /// <value>Incidates whether [Rules](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/) are enabled.</value>
    [DataMember(Name = "enableRules", EmitDefaultValue = true)]
    public bool EnableRules { get; set; }

    /// <summary>
    /// Incidates whether [Personalization](https://www.algolia.com/doc/guides/personalization/what-is-personalization/) is enabled.
    /// </summary>
    /// <value>Incidates whether [Personalization](https://www.algolia.com/doc/guides/personalization/what-is-personalization/) is enabled.</value>
    [DataMember(Name = "enablePersonalization", EmitDefaultValue = true)]
    public bool EnablePersonalization { get; set; }

    /// <summary>
    /// Gets or Sets SemanticSearch
    /// </summary>
    [DataMember(Name = "semanticSearch", EmitDefaultValue = false)]
    public SemanticSearch SemanticSearch { get; set; }

    /// <summary>
    /// Enables the [advanced query syntax](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/#advanced-syntax).
    /// </summary>
    /// <value>Enables the [advanced query syntax](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/#advanced-syntax).</value>
    [DataMember(Name = "advancedSyntax", EmitDefaultValue = true)]
    public bool AdvancedSyntax { get; set; }

    /// <summary>
    /// Words which should be considered [optional](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/empty-or-insufficient-results/#creating-a-list-of-optional-words) when found in a query.
    /// </summary>
    /// <value>Words which should be considered [optional](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/empty-or-insufficient-results/#creating-a-list-of-optional-words) when found in a query.</value>
    [DataMember(Name = "optionalWords", EmitDefaultValue = false)]
    public List<string> OptionalWords { get; set; }

    /// <summary>
    /// Attributes for which you want to [turn off the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes).
    /// </summary>
    /// <value>Attributes for which you want to [turn off the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes).</value>
    [DataMember(Name = "disableExactOnAttributes", EmitDefaultValue = false)]
    public List<string> DisableExactOnAttributes { get; set; }

    /// <summary>
    /// Alternatives that should be considered an exact match by [the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes).
    /// </summary>
    /// <value>Alternatives that should be considered an exact match by [the exact ranking criterion](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/in-depth/adjust-exact-settings/#turn-off-exact-for-some-attributes).</value>
    [DataMember(Name = "alternativesAsExact", EmitDefaultValue = false)]
    public List<AlternativesAsExact> AlternativesAsExact { get; set; }

    /// <summary>
    /// Allows you to specify which advanced syntax features are active when &#x60;advancedSyntax&#x60; is enabled.
    /// </summary>
    /// <value>Allows you to specify which advanced syntax features are active when &#x60;advancedSyntax&#x60; is enabled.</value>
    [DataMember(Name = "advancedSyntaxFeatures", EmitDefaultValue = false)]
    public List<AdvancedSyntaxFeatures> AdvancedSyntaxFeatures { get; set; }

    /// <summary>
    /// Gets or Sets Distinct
    /// </summary>
    [DataMember(Name = "distinct", EmitDefaultValue = false)]
    public Distinct Distinct { get; set; }

    /// <summary>
    /// Whether to highlight and snippet the original word that matches the synonym or the synonym itself.
    /// </summary>
    /// <value>Whether to highlight and snippet the original word that matches the synonym or the synonym itself.</value>
    [DataMember(Name = "replaceSynonymsInHighlight", EmitDefaultValue = true)]
    public bool ReplaceSynonymsInHighlight { get; set; }

    /// <summary>
    /// Precision of the [proximity ranking criterion](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#proximity).
    /// </summary>
    /// <value>Precision of the [proximity ranking criterion](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#proximity).</value>
    [DataMember(Name = "minProximity", EmitDefaultValue = false)]
    public int MinProximity { get; set; }

    /// <summary>
    /// Attributes to include in the API response for search and browse queries.
    /// </summary>
    /// <value>Attributes to include in the API response for search and browse queries.</value>
    [DataMember(Name = "responseFields", EmitDefaultValue = false)]
    public List<string> ResponseFields { get; set; }

    /// <summary>
    /// Maximum number of facet hits to return when [searching for facet values](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#search-for-facet-values).
    /// </summary>
    /// <value>Maximum number of facet hits to return when [searching for facet values](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#search-for-facet-values).</value>
    [DataMember(Name = "maxFacetHits", EmitDefaultValue = false)]
    public int MaxFacetHits { get; set; }

    /// <summary>
    /// Maximum number of facet values to return for each facet.
    /// </summary>
    /// <value>Maximum number of facet values to return for each facet.</value>
    [DataMember(Name = "maxValuesPerFacet", EmitDefaultValue = false)]
    public int MaxValuesPerFacet { get; set; }

    /// <summary>
    /// Controls how facet values are fetched.
    /// </summary>
    /// <value>Controls how facet values are fetched.</value>
    [DataMember(Name = "sortFacetValuesBy", EmitDefaultValue = false)]
    public string SortFacetValuesBy { get; set; }

    /// <summary>
    /// When the [Attribute criterion is ranked above Proximity](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#attribute-and-proximity-combinations) in your ranking formula, Proximity is used to select which searchable attribute is matched in the Attribute ranking stage.
    /// </summary>
    /// <value>When the [Attribute criterion is ranked above Proximity](https://www.algolia.com/doc/guides/managing-results/relevance-overview/in-depth/ranking-criteria/#attribute-and-proximity-combinations) in your ranking formula, Proximity is used to select which searchable attribute is matched in the Attribute ranking stage.</value>
    [DataMember(Name = "attributeCriteriaComputedByMinProximity", EmitDefaultValue = true)]
    public bool AttributeCriteriaComputedByMinProximity { get; set; }

    /// <summary>
    /// Gets or Sets RenderingContent
    /// </summary>
    [DataMember(Name = "renderingContent", EmitDefaultValue = false)]
    public RenderingContent RenderingContent { get; set; }

    /// <summary>
    /// Indicates whether this search will use [Dynamic Re-Ranking](https://www.algolia.com/doc/guides/algolia-ai/re-ranking/).
    /// </summary>
    /// <value>Indicates whether this search will use [Dynamic Re-Ranking](https://www.algolia.com/doc/guides/algolia-ai/re-ranking/).</value>
    [DataMember(Name = "enableReRanking", EmitDefaultValue = true)]
    public bool EnableReRanking { get; set; }

    /// <summary>
    /// Gets or Sets ReRankingApplyFilter
    /// </summary>
    [DataMember(Name = "reRankingApplyFilter", EmitDefaultValue = true)]
    public ReRankingApplyFilter ReRankingApplyFilter { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class IndexSettingsAsSearchParams {\n");
      sb.Append("  AttributesForFaceting: ").Append(AttributesForFaceting).Append("\n");
      sb.Append("  AttributesToRetrieve: ").Append(AttributesToRetrieve).Append("\n");
      sb.Append("  Ranking: ").Append(Ranking).Append("\n");
      sb.Append("  CustomRanking: ").Append(CustomRanking).Append("\n");
      sb.Append("  RelevancyStrictness: ").Append(RelevancyStrictness).Append("\n");
      sb.Append("  AttributesToHighlight: ").Append(AttributesToHighlight).Append("\n");
      sb.Append("  AttributesToSnippet: ").Append(AttributesToSnippet).Append("\n");
      sb.Append("  HighlightPreTag: ").Append(HighlightPreTag).Append("\n");
      sb.Append("  HighlightPostTag: ").Append(HighlightPostTag).Append("\n");
      sb.Append("  SnippetEllipsisText: ").Append(SnippetEllipsisText).Append("\n");
      sb.Append("  RestrictHighlightAndSnippetArrays: ").Append(RestrictHighlightAndSnippetArrays).Append("\n");
      sb.Append("  HitsPerPage: ").Append(HitsPerPage).Append("\n");
      sb.Append("  MinWordSizefor1Typo: ").Append(MinWordSizefor1Typo).Append("\n");
      sb.Append("  MinWordSizefor2Typos: ").Append(MinWordSizefor2Typos).Append("\n");
      sb.Append("  TypoTolerance: ").Append(TypoTolerance).Append("\n");
      sb.Append("  AllowTyposOnNumericTokens: ").Append(AllowTyposOnNumericTokens).Append("\n");
      sb.Append("  DisableTypoToleranceOnAttributes: ").Append(DisableTypoToleranceOnAttributes).Append("\n");
      sb.Append("  IgnorePlurals: ").Append(IgnorePlurals).Append("\n");
      sb.Append("  RemoveStopWords: ").Append(RemoveStopWords).Append("\n");
      sb.Append("  KeepDiacriticsOnCharacters: ").Append(KeepDiacriticsOnCharacters).Append("\n");
      sb.Append("  QueryLanguages: ").Append(QueryLanguages).Append("\n");
      sb.Append("  DecompoundQuery: ").Append(DecompoundQuery).Append("\n");
      sb.Append("  EnableRules: ").Append(EnableRules).Append("\n");
      sb.Append("  EnablePersonalization: ").Append(EnablePersonalization).Append("\n");
      sb.Append("  QueryType: ").Append(QueryType).Append("\n");
      sb.Append("  RemoveWordsIfNoResults: ").Append(RemoveWordsIfNoResults).Append("\n");
      sb.Append("  Mode: ").Append(Mode).Append("\n");
      sb.Append("  SemanticSearch: ").Append(SemanticSearch).Append("\n");
      sb.Append("  AdvancedSyntax: ").Append(AdvancedSyntax).Append("\n");
      sb.Append("  OptionalWords: ").Append(OptionalWords).Append("\n");
      sb.Append("  DisableExactOnAttributes: ").Append(DisableExactOnAttributes).Append("\n");
      sb.Append("  ExactOnSingleWordQuery: ").Append(ExactOnSingleWordQuery).Append("\n");
      sb.Append("  AlternativesAsExact: ").Append(AlternativesAsExact).Append("\n");
      sb.Append("  AdvancedSyntaxFeatures: ").Append(AdvancedSyntaxFeatures).Append("\n");
      sb.Append("  Distinct: ").Append(Distinct).Append("\n");
      sb.Append("  ReplaceSynonymsInHighlight: ").Append(ReplaceSynonymsInHighlight).Append("\n");
      sb.Append("  MinProximity: ").Append(MinProximity).Append("\n");
      sb.Append("  ResponseFields: ").Append(ResponseFields).Append("\n");
      sb.Append("  MaxFacetHits: ").Append(MaxFacetHits).Append("\n");
      sb.Append("  MaxValuesPerFacet: ").Append(MaxValuesPerFacet).Append("\n");
      sb.Append("  SortFacetValuesBy: ").Append(SortFacetValuesBy).Append("\n");
      sb.Append("  AttributeCriteriaComputedByMinProximity: ").Append(AttributeCriteriaComputedByMinProximity).Append("\n");
      sb.Append("  RenderingContent: ").Append(RenderingContent).Append("\n");
      sb.Append("  EnableReRanking: ").Append(EnableReRanking).Append("\n");
      sb.Append("  ReRankingApplyFilter: ").Append(ReRankingApplyFilter).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Returns the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public virtual string ToJson()
    {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

  }

}
