# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from json import loads
from typing import Any, Dict, List, Optional, Self

from pydantic import BaseModel, Field, StrictInt, StrictStr

from algoliasearch.search.models.acl import Acl


class GetApiKeyResponse(BaseModel):
    """
    GetApiKeyResponse
    """

    value: Optional[StrictStr] = Field(default=None, description="API key.")
    created_at: StrictInt = Field(
        description="Timestamp of creation in milliseconds in [Unix epoch time](https://wikipedia.org/wiki/Unix_time).",
        alias="createdAt",
    )
    acl: List[Acl] = Field(
        description="[Permissions](https://www.algolia.com/doc/guides/security/api-keys/#access-control-list-acl) associated with the key. "
    )
    description: Optional[StrictStr] = Field(
        default="",
        description="Description of an API key for you and your team members.",
    )
    indexes: Optional[List[StrictStr]] = Field(
        default=None,
        description='Restricts this API key to a list of indices or index patterns. If the list is empty, all indices are allowed. Specify either an exact index name or a pattern with a leading or trailing wildcard character (or both). For example: - `dev_*` matches all indices starting with "dev_" - `*_dev` matches all indices ending with "_dev" - `*_products_*` matches all indices containing "_products_". ',
    )
    max_hits_per_query: Optional[StrictInt] = Field(
        default=0,
        description="Maximum number of hits this API key can retrieve in one query. If zero, no limit is enforced. > **Note**: Use this parameter to protect you from third-party attempts to retrieve your entire content by massively querying the index. ",
        alias="maxHitsPerQuery",
    )
    max_queries_per_ip_per_hour: Optional[StrictInt] = Field(
        default=0,
        description="Maximum number of API calls per hour allowed from a given IP address or [user token](https://www.algolia.com/doc/guides/sending-events/concepts/usertoken/). Each time an API call is performed with this key, a check is performed. If there were more than the specified number of calls within the last hour, the API returns an error with the status code `429` (Too Many Requests).  > **Note**: Use this parameter to protect you from third-party attempts to retrieve your entire content by massively querying the index. ",
        alias="maxQueriesPerIPPerHour",
    )
    query_parameters: Optional[StrictStr] = Field(
        default="",
        description="Force some [query parameters](https://www.algolia.com/doc/api-reference/api-parameters/) to be applied for each query made with this API key. It's a URL-encoded query string. ",
        alias="queryParameters",
    )
    referers: Optional[List[StrictStr]] = Field(
        default=None,
        description='Restrict this API key to specific [referrers](https://www.algolia.com/doc/guides/security/api-keys/in-depth/api-key-restrictions/#http-referrers). If empty, all referrers are allowed. For example: - `https://algolia.com/*` matches all referrers starting with "https://algolia.com/" - `*.algolia.com` matches all referrers ending with ".algolia.com" - `*algolia.com*` allows everything in the domain "algolia.com". ',
    )
    validity: Optional[StrictInt] = Field(
        default=0,
        description="Validity duration of a key (in seconds).  The key will automatically be removed after this time has expired. The default value of 0 never expires. Short-lived API keys are useful to grant temporary access to your data. For example, in mobile apps, you can't [control when users update your app](https://www.algolia.com/doc/guides/security/security-best-practices/#use-secured-api-keys-in-mobile-apps). So instead of encoding keys into your app as you would for a web app, you should dynamically fetch them from your mobile app's backend. ",
    )

    model_config = {"populate_by_name": True, "validate_assignment": True}

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of GetApiKeyResponse from a JSON string"""
        return cls.from_dict(loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        _dict = self.model_dump(
            by_alias=True,
            exclude={},
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of GetApiKeyResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "value": obj.get("value"),
                "createdAt": obj.get("createdAt"),
                "acl": obj.get("acl"),
                "description": obj.get("description")
                if obj.get("description") is not None
                else "",
                "indexes": obj.get("indexes"),
                "maxHitsPerQuery": obj.get("maxHitsPerQuery")
                if obj.get("maxHitsPerQuery") is not None
                else 0,
                "maxQueriesPerIPPerHour": obj.get("maxQueriesPerIPPerHour")
                if obj.get("maxQueriesPerIPPerHour") is not None
                else 0,
                "queryParameters": obj.get("queryParameters")
                if obj.get("queryParameters") is not None
                else "",
                "referers": obj.get("referers"),
                "validity": obj.get("validity")
                if obj.get("validity") is not None
                else 0,
            }
        )
        return _obj
