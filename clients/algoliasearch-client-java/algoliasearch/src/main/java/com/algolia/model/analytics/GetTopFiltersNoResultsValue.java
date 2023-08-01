// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.analytics;

import com.fasterxml.jackson.annotation.*;
import java.util.Objects;

/** GetTopFiltersNoResultsValue */
public class GetTopFiltersNoResultsValue {

  @JsonProperty("attribute")
  private String attribute;

  @JsonProperty("operator")
  private String operator;

  @JsonProperty("value")
  private String value;

  public GetTopFiltersNoResultsValue setAttribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * Attribute name.
   *
   * @return attribute
   */
  @javax.annotation.Nonnull
  public String getAttribute() {
    return attribute;
  }

  public GetTopFiltersNoResultsValue setOperator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Operator.
   *
   * @return operator
   */
  @javax.annotation.Nonnull
  public String getOperator() {
    return operator;
  }

  public GetTopFiltersNoResultsValue setValue(String value) {
    this.value = value;
    return this;
  }

  /**
   * Attribute value.
   *
   * @return value
   */
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTopFiltersNoResultsValue getTopFiltersNoResultsValue = (GetTopFiltersNoResultsValue) o;
    return (
      Objects.equals(this.attribute, getTopFiltersNoResultsValue.attribute) &&
      Objects.equals(this.operator, getTopFiltersNoResultsValue.operator) &&
      Objects.equals(this.value, getTopFiltersNoResultsValue.value)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTopFiltersNoResultsValue {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
