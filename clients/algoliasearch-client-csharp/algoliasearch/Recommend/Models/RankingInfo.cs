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

namespace Algolia.Search.Recommend.Models
{
  /// <summary>
  /// RankingInfo
  /// </summary>
  [DataContract(Name = "rankingInfo")]
  public partial class RankingInfo
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="RankingInfo" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected RankingInfo() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="RankingInfo" /> class.
    /// </summary>
    /// <param name="filters">This field is reserved for advanced usage. (required).</param>
    /// <param name="firstMatchedWord">Position of the most important matched attribute in the attributes to index list. (required).</param>
    /// <param name="geoDistance">Distance between the geo location in the search query and the best matching geo location in the record, divided by the geo precision (in meters). (required).</param>
    /// <param name="geoPrecision">Precision used when computing the geo distance, in meters..</param>
    /// <param name="matchedGeoLocation">matchedGeoLocation.</param>
    /// <param name="personalization">personalization.</param>
    /// <param name="nbExactWords">Number of exactly matched words. (required).</param>
    /// <param name="nbTypos">Number of typos encountered when matching the record. (required).</param>
    /// <param name="promoted">Present and set to true if a Rule promoted the hit. (required).</param>
    /// <param name="proximityDistance">When the query contains more than one word, the sum of the distances between matched words (in meters)..</param>
    /// <param name="userScore">Custom ranking for the object, expressed as a single integer value. (required).</param>
    /// <param name="words">Number of matched words, including prefixes and typos. (required).</param>
    /// <param name="promotedByReRanking">Wether the record are promoted by the re-ranking strategy..</param>
    public RankingInfo(int filters = default(int), int firstMatchedWord = default(int), int geoDistance = default(int), int geoPrecision = default(int), MatchedGeoLocation matchedGeoLocation = default(MatchedGeoLocation), Personalization personalization = default(Personalization), int nbExactWords = default(int), int nbTypos = default(int), bool promoted = default(bool), int proximityDistance = default(int), int userScore = default(int), int words = default(int), bool promotedByReRanking = default(bool))
    {
      this.Filters = filters;
      this.FirstMatchedWord = firstMatchedWord;
      this.GeoDistance = geoDistance;
      this.NbExactWords = nbExactWords;
      this.NbTypos = nbTypos;
      this.Promoted = promoted;
      this.UserScore = userScore;
      this.Words = words;
      this.GeoPrecision = geoPrecision;
      this.MatchedGeoLocation = matchedGeoLocation;
      this.Personalization = personalization;
      this.ProximityDistance = proximityDistance;
      this.PromotedByReRanking = promotedByReRanking;
    }

    /// <summary>
    /// This field is reserved for advanced usage.
    /// </summary>
    /// <value>This field is reserved for advanced usage.</value>
    [DataMember(Name = "filters", IsRequired = true, EmitDefaultValue = true)]
    public int Filters { get; set; }

    /// <summary>
    /// Position of the most important matched attribute in the attributes to index list.
    /// </summary>
    /// <value>Position of the most important matched attribute in the attributes to index list.</value>
    [DataMember(Name = "firstMatchedWord", IsRequired = true, EmitDefaultValue = true)]
    public int FirstMatchedWord { get; set; }

    /// <summary>
    /// Distance between the geo location in the search query and the best matching geo location in the record, divided by the geo precision (in meters).
    /// </summary>
    /// <value>Distance between the geo location in the search query and the best matching geo location in the record, divided by the geo precision (in meters).</value>
    [DataMember(Name = "geoDistance", IsRequired = true, EmitDefaultValue = true)]
    public int GeoDistance { get; set; }

    /// <summary>
    /// Precision used when computing the geo distance, in meters.
    /// </summary>
    /// <value>Precision used when computing the geo distance, in meters.</value>
    [DataMember(Name = "geoPrecision", EmitDefaultValue = false)]
    public int GeoPrecision { get; set; }

    /// <summary>
    /// Gets or Sets MatchedGeoLocation
    /// </summary>
    [DataMember(Name = "matchedGeoLocation", EmitDefaultValue = false)]
    public MatchedGeoLocation MatchedGeoLocation { get; set; }

    /// <summary>
    /// Gets or Sets Personalization
    /// </summary>
    [DataMember(Name = "personalization", EmitDefaultValue = false)]
    public Personalization Personalization { get; set; }

    /// <summary>
    /// Number of exactly matched words.
    /// </summary>
    /// <value>Number of exactly matched words.</value>
    [DataMember(Name = "nbExactWords", IsRequired = true, EmitDefaultValue = true)]
    public int NbExactWords { get; set; }

    /// <summary>
    /// Number of typos encountered when matching the record.
    /// </summary>
    /// <value>Number of typos encountered when matching the record.</value>
    [DataMember(Name = "nbTypos", IsRequired = true, EmitDefaultValue = true)]
    public int NbTypos { get; set; }

    /// <summary>
    /// Present and set to true if a Rule promoted the hit.
    /// </summary>
    /// <value>Present and set to true if a Rule promoted the hit.</value>
    [DataMember(Name = "promoted", IsRequired = true, EmitDefaultValue = true)]
    public bool Promoted { get; set; }

    /// <summary>
    /// When the query contains more than one word, the sum of the distances between matched words (in meters).
    /// </summary>
    /// <value>When the query contains more than one word, the sum of the distances between matched words (in meters).</value>
    [DataMember(Name = "proximityDistance", EmitDefaultValue = false)]
    public int ProximityDistance { get; set; }

    /// <summary>
    /// Custom ranking for the object, expressed as a single integer value.
    /// </summary>
    /// <value>Custom ranking for the object, expressed as a single integer value.</value>
    [DataMember(Name = "userScore", IsRequired = true, EmitDefaultValue = true)]
    public int UserScore { get; set; }

    /// <summary>
    /// Number of matched words, including prefixes and typos.
    /// </summary>
    /// <value>Number of matched words, including prefixes and typos.</value>
    [DataMember(Name = "words", IsRequired = true, EmitDefaultValue = true)]
    public int Words { get; set; }

    /// <summary>
    /// Wether the record are promoted by the re-ranking strategy.
    /// </summary>
    /// <value>Wether the record are promoted by the re-ranking strategy.</value>
    [DataMember(Name = "promotedByReRanking", EmitDefaultValue = true)]
    public bool PromotedByReRanking { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class RankingInfo {\n");
      sb.Append("  Filters: ").Append(Filters).Append("\n");
      sb.Append("  FirstMatchedWord: ").Append(FirstMatchedWord).Append("\n");
      sb.Append("  GeoDistance: ").Append(GeoDistance).Append("\n");
      sb.Append("  GeoPrecision: ").Append(GeoPrecision).Append("\n");
      sb.Append("  MatchedGeoLocation: ").Append(MatchedGeoLocation).Append("\n");
      sb.Append("  Personalization: ").Append(Personalization).Append("\n");
      sb.Append("  NbExactWords: ").Append(NbExactWords).Append("\n");
      sb.Append("  NbTypos: ").Append(NbTypos).Append("\n");
      sb.Append("  Promoted: ").Append(Promoted).Append("\n");
      sb.Append("  ProximityDistance: ").Append(ProximityDistance).Append("\n");
      sb.Append("  UserScore: ").Append(UserScore).Append("\n");
      sb.Append("  Words: ").Append(Words).Append("\n");
      sb.Append("  PromotedByReRanking: ").Append(PromotedByReRanking).Append("\n");
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
