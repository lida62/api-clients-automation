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
  /// RunProgress
  /// </summary>
  [DataContract(Name = "Run_progress")]
  public partial class RunProgress
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="RunProgress" /> class.
    /// </summary>
    /// <param name="expectedNbOfEvents">expectedNbOfEvents.</param>
    /// <param name="receivedNbOfEvents">receivedNbOfEvents.</param>
    public RunProgress(int expectedNbOfEvents = default(int), int receivedNbOfEvents = default(int))
    {
      this.ExpectedNbOfEvents = expectedNbOfEvents;
      this.ReceivedNbOfEvents = receivedNbOfEvents;
    }

    /// <summary>
    /// Gets or Sets ExpectedNbOfEvents
    /// </summary>
    [DataMember(Name = "expectedNbOfEvents", EmitDefaultValue = false)]
    public int ExpectedNbOfEvents { get; set; }

    /// <summary>
    /// Gets or Sets ReceivedNbOfEvents
    /// </summary>
    [DataMember(Name = "receivedNbOfEvents", EmitDefaultValue = false)]
    public int ReceivedNbOfEvents { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class RunProgress {\n");
      sb.Append("  ExpectedNbOfEvents: ").Append(ExpectedNbOfEvents).Append("\n");
      sb.Append("  ReceivedNbOfEvents: ").Append(ReceivedNbOfEvents).Append("\n");
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
