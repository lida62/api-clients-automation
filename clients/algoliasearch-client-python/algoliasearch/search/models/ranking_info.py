# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from json import loads
from typing import Any, Dict, Optional, Self

from pydantic import BaseModel, Field, StrictBool, StrictInt

from algoliasearch.search.models.matched_geo_location import MatchedGeoLocation
from algoliasearch.search.models.personalization import Personalization


class RankingInfo(BaseModel):
    """
    RankingInfo
    """

    filters: StrictInt = Field(description="This field is reserved for advanced usage.")
    first_matched_word: StrictInt = Field(
        description="Position of the most important matched attribute in the attributes to index list.",
        alias="firstMatchedWord",
    )
    geo_distance: StrictInt = Field(
        description="Distance between the geo location in the search query and the best matching geo location in the record, divided by the geo precision (in meters).",
        alias="geoDistance",
    )
    geo_precision: Optional[StrictInt] = Field(
        default=None,
        description="Precision used when computing the geo distance, in meters.",
        alias="geoPrecision",
    )
    matched_geo_location: Optional[MatchedGeoLocation] = Field(
        default=None, alias="matchedGeoLocation"
    )
    personalization: Optional[Personalization] = None
    nb_exact_words: StrictInt = Field(
        description="Number of exactly matched words.", alias="nbExactWords"
    )
    nb_typos: StrictInt = Field(
        description="Number of typos encountered when matching the record.",
        alias="nbTypos",
    )
    promoted: StrictBool = Field(
        description="Present and set to true if a Rule promoted the hit."
    )
    proximity_distance: Optional[StrictInt] = Field(
        default=None,
        description="When the query contains more than one word, the sum of the distances between matched words (in meters).",
        alias="proximityDistance",
    )
    user_score: StrictInt = Field(
        description="Custom ranking for the object, expressed as a single integer value.",
        alias="userScore",
    )
    words: StrictInt = Field(
        description="Number of matched words, including prefixes and typos."
    )
    promoted_by_re_ranking: Optional[StrictBool] = Field(
        default=None,
        description="Wether the record are promoted by the re-ranking strategy.",
        alias="promotedByReRanking",
    )

    model_config = {"populate_by_name": True, "validate_assignment": True}

    def to_json(self) -> str:
        return self.model_dump_json(by_alias=True, exclude_unset=True)

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of RankingInfo from a JSON string"""
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
        # matched_geo_location
        if self.matched_geo_location:
            _dict["matchedGeoLocation"] = self.matched_geo_location.to_dict()
        # override the default output from pydantic by calling `to_dict()` of
        # personalization
        if self.personalization:
            _dict["personalization"] = self.personalization.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of RankingInfo from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate(
            {
                "filters": obj.get("filters"),
                "firstMatchedWord": obj.get("firstMatchedWord"),
                "geoDistance": obj.get("geoDistance"),
                "geoPrecision": obj.get("geoPrecision"),
                "matchedGeoLocation": MatchedGeoLocation.from_dict(
                    obj.get("matchedGeoLocation")
                )
                if obj.get("matchedGeoLocation") is not None
                else None,
                "personalization": Personalization.from_dict(obj.get("personalization"))
                if obj.get("personalization") is not None
                else None,
                "nbExactWords": obj.get("nbExactWords"),
                "nbTypos": obj.get("nbTypos"),
                "promoted": obj.get("promoted"),
                "proximityDistance": obj.get("proximityDistance"),
                "userScore": obj.get("userScore"),
                "words": obj.get("words"),
                "promotedByReRanking": obj.get("promotedByReRanking"),
            }
        )
        return _obj
