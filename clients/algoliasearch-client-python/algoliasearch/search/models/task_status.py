# coding: utf-8

"""
Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
"""
from __future__ import annotations

from enum import Enum
from json import loads
from typing import Self


class TaskStatus(str, Enum):
    """
    _published_ if the task has been processed, _notPublished_ otherwise.
    """

    """
    allowed enum values
    """
    PUBLISHED = "published"
    NOTPUBLISHED = "notPublished"

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of TaskStatus from a JSON string"""
        return cls(loads(json_str))
