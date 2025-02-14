# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from json import loads
from typing import Annotated, Any, Dict, Self, Union

from pydantic import BaseModel, Field, StrictFloat, StrictInt, StrictStr


class TopHitWithAnalytics(BaseModel):
    """
    TopHitWithAnalytics
    """

    hit: StrictStr = Field(description="Hit.")
    count: StrictInt = Field(description="Number of occurrences.")
    click_through_rate: Union[
        Annotated[float, Field(le=1, strict=True, ge=0)],
        Annotated[int, Field(le=1, strict=True, ge=0)],
    ] = Field(
        description="[Click-through rate (CTR)](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#click-through-rate). ",
        alias="clickThroughRate",
    )
    conversion_rate: Union[StrictFloat, StrictInt] = Field(
        description="[Conversion rate (CR)](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#conversion-rate). ",
        alias="conversionRate",
    )
    tracked_search_count: StrictInt = Field(
        description="Number of tracked searches. This is the number of search requests where the `clickAnalytics` parameter is `true`.",
        alias="trackedSearchCount",
    )
    click_count: StrictInt = Field(
        description="Number of click events.", alias="clickCount"
    )
    conversion_count: StrictInt = Field(
        description="Number of converted clicks.", alias="conversionCount"
    )

    model_config = {"populate_by_name": True, "validate_assignment": True}

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of TopHitWithAnalytics from a JSON string"""
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
        """Create an instance of TopHitWithAnalytics from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "hit": obj.get("hit"),
                "count": obj.get("count"),
                "clickThroughRate": obj.get("clickThroughRate"),
                "conversionRate": obj.get("conversionRate"),
                "trackedSearchCount": obj.get("trackedSearchCount"),
                "clickCount": obj.get("clickCount"),
                "conversionCount": obj.get("conversionCount"),
            }
        )
        return _obj
