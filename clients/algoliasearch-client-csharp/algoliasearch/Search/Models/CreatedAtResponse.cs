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
  /// Response and creation timestamp.
  /// </summary>
  [DataContract(Name = "createdAtResponse")]
  public partial class CreatedAtResponse
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="CreatedAtResponse" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected CreatedAtResponse() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="CreatedAtResponse" /> class.
    /// </summary>
    /// <param name="createdAt">Timestamp of creation in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format. (required).</param>
    public CreatedAtResponse(string createdAt = default(string))
    {
      // to ensure "createdAt" is required (not null)
      if (createdAt == null)
      {
        throw new ArgumentNullException("createdAt is a required property for CreatedAtResponse and cannot be null");
      }
      this.CreatedAt = createdAt;
    }

    /// <summary>
    /// Timestamp of creation in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format.
    /// </summary>
    /// <value>Timestamp of creation in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format.</value>
    [DataMember(Name = "createdAt", IsRequired = true, EmitDefaultValue = true)]
    public string CreatedAt { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class CreatedAtResponse {\n");
      sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
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
