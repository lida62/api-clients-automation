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
  /// SearchSynonymsResponse
  /// </summary>
  [DataContract(Name = "searchSynonymsResponse")]
  public partial class SearchSynonymsResponse
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="SearchSynonymsResponse" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected SearchSynonymsResponse()
    {
      this.AdditionalProperties = new Dictionary<string, object>();
    }
    /// <summary>
    /// Initializes a new instance of the <see cref="SearchSynonymsResponse" /> class.
    /// </summary>
    /// <param name="hits">Synonym objects. (required).</param>
    /// <param name="nbHits">Number of hits the search query matched. (required).</param>
    public SearchSynonymsResponse(List<SynonymHit> hits = default(List<SynonymHit>), int nbHits = default(int))
    {
      // to ensure "hits" is required (not null)
      if (hits == null)
      {
        throw new ArgumentNullException("hits is a required property for SearchSynonymsResponse and cannot be null");
      }
      this.Hits = hits;
      this.NbHits = nbHits;
      this.AdditionalProperties = new Dictionary<string, object>();
    }

    /// <summary>
    /// Synonym objects.
    /// </summary>
    /// <value>Synonym objects.</value>
    [DataMember(Name = "hits", IsRequired = true, EmitDefaultValue = true)]
    public List<SynonymHit> Hits { get; set; }

    /// <summary>
    /// Number of hits the search query matched.
    /// </summary>
    /// <value>Number of hits the search query matched.</value>
    [DataMember(Name = "nbHits", IsRequired = true, EmitDefaultValue = true)]
    public int NbHits { get; set; }

    /// <summary>
    /// Gets or Sets additional properties
    /// </summary>
    [JsonExtensionData]
    public IDictionary<string, object> AdditionalProperties { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class SearchSynonymsResponse {\n");
      sb.Append("  Hits: ").Append(Hits).Append("\n");
      sb.Append("  NbHits: ").Append(NbHits).Append("\n");
      sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
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
