// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.search;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SearchForFacetValuesResponse */
@JsonDeserialize(as = SearchForFacetValuesResponse.class)
public class SearchForFacetValuesResponse implements SearchResult {

  @JsonProperty("facetHits")
  private List<FacetHits> facetHits = new ArrayList<>();

  public SearchForFacetValuesResponse setFacetHits(List<FacetHits> facetHits) {
    this.facetHits = facetHits;
    return this;
  }

  public SearchForFacetValuesResponse addFacetHits(FacetHits facetHitsItem) {
    this.facetHits.add(facetHitsItem);
    return this;
  }

  /** Get facetHits */
  @javax.annotation.Nonnull
  public List<FacetHits> getFacetHits() {
    return facetHits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchForFacetValuesResponse searchForFacetValuesResponse = (SearchForFacetValuesResponse) o;
    return Objects.equals(this.facetHits, searchForFacetValuesResponse.facetHits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facetHits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchForFacetValuesResponse {\n");
    sb.append("    facetHits: ").append(toIndentedString(facetHits)).append("\n");
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
