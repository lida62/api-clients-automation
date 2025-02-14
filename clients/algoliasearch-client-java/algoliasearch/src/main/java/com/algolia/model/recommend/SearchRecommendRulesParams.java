// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.recommend;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** Recommend rules search parameters. */
public class SearchRecommendRulesParams {

  @JsonProperty("query")
  private String query;

  @JsonProperty("context")
  private String context;

  @JsonProperty("page")
  private Integer page;

  @JsonProperty("hitsPerPage")
  private Integer hitsPerPage;

  @JsonProperty("enabled")
  private Boolean enabled;

  public SearchRecommendRulesParams setQuery(String query) {
    this.query = query;
    return this;
  }

  /** Full-text query. */
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }

  public SearchRecommendRulesParams setContext(String context) {
    this.context = context;
    return this;
  }

  /**
   * Restricts responses to the specified [contextual
   * rule](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/how-to/customize-search-results-by-platform/#creating-contextual-rules).
   */
  @javax.annotation.Nullable
  public String getContext() {
    return context;
  }

  public SearchRecommendRulesParams setPage(Integer page) {
    this.page = page;
    return this;
  }

  /** Requested page (the first page is page 0). minimum: 0 */
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }

  public SearchRecommendRulesParams setHitsPerPage(Integer hitsPerPage) {
    this.hitsPerPage = hitsPerPage;
    return this;
  }

  /** Maximum number of hits per page. minimum: 1 maximum: 1000 */
  @javax.annotation.Nullable
  public Integer getHitsPerPage() {
    return hitsPerPage;
  }

  public SearchRecommendRulesParams setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /** Restricts responses to enabled rules. When absent (default), _all_ rules are retrieved. */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRecommendRulesParams searchRecommendRulesParams = (SearchRecommendRulesParams) o;
    return (
      Objects.equals(this.query, searchRecommendRulesParams.query) &&
      Objects.equals(this.context, searchRecommendRulesParams.context) &&
      Objects.equals(this.page, searchRecommendRulesParams.page) &&
      Objects.equals(this.hitsPerPage, searchRecommendRulesParams.hitsPerPage) &&
      Objects.equals(this.enabled, searchRecommendRulesParams.enabled)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, context, page, hitsPerPage, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRecommendRulesParams {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    hitsPerPage: ").append(toIndentedString(hitsPerPage)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
