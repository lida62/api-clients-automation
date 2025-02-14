# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from json import loads
from typing import Annotated, Any, Dict, List, Optional, Self, Union

from pydantic import BaseModel, Field, StrictBool, StrictFloat, StrictInt, StrictStr

from algoliasearch.search.models.around_precision import AroundPrecision
from algoliasearch.search.models.around_radius import AroundRadius
from algoliasearch.search.models.facet_filters import FacetFilters
from algoliasearch.search.models.numeric_filters import NumericFilters
from algoliasearch.search.models.optional_filters import OptionalFilters
from algoliasearch.search.models.tag_filters import TagFilters


class BaseSearchParamsWithoutQuery(BaseModel):
    """
    BaseSearchParamsWithoutQuery
    """

    similar_query: Optional[StrictStr] = Field(
        default="",
        description="Overrides the query parameter and performs a more generic search.",
        alias="similarQuery",
    )
    filters: Optional[StrictStr] = Field(
        default="",
        description="[Filter](https://www.algolia.com/doc/guides/managing-results/refine-results/filtering/) the query with numeric, facet, or tag filters. ",
    )
    facet_filters: Optional[FacetFilters] = Field(default=None, alias="facetFilters")
    optional_filters: Optional[OptionalFilters] = Field(
        default=None, alias="optionalFilters"
    )
    numeric_filters: Optional[NumericFilters] = Field(
        default=None, alias="numericFilters"
    )
    tag_filters: Optional[TagFilters] = Field(default=None, alias="tagFilters")
    sum_or_filters_scores: Optional[StrictBool] = Field(
        default=False,
        description="Determines how to calculate [filter scores](https://www.algolia.com/doc/guides/managing-results/refine-results/filtering/in-depth/filter-scoring/#accumulating-scores-with-sumorfiltersscores). If `false`, maximum score is kept. If `true`, score is summed. ",
        alias="sumOrFiltersScores",
    )
    restrict_searchable_attributes: Optional[List[StrictStr]] = Field(
        default=None,
        description="Restricts a query to only look at a subset of your [searchable attributes](https://www.algolia.com/doc/guides/managing-results/must-do/searchable-attributes/).",
        alias="restrictSearchableAttributes",
    )
    facets: Optional[List[StrictStr]] = Field(
        default=None,
        description="Returns [facets](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#contextual-facet-values-and-counts), their facet values, and the number of matching facet values.",
    )
    faceting_after_distinct: Optional[StrictBool] = Field(
        default=False,
        description="Forces faceting to be applied after [de-duplication](https://www.algolia.com/doc/guides/managing-results/refine-results/grouping/) (with the distinct feature). Alternatively, the `afterDistinct` [modifier](https://www.algolia.com/doc/api-reference/api-parameters/attributesForFaceting/#modifiers) of `attributesForFaceting` allows for more granular control. ",
        alias="facetingAfterDistinct",
    )
    page: Optional[StrictInt] = Field(
        default=0, description="Page to retrieve (the first page is `0`, not `1`)."
    )
    offset: Optional[StrictInt] = Field(
        default=None,
        description="Specifies the offset of the first hit to return. > **Note**: Using `page` and `hitsPerPage` is the recommended method for [paging results](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/). However, you can use `offset` and `length` to implement [an alternative approach to paging](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/#retrieving-a-subset-of-records-with-offset-and-length). ",
    )
    length: Optional[Annotated[int, Field(le=1000, strict=True, ge=1)]] = Field(
        default=None,
        description="Sets the number of hits to retrieve (for use with `offset`). > **Note**: Using `page` and `hitsPerPage` is the recommended method for [paging results](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/). However, you can use `offset` and `length` to implement [an alternative approach to paging](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/#retrieving-a-subset-of-records-with-offset-and-length). ",
    )
    around_lat_lng: Optional[StrictStr] = Field(
        default="",
        description="Search for entries [around a central location](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filter-around-a-central-point), enabling a geographical search within a circular area.",
        alias="aroundLatLng",
    )
    around_lat_lng_via_ip: Optional[StrictBool] = Field(
        default=False,
        description="Search for entries around a location. The location is automatically computed from the requester's IP address.",
        alias="aroundLatLngViaIP",
    )
    around_radius: Optional[AroundRadius] = Field(default=None, alias="aroundRadius")
    around_precision: Optional[AroundPrecision] = Field(
        default=None, alias="aroundPrecision"
    )
    minimum_around_radius: Optional[Annotated[int, Field(strict=True, ge=1)]] = Field(
        default=None,
        description="Minimum radius (in meters) used for a geographical search when `aroundRadius` isn't set.",
        alias="minimumAroundRadius",
    )
    inside_bounding_box: Optional[List[List[Union[StrictFloat, StrictInt]]]] = Field(
        default=None,
        description="Search inside a [rectangular area](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filtering-inside-rectangular-or-polygonal-areas) (in geographical coordinates).",
        alias="insideBoundingBox",
    )
    inside_polygon: Optional[List[List[Union[StrictFloat, StrictInt]]]] = Field(
        default=None,
        description="Search inside a [polygon](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filtering-inside-rectangular-or-polygonal-areas) (in geographical coordinates).",
        alias="insidePolygon",
    )
    natural_languages: Optional[List[StrictStr]] = Field(
        default=None,
        description="Changes the default values of parameters that work best for a natural language query, such as `ignorePlurals`, `removeStopWords`, `removeWordsIfNoResults`, `analyticsTags`, and `ruleContexts`. These parameters work well together when the query consists of fuller natural language strings instead of keywords, for example when processing voice search queries.",
        alias="naturalLanguages",
    )
    rule_contexts: Optional[List[StrictStr]] = Field(
        default=None,
        description="Assigns [rule contexts](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/how-to/customize-search-results-by-platform/#whats-a-context) to search queries.",
        alias="ruleContexts",
    )
    personalization_impact: Optional[StrictInt] = Field(
        default=100,
        description="Defines how much [Personalization affects results](https://www.algolia.com/doc/guides/personalization/personalizing-results/in-depth/configuring-personalization/#understanding-personalization-impact).",
        alias="personalizationImpact",
    )
    user_token: Optional[StrictStr] = Field(
        default=None,
        description="Associates a [user token](https://www.algolia.com/doc/guides/sending-events/concepts/usertoken/) with the current search.",
        alias="userToken",
    )
    get_ranking_info: Optional[StrictBool] = Field(
        default=False,
        description="Incidates whether the search response includes [detailed ranking information](https://www.algolia.com/doc/guides/building-search-ui/going-further/backend-search/in-depth/understanding-the-api-response/#ranking-information).",
        alias="getRankingInfo",
    )
    explain: Optional[List[StrictStr]] = Field(
        default=None,
        description="Enriches the API's response with information about how the query was processed.",
    )
    synonyms: Optional[StrictBool] = Field(
        default=True,
        description="Whether to take into account an index's synonyms for a particular search.",
    )
    click_analytics: Optional[StrictBool] = Field(
        default=False,
        description="Indicates whether a query ID parameter is included in the search response. This is required for [tracking click and conversion events](https://www.algolia.com/doc/guides/sending-events/concepts/event-types/#events-related-to-algolia-requests).",
        alias="clickAnalytics",
    )
    analytics: Optional[StrictBool] = Field(
        default=True,
        description="Indicates whether this query will be included in [analytics](https://www.algolia.com/doc/guides/search-analytics/guides/exclude-queries/).",
    )
    analytics_tags: Optional[List[StrictStr]] = Field(
        default=None,
        description="Tags to apply to the query for [segmenting analytics data](https://www.algolia.com/doc/guides/search-analytics/guides/segments/).",
        alias="analyticsTags",
    )
    percentile_computation: Optional[StrictBool] = Field(
        default=True,
        description="Whether to include or exclude a query from the processing-time percentile computation.",
        alias="percentileComputation",
    )
    enable_ab_test: Optional[StrictBool] = Field(
        default=True,
        description="Incidates whether this search will be considered in A/B testing.",
        alias="enableABTest",
    )

    model_config = {"populate_by_name": True, "validate_assignment": True}

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of BaseSearchParamsWithoutQuery from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of
        # facet_filters
        if self.facet_filters:
            _dict["facetFilters"] = self.facet_filters.to_dict()
        # override the default output from pydantic by calling `to_dict()` of
        # optional_filters
        if self.optional_filters:
            _dict["optionalFilters"] = self.optional_filters.to_dict()
        # override the default output from pydantic by calling `to_dict()` of
        # numeric_filters
        if self.numeric_filters:
            _dict["numericFilters"] = self.numeric_filters.to_dict()
        # override the default output from pydantic by calling `to_dict()` of
        # tag_filters
        if self.tag_filters:
            _dict["tagFilters"] = self.tag_filters.to_dict()
        # override the default output from pydantic by calling `to_dict()` of
        # around_radius
        if self.around_radius:
            _dict["aroundRadius"] = self.around_radius.to_dict()
        # override the default output from pydantic by calling `to_dict()` of
        # around_precision
        if self.around_precision:
            _dict["aroundPrecision"] = self.around_precision.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of BaseSearchParamsWithoutQuery from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "similarQuery": obj.get("similarQuery")
                if obj.get("similarQuery") is not None
                else "",
                "filters": obj.get("filters") if obj.get("filters") is not None else "",
                "facetFilters": FacetFilters.from_dict(obj.get("facetFilters"))
                if obj.get("facetFilters") is not None
                else None,
                "optionalFilters": OptionalFilters.from_dict(obj.get("optionalFilters"))
                if obj.get("optionalFilters") is not None
                else None,
                "numericFilters": NumericFilters.from_dict(obj.get("numericFilters"))
                if obj.get("numericFilters") is not None
                else None,
                "tagFilters": TagFilters.from_dict(obj.get("tagFilters"))
                if obj.get("tagFilters") is not None
                else None,
                "sumOrFiltersScores": obj.get("sumOrFiltersScores")
                if obj.get("sumOrFiltersScores") is not None
                else False,
                "restrictSearchableAttributes": obj.get("restrictSearchableAttributes"),
                "facets": obj.get("facets"),
                "facetingAfterDistinct": obj.get("facetingAfterDistinct")
                if obj.get("facetingAfterDistinct") is not None
                else False,
                "page": obj.get("page") if obj.get("page") is not None else 0,
                "offset": obj.get("offset"),
                "length": obj.get("length"),
                "aroundLatLng": obj.get("aroundLatLng")
                if obj.get("aroundLatLng") is not None
                else "",
                "aroundLatLngViaIP": obj.get("aroundLatLngViaIP")
                if obj.get("aroundLatLngViaIP") is not None
                else False,
                "aroundRadius": AroundRadius.from_dict(obj.get("aroundRadius"))
                if obj.get("aroundRadius") is not None
                else None,
                "aroundPrecision": AroundPrecision.from_dict(obj.get("aroundPrecision"))
                if obj.get("aroundPrecision") is not None
                else None,
                "minimumAroundRadius": obj.get("minimumAroundRadius"),
                "insideBoundingBox": obj.get("insideBoundingBox"),
                "insidePolygon": obj.get("insidePolygon"),
                "naturalLanguages": obj.get("naturalLanguages"),
                "ruleContexts": obj.get("ruleContexts"),
                "personalizationImpact": obj.get("personalizationImpact")
                if obj.get("personalizationImpact") is not None
                else 100,
                "userToken": obj.get("userToken"),
                "getRankingInfo": obj.get("getRankingInfo")
                if obj.get("getRankingInfo") is not None
                else False,
                "explain": obj.get("explain"),
                "synonyms": obj.get("synonyms")
                if obj.get("synonyms") is not None
                else True,
                "clickAnalytics": obj.get("clickAnalytics")
                if obj.get("clickAnalytics") is not None
                else False,
                "analytics": obj.get("analytics")
                if obj.get("analytics") is not None
                else True,
                "analyticsTags": obj.get("analyticsTags"),
                "percentileComputation": obj.get("percentileComputation")
                if obj.get("percentileComputation") is not None
                else True,
                "enableABTest": obj.get("enableABTest")
                if obj.get("enableABTest") is not None
                else True,
            }
        )
        return _obj
