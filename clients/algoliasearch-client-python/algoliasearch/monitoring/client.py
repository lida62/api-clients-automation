# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from json import dumps
from typing import Annotated, Any, Dict, List, Optional, Self, Tuple, Union
from urllib.parse import quote

from pydantic import Field, StrictStr

from algoliasearch.http.api_response import ApiResponse
from algoliasearch.http.request_options import RequestOptions
from algoliasearch.http.serializer import bodySerializer
from algoliasearch.http.transporter import Transporter
from algoliasearch.http.verb import Verb
from algoliasearch.monitoring.config import MonitoringConfig
from algoliasearch.monitoring.models.incidents_response import IncidentsResponse
from algoliasearch.monitoring.models.indexing_time_response import IndexingTimeResponse
from algoliasearch.monitoring.models.infrastructure_response import (
    InfrastructureResponse,
)
from algoliasearch.monitoring.models.inventory_response import InventoryResponse
from algoliasearch.monitoring.models.latency_response import LatencyResponse
from algoliasearch.monitoring.models.metric import Metric
from algoliasearch.monitoring.models.period import Period
from algoliasearch.monitoring.models.status_response import StatusResponse


class MonitoringClient:
    _transporter: Transporter
    _config: MonitoringConfig
    _request_options: RequestOptions

    def __init__(
        self,
        app_id: Optional[str] = None,
        api_key: Optional[str] = None,
        transporter: Optional[Transporter] = None,
        config: Optional[MonitoringConfig] = None,
    ) -> None:
        if transporter is not None and config is None:
            config = transporter._config

        if config is None:
            config = MonitoringConfig(app_id, api_key)
        self._config = config
        self._request_options = RequestOptions(config)

        if transporter is None:
            transporter = Transporter(config)
        self._transporter = transporter

    def create_with_config(
        config: MonitoringConfig, transporter: Optional[Transporter] = None
    ) -> Self:
        if transporter is None:
            transporter = Transporter(config)

        return MonitoringClient(
            app_id=config.app_id,
            api_key=config.api_key,
            transporter=transporter,
            config=config,
        )

    async def close(self) -> None:
        return await self._transporter.close()

    async def custom_delete_with_http_info(
        self,
        path: Annotated[
            StrictStr,
            Field(
                description='Path of the endpoint, anything after "/1" must be specified.'
            ),
        ],
        parameters: Annotated[
            Optional[Dict[str, Any]],
            Field(description="Query parameters to apply to the current query."),
        ] = None,
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        Send requests to the Algolia REST API.

        This method allow you to send requests to the Algolia REST API.

        :param path: Path of the endpoint, anything after \"/1\" must be specified. (required)
        :type path: str
        :param parameters: Query parameters to apply to the current query.
        :type parameters: Dict[str, object]
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if path is None:
            raise ValueError(
                "Parameter `path` is required when calling `custom_delete`."
            )

        _query_parameters: List[Tuple[str, str]] = []

        if parameters is not None:
            for _qpkey, _qpvalue in parameters.items():
                _query_parameters.append((_qpkey, _qpvalue))

        return await self._transporter.request(
            verb=Verb.DELETE,
            path="/1{path}".replace("{path}", path),
            data=None,
            request_options=self._request_options.merge(
                query_parameters=_query_parameters,
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def custom_delete(
        self,
        path: Annotated[
            StrictStr,
            Field(
                description='Path of the endpoint, anything after "/1" must be specified.'
            ),
        ],
        parameters: Annotated[
            Optional[Dict[str, Any]],
            Field(description="Query parameters to apply to the current query."),
        ] = None,
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> object:
        """
        Send requests to the Algolia REST API.

        This method allow you to send requests to the Algolia REST API.

        :param path: Path of the endpoint, anything after \"/1\" must be specified. (required)
        :type path: str
        :param parameters: Query parameters to apply to the current query.
        :type parameters: Dict[str, object]
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'object' result object.
        """
        return (
            await self.custom_delete_with_http_info(path, parameters, request_options)
        ).deserialize(object)

    async def custom_get_with_http_info(
        self,
        path: Annotated[
            StrictStr,
            Field(
                description='Path of the endpoint, anything after "/1" must be specified.'
            ),
        ],
        parameters: Annotated[
            Optional[Dict[str, Any]],
            Field(description="Query parameters to apply to the current query."),
        ] = None,
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        Send requests to the Algolia REST API.

        This method allow you to send requests to the Algolia REST API.

        :param path: Path of the endpoint, anything after \"/1\" must be specified. (required)
        :type path: str
        :param parameters: Query parameters to apply to the current query.
        :type parameters: Dict[str, object]
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if path is None:
            raise ValueError("Parameter `path` is required when calling `custom_get`.")

        _query_parameters: List[Tuple[str, str]] = []

        if parameters is not None:
            for _qpkey, _qpvalue in parameters.items():
                _query_parameters.append((_qpkey, _qpvalue))

        return await self._transporter.request(
            verb=Verb.GET,
            path="/1{path}".replace("{path}", path),
            data=None,
            request_options=self._request_options.merge(
                query_parameters=_query_parameters,
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def custom_get(
        self,
        path: Annotated[
            StrictStr,
            Field(
                description='Path of the endpoint, anything after "/1" must be specified.'
            ),
        ],
        parameters: Annotated[
            Optional[Dict[str, Any]],
            Field(description="Query parameters to apply to the current query."),
        ] = None,
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> object:
        """
        Send requests to the Algolia REST API.

        This method allow you to send requests to the Algolia REST API.

        :param path: Path of the endpoint, anything after \"/1\" must be specified. (required)
        :type path: str
        :param parameters: Query parameters to apply to the current query.
        :type parameters: Dict[str, object]
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'object' result object.
        """
        return (
            await self.custom_get_with_http_info(path, parameters, request_options)
        ).deserialize(object)

    async def custom_post_with_http_info(
        self,
        path: Annotated[
            StrictStr,
            Field(
                description='Path of the endpoint, anything after "/1" must be specified.'
            ),
        ],
        parameters: Annotated[
            Optional[Dict[str, Any]],
            Field(description="Query parameters to apply to the current query."),
        ] = None,
        body: Annotated[
            Optional[Dict[str, Any]],
            Field(description="Parameters to send with the custom request."),
        ] = None,
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        Send requests to the Algolia REST API.

        This method allow you to send requests to the Algolia REST API.

        :param path: Path of the endpoint, anything after \"/1\" must be specified. (required)
        :type path: str
        :param parameters: Query parameters to apply to the current query.
        :type parameters: Dict[str, object]
        :param body: Parameters to send with the custom request.
        :type body: object
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if path is None:
            raise ValueError("Parameter `path` is required when calling `custom_post`.")

        _query_parameters: List[Tuple[str, str]] = []

        if parameters is not None:
            for _qpkey, _qpvalue in parameters.items():
                _query_parameters.append((_qpkey, _qpvalue))

        _body = {}
        if body is not None:
            _body = body

        return await self._transporter.request(
            verb=Verb.POST,
            path="/1{path}".replace("{path}", path),
            data=dumps(bodySerializer(_body)),
            request_options=self._request_options.merge(
                query_parameters=_query_parameters,
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def custom_post(
        self,
        path: Annotated[
            StrictStr,
            Field(
                description='Path of the endpoint, anything after "/1" must be specified.'
            ),
        ],
        parameters: Annotated[
            Optional[Dict[str, Any]],
            Field(description="Query parameters to apply to the current query."),
        ] = None,
        body: Annotated[
            Optional[Dict[str, Any]],
            Field(description="Parameters to send with the custom request."),
        ] = None,
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> object:
        """
        Send requests to the Algolia REST API.

        This method allow you to send requests to the Algolia REST API.

        :param path: Path of the endpoint, anything after \"/1\" must be specified. (required)
        :type path: str
        :param parameters: Query parameters to apply to the current query.
        :type parameters: Dict[str, object]
        :param body: Parameters to send with the custom request.
        :type body: object
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'object' result object.
        """
        return (
            await self.custom_post_with_http_info(
                path, parameters, body, request_options
            )
        ).deserialize(object)

    async def custom_put_with_http_info(
        self,
        path: Annotated[
            StrictStr,
            Field(
                description='Path of the endpoint, anything after "/1" must be specified.'
            ),
        ],
        parameters: Annotated[
            Optional[Dict[str, Any]],
            Field(description="Query parameters to apply to the current query."),
        ] = None,
        body: Annotated[
            Optional[Dict[str, Any]],
            Field(description="Parameters to send with the custom request."),
        ] = None,
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        Send requests to the Algolia REST API.

        This method allow you to send requests to the Algolia REST API.

        :param path: Path of the endpoint, anything after \"/1\" must be specified. (required)
        :type path: str
        :param parameters: Query parameters to apply to the current query.
        :type parameters: Dict[str, object]
        :param body: Parameters to send with the custom request.
        :type body: object
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if path is None:
            raise ValueError("Parameter `path` is required when calling `custom_put`.")

        _query_parameters: List[Tuple[str, str]] = []

        if parameters is not None:
            for _qpkey, _qpvalue in parameters.items():
                _query_parameters.append((_qpkey, _qpvalue))

        _body = {}
        if body is not None:
            _body = body

        return await self._transporter.request(
            verb=Verb.PUT,
            path="/1{path}".replace("{path}", path),
            data=dumps(bodySerializer(_body)),
            request_options=self._request_options.merge(
                query_parameters=_query_parameters,
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def custom_put(
        self,
        path: Annotated[
            StrictStr,
            Field(
                description='Path of the endpoint, anything after "/1" must be specified.'
            ),
        ],
        parameters: Annotated[
            Optional[Dict[str, Any]],
            Field(description="Query parameters to apply to the current query."),
        ] = None,
        body: Annotated[
            Optional[Dict[str, Any]],
            Field(description="Parameters to send with the custom request."),
        ] = None,
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> object:
        """
        Send requests to the Algolia REST API.

        This method allow you to send requests to the Algolia REST API.

        :param path: Path of the endpoint, anything after \"/1\" must be specified. (required)
        :type path: str
        :param parameters: Query parameters to apply to the current query.
        :type parameters: Dict[str, object]
        :param body: Parameters to send with the custom request.
        :type body: object
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'object' result object.
        """
        return (
            await self.custom_put_with_http_info(
                path, parameters, body, request_options
            )
        ).deserialize(object)

    async def get_cluster_incidents_with_http_info(
        self,
        clusters: Annotated[
            StrictStr, Field(description="Subset of clusters, separated by comma.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        List incidents for selected clusters.

        List known incidents for selected clusters.

        :param clusters: Subset of clusters, separated by comma. (required)
        :type clusters: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if clusters is None:
            raise ValueError(
                "Parameter `clusters` is required when calling `get_cluster_incidents`."
            )

        return await self._transporter.request(
            verb=Verb.GET,
            path="/1/incidents/{clusters}".replace(
                "{clusters}", quote(str(clusters), safe="")
            ),
            data=None,
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def get_cluster_incidents(
        self,
        clusters: Annotated[
            StrictStr, Field(description="Subset of clusters, separated by comma.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> IncidentsResponse:
        """
        List incidents for selected clusters.

        List known incidents for selected clusters.

        :param clusters: Subset of clusters, separated by comma. (required)
        :type clusters: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'IncidentsResponse' result object.
        """
        return (
            await self.get_cluster_incidents_with_http_info(clusters, request_options)
        ).deserialize(IncidentsResponse)

    async def get_cluster_status_with_http_info(
        self,
        clusters: Annotated[
            StrictStr, Field(description="Subset of clusters, separated by comma.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        List statuses of selected clusters.

        Report whether a cluster is operational.

        :param clusters: Subset of clusters, separated by comma. (required)
        :type clusters: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if clusters is None:
            raise ValueError(
                "Parameter `clusters` is required when calling `get_cluster_status`."
            )

        return await self._transporter.request(
            verb=Verb.GET,
            path="/1/status/{clusters}".replace(
                "{clusters}", quote(str(clusters), safe="")
            ),
            data=None,
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def get_cluster_status(
        self,
        clusters: Annotated[
            StrictStr, Field(description="Subset of clusters, separated by comma.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> StatusResponse:
        """
        List statuses of selected clusters.

        Report whether a cluster is operational.

        :param clusters: Subset of clusters, separated by comma. (required)
        :type clusters: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'StatusResponse' result object.
        """
        return (
            await self.get_cluster_status_with_http_info(clusters, request_options)
        ).deserialize(StatusResponse)

    async def get_incidents_with_http_info(
        self, request_options: Optional[Union[dict, RequestOptions]] = None
    ) -> ApiResponse[str]:
        """
        List incidents.

        List known incidents for all clusters.

        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        return await self._transporter.request(
            verb=Verb.GET,
            path="/1/incidents",
            data=None,
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def get_incidents(
        self, request_options: Optional[Union[dict, RequestOptions]] = None
    ) -> IncidentsResponse:
        """
        List incidents.

        List known incidents for all clusters.

        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'IncidentsResponse' result object.
        """
        return (await self.get_incidents_with_http_info(request_options)).deserialize(
            IncidentsResponse
        )

    async def get_indexing_time_with_http_info(
        self,
        clusters: Annotated[
            StrictStr, Field(description="Subset of clusters, separated by comma.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        Get indexing times.

        List the average times for indexing operations for selected clusters.

        :param clusters: Subset of clusters, separated by comma. (required)
        :type clusters: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if clusters is None:
            raise ValueError(
                "Parameter `clusters` is required when calling `get_indexing_time`."
            )

        return await self._transporter.request(
            verb=Verb.GET,
            path="/1/indexing/{clusters}".replace(
                "{clusters}", quote(str(clusters), safe="")
            ),
            data=None,
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def get_indexing_time(
        self,
        clusters: Annotated[
            StrictStr, Field(description="Subset of clusters, separated by comma.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> IndexingTimeResponse:
        """
        Get indexing times.

        List the average times for indexing operations for selected clusters.

        :param clusters: Subset of clusters, separated by comma. (required)
        :type clusters: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'IndexingTimeResponse' result object.
        """
        return (
            await self.get_indexing_time_with_http_info(clusters, request_options)
        ).deserialize(IndexingTimeResponse)

    async def get_inventory_with_http_info(
        self, request_options: Optional[Union[dict, RequestOptions]] = None
    ) -> ApiResponse[str]:
        """
        List servers.

        List the servers belonging to clusters.  The response depends on whether you authenticate your API request:  - With authentication, the response lists the servers assigned to your Algolia application's cluster.  - Without authentication, the response lists the servers for all Algolia clusters.

        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        return await self._transporter.request(
            verb=Verb.GET,
            path="/1/inventory/servers",
            data=None,
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def get_inventory(
        self, request_options: Optional[Union[dict, RequestOptions]] = None
    ) -> InventoryResponse:
        """
        List servers.

        List the servers belonging to clusters.  The response depends on whether you authenticate your API request:  - With authentication, the response lists the servers assigned to your Algolia application's cluster.  - Without authentication, the response lists the servers for all Algolia clusters.

        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'InventoryResponse' result object.
        """
        return (await self.get_inventory_with_http_info(request_options)).deserialize(
            InventoryResponse
        )

    async def get_latency_with_http_info(
        self,
        clusters: Annotated[
            StrictStr, Field(description="Subset of clusters, separated by comma.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        Get search latency times.

        List the average latency for search requests for selected clusters.

        :param clusters: Subset of clusters, separated by comma. (required)
        :type clusters: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if clusters is None:
            raise ValueError(
                "Parameter `clusters` is required when calling `get_latency`."
            )

        return await self._transporter.request(
            verb=Verb.GET,
            path="/1/latency/{clusters}".replace(
                "{clusters}", quote(str(clusters), safe="")
            ),
            data=None,
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def get_latency(
        self,
        clusters: Annotated[
            StrictStr, Field(description="Subset of clusters, separated by comma.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> LatencyResponse:
        """
        Get search latency times.

        List the average latency for search requests for selected clusters.

        :param clusters: Subset of clusters, separated by comma. (required)
        :type clusters: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'LatencyResponse' result object.
        """
        return (
            await self.get_latency_with_http_info(clusters, request_options)
        ).deserialize(LatencyResponse)

    async def get_metrics_with_http_info(
        self,
        metric: Annotated[
            Metric,
            Field(
                description="Metric to report.  For more information about the individual metrics, see the response. To include all metrics, use `*` as the parameter. "
            ),
        ],
        period: Annotated[
            Period,
            Field(
                description="Period over which to aggregate the metrics:  - `minute`. Aggregate the last minute. 1 data point per 10 seconds. - `hour`. Aggregate the last hour. 1 data point per minute. - `day`. Aggregate the last day. 1 data point per 10 minutes. - `week`. Aggregate the last week. 1 data point per hour. - `month`. Aggregate the last month. 1 data point per day. "
            ),
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        Get metrics for a given period.

        Report the aggregate value of a metric for a selected period of time.

        :param metric: Metric to report.  For more information about the individual metrics, see the response. To include all metrics, use `*` as the parameter.  (required)
        :type metric: Metric
        :param period: Period over which to aggregate the metrics:  - `minute`. Aggregate the last minute. 1 data point per 10 seconds. - `hour`. Aggregate the last hour. 1 data point per minute. - `day`. Aggregate the last day. 1 data point per 10 minutes. - `week`. Aggregate the last week. 1 data point per hour. - `month`. Aggregate the last month. 1 data point per day.  (required)
        :type period: Period
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if metric is None:
            raise ValueError(
                "Parameter `metric` is required when calling `get_metrics`."
            )

        if period is None:
            raise ValueError(
                "Parameter `period` is required when calling `get_metrics`."
            )

        return await self._transporter.request(
            verb=Verb.GET,
            path="/1/infrastructure/{metric}/period/{period}".replace(
                "{metric}", quote(str(metric), safe="")
            ).replace("{period}", quote(str(period), safe="")),
            data=None,
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def get_metrics(
        self,
        metric: Annotated[
            Metric,
            Field(
                description="Metric to report.  For more information about the individual metrics, see the response. To include all metrics, use `*` as the parameter. "
            ),
        ],
        period: Annotated[
            Period,
            Field(
                description="Period over which to aggregate the metrics:  - `minute`. Aggregate the last minute. 1 data point per 10 seconds. - `hour`. Aggregate the last hour. 1 data point per minute. - `day`. Aggregate the last day. 1 data point per 10 minutes. - `week`. Aggregate the last week. 1 data point per hour. - `month`. Aggregate the last month. 1 data point per day. "
            ),
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> InfrastructureResponse:
        """
        Get metrics for a given period.

        Report the aggregate value of a metric for a selected period of time.

        :param metric: Metric to report.  For more information about the individual metrics, see the response. To include all metrics, use `*` as the parameter.  (required)
        :type metric: Metric
        :param period: Period over which to aggregate the metrics:  - `minute`. Aggregate the last minute. 1 data point per 10 seconds. - `hour`. Aggregate the last hour. 1 data point per minute. - `day`. Aggregate the last day. 1 data point per 10 minutes. - `week`. Aggregate the last week. 1 data point per hour. - `month`. Aggregate the last month. 1 data point per day.  (required)
        :type period: Period
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'InfrastructureResponse' result object.
        """
        return (
            await self.get_metrics_with_http_info(metric, period, request_options)
        ).deserialize(InfrastructureResponse)

    async def get_reachability_with_http_info(
        self,
        clusters: Annotated[
            StrictStr, Field(description="Subset of clusters, separated by comma.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        Test the reachability of clusters.

        Test whether clusters are reachable or not.

        :param clusters: Subset of clusters, separated by comma. (required)
        :type clusters: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if clusters is None:
            raise ValueError(
                "Parameter `clusters` is required when calling `get_reachability`."
            )

        return await self._transporter.request(
            verb=Verb.GET,
            path="/1/reachability/{clusters}/probes".replace(
                "{clusters}", quote(str(clusters), safe="")
            ),
            data=None,
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def get_reachability(
        self,
        clusters: Annotated[
            StrictStr, Field(description="Subset of clusters, separated by comma.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> Dict[str, Dict[str, bool]]:
        """
        Test the reachability of clusters.

        Test whether clusters are reachable or not.

        :param clusters: Subset of clusters, separated by comma. (required)
        :type clusters: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'Dict[str, Dict[str, bool]]' result object.
        """
        return (
            await self.get_reachability_with_http_info(clusters, request_options)
        ).deserialize(Dict[str, Dict[str, bool]])

    async def get_status_with_http_info(
        self, request_options: Optional[Union[dict, RequestOptions]] = None
    ) -> ApiResponse[str]:
        """
        List cluster statuses.

        Report whether clusters are operational.  The response depends on whether you authenticate your API request.  - With authentication, the response includes the status of the cluster assigned to your Algolia application.  - Without authentication, the response lists the statuses of all public Algolia clusters.

        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        return await self._transporter.request(
            verb=Verb.GET,
            path="/1/status",
            data=None,
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def get_status(
        self, request_options: Optional[Union[dict, RequestOptions]] = None
    ) -> StatusResponse:
        """
        List cluster statuses.

        Report whether clusters are operational.  The response depends on whether you authenticate your API request.  - With authentication, the response includes the status of the cluster assigned to your Algolia application.  - Without authentication, the response lists the statuses of all public Algolia clusters.

        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'StatusResponse' result object.
        """
        return (await self.get_status_with_http_info(request_options)).deserialize(
            StatusResponse
        )
