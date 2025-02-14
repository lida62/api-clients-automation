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
using System.Reflection;
using Algolia.Search.Models;

namespace Algolia.Search.Recommend.Models
{
  /// <summary>
  /// SnippetResult
  /// </summary>
  [JsonConverter(typeof(SnippetResultJsonConverter))]
  [DataContract(Name = "snippetResult")]
  public partial class SnippetResult : AbstractSchema
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="SnippetResult" /> class
    /// with the <see cref="SnippetResultOption" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of SnippetResultOption.</param>
    public SnippetResult(SnippetResultOption actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="SnippetResult" /> class
    /// with the <see cref="Dictionary{string, SnippetResultOption}" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of Dictionary&lt;string, SnippetResultOption&gt;.</param>
    public SnippetResult(Dictionary<string, SnippetResultOption> actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
    }


    private Object _actualInstance;

    /// <summary>
    /// Gets or Sets ActualInstance
    /// </summary>
    public override Object ActualInstance
    {
      get
      {
        return _actualInstance;
      }
      set
      {
        if (value.GetType() == typeof(Dictionary<string, SnippetResultOption>))
        {
          this._actualInstance = value;
        }
        else if (value.GetType() == typeof(SnippetResultOption))
        {
          this._actualInstance = value;
        }
        else
        {
          throw new ArgumentException("Invalid instance found. Must be the following types: Dictionary<string, SnippetResultOption>, SnippetResultOption");
        }
      }
    }

    /// <summary>
    /// Get the actual instance of `SnippetResultOption`. If the actual instance is not `SnippetResultOption`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of SnippetResultOption</returns>
    public SnippetResultOption GetterSnippetResultOption()
    {
      return (SnippetResultOption)this.ActualInstance;
    }

    /// <summary>
    /// Get the actual instance of `Dictionary&lt;string, SnippetResultOption&gt;`. If the actual instance is not `Dictionary&lt;string, SnippetResultOption&gt;`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of Dictionary&lt;string, SnippetResultOption&gt;</returns>
    public Dictionary<string, SnippetResultOption> GetterDictionary()
    {
      return (Dictionary<string, SnippetResultOption>)this.ActualInstance;
    }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      var sb = new StringBuilder();
      sb.Append("class SnippetResult {\n");
      sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Returns the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public override string ToJson()
    {
      return JsonConvert.SerializeObject(this.ActualInstance, SnippetResult.SerializerSettings);
    }

    /// <summary>
    /// Converts the JSON string into an instance of SnippetResult
    /// </summary>
    /// <param name="jsonString">JSON string</param>
    /// <returns>An instance of SnippetResult</returns>
    public static SnippetResult FromJson(string jsonString)
    {
      SnippetResult newSnippetResult = null;

      if (string.IsNullOrEmpty(jsonString))
      {
        return newSnippetResult;
      }
      int match = 0;
      List<string> matchedTypes = new List<string>();

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(Dictionary<string, SnippetResultOption>).GetProperty("AdditionalProperties") == null)
        {
          newSnippetResult = new SnippetResult(JsonConvert.DeserializeObject<Dictionary<string, SnippetResultOption>>(jsonString, SnippetResult.SerializerSettings));
        }
        else
        {
          newSnippetResult = new SnippetResult(JsonConvert.DeserializeObject<Dictionary<string, SnippetResultOption>>(jsonString, SnippetResult.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("Dictionary<string, SnippetResultOption>");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Dictionary<string, SnippetResultOption>: {1}", jsonString, exception.ToString()));
      }

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(SnippetResultOption).GetProperty("AdditionalProperties") == null)
        {
          newSnippetResult = new SnippetResult(JsonConvert.DeserializeObject<SnippetResultOption>(jsonString, SnippetResult.SerializerSettings));
        }
        else
        {
          newSnippetResult = new SnippetResult(JsonConvert.DeserializeObject<SnippetResultOption>(jsonString, SnippetResult.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("SnippetResultOption");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into SnippetResultOption: {1}", jsonString, exception.ToString()));
      }

      if (match == 0)
      {
        throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
      }
      else if (match > 1)
      {
        throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + String.Join(",", matchedTypes));
      }

      // deserialization is considered successful at this point if no exception has been thrown.
      return newSnippetResult;
    }

  }

  /// <summary>
  /// Custom JSON converter for SnippetResult
  /// </summary>
  public class SnippetResultJsonConverter : JsonConverter
  {
    /// <summary>
    /// To write the JSON string
    /// </summary>
    /// <param name="writer">JSON writer</param>
    /// <param name="value">Object to be converted into a JSON string</param>
    /// <param name="serializer">JSON Serializer</param>
    public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
    {
      writer.WriteRawValue((string)(typeof(SnippetResult).GetMethod("ToJson").Invoke(value, null)));
    }

    /// <summary>
    /// To convert a JSON string into an object
    /// </summary>
    /// <param name="reader">JSON reader</param>
    /// <param name="objectType">Object type</param>
    /// <param name="existingValue">Existing value</param>
    /// <param name="serializer">JSON Serializer</param>
    /// <returns>The object converted from the JSON string</returns>
    public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
    {
      if (reader.TokenType != JsonToken.Null)
      {
        return SnippetResult.FromJson(JObject.Load(reader).ToString(Formatting.None));
      }
      return null;
    }

    /// <summary>
    /// Check if the object can be converted
    /// </summary>
    /// <param name="objectType">Object type</param>
    /// <returns>True if the object can be converted</returns>
    public override bool CanConvert(Type objectType)
    {
      return false;
    }
  }

}
