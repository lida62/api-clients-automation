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
  /// Used to filter Authentication without platform property.
  /// </summary>
  /// <value>Used to filter Authentication without platform property.</value>
  [JsonConverter(typeof(StringEnumConverter))]
  public enum PlatformNone
  {
    /// <summary>
    /// Enum None for value: none
    /// </summary>
    [EnumMember(Value = "none")]
    None = 1
  }

}
