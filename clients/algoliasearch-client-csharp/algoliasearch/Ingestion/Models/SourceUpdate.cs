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
  /// SourceUpdate
  /// </summary>
  [DataContract(Name = "SourceUpdate")]
  public partial class SourceUpdate
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="SourceUpdate" /> class.
    /// </summary>
    /// <param name="name">name.</param>
    /// <param name="input">input.</param>
    /// <param name="authenticationID">The authentication UUID..</param>
    public SourceUpdate(string name = default(string), SourceUpdateInput input = default(SourceUpdateInput), string authenticationID = default(string))
    {
      this.Name = name;
      this.Input = input;
      this.AuthenticationID = authenticationID;
    }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name = "name", EmitDefaultValue = false)]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Input
    /// </summary>
    [DataMember(Name = "input", EmitDefaultValue = false)]
    public SourceUpdateInput Input { get; set; }

    /// <summary>
    /// The authentication UUID.
    /// </summary>
    /// <value>The authentication UUID.</value>
    [DataMember(Name = "authenticationID", EmitDefaultValue = false)]
    public string AuthenticationID { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class SourceUpdate {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Input: ").Append(Input).Append("\n");
      sb.Append("  AuthenticationID: ").Append(AuthenticationID).Append("\n");
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
