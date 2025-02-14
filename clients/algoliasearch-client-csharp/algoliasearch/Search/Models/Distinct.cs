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

namespace Algolia.Search.Search.Models
{
  /// <summary>
  /// Enables [deduplication or grouping of results (Algolia&#39;s _distinct_ feature](https://www.algolia.com/doc/guides/managing-results/refine-results/grouping/#introducing-algolias-distinct-feature)).
  /// </summary>
  [JsonConverter(typeof(DistinctJsonConverter))]
  [DataContract(Name = "distinct")]
  public partial class Distinct : AbstractSchema
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="Distinct" /> class
    /// with the <see cref="bool" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of bool.</param>
    public Distinct(bool actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance;
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="Distinct" /> class
    /// with the <see cref="int" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of int.</param>
    public Distinct(int actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance;
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
        if (value.GetType() == typeof(bool))
        {
          this._actualInstance = value;
        }
        else if (value.GetType() == typeof(int))
        {
          this._actualInstance = value;
        }
        else
        {
          throw new ArgumentException("Invalid instance found. Must be the following types: bool, int");
        }
      }
    }

    /// <summary>
    /// Get the actual instance of `bool`. If the actual instance is not `bool`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of bool</returns>
    public bool GetterBool()
    {
      return (bool)this.ActualInstance;
    }

    /// <summary>
    /// Get the actual instance of `int`. If the actual instance is not `int`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of int</returns>
    public int GetterInt()
    {
      return (int)this.ActualInstance;
    }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      var sb = new StringBuilder();
      sb.Append("class Distinct {\n");
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
      return JsonConvert.SerializeObject(this.ActualInstance, Distinct.SerializerSettings);
    }

    /// <summary>
    /// Converts the JSON string into an instance of Distinct
    /// </summary>
    /// <param name="jsonString">JSON string</param>
    /// <returns>An instance of Distinct</returns>
    public static Distinct FromJson(string jsonString)
    {
      Distinct newDistinct = null;

      if (string.IsNullOrEmpty(jsonString))
      {
        return newDistinct;
      }
      int match = 0;
      List<string> matchedTypes = new List<string>();

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(bool).GetProperty("AdditionalProperties") == null)
        {
          newDistinct = new Distinct(JsonConvert.DeserializeObject<bool>(jsonString, Distinct.SerializerSettings));
        }
        else
        {
          newDistinct = new Distinct(JsonConvert.DeserializeObject<bool>(jsonString, Distinct.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("bool");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into bool: {1}", jsonString, exception.ToString()));
      }

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(int).GetProperty("AdditionalProperties") == null)
        {
          newDistinct = new Distinct(JsonConvert.DeserializeObject<int>(jsonString, Distinct.SerializerSettings));
        }
        else
        {
          newDistinct = new Distinct(JsonConvert.DeserializeObject<int>(jsonString, Distinct.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("int");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into int: {1}", jsonString, exception.ToString()));
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
      return newDistinct;
    }

  }

  /// <summary>
  /// Custom JSON converter for Distinct
  /// </summary>
  public class DistinctJsonConverter : JsonConverter
  {
    /// <summary>
    /// To write the JSON string
    /// </summary>
    /// <param name="writer">JSON writer</param>
    /// <param name="value">Object to be converted into a JSON string</param>
    /// <param name="serializer">JSON Serializer</param>
    public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
    {
      writer.WriteRawValue((string)(typeof(Distinct).GetMethod("ToJson").Invoke(value, null)));
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
        return Distinct.FromJson(JObject.Load(reader).ToString(Formatting.None));
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
