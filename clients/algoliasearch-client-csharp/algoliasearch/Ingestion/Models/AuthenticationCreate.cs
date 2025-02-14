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
  /// The payload when creating an authentication.
  /// </summary>
  [DataContract(Name = "AuthenticationCreate")]
  public partial class AuthenticationCreate
  {

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
    public AuthenticationType Type { get; set; }

    /// <summary>
    /// Gets or Sets Platform
    /// </summary>
    [DataMember(Name = "platform", EmitDefaultValue = false)]
    public Platform? Platform { get; set; }
    /// <summary>
    /// Initializes a new instance of the <see cref="AuthenticationCreate" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected AuthenticationCreate() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="AuthenticationCreate" /> class.
    /// </summary>
    /// <param name="type">type (required).</param>
    /// <param name="name">An human readable name describing the object. (required).</param>
    /// <param name="platform">platform.</param>
    /// <param name="input">input (required).</param>
    public AuthenticationCreate(AuthenticationType type = default(AuthenticationType), string name = default(string), Platform? platform = default(Platform?), AuthInput input = default(AuthInput))
    {
      this.Type = type;
      // to ensure "name" is required (not null)
      if (name == null)
      {
        throw new ArgumentNullException("name is a required property for AuthenticationCreate and cannot be null");
      }
      this.Name = name;
      // to ensure "input" is required (not null)
      if (input == null)
      {
        throw new ArgumentNullException("input is a required property for AuthenticationCreate and cannot be null");
      }
      this.Input = input;
      this.Platform = platform;
    }

    /// <summary>
    /// An human readable name describing the object.
    /// </summary>
    /// <value>An human readable name describing the object.</value>
    [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Input
    /// </summary>
    [DataMember(Name = "input", IsRequired = true, EmitDefaultValue = true)]
    public AuthInput Input { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class AuthenticationCreate {\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Platform: ").Append(Platform).Append("\n");
      sb.Append("  Input: ").Append(Input).Append("\n");
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
