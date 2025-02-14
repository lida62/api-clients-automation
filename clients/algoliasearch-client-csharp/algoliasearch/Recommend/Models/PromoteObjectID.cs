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

namespace Algolia.Search.Recommend.Models
{
  /// <summary>
  /// Record to promote.
  /// </summary>
  [DataContract(Name = "promoteObjectID")]
  public partial class PromoteObjectID
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="PromoteObjectID" /> class.
    /// </summary>
    [JsonConstructorAttribute]
    protected PromoteObjectID() { }
    /// <summary>
    /// Initializes a new instance of the <see cref="PromoteObjectID" /> class.
    /// </summary>
    /// <param name="objectID">Unique identifier of the record to promote. (required).</param>
    /// <param name="position">The position to promote the records to. If you pass objectIDs, the records are placed at this position as a group. For example, if you pronmote four objectIDs to position 0, the records take the first four positions. (required).</param>
    public PromoteObjectID(string objectID = default(string), int position = default(int))
    {
      // to ensure "objectID" is required (not null)
      if (objectID == null)
      {
        throw new ArgumentNullException("objectID is a required property for PromoteObjectID and cannot be null");
      }
      this.ObjectID = objectID;
      this.Position = position;
    }

    /// <summary>
    /// Unique identifier of the record to promote.
    /// </summary>
    /// <value>Unique identifier of the record to promote.</value>
    [DataMember(Name = "objectID", IsRequired = true, EmitDefaultValue = true)]
    public string ObjectID { get; set; }

    /// <summary>
    /// The position to promote the records to. If you pass objectIDs, the records are placed at this position as a group. For example, if you pronmote four objectIDs to position 0, the records take the first four positions.
    /// </summary>
    /// <value>The position to promote the records to. If you pass objectIDs, the records are placed at this position as a group. For example, if you pronmote four objectIDs to position 0, the records take the first four positions.</value>
    [DataMember(Name = "position", IsRequired = true, EmitDefaultValue = true)]
    public int Position { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class PromoteObjectID {\n");
      sb.Append("  ObjectID: ").Append(ObjectID).Append("\n");
      sb.Append("  Position: ").Append(Position).Append("\n");
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
