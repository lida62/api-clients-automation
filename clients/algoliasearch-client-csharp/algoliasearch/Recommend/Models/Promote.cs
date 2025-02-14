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
  /// Promote
  /// </summary>
  [JsonConverter(typeof(PromoteJsonConverter))]
  [DataContract(Name = "promote")]
  public partial class Promote : AbstractSchema
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="Promote" /> class
    /// with the <see cref="PromoteObjectIDs" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of PromoteObjectIDs.</param>
    public Promote(PromoteObjectIDs actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="Promote" /> class
    /// with the <see cref="PromoteObjectID" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of PromoteObjectID.</param>
    public Promote(PromoteObjectID actualInstance)
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
        if (value.GetType() == typeof(PromoteObjectID))
        {
          this._actualInstance = value;
        }
        else if (value.GetType() == typeof(PromoteObjectIDs))
        {
          this._actualInstance = value;
        }
        else
        {
          throw new ArgumentException("Invalid instance found. Must be the following types: PromoteObjectID, PromoteObjectIDs");
        }
      }
    }

    /// <summary>
    /// Get the actual instance of `PromoteObjectIDs`. If the actual instance is not `PromoteObjectIDs`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of PromoteObjectIDs</returns>
    public PromoteObjectIDs GetterPromoteObjectIDs()
    {
      return (PromoteObjectIDs)this.ActualInstance;
    }

    /// <summary>
    /// Get the actual instance of `PromoteObjectID`. If the actual instance is not `PromoteObjectID`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of PromoteObjectID</returns>
    public PromoteObjectID GetterPromoteObjectID()
    {
      return (PromoteObjectID)this.ActualInstance;
    }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      var sb = new StringBuilder();
      sb.Append("class Promote {\n");
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
      return JsonConvert.SerializeObject(this.ActualInstance, Promote.SerializerSettings);
    }

    /// <summary>
    /// Converts the JSON string into an instance of Promote
    /// </summary>
    /// <param name="jsonString">JSON string</param>
    /// <returns>An instance of Promote</returns>
    public static Promote FromJson(string jsonString)
    {
      Promote newPromote = null;

      if (string.IsNullOrEmpty(jsonString))
      {
        return newPromote;
      }
      int match = 0;
      List<string> matchedTypes = new List<string>();

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(PromoteObjectID).GetProperty("AdditionalProperties") == null)
        {
          newPromote = new Promote(JsonConvert.DeserializeObject<PromoteObjectID>(jsonString, Promote.SerializerSettings));
        }
        else
        {
          newPromote = new Promote(JsonConvert.DeserializeObject<PromoteObjectID>(jsonString, Promote.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("PromoteObjectID");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into PromoteObjectID: {1}", jsonString, exception.ToString()));
      }

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(PromoteObjectIDs).GetProperty("AdditionalProperties") == null)
        {
          newPromote = new Promote(JsonConvert.DeserializeObject<PromoteObjectIDs>(jsonString, Promote.SerializerSettings));
        }
        else
        {
          newPromote = new Promote(JsonConvert.DeserializeObject<PromoteObjectIDs>(jsonString, Promote.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("PromoteObjectIDs");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into PromoteObjectIDs: {1}", jsonString, exception.ToString()));
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
      return newPromote;
    }

  }

  /// <summary>
  /// Custom JSON converter for Promote
  /// </summary>
  public class PromoteJsonConverter : JsonConverter
  {
    /// <summary>
    /// To write the JSON string
    /// </summary>
    /// <param name="writer">JSON writer</param>
    /// <param name="value">Object to be converted into a JSON string</param>
    /// <param name="serializer">JSON Serializer</param>
    public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
    {
      writer.WriteRawValue((string)(typeof(Promote).GetMethod("ToJson").Invoke(value, null)));
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
        return Promote.FromJson(JObject.Load(reader).ToString(Formatting.None));
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
