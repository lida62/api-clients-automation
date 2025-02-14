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
  /// RecommendationsRequest
  /// </summary>
  [JsonConverter(typeof(RecommendationsRequestJsonConverter))]
  [DataContract(Name = "recommendationsRequest")]
  public partial class RecommendationsRequest : AbstractSchema
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="RecommendationsRequest" /> class
    /// with the <see cref="TrendingItemsQuery" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of TrendingItemsQuery.</param>
    public RecommendationsRequest(TrendingItemsQuery actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="RecommendationsRequest" /> class
    /// with the <see cref="TrendingFacetsQuery" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of TrendingFacetsQuery.</param>
    public RecommendationsRequest(TrendingFacetsQuery actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="RecommendationsRequest" /> class
    /// with the <see cref="RecommendationsQuery" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of RecommendationsQuery.</param>
    public RecommendationsRequest(RecommendationsQuery actualInstance)
    {
      this.IsNullable = false;
      this.SchemaType = "oneOf";
      this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="RecommendationsRequest" /> class
    /// with the <see cref="RecommendedForYouQuery" /> class
    /// </summary>
    /// <param name="actualInstance">An instance of RecommendedForYouQuery.</param>
    public RecommendationsRequest(RecommendedForYouQuery actualInstance)
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
        if (value.GetType() == typeof(RecommendationsQuery))
        {
          this._actualInstance = value;
        }
        else if (value.GetType() == typeof(RecommendedForYouQuery))
        {
          this._actualInstance = value;
        }
        else if (value.GetType() == typeof(TrendingFacetsQuery))
        {
          this._actualInstance = value;
        }
        else if (value.GetType() == typeof(TrendingItemsQuery))
        {
          this._actualInstance = value;
        }
        else
        {
          throw new ArgumentException("Invalid instance found. Must be the following types: RecommendationsQuery, RecommendedForYouQuery, TrendingFacetsQuery, TrendingItemsQuery");
        }
      }
    }

    /// <summary>
    /// Get the actual instance of `TrendingItemsQuery`. If the actual instance is not `TrendingItemsQuery`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of TrendingItemsQuery</returns>
    public TrendingItemsQuery GetterTrendingItemsQuery()
    {
      return (TrendingItemsQuery)this.ActualInstance;
    }

    /// <summary>
    /// Get the actual instance of `TrendingFacetsQuery`. If the actual instance is not `TrendingFacetsQuery`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of TrendingFacetsQuery</returns>
    public TrendingFacetsQuery GetterTrendingFacetsQuery()
    {
      return (TrendingFacetsQuery)this.ActualInstance;
    }

    /// <summary>
    /// Get the actual instance of `RecommendationsQuery`. If the actual instance is not `RecommendationsQuery`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of RecommendationsQuery</returns>
    public RecommendationsQuery GetterRecommendationsQuery()
    {
      return (RecommendationsQuery)this.ActualInstance;
    }

    /// <summary>
    /// Get the actual instance of `RecommendedForYouQuery`. If the actual instance is not `RecommendedForYouQuery`,
    /// the InvalidClassException will be thrown
    /// </summary>
    /// <returns>An instance of RecommendedForYouQuery</returns>
    public RecommendedForYouQuery GetterRecommendedForYouQuery()
    {
      return (RecommendedForYouQuery)this.ActualInstance;
    }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      var sb = new StringBuilder();
      sb.Append("class RecommendationsRequest {\n");
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
      return JsonConvert.SerializeObject(this.ActualInstance, RecommendationsRequest.SerializerSettings);
    }

    /// <summary>
    /// Converts the JSON string into an instance of RecommendationsRequest
    /// </summary>
    /// <param name="jsonString">JSON string</param>
    /// <returns>An instance of RecommendationsRequest</returns>
    public static RecommendationsRequest FromJson(string jsonString)
    {
      RecommendationsRequest newRecommendationsRequest = null;

      if (string.IsNullOrEmpty(jsonString))
      {
        return newRecommendationsRequest;
      }
      int match = 0;
      List<string> matchedTypes = new List<string>();

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(RecommendationsQuery).GetProperty("AdditionalProperties") == null)
        {
          newRecommendationsRequest = new RecommendationsRequest(JsonConvert.DeserializeObject<RecommendationsQuery>(jsonString, RecommendationsRequest.SerializerSettings));
        }
        else
        {
          newRecommendationsRequest = new RecommendationsRequest(JsonConvert.DeserializeObject<RecommendationsQuery>(jsonString, RecommendationsRequest.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("RecommendationsQuery");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RecommendationsQuery: {1}", jsonString, exception.ToString()));
      }

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(RecommendedForYouQuery).GetProperty("AdditionalProperties") == null)
        {
          newRecommendationsRequest = new RecommendationsRequest(JsonConvert.DeserializeObject<RecommendedForYouQuery>(jsonString, RecommendationsRequest.SerializerSettings));
        }
        else
        {
          newRecommendationsRequest = new RecommendationsRequest(JsonConvert.DeserializeObject<RecommendedForYouQuery>(jsonString, RecommendationsRequest.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("RecommendedForYouQuery");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RecommendedForYouQuery: {1}", jsonString, exception.ToString()));
      }

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(TrendingFacetsQuery).GetProperty("AdditionalProperties") == null)
        {
          newRecommendationsRequest = new RecommendationsRequest(JsonConvert.DeserializeObject<TrendingFacetsQuery>(jsonString, RecommendationsRequest.SerializerSettings));
        }
        else
        {
          newRecommendationsRequest = new RecommendationsRequest(JsonConvert.DeserializeObject<TrendingFacetsQuery>(jsonString, RecommendationsRequest.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("TrendingFacetsQuery");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into TrendingFacetsQuery: {1}", jsonString, exception.ToString()));
      }

      try
      {
        // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
        if (typeof(TrendingItemsQuery).GetProperty("AdditionalProperties") == null)
        {
          newRecommendationsRequest = new RecommendationsRequest(JsonConvert.DeserializeObject<TrendingItemsQuery>(jsonString, RecommendationsRequest.SerializerSettings));
        }
        else
        {
          newRecommendationsRequest = new RecommendationsRequest(JsonConvert.DeserializeObject<TrendingItemsQuery>(jsonString, RecommendationsRequest.AdditionalPropertiesSerializerSettings));
        }
        matchedTypes.Add("TrendingItemsQuery");
        match++;
      }
      catch (Exception exception)
      {
        // deserialization failed, try the next one
        System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into TrendingItemsQuery: {1}", jsonString, exception.ToString()));
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
      return newRecommendationsRequest;
    }

  }

  /// <summary>
  /// Custom JSON converter for RecommendationsRequest
  /// </summary>
  public class RecommendationsRequestJsonConverter : JsonConverter
  {
    /// <summary>
    /// To write the JSON string
    /// </summary>
    /// <param name="writer">JSON writer</param>
    /// <param name="value">Object to be converted into a JSON string</param>
    /// <param name="serializer">JSON Serializer</param>
    public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
    {
      writer.WriteRawValue((string)(typeof(RecommendationsRequest).GetMethod("ToJson").Invoke(value, null)));
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
        return RecommendationsRequest.FromJson(JObject.Load(reader).ToString(Formatting.None));
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
