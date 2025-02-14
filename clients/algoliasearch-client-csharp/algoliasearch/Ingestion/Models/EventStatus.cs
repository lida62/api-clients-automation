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
  /// Defines EventStatus
  /// </summary>
  [JsonConverter(typeof(StringEnumConverter))]
  public enum EventStatus
  {
    /// <summary>
    /// Enum Created for value: created
    /// </summary>
    [EnumMember(Value = "created")]
    Created = 1,

    /// <summary>
    /// Enum Started for value: started
    /// </summary>
    [EnumMember(Value = "started")]
    Started = 2,

    /// <summary>
    /// Enum Retried for value: retried
    /// </summary>
    [EnumMember(Value = "retried")]
    Retried = 3,

    /// <summary>
    /// Enum Failed for value: failed
    /// </summary>
    [EnumMember(Value = "failed")]
    Failed = 4,

    /// <summary>
    /// Enum Succeeded for value: succeeded
    /// </summary>
    [EnumMember(Value = "succeeded")]
    Succeeded = 5,

    /// <summary>
    /// Enum Critical for value: critical
    /// </summary>
    [EnumMember(Value = "critical")]
    Critical = 6
  }

}
