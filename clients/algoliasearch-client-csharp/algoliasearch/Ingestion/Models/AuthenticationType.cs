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
  /// Type of the Authentication, defines what kind of object is stored in the input.
  /// </summary>
  /// <value>Type of the Authentication, defines what kind of object is stored in the input.</value>
  [JsonConverter(typeof(StringEnumConverter))]
  public enum AuthenticationType
  {
    /// <summary>
    /// Enum GoogleServiceAccount for value: googleServiceAccount
    /// </summary>
    [EnumMember(Value = "googleServiceAccount")]
    GoogleServiceAccount = 1,

    /// <summary>
    /// Enum Basic for value: basic
    /// </summary>
    [EnumMember(Value = "basic")]
    Basic = 2,

    /// <summary>
    /// Enum ApiKey for value: apiKey
    /// </summary>
    [EnumMember(Value = "apiKey")]
    ApiKey = 3,

    /// <summary>
    /// Enum Oauth for value: oauth
    /// </summary>
    [EnumMember(Value = "oauth")]
    Oauth = 4,

    /// <summary>
    /// Enum Algolia for value: algolia
    /// </summary>
    [EnumMember(Value = "algolia")]
    Algolia = 5
  }

}
