# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from json import dumps
from typing import Annotated, Any, Dict, List, Optional, Self, Tuple, Union
from urllib.parse import quote

from pydantic import Field, StrictInt, StrictStr

from algoliasearch.http.api_response import ApiResponse
from algoliasearch.http.request_options import RequestOptions
from algoliasearch.http.serializer import bodySerializer
from algoliasearch.http.transporter import Transporter
from algoliasearch.http.verb import Verb
from algoliasearch.recommend.config import RecommendConfig
from algoliasearch.recommend.models.deleted_at_response import DeletedAtResponse
from algoliasearch.recommend.models.get_recommend_task_response import (
    GetRecommendTaskResponse,
)
from algoliasearch.recommend.models.get_recommendations_params import (
    GetRecommendationsParams,
)
from algoliasearch.recommend.models.get_recommendations_response import (
    GetRecommendationsResponse,
)
from algoliasearch.recommend.models.recommend_models import RecommendModels
from algoliasearch.recommend.models.rule_response import RuleResponse
from algoliasearch.recommend.models.search_recommend_rules_params import (
    SearchRecommendRulesParams,
)
from algoliasearch.recommend.models.search_recommend_rules_response import (
    SearchRecommendRulesResponse,
)


class RecommendClient:
    _transporter: Transporter
    _config: RecommendConfig
    _request_options: RequestOptions

    def __init__(
        self,
        app_id: Optional[str] = None,
        api_key: Optional[str] = None,
        transporter: Optional[Transporter] = None,
        config: Optional[RecommendConfig] = None,
    ) -> None:
        if transporter is not None and config is None:
            config = transporter._config

        if config is None:
            config = RecommendConfig(app_id, api_key)
        self._config = config
        self._request_options = RequestOptions(config)

        if transporter is None:
            transporter = Transporter(config)
        self._transporter = transporter

    def create_with_config(
        config: RecommendConfig, transporter: Optional[Transporter] = None
    ) -> Self:
        if transporter is None:
            transporter = Transporter(config)

        return RecommendClient(
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

    async def delete_recommend_rule_with_http_info(
        self,
        index_name: Annotated[
            StrictStr, Field(description="Index on which to perform the request.")
        ],
        model: Annotated[
            RecommendModels,
            Field(
                description="[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). "
            ),
        ],
        object_id: Annotated[
            StrictStr, Field(description="Unique record (object) identifier.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        Delete a Recommend rule.

        Delete a [Recommend rule](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).

        :param index_name: Index on which to perform the request. (required)
        :type index_name: str
        :param model: [Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
        :type model: RecommendModels
        :param object_id: Unique record (object) identifier. (required)
        :type object_id: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if index_name is None:
            raise ValueError(
                "Parameter `index_name` is required when calling `delete_recommend_rule`."
            )

        if model is None:
            raise ValueError(
                "Parameter `model` is required when calling `delete_recommend_rule`."
            )

        if object_id is None:
            raise ValueError(
                "Parameter `object_id` is required when calling `delete_recommend_rule`."
            )

        return await self._transporter.request(
            verb=Verb.DELETE,
            path="/1/indexes/{indexName}/{model}/recommend/rules/{objectID}".replace(
                "{indexName}", quote(str(index_name), safe="")
            )
            .replace("{model}", quote(str(model), safe=""))
            .replace("{objectID}", quote(str(object_id), safe="")),
            data=None,
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def delete_recommend_rule(
        self,
        index_name: Annotated[
            StrictStr, Field(description="Index on which to perform the request.")
        ],
        model: Annotated[
            RecommendModels,
            Field(
                description="[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). "
            ),
        ],
        object_id: Annotated[
            StrictStr, Field(description="Unique record (object) identifier.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> DeletedAtResponse:
        """
        Delete a Recommend rule.

        Delete a [Recommend rule](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).

        :param index_name: Index on which to perform the request. (required)
        :type index_name: str
        :param model: [Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
        :type model: RecommendModels
        :param object_id: Unique record (object) identifier. (required)
        :type object_id: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'DeletedAtResponse' result object.
        """
        return (
            await self.delete_recommend_rule_with_http_info(
                index_name, model, object_id, request_options
            )
        ).deserialize(DeletedAtResponse)

    async def get_recommend_rule_with_http_info(
        self,
        index_name: Annotated[
            StrictStr, Field(description="Index on which to perform the request.")
        ],
        model: Annotated[
            RecommendModels,
            Field(
                description="[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). "
            ),
        ],
        object_id: Annotated[
            StrictStr, Field(description="Unique record (object) identifier.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        Get a Recommend rule.

        Return a [Recommend rule](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).

        :param index_name: Index on which to perform the request. (required)
        :type index_name: str
        :param model: [Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
        :type model: RecommendModels
        :param object_id: Unique record (object) identifier. (required)
        :type object_id: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if index_name is None:
            raise ValueError(
                "Parameter `index_name` is required when calling `get_recommend_rule`."
            )

        if model is None:
            raise ValueError(
                "Parameter `model` is required when calling `get_recommend_rule`."
            )

        if object_id is None:
            raise ValueError(
                "Parameter `object_id` is required when calling `get_recommend_rule`."
            )

        return await self._transporter.request(
            verb=Verb.GET,
            path="/1/indexes/{indexName}/{model}/recommend/rules/{objectID}".replace(
                "{indexName}", quote(str(index_name), safe="")
            )
            .replace("{model}", quote(str(model), safe=""))
            .replace("{objectID}", quote(str(object_id), safe="")),
            data=None,
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def get_recommend_rule(
        self,
        index_name: Annotated[
            StrictStr, Field(description="Index on which to perform the request.")
        ],
        model: Annotated[
            RecommendModels,
            Field(
                description="[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). "
            ),
        ],
        object_id: Annotated[
            StrictStr, Field(description="Unique record (object) identifier.")
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> RuleResponse:
        """
        Get a Recommend rule.

        Return a [Recommend rule](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).

        :param index_name: Index on which to perform the request. (required)
        :type index_name: str
        :param model: [Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
        :type model: RecommendModels
        :param object_id: Unique record (object) identifier. (required)
        :type object_id: str
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'RuleResponse' result object.
        """
        return (
            await self.get_recommend_rule_with_http_info(
                index_name, model, object_id, request_options
            )
        ).deserialize(RuleResponse)

    async def get_recommend_status_with_http_info(
        self,
        index_name: Annotated[
            StrictStr, Field(description="Index on which to perform the request.")
        ],
        model: Annotated[
            RecommendModels,
            Field(
                description="[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). "
            ),
        ],
        task_id: Annotated[
            StrictInt,
            Field(
                description="Unique identifier of a task. Numeric value (up to 64bits)."
            ),
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        Get a Recommend task's status.

        Some operations, such as deleting a Recommend rule, will respond with a `taskID` value. Use this value here to check the status of that task.

        :param index_name: Index on which to perform the request. (required)
        :type index_name: str
        :param model: [Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
        :type model: RecommendModels
        :param task_id: Unique identifier of a task. Numeric value (up to 64bits). (required)
        :type task_id: int
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if index_name is None:
            raise ValueError(
                "Parameter `index_name` is required when calling `get_recommend_status`."
            )

        if model is None:
            raise ValueError(
                "Parameter `model` is required when calling `get_recommend_status`."
            )

        if task_id is None:
            raise ValueError(
                "Parameter `task_id` is required when calling `get_recommend_status`."
            )

        return await self._transporter.request(
            verb=Verb.GET,
            path="/1/indexes/{indexName}/{model}/task/{taskID}".replace(
                "{indexName}", quote(str(index_name), safe="")
            )
            .replace("{model}", quote(str(model), safe=""))
            .replace("{taskID}", quote(str(task_id), safe="")),
            data=None,
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=False,
        )

    async def get_recommend_status(
        self,
        index_name: Annotated[
            StrictStr, Field(description="Index on which to perform the request.")
        ],
        model: Annotated[
            RecommendModels,
            Field(
                description="[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). "
            ),
        ],
        task_id: Annotated[
            StrictInt,
            Field(
                description="Unique identifier of a task. Numeric value (up to 64bits)."
            ),
        ],
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> GetRecommendTaskResponse:
        """
        Get a Recommend task's status.

        Some operations, such as deleting a Recommend rule, will respond with a `taskID` value. Use this value here to check the status of that task.

        :param index_name: Index on which to perform the request. (required)
        :type index_name: str
        :param model: [Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
        :type model: RecommendModels
        :param task_id: Unique identifier of a task. Numeric value (up to 64bits). (required)
        :type task_id: int
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'GetRecommendTaskResponse' result object.
        """
        return (
            await self.get_recommend_status_with_http_info(
                index_name, model, task_id, request_options
            )
        ).deserialize(GetRecommendTaskResponse)

    async def get_recommendations_with_http_info(
        self,
        get_recommendations_params: GetRecommendationsParams,
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        Get recommendations and trending items.

        Returns results from either recommendation or trending models:    - **Recommendations** are provided by the [Related Products](https://www.algolia.com/doc/guides/algolia-recommend/overview/#related-products-and-related-content) and [Frequently Bought Together](https://www.algolia.com/doc/guides/algolia-recommend/overview/#frequently-bought-together) models   - **Trending** models are [Trending Items and Trending Facet Values](https://www.algolia.com/doc/guides/algolia-recommend/overview/#trending-items-and-trending-facet-values).

        :param get_recommendations_params: (required)
        :type get_recommendations_params: GetRecommendationsParams
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if get_recommendations_params is None:
            raise ValueError(
                "Parameter `get_recommendations_params` is required when calling `get_recommendations`."
            )

        _body = {}
        if get_recommendations_params is not None:
            _body = get_recommendations_params

        return await self._transporter.request(
            verb=Verb.POST,
            path="/1/indexes/*/recommendations",
            data=dumps(bodySerializer(_body)),
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=True,
        )

    async def get_recommendations(
        self,
        get_recommendations_params: GetRecommendationsParams,
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> GetRecommendationsResponse:
        """
        Get recommendations and trending items.

        Returns results from either recommendation or trending models:    - **Recommendations** are provided by the [Related Products](https://www.algolia.com/doc/guides/algolia-recommend/overview/#related-products-and-related-content) and [Frequently Bought Together](https://www.algolia.com/doc/guides/algolia-recommend/overview/#frequently-bought-together) models   - **Trending** models are [Trending Items and Trending Facet Values](https://www.algolia.com/doc/guides/algolia-recommend/overview/#trending-items-and-trending-facet-values).

        :param get_recommendations_params: (required)
        :type get_recommendations_params: GetRecommendationsParams
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'GetRecommendationsResponse' result object.
        """
        return (
            await self.get_recommendations_with_http_info(
                get_recommendations_params, request_options
            )
        ).deserialize(GetRecommendationsResponse)

    async def search_recommend_rules_with_http_info(
        self,
        index_name: Annotated[
            StrictStr, Field(description="Index on which to perform the request.")
        ],
        model: Annotated[
            RecommendModels,
            Field(
                description="[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). "
            ),
        ],
        search_recommend_rules_params: Optional[SearchRecommendRulesParams] = None,
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> ApiResponse[str]:
        """
        List Recommend rules.

        List [Recommend rules](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).

        :param index_name: Index on which to perform the request. (required)
        :type index_name: str
        :param model: [Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
        :type model: RecommendModels
        :param search_recommend_rules_params:
        :type search_recommend_rules_params: SearchRecommendRulesParams
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the raw algoliasearch 'APIResponse' object.
        """

        if index_name is None:
            raise ValueError(
                "Parameter `index_name` is required when calling `search_recommend_rules`."
            )

        if model is None:
            raise ValueError(
                "Parameter `model` is required when calling `search_recommend_rules`."
            )

        _body = {}
        if search_recommend_rules_params is not None:
            _body = search_recommend_rules_params

        return await self._transporter.request(
            verb=Verb.POST,
            path="/1/indexes/{indexName}/{model}/recommend/rules/search".replace(
                "{indexName}", quote(str(index_name), safe="")
            ).replace("{model}", quote(str(model), safe="")),
            data=dumps(bodySerializer(_body)),
            request_options=self._request_options.merge(
                user_request_options=request_options,
            ),
            use_read_transporter=True,
        )

    async def search_recommend_rules(
        self,
        index_name: Annotated[
            StrictStr, Field(description="Index on which to perform the request.")
        ],
        model: Annotated[
            RecommendModels,
            Field(
                description="[Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models). "
            ),
        ],
        search_recommend_rules_params: Optional[SearchRecommendRulesParams] = None,
        request_options: Optional[Union[dict, RequestOptions]] = None,
    ) -> SearchRecommendRulesResponse:
        """
        List Recommend rules.

        List [Recommend rules](https://www.algolia.com/doc/guides/algolia-recommend/how-to/rules/).

        :param index_name: Index on which to perform the request. (required)
        :type index_name: str
        :param model: [Recommend models](https://www.algolia.com/doc/guides/algolia-recommend/overview/#recommend-models).  (required)
        :type model: RecommendModels
        :param search_recommend_rules_params:
        :type search_recommend_rules_params: SearchRecommendRulesParams
        :param request_options: The request options to send along with the query, they will be merged with the transporter base parameters (headers, query params, timeouts, etc.). (optional)
        :return: Returns the deserialized response in a 'SearchRecommendRulesResponse' result object.
        """
        return (
            await self.search_recommend_rules_with_http_info(
                index_name, model, search_recommend_rules_params, request_options
            )
        ).deserialize(SearchRecommendRulesResponse)
