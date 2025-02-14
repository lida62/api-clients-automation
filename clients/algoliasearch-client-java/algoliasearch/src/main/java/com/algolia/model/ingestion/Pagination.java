// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.ingestion;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** Pagination */
public class Pagination {

  @JsonProperty("nbPages")
  private Integer nbPages;

  @JsonProperty("page")
  private Integer page;

  @JsonProperty("nbItems")
  private Integer nbItems;

  @JsonProperty("itemsPerPage")
  private Integer itemsPerPage;

  public Pagination setNbPages(Integer nbPages) {
    this.nbPages = nbPages;
    return this;
  }

  /** Get nbPages */
  @javax.annotation.Nonnull
  public Integer getNbPages() {
    return nbPages;
  }

  public Pagination setPage(Integer page) {
    this.page = page;
    return this;
  }

  /** Get page */
  @javax.annotation.Nonnull
  public Integer getPage() {
    return page;
  }

  public Pagination setNbItems(Integer nbItems) {
    this.nbItems = nbItems;
    return this;
  }

  /** Get nbItems */
  @javax.annotation.Nonnull
  public Integer getNbItems() {
    return nbItems;
  }

  public Pagination setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  /** Get itemsPerPage */
  @javax.annotation.Nonnull
  public Integer getItemsPerPage() {
    return itemsPerPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return (
      Objects.equals(this.nbPages, pagination.nbPages) &&
      Objects.equals(this.page, pagination.page) &&
      Objects.equals(this.nbItems, pagination.nbItems) &&
      Objects.equals(this.itemsPerPage, pagination.itemsPerPage)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(nbPages, page, nbItems, itemsPerPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    sb.append("    nbPages: ").append(toIndentedString(nbPages)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    nbItems: ").append(toIndentedString(nbItems)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
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
