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

namespace Algolia.Search.Abtesting.Models
{
  /// <summary>
  /// Applies search parameters from [a restricted set of options](https://www.algolia.com/doc/api-reference/api-methods/add-ab-test/#method-param-customsearchparameters). Only use this parameter if the two variants use the same index.
  /// </summary>
  [DataContract(Name = "customSearchParams")]
  public partial class CustomSearchParams
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="CustomSearchParams" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected CustomSearchParams() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="CustomSearchParams" /> class.
    /// </summary>
    /// <param name="customSearchParameters">customSearchParameters (required).</param>
    public CustomSearchParams(Object customSearchParameters = default(Object))
    {
      // to ensure "customSearchParameters" is required (not null)
      if (customSearchParameters == null)
      {
        throw new ArgumentNullException("customSearchParameters is a required property for CustomSearchParams and cannot be null");
      }
      this.CustomSearchParameters = customSearchParameters;
    }

    /// <summary>
    /// Gets or Sets CustomSearchParameters
    /// </summary>
    [DataMember(Name = "customSearchParameters", IsRequired = true, EmitDefaultValue = true)]
    public Object CustomSearchParameters { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class CustomSearchParams {\n");
      sb.Append("  CustomSearchParameters: ").Append(CustomSearchParameters).Append("\n");
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
