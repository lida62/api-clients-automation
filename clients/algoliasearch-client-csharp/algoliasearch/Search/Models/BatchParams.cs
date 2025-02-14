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
  /// Batch parameters.
  /// </summary>
  [DataContract(Name = "batchParams")]
  public partial class BatchParams
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="BatchParams" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected BatchParams() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="BatchParams" /> class.
    /// </summary>
    /// <param name="requests">requests (required).</param>
    public BatchParams(List<MultipleBatchRequest> requests = default(List<MultipleBatchRequest>))
    {
      // to ensure "requests" is required (not null)
      if (requests == null)
      {
        throw new ArgumentNullException("requests is a required property for BatchParams and cannot be null");
      }
      this.Requests = requests;
    }

    /// <summary>
    /// Gets or Sets Requests
    /// </summary>
    [DataMember(Name = "requests", IsRequired = true, EmitDefaultValue = true)]
    public List<MultipleBatchRequest> Requests { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class BatchParams {\n");
      sb.Append("  Requests: ").Append(Requests).Append("\n");
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
