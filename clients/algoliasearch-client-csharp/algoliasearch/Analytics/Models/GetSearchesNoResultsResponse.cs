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

namespace Algolia.Search.Analytics.Models
{
  /// <summary>
  /// GetSearchesNoResultsResponse
  /// </summary>
  [DataContract(Name = "getSearchesNoResultsResponse")]
  public partial class GetSearchesNoResultsResponse
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="GetSearchesNoResultsResponse" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected GetSearchesNoResultsResponse() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="GetSearchesNoResultsResponse" /> class.
    /// </summary>
    /// <param name="searches">Searches with no results. (required).</param>
    public GetSearchesNoResultsResponse(List<SearchNoResultEvent> searches = default(List<SearchNoResultEvent>))
    {
      // to ensure "searches" is required (not null)
      if (searches == null)
      {
        throw new ArgumentNullException("searches is a required property for GetSearchesNoResultsResponse and cannot be null");
      }
      this.Searches = searches;
    }

    /// <summary>
    /// Searches with no results.
    /// </summary>
    /// <value>Searches with no results.</value>
    [DataMember(Name = "searches", IsRequired = true, EmitDefaultValue = true)]
    public List<SearchNoResultEvent> Searches { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class GetSearchesNoResultsResponse {\n");
      sb.Append("  Searches: ").Append(Searches).Append("\n");
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
