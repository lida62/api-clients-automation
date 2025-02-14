// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.recommend;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

/** Gets or Sets typoToleranceEnum */
@JsonDeserialize(as = TypoToleranceEnum.class)
public enum TypoToleranceEnum implements TypoTolerance {
  MIN("min"),

  STRICT("strict");

  private final String value;

  TypoToleranceEnum(String value) {
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
  public static TypoToleranceEnum fromValue(String value) {
    for (TypoToleranceEnum b : TypoToleranceEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
