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
  /// BaseIndexSettings
  /// </summary>
  [DataContract(Name = "baseIndexSettings")]
  public partial class BaseIndexSettings
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="BaseIndexSettings" /> class.
    /// </summary>
    /// <param name="replicas">Creates [replicas](https://www.algolia.com/doc/guides/managing-results/refine-results/sorting/in-depth/replicas/), which are copies of a primary index with the same records but different settings..</param>
    /// <param name="paginationLimitedTo">Maximum number of hits accessible through pagination. (default to 1000).</param>
    /// <param name="unretrievableAttributes">Attributes that can&#39;t be retrieved at query time..</param>
    /// <param name="disableTypoToleranceOnWords">Words for which you want to turn off [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/)..</param>
    /// <param name="attributesToTransliterate">Attributes in your index to which [Japanese transliteration](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/#japanese-transliteration-and-type-ahead) applies. This will ensure that words indexed in Katakana or Kanji can also be searched in Hiragana..</param>
    /// <param name="camelCaseAttributes">Attributes on which to split [camel case](https://wikipedia.org/wiki/Camel_case) words..</param>
    /// <param name="decompoundedAttributes">Attributes in your index to which [word segmentation](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/how-to/customize-segmentation/) (decompounding) applies..</param>
    /// <param name="indexLanguages">Set the languages of your index, for language-specific processing steps such as [tokenization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/tokenization/) and [normalization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/)..</param>
    /// <param name="disablePrefixOnAttributes">Attributes for which you want to turn off [prefix matching](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/#adjusting-prefix-search)..</param>
    /// <param name="allowCompressionOfIntegerArray">Incidates whether the engine compresses arrays with exclusively non-negative integers. When enabled, the compressed arrays may be reordered.  (default to false).</param>
    /// <param name="numericAttributesForFiltering">Numeric attributes that can be used as [numerical filters](https://www.algolia.com/doc/guides/managing-results/rules/detecting-intent/how-to/applying-a-custom-filter-for-a-specific-query/#numerical-filters)..</param>
    /// <param name="separatorsToIndex">Controls which separators are added to an Algolia index as part of [normalization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/#what-does-normalization-mean). Separators are all non-letter characters except spaces and currency characters, such as $€£¥. (default to &quot;&quot;).</param>
    /// <param name="searchableAttributes">[Attributes used for searching](https://www.algolia.com/doc/guides/managing-results/must-do/searchable-attributes/), including determining [if matches at the beginning of a word are important (ordered) or not (unordered)](https://www.algolia.com/doc/guides/managing-results/must-do/searchable-attributes/how-to/configuring-searchable-attributes-the-right-way/#understanding-word-position). .</param>
    /// <param name="userData">Lets you store custom data in your indices..</param>
    /// <param name="customNormalization">A list of characters and their normalized replacements to override Algolia&#39;s default [normalization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/)..</param>
    /// <param name="attributeForDistinct">Name of the deduplication attribute to be used with Algolia&#39;s [_distinct_ feature](https://www.algolia.com/doc/guides/managing-results/refine-results/grouping/#introducing-algolias-distinct-feature)..</param>
    public BaseIndexSettings(List<string> replicas = default(List<string>), int paginationLimitedTo = 1000, List<string> unretrievableAttributes = default(List<string>), List<string> disableTypoToleranceOnWords = default(List<string>), List<string> attributesToTransliterate = default(List<string>), List<string> camelCaseAttributes = default(List<string>), Object decompoundedAttributes = default(Object), List<string> indexLanguages = default(List<string>), List<string> disablePrefixOnAttributes = default(List<string>), bool allowCompressionOfIntegerArray = false, List<string> numericAttributesForFiltering = default(List<string>), string separatorsToIndex = @"", List<string> searchableAttributes = default(List<string>), Object userData = default(Object), Dictionary<string, Dictionary<string, string>> customNormalization = default(Dictionary<string, Dictionary<string, string>>), string attributeForDistinct = default(string))
    {
      this.Replicas = replicas;
      this.PaginationLimitedTo = paginationLimitedTo;
      this.UnretrievableAttributes = unretrievableAttributes;
      this.DisableTypoToleranceOnWords = disableTypoToleranceOnWords;
      this.AttributesToTransliterate = attributesToTransliterate;
      this.CamelCaseAttributes = camelCaseAttributes;
      this.DecompoundedAttributes = decompoundedAttributes;
      this.IndexLanguages = indexLanguages;
      this.DisablePrefixOnAttributes = disablePrefixOnAttributes;
      this.AllowCompressionOfIntegerArray = allowCompressionOfIntegerArray;
      this.NumericAttributesForFiltering = numericAttributesForFiltering;
      // use default value if no "separatorsToIndex" provided
      this.SeparatorsToIndex = separatorsToIndex ?? @"";
      this.SearchableAttributes = searchableAttributes;
      this.UserData = userData;
      this.CustomNormalization = customNormalization;
      this.AttributeForDistinct = attributeForDistinct;
    }

    /// <summary>
    /// Creates [replicas](https://www.algolia.com/doc/guides/managing-results/refine-results/sorting/in-depth/replicas/), which are copies of a primary index with the same records but different settings.
    /// </summary>
    /// <value>Creates [replicas](https://www.algolia.com/doc/guides/managing-results/refine-results/sorting/in-depth/replicas/), which are copies of a primary index with the same records but different settings.</value>
    [DataMember(Name = "replicas", EmitDefaultValue = false)]
    public List<string> Replicas { get; set; }

    /// <summary>
    /// Maximum number of hits accessible through pagination.
    /// </summary>
    /// <value>Maximum number of hits accessible through pagination.</value>
    [DataMember(Name = "paginationLimitedTo", EmitDefaultValue = false)]
    public int PaginationLimitedTo { get; set; }

    /// <summary>
    /// Attributes that can&#39;t be retrieved at query time.
    /// </summary>
    /// <value>Attributes that can&#39;t be retrieved at query time.</value>
    [DataMember(Name = "unretrievableAttributes", EmitDefaultValue = false)]
    public List<string> UnretrievableAttributes { get; set; }

    /// <summary>
    /// Words for which you want to turn off [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/).
    /// </summary>
    /// <value>Words for which you want to turn off [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/).</value>
    [DataMember(Name = "disableTypoToleranceOnWords", EmitDefaultValue = false)]
    public List<string> DisableTypoToleranceOnWords { get; set; }

    /// <summary>
    /// Attributes in your index to which [Japanese transliteration](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/#japanese-transliteration-and-type-ahead) applies. This will ensure that words indexed in Katakana or Kanji can also be searched in Hiragana.
    /// </summary>
    /// <value>Attributes in your index to which [Japanese transliteration](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/language-specific-configurations/#japanese-transliteration-and-type-ahead) applies. This will ensure that words indexed in Katakana or Kanji can also be searched in Hiragana.</value>
    [DataMember(Name = "attributesToTransliterate", EmitDefaultValue = false)]
    public List<string> AttributesToTransliterate { get; set; }

    /// <summary>
    /// Attributes on which to split [camel case](https://wikipedia.org/wiki/Camel_case) words.
    /// </summary>
    /// <value>Attributes on which to split [camel case](https://wikipedia.org/wiki/Camel_case) words.</value>
    [DataMember(Name = "camelCaseAttributes", EmitDefaultValue = false)]
    public List<string> CamelCaseAttributes { get; set; }

    /// <summary>
    /// Attributes in your index to which [word segmentation](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/how-to/customize-segmentation/) (decompounding) applies.
    /// </summary>
    /// <value>Attributes in your index to which [word segmentation](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/how-to/customize-segmentation/) (decompounding) applies.</value>
    [DataMember(Name = "decompoundedAttributes", EmitDefaultValue = false)]
    public Object DecompoundedAttributes { get; set; }

    /// <summary>
    /// Set the languages of your index, for language-specific processing steps such as [tokenization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/tokenization/) and [normalization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/).
    /// </summary>
    /// <value>Set the languages of your index, for language-specific processing steps such as [tokenization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/tokenization/) and [normalization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/).</value>
    [DataMember(Name = "indexLanguages", EmitDefaultValue = false)]
    public List<string> IndexLanguages { get; set; }

    /// <summary>
    /// Attributes for which you want to turn off [prefix matching](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/#adjusting-prefix-search).
    /// </summary>
    /// <value>Attributes for which you want to turn off [prefix matching](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/override-search-engine-defaults/#adjusting-prefix-search).</value>
    [DataMember(Name = "disablePrefixOnAttributes", EmitDefaultValue = false)]
    public List<string> DisablePrefixOnAttributes { get; set; }

    /// <summary>
    /// Incidates whether the engine compresses arrays with exclusively non-negative integers. When enabled, the compressed arrays may be reordered. 
    /// </summary>
    /// <value>Incidates whether the engine compresses arrays with exclusively non-negative integers. When enabled, the compressed arrays may be reordered. </value>
    [DataMember(Name = "allowCompressionOfIntegerArray", EmitDefaultValue = true)]
    public bool AllowCompressionOfIntegerArray { get; set; }

    /// <summary>
    /// Numeric attributes that can be used as [numerical filters](https://www.algolia.com/doc/guides/managing-results/rules/detecting-intent/how-to/applying-a-custom-filter-for-a-specific-query/#numerical-filters).
    /// </summary>
    /// <value>Numeric attributes that can be used as [numerical filters](https://www.algolia.com/doc/guides/managing-results/rules/detecting-intent/how-to/applying-a-custom-filter-for-a-specific-query/#numerical-filters).</value>
    [DataMember(Name = "numericAttributesForFiltering", EmitDefaultValue = false)]
    public List<string> NumericAttributesForFiltering { get; set; }

    /// <summary>
    /// Controls which separators are added to an Algolia index as part of [normalization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/#what-does-normalization-mean). Separators are all non-letter characters except spaces and currency characters, such as $€£¥.
    /// </summary>
    /// <value>Controls which separators are added to an Algolia index as part of [normalization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/#what-does-normalization-mean). Separators are all non-letter characters except spaces and currency characters, such as $€£¥.</value>
    [DataMember(Name = "separatorsToIndex", EmitDefaultValue = false)]
    public string SeparatorsToIndex { get; set; }

    /// <summary>
    /// [Attributes used for searching](https://www.algolia.com/doc/guides/managing-results/must-do/searchable-attributes/), including determining [if matches at the beginning of a word are important (ordered) or not (unordered)](https://www.algolia.com/doc/guides/managing-results/must-do/searchable-attributes/how-to/configuring-searchable-attributes-the-right-way/#understanding-word-position). 
    /// </summary>
    /// <value>[Attributes used for searching](https://www.algolia.com/doc/guides/managing-results/must-do/searchable-attributes/), including determining [if matches at the beginning of a word are important (ordered) or not (unordered)](https://www.algolia.com/doc/guides/managing-results/must-do/searchable-attributes/how-to/configuring-searchable-attributes-the-right-way/#understanding-word-position). </value>
    [DataMember(Name = "searchableAttributes", EmitDefaultValue = false)]
    public List<string> SearchableAttributes { get; set; }

    /// <summary>
    /// Lets you store custom data in your indices.
    /// </summary>
    /// <value>Lets you store custom data in your indices.</value>
    [DataMember(Name = "userData", EmitDefaultValue = true)]
    public Object UserData { get; set; }

    /// <summary>
    /// A list of characters and their normalized replacements to override Algolia&#39;s default [normalization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/).
    /// </summary>
    /// <value>A list of characters and their normalized replacements to override Algolia&#39;s default [normalization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/in-depth/normalization/).</value>
    [DataMember(Name = "customNormalization", EmitDefaultValue = false)]
    public Dictionary<string, Dictionary<string, string>> CustomNormalization { get; set; }

    /// <summary>
    /// Name of the deduplication attribute to be used with Algolia&#39;s [_distinct_ feature](https://www.algolia.com/doc/guides/managing-results/refine-results/grouping/#introducing-algolias-distinct-feature).
    /// </summary>
    /// <value>Name of the deduplication attribute to be used with Algolia&#39;s [_distinct_ feature](https://www.algolia.com/doc/guides/managing-results/refine-results/grouping/#introducing-algolias-distinct-feature).</value>
    [DataMember(Name = "attributeForDistinct", EmitDefaultValue = false)]
    public string AttributeForDistinct { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class BaseIndexSettings {\n");
      sb.Append("  Replicas: ").Append(Replicas).Append("\n");
      sb.Append("  PaginationLimitedTo: ").Append(PaginationLimitedTo).Append("\n");
      sb.Append("  UnretrievableAttributes: ").Append(UnretrievableAttributes).Append("\n");
      sb.Append("  DisableTypoToleranceOnWords: ").Append(DisableTypoToleranceOnWords).Append("\n");
      sb.Append("  AttributesToTransliterate: ").Append(AttributesToTransliterate).Append("\n");
      sb.Append("  CamelCaseAttributes: ").Append(CamelCaseAttributes).Append("\n");
      sb.Append("  DecompoundedAttributes: ").Append(DecompoundedAttributes).Append("\n");
      sb.Append("  IndexLanguages: ").Append(IndexLanguages).Append("\n");
      sb.Append("  DisablePrefixOnAttributes: ").Append(DisablePrefixOnAttributes).Append("\n");
      sb.Append("  AllowCompressionOfIntegerArray: ").Append(AllowCompressionOfIntegerArray).Append("\n");
      sb.Append("  NumericAttributesForFiltering: ").Append(NumericAttributesForFiltering).Append("\n");
      sb.Append("  SeparatorsToIndex: ").Append(SeparatorsToIndex).Append("\n");
      sb.Append("  SearchableAttributes: ").Append(SearchableAttributes).Append("\n");
      sb.Append("  UserData: ").Append(UserData).Append("\n");
      sb.Append("  CustomNormalization: ").Append(CustomNormalization).Append("\n");
      sb.Append("  AttributeForDistinct: ").Append(AttributeForDistinct).Append("\n");
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
