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
  /// Redirect rule data.
  /// </summary>
  [DataContract(Name = "RedirectRuleIndexMetadata_data")]
  public partial class RedirectRuleIndexMetadataData
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="RedirectRuleIndexMetadataData" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected RedirectRuleIndexMetadataData() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="RedirectRuleIndexMetadataData" /> class.
    /// </summary>
    /// <param name="ruleObjectID">ruleObjectID (required).</param>
    public RedirectRuleIndexMetadataData(string ruleObjectID = default(string))
    {
      // to ensure "ruleObjectID" is required (not null)
      if (ruleObjectID == null)
      {
        throw new ArgumentNullException("ruleObjectID is a required property for RedirectRuleIndexMetadataData and cannot be null");
      }
      this.RuleObjectID = ruleObjectID;
    }

    /// <summary>
    /// Gets or Sets RuleObjectID
    /// </summary>
    [DataMember(Name = "ruleObjectID", IsRequired = true, EmitDefaultValue = true)]
    public string RuleObjectID { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class RedirectRuleIndexMetadataData {\n");
      sb.Append("  RuleObjectID: ").Append(RuleObjectID).Append("\n");
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
