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

namespace Algolia.Search.Search.Models
{
  /// <summary>
  /// Ordering of facets (widgets).
  /// </summary>
  [DataContract(Name = "facets")]
  public partial class Facets
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="Facets" /> class.
    /// </summary>
    /// <param name="order">Pinned order of facet lists..</param>
    public Facets(List<string> order = default(List<string>))
    {
      this.Order = order;
    }

    /// <summary>
    /// Pinned order of facet lists.
    /// </summary>
    /// <value>Pinned order of facet lists.</value>
    [DataMember(Name = "order", EmitDefaultValue = false)]
    public List<string> Order { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class Facets {\n");
      sb.Append("  Order: ").Append(Order).Append("\n");
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
