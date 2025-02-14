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

namespace Algolia.Search.Ingestion.Models
{
  /// <summary>
  /// SourceSearch
  /// </summary>
  [DataContract(Name = "SourceSearch")]
  public partial class SourceSearch
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="SourceSearch" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected SourceSearch() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="SourceSearch" /> class.
    /// </summary>
    /// <param name="sourceIDs">sourceIDs (required).</param>
    public SourceSearch(List<string> sourceIDs = default(List<string>))
    {
      // to ensure "sourceIDs" is required (not null)
      if (sourceIDs == null)
      {
        throw new ArgumentNullException("sourceIDs is a required property for SourceSearch and cannot be null");
      }
      this.SourceIDs = sourceIDs;
    }

    /// <summary>
    /// Gets or Sets SourceIDs
    /// </summary>
    [DataMember(Name = "sourceIDs", IsRequired = true, EmitDefaultValue = true)]
    public List<string> SourceIDs { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class SourceSearch {\n");
      sb.Append("  SourceIDs: ").Append(SourceIDs).Append("\n");
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
