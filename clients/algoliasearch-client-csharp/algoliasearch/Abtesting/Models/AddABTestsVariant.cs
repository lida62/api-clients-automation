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

namespace Algolia.Search.Abtesting.Models
{
  /// <summary>
  /// AddABTestsVariant
  /// </summary>
  [JsonConverter(typeof(AddABTestsVariantJsonConverter))]
  [DataContract(Name = "AddABTestsVariant")]
  public partial class AddABTestsVariant : AbstractSchema
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="AddABTestsVariant" /> class
    /// with the <see cref="AbTestsVariant" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of AbTestsVariant.</param>
    public AddABTestsVariant(AbTestsVariant actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="AddABTestsVariant" /> class
    /// with the <see cref="AbTestsVariantSearchParams" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of AbTestsVariantSearchParams.</param>
    public AddABTestsVariant(AbTestsVariantSearchParams actualInstance)
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
        if (value.GetType() == typeof(AbTestsVariant))
        {
          this._actualInstance = value;
        }
        else if (value.GetType() == typeof(AbTestsVariantSearchParams))
        {
          this._actualInstance = value;
        }
        else
        {
          throw new ArgumentException("Invalid instance found. Must be the following types: AbTestsVariant, AbTestsVariantSearchParams");
        }
      }
    }

    /// <summary>
    /// Get the actual instance of `AbTestsVariant`. If the actual instance is not `AbTestsVariant`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of AbTestsVariant</returns>
    public AbTestsVariant GetterAbTestsVariant()
    {
      return (AbTestsVariant)this.ActualInstance;
    }

    /// <summary>
    /// Get the actual instance of `AbTestsVariantSearchParams`. If the actual instance is not `AbTestsVariantSearchParams`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of AbTestsVariantSearchParams</returns>
    public AbTestsVariantSearchParams GetterAbTestsVariantSearchParams()
    {
      return (AbTestsVariantSearchParams)this.ActualInstance;
    }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      var sb = new StringBuilder();
      sb.Append("class AddABTestsVariant {\n");
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
      return JsonConvert.SerializeObject(this.ActualInstance, AddABTestsVariant.SerializerSettings);
    }

    /// <summary>
    /// Converts the JSON string into an instance of AddABTestsVariant
    /// </summary>
    /// <param name="jsonString">JSON string</param>
    /// <returns>An instance of AddABTestsVariant</returns>
    public static AddABTestsVariant FromJson(string jsonString)
    {
      AddABTestsVariant newAddABTestsVariant = null;

      if (string.IsNullOrEmpty(jsonString))
      {
        return newAddABTestsVariant;
      }
      int match = 0;
      List<string> matchedTypes = new List<string>();

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(AbTestsVariant).GetProperty("AdditionalProperties") == null)
        {
          newAddABTestsVariant = new AddABTestsVariant(JsonConvert.DeserializeObject<AbTestsVariant>(jsonString, AddABTestsVariant.SerializerSettings));
        }
        else
        {
          newAddABTestsVariant = new AddABTestsVariant(JsonConvert.DeserializeObject<AbTestsVariant>(jsonString, AddABTestsVariant.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("AbTestsVariant");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into AbTestsVariant: {1}", jsonString, exception.ToString()));
      }

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(AbTestsVariantSearchParams).GetProperty("AdditionalProperties") == null)
        {
          newAddABTestsVariant = new AddABTestsVariant(JsonConvert.DeserializeObject<AbTestsVariantSearchParams>(jsonString, AddABTestsVariant.SerializerSettings));
        }
        else
        {
          newAddABTestsVariant = new AddABTestsVariant(JsonConvert.DeserializeObject<AbTestsVariantSearchParams>(jsonString, AddABTestsVariant.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("AbTestsVariantSearchParams");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into AbTestsVariantSearchParams: {1}", jsonString, exception.ToString()));
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
      return newAddABTestsVariant;
    }

  }

  /// <summary>
  /// Custom JSON converter for AddABTestsVariant
  /// </summary>
  public class AddABTestsVariantJsonConverter : JsonConverter
  {
    /// <summary>
    /// To write the JSON string
    /// </summary>
    /// <param name="writer">JSON writer</param>
    /// <param name="value">Object to be converted into a JSON string</param>
    /// <param name="serializer">JSON Serializer</param>
    public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
    {
      writer.WriteRawValue((string)(typeof(AddABTestsVariant).GetMethod("ToJson").Invoke(value, null)));
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
        return AddABTestsVariant.FromJson(JObject.Load(reader).ToString(Formatting.None));
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
