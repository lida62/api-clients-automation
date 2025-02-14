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
  /// SourceCommercetools
  /// </summary>
  [DataContract(Name = "SourceCommercetools")]
  public partial class SourceCommercetools
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="SourceCommercetools" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected SourceCommercetools() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="SourceCommercetools" /> class.
    /// </summary>
    /// <param name="storeKeys">storeKeys.</param>
    /// <param name="locales">Array of locales that must match the following pattern: ^[a-z]{2}(-[A-Z]{2})?$. For example [\&quot;fr-FR\&quot;, \&quot;en\&quot;]. .</param>
    /// <param name="url">url (required).</param>
    /// <param name="projectKey">projectKey (required).</param>
    /// <param name="fallbackIsInStockValue">Determines the value that will be stored in the Algolia record if there&#39;s no inventory information on the product.  (default to true).</param>
    public SourceCommercetools(List<string> storeKeys = default(List<string>), List<string> locales = default(List<string>), string url = default(string), string projectKey = default(string), bool fallbackIsInStockValue = true)
    {
      // to ensure "url" is required (not null)
      if (url == null)
      {
        throw new ArgumentNullException("url is a required property for SourceCommercetools and cannot be null");
      }
      this.Url = url;
      // to ensure "projectKey" is required (not null)
      if (projectKey == null)
      {
        throw new ArgumentNullException("projectKey is a required property for SourceCommercetools and cannot be null");
      }
      this.ProjectKey = projectKey;
      this.StoreKeys = storeKeys;
      this.Locales = locales;
      this.FallbackIsInStockValue = fallbackIsInStockValue;
    }

    /// <summary>
    /// Gets or Sets StoreKeys
    /// </summary>
    [DataMember(Name = "storeKeys", EmitDefaultValue = false)]
    public List<string> StoreKeys { get; set; }

    /// <summary>
    /// Array of locales that must match the following pattern: ^[a-z]{2}(-[A-Z]{2})?$. For example [\&quot;fr-FR\&quot;, \&quot;en\&quot;]. 
    /// </summary>
    /// <value>Array of locales that must match the following pattern: ^[a-z]{2}(-[A-Z]{2})?$. For example [\&quot;fr-FR\&quot;, \&quot;en\&quot;]. </value>
    [DataMember(Name = "locales", EmitDefaultValue = false)]
    public List<string> Locales { get; set; }

    /// <summary>
    /// Gets or Sets Url
    /// </summary>
    [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
    public string Url { get; set; }

    /// <summary>
    /// Gets or Sets ProjectKey
    /// </summary>
    [DataMember(Name = "projectKey", IsRequired = true, EmitDefaultValue = true)]
    public string ProjectKey { get; set; }

    /// <summary>
    /// Determines the value that will be stored in the Algolia record if there&#39;s no inventory information on the product. 
    /// </summary>
    /// <value>Determines the value that will be stored in the Algolia record if there&#39;s no inventory information on the product. </value>
    [DataMember(Name = "fallbackIsInStockValue", EmitDefaultValue = true)]
    public bool FallbackIsInStockValue { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class SourceCommercetools {\n");
      sb.Append("  StoreKeys: ").Append(StoreKeys).Append("\n");
      sb.Append("  Locales: ").Append(Locales).Append("\n");
      sb.Append("  Url: ").Append(Url).Append("\n");
      sb.Append("  ProjectKey: ").Append(ProjectKey).Append("\n");
      sb.Append("  FallbackIsInStockValue: ").Append(FallbackIsInStockValue).Append("\n");
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
