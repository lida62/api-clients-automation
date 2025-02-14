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
  /// AroundPrecisionFromValueInner
  /// </summary>
  [DataContract(Name = "aroundPrecisionFromValue_inner")]
  public partial class AroundPrecisionFromValueInner
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="AroundPrecisionFromValueInner" /> class.
    /// </summary>
    /// <param name="from">from.</param>
    /// <param name="value">value.</param>
    public AroundPrecisionFromValueInner(int from = default(int), int value = default(int))
    {
      this.From = from;
      this.Value = value;
    }

    /// <summary>
    /// Gets or Sets From
    /// </summary>
    [DataMember(Name = "from", EmitDefaultValue = false)]
    public int From { get; set; }

    /// <summary>
    /// Gets or Sets Value
    /// </summary>
    [DataMember(Name = "value", EmitDefaultValue = false)]
    public int Value { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class AroundPrecisionFromValueInner {\n");
      sb.Append("  From: ").Append(From).Append("\n");
      sb.Append("  Value: ").Append(Value).Append("\n");
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
