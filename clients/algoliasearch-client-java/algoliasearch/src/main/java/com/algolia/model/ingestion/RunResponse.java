// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.ingestion;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/**
 * The response from the run task API, containing an Observability Run ID and the time it was
 * created at.
 */
public class RunResponse {

  @JsonProperty("runID")
  private String runID;

  @JsonProperty("createdAt")
  private String createdAt;

  public RunResponse setRunID(String runID) {
    this.runID = runID;
    return this;
  }

  /** The run UUID. */
  @javax.annotation.Nonnull
  public String getRunID() {
    return runID;
  }

  public RunResponse setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /** Date of creation (RFC3339 format). */
  @javax.annotation.Nonnull
  public String getCreatedAt() {
    return createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunResponse runResponse = (RunResponse) o;
    return Objects.equals(this.runID, runResponse.runID) && Objects.equals(this.createdAt, runResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runID, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunResponse {\n");
    sb.append("    runID: ").append(toIndentedString(runID)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
