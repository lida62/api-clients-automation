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
  /// Run
  /// </summary>
  [DataContract(Name = "Run")]
  public partial class Run
  {

    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
    public RunStatus Status { get; set; }

    /// <summary>
    /// Gets or Sets Outcome
    /// </summary>
    [DataMember(Name = "outcome", EmitDefaultValue = false)]
    public RunOutcome? Outcome { get; set; }

    /// <summary>
    /// Gets or Sets ReasonCode
    /// </summary>
    [DataMember(Name = "reasonCode", EmitDefaultValue = false)]
    public RunReasonCode? ReasonCode { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
    public RunType Type { get; set; }
    /// <summary>
    /// Initializes a new instance of the <see cref="Run" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected Run() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="Run" /> class.
    /// </summary>
    /// <param name="runID">The run UUID. (required).</param>
    /// <param name="appID">appID (required).</param>
    /// <param name="taskID">The task UUID. (required).</param>
    /// <param name="status">status (required).</param>
    /// <param name="progress">progress.</param>
    /// <param name="outcome">outcome.</param>
    /// <param name="failureThreshold">A percentage representing the accepted failure threshold to determine if a &#x60;run&#x60; succeeded or not..</param>
    /// <param name="reason">Explains the result of outcome..</param>
    /// <param name="reasonCode">reasonCode.</param>
    /// <param name="type">type (required).</param>
    /// <param name="createdAt">Date of creation (RFC3339 format). (required).</param>
    /// <param name="startedAt">Date of start (RFC3339 format)..</param>
    /// <param name="finishedAt">Date of finish (RFC3339 format)..</param>
    public Run(string runID = default(string), string appID = default(string), string taskID = default(string), RunStatus status = default(RunStatus), RunProgress progress = default(RunProgress), RunOutcome? outcome = default(RunOutcome?), int failureThreshold = default(int), string reason = default(string), RunReasonCode? reasonCode = default(RunReasonCode?), RunType type = default(RunType), string createdAt = default(string), string startedAt = default(string), string finishedAt = default(string))
    {
      // to ensure "runID" is required (not null)
      if (runID == null)
      {
        throw new ArgumentNullException("runID is a required property for Run and cannot be null");
      }
      this.RunID = runID;
      // to ensure "appID" is required (not null)
      if (appID == null)
      {
        throw new ArgumentNullException("appID is a required property for Run and cannot be null");
      }
      this.AppID = appID;
      // to ensure "taskID" is required (not null)
      if (taskID == null)
      {
        throw new ArgumentNullException("taskID is a required property for Run and cannot be null");
      }
      this.TaskID = taskID;
      this.Status = status;
      this.Type = type;
      // to ensure "createdAt" is required (not null)
      if (createdAt == null)
      {
        throw new ArgumentNullException("createdAt is a required property for Run and cannot be null");
      }
      this.CreatedAt = createdAt;
      this.Progress = progress;
      this.Outcome = outcome;
      this.FailureThreshold = failureThreshold;
      this.Reason = reason;
      this.ReasonCode = reasonCode;
      this.StartedAt = startedAt;
      this.FinishedAt = finishedAt;
    }

    /// <summary>
    /// The run UUID.
    /// </summary>
    /// <value>The run UUID.</value>
    [DataMember(Name = "runID", IsRequired = true, EmitDefaultValue = true)]
    public string RunID { get; set; }

    /// <summary>
    /// Gets or Sets AppID
    /// </summary>
    [DataMember(Name = "appID", IsRequired = true, EmitDefaultValue = true)]
    public string AppID { get; set; }

    /// <summary>
    /// The task UUID.
    /// </summary>
    /// <value>The task UUID.</value>
    [DataMember(Name = "taskID", IsRequired = true, EmitDefaultValue = true)]
    public string TaskID { get; set; }

    /// <summary>
    /// Gets or Sets Progress
    /// </summary>
    [DataMember(Name = "progress", EmitDefaultValue = false)]
    public RunProgress Progress { get; set; }

    /// <summary>
    /// A percentage representing the accepted failure threshold to determine if a &#x60;run&#x60; succeeded or not.
    /// </summary>
    /// <value>A percentage representing the accepted failure threshold to determine if a &#x60;run&#x60; succeeded or not.</value>
    [DataMember(Name = "failureThreshold", EmitDefaultValue = false)]
    public int FailureThreshold { get; set; }

    /// <summary>
    /// Explains the result of outcome.
    /// </summary>
    /// <value>Explains the result of outcome.</value>
    [DataMember(Name = "reason", EmitDefaultValue = false)]
    public string Reason { get; set; }

    /// <summary>
    /// Date of creation (RFC3339 format).
    /// </summary>
    /// <value>Date of creation (RFC3339 format).</value>
    [DataMember(Name = "createdAt", IsRequired = true, EmitDefaultValue = true)]
    public string CreatedAt { get; set; }

    /// <summary>
    /// Date of start (RFC3339 format).
    /// </summary>
    /// <value>Date of start (RFC3339 format).</value>
    [DataMember(Name = "startedAt", EmitDefaultValue = false)]
    public string StartedAt { get; set; }

    /// <summary>
    /// Date of finish (RFC3339 format).
    /// </summary>
    /// <value>Date of finish (RFC3339 format).</value>
    [DataMember(Name = "finishedAt", EmitDefaultValue = false)]
    public string FinishedAt { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class Run {\n");
      sb.Append("  RunID: ").Append(RunID).Append("\n");
      sb.Append("  AppID: ").Append(AppID).Append("\n");
      sb.Append("  TaskID: ").Append(TaskID).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
      sb.Append("  Progress: ").Append(Progress).Append("\n");
      sb.Append("  Outcome: ").Append(Outcome).Append("\n");
      sb.Append("  FailureThreshold: ").Append(FailureThreshold).Append("\n");
      sb.Append("  Reason: ").Append(Reason).Append("\n");
      sb.Append("  ReasonCode: ").Append(ReasonCode).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
      sb.Append("  StartedAt: ").Append(StartedAt).Append("\n");
      sb.Append("  FinishedAt: ").Append(FinishedAt).Append("\n");
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
