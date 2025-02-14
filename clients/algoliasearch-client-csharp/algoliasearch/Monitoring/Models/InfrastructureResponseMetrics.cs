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

namespace Algolia.Search.Monitoring.Models
{
  /// <summary>
  /// InfrastructureResponseMetrics
  /// </summary>
  [DataContract(Name = "InfrastructureResponse_metrics")]
  public partial class InfrastructureResponseMetrics
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="InfrastructureResponseMetrics" /> class.
    /// </summary>
    /// <param name="cpuUsage">CPU idleness in %..</param>
    /// <param name="ramIndexingUsage">RAM used for indexing in MB..</param>
    /// <param name="ramSearchUsage">RAM used for search in MB..</param>
    /// <param name="ssdUsage">Solid-state disk (SSD) usage expressed as % of RAM.  0% means no SSD usage. A value of 50% indicates 32&amp;nbsp;GB SSD usage for a machine with 64&amp;nbsp;RAM. .</param>
    /// <param name="avgBuildTime">Average build time of the indices in seconds..</param>
    public InfrastructureResponseMetrics(Dictionary<string, List<ProbesMetric>> cpuUsage = default(Dictionary<string, List<ProbesMetric>>), Dictionary<string, List<ProbesMetric>> ramIndexingUsage = default(Dictionary<string, List<ProbesMetric>>), Dictionary<string, List<ProbesMetric>> ramSearchUsage = default(Dictionary<string, List<ProbesMetric>>), Dictionary<string, List<ProbesMetric>> ssdUsage = default(Dictionary<string, List<ProbesMetric>>), Dictionary<string, List<ProbesMetric>> avgBuildTime = default(Dictionary<string, List<ProbesMetric>>))
    {
      this.CpuUsage = cpuUsage;
      this.RamIndexingUsage = ramIndexingUsage;
      this.RamSearchUsage = ramSearchUsage;
      this.SsdUsage = ssdUsage;
      this.AvgBuildTime = avgBuildTime;
    }

    /// <summary>
    /// CPU idleness in %.
    /// </summary>
    /// <value>CPU idleness in %.</value>
    [DataMember(Name = "cpu_usage", EmitDefaultValue = false)]
    public Dictionary<string, List<ProbesMetric>> CpuUsage { get; set; }

    /// <summary>
    /// RAM used for indexing in MB.
    /// </summary>
    /// <value>RAM used for indexing in MB.</value>
    [DataMember(Name = "ram_indexing_usage", EmitDefaultValue = false)]
    public Dictionary<string, List<ProbesMetric>> RamIndexingUsage { get; set; }

    /// <summary>
    /// RAM used for search in MB.
    /// </summary>
    /// <value>RAM used for search in MB.</value>
    [DataMember(Name = "ram_search_usage", EmitDefaultValue = false)]
    public Dictionary<string, List<ProbesMetric>> RamSearchUsage { get; set; }

    /// <summary>
    /// Solid-state disk (SSD) usage expressed as % of RAM.  0% means no SSD usage. A value of 50% indicates 32&amp;nbsp;GB SSD usage for a machine with 64&amp;nbsp;RAM. 
    /// </summary>
    /// <value>Solid-state disk (SSD) usage expressed as % of RAM.  0% means no SSD usage. A value of 50% indicates 32&amp;nbsp;GB SSD usage for a machine with 64&amp;nbsp;RAM. </value>
    [DataMember(Name = "ssd_usage", EmitDefaultValue = false)]
    public Dictionary<string, List<ProbesMetric>> SsdUsage { get; set; }

    /// <summary>
    /// Average build time of the indices in seconds.
    /// </summary>
    /// <value>Average build time of the indices in seconds.</value>
    [DataMember(Name = "avg_build_time", EmitDefaultValue = false)]
    public Dictionary<string, List<ProbesMetric>> AvgBuildTime { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class InfrastructureResponseMetrics {\n");
      sb.Append("  CpuUsage: ").Append(CpuUsage).Append("\n");
      sb.Append("  RamIndexingUsage: ").Append(RamIndexingUsage).Append("\n");
      sb.Append("  RamSearchUsage: ").Append(RamSearchUsage).Append("\n");
      sb.Append("  SsdUsage: ").Append(SsdUsage).Append("\n");
      sb.Append("  AvgBuildTime: ").Append(AvgBuildTime).Append("\n");
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
