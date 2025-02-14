// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.ingestion;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** AuthAlgoliaPartial */
@JsonDeserialize(as = AuthAlgoliaPartial.class)
public class AuthAlgoliaPartial implements AuthInputPartial {

  @JsonProperty("appID")
  private String appID;

  @JsonProperty("apiKey")
  private String apiKey;

  public AuthAlgoliaPartial setAppID(String appID) {
    this.appID = appID;
    return this;
  }

  /** Algolia Application ID. */
  @javax.annotation.Nullable
  public String getAppID() {
    return appID;
  }

  public AuthAlgoliaPartial setApiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /** Algolia API Key, with the correct rights to push to an index and change settings. */
  @javax.annotation.Nullable
  public String getApiKey() {
    return apiKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthAlgoliaPartial authAlgoliaPartial = (AuthAlgoliaPartial) o;
    return Objects.equals(this.appID, authAlgoliaPartial.appID) && Objects.equals(this.apiKey, authAlgoliaPartial.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appID, apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthAlgoliaPartial {\n");
    sb.append("    appID: ").append(toIndentedString(appID)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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
