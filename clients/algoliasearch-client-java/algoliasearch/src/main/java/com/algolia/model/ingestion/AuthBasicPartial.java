// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.ingestion;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** Authentication input for Basic login with username and password. */
@JsonDeserialize(as = AuthBasicPartial.class)
public class AuthBasicPartial implements AuthInputPartial {

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  public AuthBasicPartial setUsername(String username) {
    this.username = username;
    return this;
  }

  /** Get username */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public AuthBasicPartial setPassword(String password) {
    this.password = password;
    return this;
  }

  /** Get password */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthBasicPartial authBasicPartial = (AuthBasicPartial) o;
    return Objects.equals(this.username, authBasicPartial.username) && Objects.equals(this.password, authBasicPartial.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthBasicPartial {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
