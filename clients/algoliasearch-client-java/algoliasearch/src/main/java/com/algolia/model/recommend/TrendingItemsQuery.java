// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.recommend;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** TrendingItemsQuery */
@JsonDeserialize(as = TrendingItemsQuery.class)
public class TrendingItemsQuery implements RecommendationsRequest {

  @JsonProperty("indexName")
  private String indexName;

  @JsonProperty("threshold")
  private Integer threshold;

  @JsonProperty("maxRecommendations")
  private Integer maxRecommendations;

  @JsonProperty("facetName")
  private String facetName;

  @JsonProperty("facetValue")
  private String facetValue;

  @JsonProperty("model")
  private TrendingItemsModel model;

  @JsonProperty("queryParameters")
  private SearchParamsObject queryParameters;

  @JsonProperty("fallbackParameters")
  private SearchParamsObject fallbackParameters;

  public TrendingItemsQuery setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  /** Algolia index name. */
  @javax.annotation.Nonnull
  public String getIndexName() {
    return indexName;
  }

  public TrendingItemsQuery setThreshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Recommendations with a confidence score lower than `threshold` won't appear in results. >
   * **Note**: Each recommendation has a confidence score of 0 to 100. The closer the score is to
   * 100, the more relevant the recommendations are. minimum: 0 maximum: 100
   */
  @javax.annotation.Nullable
  public Integer getThreshold() {
    return threshold;
  }

  public TrendingItemsQuery setMaxRecommendations(Integer maxRecommendations) {
    this.maxRecommendations = maxRecommendations;
    return this;
  }

  /** Maximum number of recommendations to retrieve. If 0, all recommendations will be returned. */
  @javax.annotation.Nullable
  public Integer getMaxRecommendations() {
    return maxRecommendations;
  }

  public TrendingItemsQuery setFacetName(String facetName) {
    this.facetName = facetName;
    return this;
  }

  /** Facet name for trending models. */
  @javax.annotation.Nullable
  public String getFacetName() {
    return facetName;
  }

  public TrendingItemsQuery setFacetValue(String facetValue) {
    this.facetValue = facetValue;
    return this;
  }

  /** Facet value for trending models. */
  @javax.annotation.Nullable
  public String getFacetValue() {
    return facetValue;
  }

  public TrendingItemsQuery setModel(TrendingItemsModel model) {
    this.model = model;
    return this;
  }

  /** Get model */
  @javax.annotation.Nullable
  public TrendingItemsModel getModel() {
    return model;
  }

  public TrendingItemsQuery setQueryParameters(SearchParamsObject queryParameters) {
    this.queryParameters = queryParameters;
    return this;
  }

  /** Get queryParameters */
  @javax.annotation.Nullable
  public SearchParamsObject getQueryParameters() {
    return queryParameters;
  }

  public TrendingItemsQuery setFallbackParameters(SearchParamsObject fallbackParameters) {
    this.fallbackParameters = fallbackParameters;
    return this;
  }

  /** Get fallbackParameters */
  @javax.annotation.Nullable
  public SearchParamsObject getFallbackParameters() {
    return fallbackParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingItemsQuery trendingItemsQuery = (TrendingItemsQuery) o;
    return (
      Objects.equals(this.indexName, trendingItemsQuery.indexName) &&
      Objects.equals(this.threshold, trendingItemsQuery.threshold) &&
      Objects.equals(this.maxRecommendations, trendingItemsQuery.maxRecommendations) &&
      Objects.equals(this.facetName, trendingItemsQuery.facetName) &&
      Objects.equals(this.facetValue, trendingItemsQuery.facetValue) &&
      Objects.equals(this.model, trendingItemsQuery.model) &&
      Objects.equals(this.queryParameters, trendingItemsQuery.queryParameters) &&
      Objects.equals(this.fallbackParameters, trendingItemsQuery.fallbackParameters)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName, threshold, maxRecommendations, facetName, facetValue, model, queryParameters, fallbackParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingItemsQuery {\n");
    sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    maxRecommendations: ").append(toIndentedString(maxRecommendations)).append("\n");
    sb.append("    facetName: ").append(toIndentedString(facetName)).append("\n");
    sb.append("    facetValue: ").append(toIndentedString(facetValue)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    queryParameters: ").append(toIndentedString(queryParameters)).append("\n");
    sb.append("    fallbackParameters: ").append(toIndentedString(fallbackParameters)).append("\n");
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
