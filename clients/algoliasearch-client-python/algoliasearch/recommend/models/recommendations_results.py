# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from json import loads
from re import match
from typing import Annotated, Any, Dict, List, Optional, Self

from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr, field_validator

from algoliasearch.recommend.models.exhaustive import Exhaustive
from algoliasearch.recommend.models.facets_stats import FacetsStats
from algoliasearch.recommend.models.recommendations_hit import RecommendationsHit
from algoliasearch.recommend.models.redirect import Redirect
from algoliasearch.recommend.models.rendering_content import RenderingContent


class RecommendationsResults(BaseModel):
    """
    RecommendationsResults
    """

    ab_test_id: Optional[StrictInt] = Field(
        default=None,
        description="A/B test ID. This is only included in the response for indices that are part of an A/B test.",
        alias="abTestID",
    )
    ab_test_variant_id: Optional[Annotated[int, Field(strict=True, ge=1)]] = Field(
        default=None,
        description="Variant ID. This is only included in the response for indices that are part of an A/B test.",
        alias="abTestVariantID",
    )
    around_lat_lng: Optional[Annotated[str, Field(strict=True)]] = Field(
        default=None,
        description="Computed geographical location.",
        alias="aroundLatLng",
    )
    automatic_radius: Optional[StrictStr] = Field(
        default=None,
        description="Automatically-computed radius.",
        alias="automaticRadius",
    )
    exhaustive: Optional[Exhaustive] = None
    exhaustive_facets_count: Optional[StrictBool] = Field(
        default=None,
        description="See the `facetsCount` field of the `exhaustive` object in the response.",
        alias="exhaustiveFacetsCount",
    )
    exhaustive_nb_hits: Optional[StrictBool] = Field(
        default=None,
        description="See the `nbHits` field of the `exhaustive` object in the response.",
        alias="exhaustiveNbHits",
    )
    exhaustive_typo: Optional[StrictBool] = Field(
        default=None,
        description="See the `typo` field of the `exhaustive` object in the response.",
        alias="exhaustiveTypo",
    )
    facets: Optional[Dict[str, Dict[str, StrictInt]]] = Field(
        default=None,
        description="Mapping of each facet name to the corresponding facet counts.",
    )
    facets_stats: Optional[Dict[str, FacetsStats]] = Field(
        default=None, description="Statistics for numerical facets."
    )
    hits_per_page: Annotated[int, Field(le=1000, strict=True, ge=1)] = Field(
        description="Number of hits per page.", alias="hitsPerPage"
    )
    index: Optional[StrictStr] = Field(
        default=None, description="Index name used for the query."
    )
    index_used: Optional[StrictStr] = Field(
        default=None,
        description="Index name used for the query. During A/B testing, the targeted index isn't always the index used by the query.",
        alias="indexUsed",
    )
    message: Optional[StrictStr] = Field(
        default=None, description="Warnings about the query."
    )
    nb_hits: StrictInt = Field(
        description="Number of hits the search query matched.", alias="nbHits"
    )
    nb_pages: StrictInt = Field(
        description="Number of pages of results for the current query.", alias="nbPages"
    )
    nb_sorted_hits: Optional[StrictInt] = Field(
        default=None,
        description="Number of hits selected and sorted by the relevant sort algorithm.",
        alias="nbSortedHits",
    )
    page: StrictInt = Field(
        description="Page to retrieve (the first page is `0`, not `1`)."
    )
    parsed_query: Optional[StrictStr] = Field(
        default=None,
        description="Post-[normalization](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/handling-natural-languages-nlp/#what-does-normalization-mean) query string that will be searched.",
        alias="parsedQuery",
    )
    processing_time_ms: StrictInt = Field(
        description="Time the server took to process the request, in milliseconds.",
        alias="processingTimeMS",
    )
    processing_timings_ms: Optional[Dict[str, Any]] = Field(
        default=None,
        description="Experimental. List of processing steps and their times, in milliseconds. You can use this list to investigate performance issues.",
        alias="processingTimingsMS",
    )
    query_after_removal: Optional[StrictStr] = Field(
        default=None,
        description="Markup text indicating which parts of the original query have been removed to retrieve a non-empty result set.",
        alias="queryAfterRemoval",
    )
    redirect: Optional[Redirect] = None
    rendering_content: Optional[RenderingContent] = Field(
        default=None, alias="renderingContent"
    )
    server_time_ms: Optional[StrictInt] = Field(
        default=None,
        description="Time the server took to process the request, in milliseconds.",
        alias="serverTimeMS",
    )
    server_used: Optional[StrictStr] = Field(
        default=None,
        description="Host name of the server that processed the request.",
        alias="serverUsed",
    )
    user_data: Optional[Dict[str, Any]] = Field(
        default=None,
        description="Lets you store custom data in your indices.",
        alias="userData",
    )
    hits: List[RecommendationsHit]
    query: Optional[StrictStr] = Field(
        default="", description="Text to search for in an index."
    )
    params: Optional[StrictStr] = Field(
        default=None, description="URL-encoded string of all search parameters."
    )

    @field_validator("around_lat_lng")
    def around_lat_lng_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not match(r"^(-?\d+(\.\d+)?),\s*(-?\d+(\.\d+)?)$", value):
            raise ValueError(
                r"must validate the regular expression /^(-?\d+(\.\d+)?),\s*(-?\d+(\.\d+)?)$/"
            )
        return value

    model_config = {"populate_by_name": True, "validate_assignment": True}

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of RecommendationsResults from a JSON string"""
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
        # exhaustive
        if self.exhaustive:
            _dict["exhaustive"] = self.exhaustive.to_dict()
        # override the default output from pydantic by calling `to_dict()` of
        # each value in facets_stats (dict)
        _field_dict = {}
        if self.facets_stats:
            for _key in self.facets_stats:
                if self.facets_stats[_key]:
                    _field_dict[_key] = self.facets_stats[_key].to_dict()
            _dict["facets_stats"] = _field_dict
        # override the default output from pydantic by calling `to_dict()` of
        # redirect
        if self.redirect:
            _dict["redirect"] = self.redirect.to_dict()
        # override the default output from pydantic by calling `to_dict()` of
        # rendering_content
        if self.rendering_content:
            _dict["renderingContent"] = self.rendering_content.to_dict()
        # override the default output from pydantic by calling `to_dict()` of
        # each item in hits (list)
        _items = []
        if self.hits:
            for _item in self.hits:
                if _item:
                    _items.append(_item.to_dict())
            _dict["hits"] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of RecommendationsResults from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "abTestID": obj.get("abTestID"),
                "abTestVariantID": obj.get("abTestVariantID"),
                "aroundLatLng": obj.get("aroundLatLng"),
                "automaticRadius": obj.get("automaticRadius"),
                "exhaustive": Exhaustive.from_dict(obj.get("exhaustive"))
                if obj.get("exhaustive") is not None
                else None,
                "exhaustiveFacetsCount": obj.get("exhaustiveFacetsCount"),
                "exhaustiveNbHits": obj.get("exhaustiveNbHits"),
                "exhaustiveTypo": obj.get("exhaustiveTypo"),
                "facets": obj.get("facets"),
                "facets_stats": dict(
                    (_k, FacetsStats.from_dict(_v))
                    for _k, _v in obj.get("facets_stats").items()
                )
                if obj.get("facets_stats") is not None
                else None,
                "hitsPerPage": obj.get("hitsPerPage")
                if obj.get("hitsPerPage") is not None
                else 20,
                "index": obj.get("index"),
                "indexUsed": obj.get("indexUsed"),
                "message": obj.get("message"),
                "nbHits": obj.get("nbHits"),
                "nbPages": obj.get("nbPages"),
                "nbSortedHits": obj.get("nbSortedHits"),
                "page": obj.get("page") if obj.get("page") is not None else 0,
                "parsedQuery": obj.get("parsedQuery"),
                "processingTimeMS": obj.get("processingTimeMS"),
                "processingTimingsMS": obj.get("processingTimingsMS"),
                "queryAfterRemoval": obj.get("queryAfterRemoval"),
                "redirect": Redirect.from_dict(obj.get("redirect"))
                if obj.get("redirect") is not None
                else None,
                "renderingContent": RenderingContent.from_dict(
                    obj.get("renderingContent")
                )
                if obj.get("renderingContent") is not None
                else None,
                "serverTimeMS": obj.get("serverTimeMS"),
                "serverUsed": obj.get("serverUsed"),
                "userData": obj.get("userData"),
                "hits": [
                    RecommendationsHit.from_dict(_item) for _item in obj.get("hits")
                ]
                if obj.get("hits") is not None
                else None,
                "query": obj.get("query") if obj.get("query") is not None else "",
                "params": obj.get("params"),
            }
        )
        return _obj
