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

namespace Algolia.Search.Analytics.Models
{
  /// <summary>
  /// ClickThroughRateEvent
  /// </summary>
  [DataContract(Name = "clickThroughRateEvent")]
  public partial class ClickThroughRateEvent
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="ClickThroughRateEvent" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected ClickThroughRateEvent() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="ClickThroughRateEvent" /> class.
    /// </summary>
    /// <param name="rate">[Click-through rate (CTR)](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#click-through-rate).  (required).</param>
    /// <param name="clickCount">Number of click events. (required).</param>
    /// <param name="trackedSearchCount">Number of tracked searches. This is the number of search requests where the &#x60;clickAnalytics&#x60; parameter is &#x60;true&#x60;. (required).</param>
    /// <param name="date">Date of the event in the format YYYY-MM-DD. (required).</param>
    public ClickThroughRateEvent(double rate = default(double), int clickCount = default(int), int trackedSearchCount = default(int), string date = default(string))
    {
      this.Rate = rate;
      this.ClickCount = clickCount;
      this.TrackedSearchCount = trackedSearchCount;
      // to ensure "date" is required (not null)
      if (date == null)
      {
        throw new ArgumentNullException("date is a required property for ClickThroughRateEvent and cannot be null");
      }
      this.Date = date;
    }

    /// <summary>
    /// [Click-through rate (CTR)](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#click-through-rate). 
    /// </summary>
    /// <value>[Click-through rate (CTR)](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#click-through-rate). </value>
    [DataMember(Name = "rate", IsRequired = true, EmitDefaultValue = true)]
    public double Rate { get; set; }

    /// <summary>
    /// Number of click events.
    /// </summary>
    /// <value>Number of click events.</value>
    [DataMember(Name = "clickCount", IsRequired = true, EmitDefaultValue = true)]
    public int ClickCount { get; set; }

    /// <summary>
    /// Number of tracked searches. This is the number of search requests where the &#x60;clickAnalytics&#x60; parameter is &#x60;true&#x60;.
    /// </summary>
    /// <value>Number of tracked searches. This is the number of search requests where the &#x60;clickAnalytics&#x60; parameter is &#x60;true&#x60;.</value>
    [DataMember(Name = "trackedSearchCount", IsRequired = true, EmitDefaultValue = true)]
    public int TrackedSearchCount { get; set; }

    /// <summary>
    /// Date of the event in the format YYYY-MM-DD.
    /// </summary>
    /// <value>Date of the event in the format YYYY-MM-DD.</value>
    [DataMember(Name = "date", IsRequired = true, EmitDefaultValue = true)]
    public string Date { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class ClickThroughRateEvent {\n");
      sb.Append("  Rate: ").Append(Rate).Append("\n");
      sb.Append("  ClickCount: ").Append(ClickCount).Append("\n");
      sb.Append("  TrackedSearchCount: ").Append(TrackedSearchCount).Append("\n");
      sb.Append("  Date: ").Append(Date).Append("\n");
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
