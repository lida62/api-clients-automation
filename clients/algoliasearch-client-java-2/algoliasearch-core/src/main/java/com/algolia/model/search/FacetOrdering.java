package com.algolia.model.search;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Defining how facets should be ordered. */
public class FacetOrdering {

  @SerializedName("facets")
  private Facets facets;

  @SerializedName("values")
  private Map<String, Value> values;

  public FacetOrdering setFacets(Facets facets) {
    this.facets = facets;
    return this;
  }

  /**
   * Get facets
   *
   * @return facets
   */
  @javax.annotation.Nullable
  public Facets getFacets() {
    return facets;
  }

  public FacetOrdering setValues(Map<String, Value> values) {
    this.values = values;
    return this;
  }

  public FacetOrdering putValues(String key, Value valuesItem) {
    if (this.values == null) {
      this.values = new HashMap<>();
    }
    this.values.put(key, valuesItem);
    return this;
  }

  /**
   * The ordering of facet values, within an individual list.
   *
   * @return values
   */
  @javax.annotation.Nullable
  public Map<String, Value> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetOrdering facetOrdering = (FacetOrdering) o;
    return Objects.equals(this.facets, facetOrdering.facets) && Objects.equals(this.values, facetOrdering.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facets, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetOrdering {\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
