//
// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
//

using System;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Reflection;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Net.Http;
using System.Net.Security;
using Algolia.Search.Client;
using Algolia.Search.Transport;

namespace Algolia.Search.Monitoring.Client
{
  /// <summary>
  /// Monitoring client configuration
  /// </summary>
  public sealed class MonitoringConfig : AlgoliaConfig
  {
    /// <summary>
    /// The configuration of the Monitoring client
    /// A client should have it's own configuration ie on configuration per client instance
    /// </summary>
    /// <param name="applicationId">Your application ID</param>
    /// <param name="apiKey">Your API Key</param>

    public MonitoringConfig(string applicationId, string apiKey) : base(applicationId, apiKey)
    {
      List<StatefulHost> hosts = new List<StatefulHost>
      {
        new StatefulHost
        {
          Url = $"{applicationId}-dsn.algolia.net",
          Up = true,
          LastUse = DateTime.UtcNow,
          Accept = CallType.Read
        },
        new StatefulHost
        {
          Url = $"{applicationId}.algolia.net", Up = true, LastUse = DateTime.UtcNow, Accept = CallType.Write,
        }
      };

      var commonHosts = new List<StatefulHost>
      {
        new StatefulHost
        {
          Url = $"{applicationId}-1.algolianet.com",
          Up = true,
          LastUse = DateTime.UtcNow,
          Accept = CallType.Read | CallType.Write,
        },
        new StatefulHost
        {
          Url = $"{applicationId}-2.algolianet.com",
          Up = true,
          LastUse = DateTime.UtcNow,
          Accept = CallType.Read | CallType.Write,
        },
        new StatefulHost
        {
          Url = $"{applicationId}-3.algolianet.com",
          Up = true,
          LastUse = DateTime.UtcNow,
          Accept = CallType.Read | CallType.Write,
        }
      }.Shuffle();

      hosts.AddRange(commonHosts);

      DefaultHosts = hosts;
      Compression = CompressionType.NONE;
    }
  }
}
