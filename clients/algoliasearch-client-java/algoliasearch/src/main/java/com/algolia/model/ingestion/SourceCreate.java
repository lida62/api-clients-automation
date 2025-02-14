// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.ingestion;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** SourceCreate */
public class SourceCreate {

  @JsonProperty("type")
  private SourceType type;

  @JsonProperty("name")
  private String name;

  @JsonProperty("input")
  private SourceInput input;

  @JsonProperty("authenticationID")
  private String authenticationID;

  public SourceCreate setType(SourceType type) {
    this.type = type;
    return this;
  }

  /** Get type */
  @javax.annotation.Nonnull
  public SourceType getType() {
    return type;
  }

  public SourceCreate setName(String name) {
    this.name = name;
    return this;
  }

  /** Get name */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public SourceCreate setInput(SourceInput input) {
    this.input = input;
    return this;
  }

  /** Get input */
  @javax.annotation.Nonnull
  public SourceInput getInput() {
    return input;
  }

  public SourceCreate setAuthenticationID(String authenticationID) {
    this.authenticationID = authenticationID;
    return this;
  }

  /** The authentication UUID. */
  @javax.annotation.Nullable
  public String getAuthenticationID() {
    return authenticationID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceCreate sourceCreate = (SourceCreate) o;
    return (
      Objects.equals(this.type, sourceCreate.type) &&
      Objects.equals(this.name, sourceCreate.name) &&
      Objects.equals(this.input, sourceCreate.input) &&
      Objects.equals(this.authenticationID, sourceCreate.authenticationID)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, input, authenticationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceCreate {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    authenticationID: ").append(toIndentedString(authenticationID)).append("\n");
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
