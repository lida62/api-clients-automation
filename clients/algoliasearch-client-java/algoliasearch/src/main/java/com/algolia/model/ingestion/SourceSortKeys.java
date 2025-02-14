// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.ingestion;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

/** Used to sort the Source list endpoint. */
public enum SourceSortKeys {
  NAME("name"),

  TYPE("type"),

  UPDATED_AT("updatedAt"),

  CREATED_AT("createdAt");

  private final String value;

  SourceSortKeys(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SourceSortKeys fromValue(String value) {
    for (SourceSortKeys b : SourceSortKeys.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
