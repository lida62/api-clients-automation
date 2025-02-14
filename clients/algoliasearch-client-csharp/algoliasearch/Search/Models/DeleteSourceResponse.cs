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
  /// DeleteSourceResponse
  /// </summary>
  [DataContract(Name = "deleteSourceResponse")]
  public partial class DeleteSourceResponse
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="DeleteSourceResponse" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected DeleteSourceResponse() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="DeleteSourceResponse" /> class.
    /// </summary>
    /// <param name="deletedAt">Timestamp of deletion in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format. (required).</param>
    public DeleteSourceResponse(string deletedAt = default(string))
    {
      // to ensure "deletedAt" is required (not null)
      if (deletedAt == null)
      {
        throw new ArgumentNullException("deletedAt is a required property for DeleteSourceResponse and cannot be null");
      }
      this.DeletedAt = deletedAt;
    }

    /// <summary>
    /// Timestamp of deletion in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
    /// </summary>
    /// <value>Timestamp of deletion in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.</value>
    [DataMember(Name = "deletedAt", IsRequired = true, EmitDefaultValue = true)]
    public string DeletedAt { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class DeleteSourceResponse {\n");
      sb.Append("  DeletedAt: ").Append(DeletedAt).Append("\n");
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
