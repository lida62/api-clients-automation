// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.recommend;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** Additional search parameters. */
public class Params {

  @JsonProperty("query")
  private ConsequenceQuery query;

  @JsonProperty("automaticFacetFilters")
  private AutomaticFacetFilters automaticFacetFilters;

  @JsonProperty("automaticOptionalFacetFilters")
  private AutomaticFacetFilters automaticOptionalFacetFilters;

  @JsonProperty("renderingContent")
  private RenderingContent renderingContent;

  public Params setQuery(ConsequenceQuery query) {
    this.query = query;
    return this;
  }

  /** Get query */
  @javax.annotation.Nullable
  public ConsequenceQuery getQuery() {
    return query;
  }

  public Params setAutomaticFacetFilters(AutomaticFacetFilters automaticFacetFilters) {
    this.automaticFacetFilters = automaticFacetFilters;
    return this;
  }

  /** Get automaticFacetFilters */
  @javax.annotation.Nullable
  public AutomaticFacetFilters getAutomaticFacetFilters() {
    return automaticFacetFilters;
  }

  public Params setAutomaticOptionalFacetFilters(AutomaticFacetFilters automaticOptionalFacetFilters) {
    this.automaticOptionalFacetFilters = automaticOptionalFacetFilters;
    return this;
  }

  /** Get automaticOptionalFacetFilters */
  @javax.annotation.Nullable
  public AutomaticFacetFilters getAutomaticOptionalFacetFilters() {
    return automaticOptionalFacetFilters;
  }

  public Params setRenderingContent(RenderingContent renderingContent) {
    this.renderingContent = renderingContent;
    return this;
  }

  /** Get renderingContent */
  @javax.annotation.Nullable
  public RenderingContent getRenderingContent() {
    return renderingContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Params params = (Params) o;
    return (
      Objects.equals(this.query, params.query) &&
      Objects.equals(this.automaticFacetFilters, params.automaticFacetFilters) &&
      Objects.equals(this.automaticOptionalFacetFilters, params.automaticOptionalFacetFilters) &&
      Objects.equals(this.renderingContent, params.renderingContent)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, automaticFacetFilters, automaticOptionalFacetFilters, renderingContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Params {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    automaticFacetFilters: ").append(toIndentedString(automaticFacetFilters)).append("\n");
    sb.append("    automaticOptionalFacetFilters: ").append(toIndentedString(automaticOptionalFacetFilters)).append("\n");
    sb.append("    renderingContent: ").append(toIndentedString(renderingContent)).append("\n");
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
