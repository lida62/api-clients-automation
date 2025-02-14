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
  /// RecommendationsHit
  /// </summary>
  [JsonConverter(typeof(RecommendationsHitJsonConverter))]
  [DataContract(Name = "recommendationsHit")]
  public partial class RecommendationsHit : AbstractSchema
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="RecommendationsHit" /> class
    /// with the <see cref="RecommendHit" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of RecommendHit.</param>
    public RecommendationsHit(RecommendHit actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="RecommendationsHit" /> class
    /// with the <see cref="TrendingFacetHit" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of TrendingFacetHit.</param>
    public RecommendationsHit(TrendingFacetHit actualInstance)
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
        if (value.GetType() == typeof(RecommendHit))
        {
          this._actualInstance = value;
        }
        else if (value.GetType() == typeof(TrendingFacetHit))
        {
          this._actualInstance = value;
        }
        else
        {
          throw new ArgumentException("Invalid instance found. Must be the following types: RecommendHit, TrendingFacetHit");
        }
      }
    }

    /// <summary>
    /// Get the actual instance of `RecommendHit`. If the actual instance is not `RecommendHit`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of RecommendHit</returns>
    public RecommendHit GetterRecommendHit()
    {
      return (RecommendHit)this.ActualInstance;
    }

    /// <summary>
    /// Get the actual instance of `TrendingFacetHit`. If the actual instance is not `TrendingFacetHit`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of TrendingFacetHit</returns>
    public TrendingFacetHit GetterTrendingFacetHit()
    {
      return (TrendingFacetHit)this.ActualInstance;
    }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      var sb = new StringBuilder();
      sb.Append("class RecommendationsHit {\n");
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
      return JsonConvert.SerializeObject(this.ActualInstance, RecommendationsHit.SerializerSettings);
    }

    /// <summary>
    /// Converts the JSON string into an instance of RecommendationsHit
    /// </summary>
    /// <param name="jsonString">JSON string</param>
    /// <returns>An instance of RecommendationsHit</returns>
    public static RecommendationsHit FromJson(string jsonString)
    {
      RecommendationsHit newRecommendationsHit = null;

      if (string.IsNullOrEmpty(jsonString))
      {
        return newRecommendationsHit;
      }
      int match = 0;
      List<string> matchedTypes = new List<string>();

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(RecommendHit).GetProperty("AdditionalProperties") == null)
        {
          newRecommendationsHit = new RecommendationsHit(JsonConvert.DeserializeObject<RecommendHit>(jsonString, RecommendationsHit.SerializerSettings));
        }
        else
        {
          newRecommendationsHit = new RecommendationsHit(JsonConvert.DeserializeObject<RecommendHit>(jsonString, RecommendationsHit.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("RecommendHit");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RecommendHit: {1}", jsonString, exception.ToString()));
      }

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(TrendingFacetHit).GetProperty("AdditionalProperties") == null)
        {
          newRecommendationsHit = new RecommendationsHit(JsonConvert.DeserializeObject<TrendingFacetHit>(jsonString, RecommendationsHit.SerializerSettings));
        }
        else
        {
          newRecommendationsHit = new RecommendationsHit(JsonConvert.DeserializeObject<TrendingFacetHit>(jsonString, RecommendationsHit.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("TrendingFacetHit");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into TrendingFacetHit: {1}", jsonString, exception.ToString()));
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
      return newRecommendationsHit;
    }

  }

  /// <summary>
  /// Custom JSON converter for RecommendationsHit
  /// </summary>
  public class RecommendationsHitJsonConverter : JsonConverter
  {
    /// <summary>
    /// To write the JSON string
    /// </summary>
    /// <param name="writer">JSON writer</param>
    /// <param name="value">Object to be converted into a JSON string</param>
    /// <param name="serializer">JSON Serializer</param>
    public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
    {
      writer.WriteRawValue((string)(typeof(RecommendationsHit).GetMethod("ToJson").Invoke(value, null)));
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
        return RecommendationsHit.FromJson(JObject.Load(reader).ToString(Formatting.None));
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
