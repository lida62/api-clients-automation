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
  /// The input for an &#x60;onDemand&#x60; task whose source is of type &#x60;bigquery&#x60; and for which extracted data spans a given time range.
  /// </summary>
  [DataContract(Name = "OnDemandDateUtilsInput")]
  public partial class OnDemandDateUtilsInput
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="OnDemandDateUtilsInput" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected OnDemandDateUtilsInput() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="OnDemandDateUtilsInput" /> class.
    /// </summary>
    /// <param name="startDate">The start date of the extraction (RFC3339 format). (required).</param>
    /// <param name="endDate">The end date of the extraction (RFC3339 format). (required).</param>
    public OnDemandDateUtilsInput(string startDate = default(string), string endDate = default(string))
    {
      // to ensure "startDate" is required (not null)
      if (startDate == null)
      {
        throw new ArgumentNullException("startDate is a required property for OnDemandDateUtilsInput and cannot be null");
      }
      this.StartDate = startDate;
      // to ensure "endDate" is required (not null)
      if (endDate == null)
      {
        throw new ArgumentNullException("endDate is a required property for OnDemandDateUtilsInput and cannot be null");
      }
      this.EndDate = endDate;
    }

    /// <summary>
    /// The start date of the extraction (RFC3339 format).
    /// </summary>
    /// <value>The start date of the extraction (RFC3339 format).</value>
    [DataMember(Name = "startDate", IsRequired = true, EmitDefaultValue = true)]
    public string StartDate { get; set; }

    /// <summary>
    /// The end date of the extraction (RFC3339 format).
    /// </summary>
    /// <value>The end date of the extraction (RFC3339 format).</value>
    [DataMember(Name = "endDate", IsRequired = true, EmitDefaultValue = true)]
    public string EndDate { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class OnDemandDateUtilsInput {\n");
      sb.Append("  StartDate: ").Append(StartDate).Append("\n");
      sb.Append("  EndDate: ").Append(EndDate).Append("\n");
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
