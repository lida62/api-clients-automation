# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from enum import Enum
from json import loads
from typing import Self


class DestinationSortKeys(str, Enum):
    """
    Used to sort the Destination list endpoint.
    """

    """
    allowed enum values
    """
    NAME = "name"
    TYPE = "type"
    UPDATEDAT = "updatedAt"
    CREATEDAT = "createdAt"

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of DestinationSortKeys from a JSON string"""
        return cls(loads(json_str))
