// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.ingestion;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SourceCommercetools */
@JsonDeserialize(as = SourceCommercetools.class)
public class SourceCommercetools implements SourceInput {

  @JsonProperty("storeKeys")
  private List<String> storeKeys;

  @JsonProperty("locales")
  private List<String> locales;

  @JsonProperty("url")
  private String url;

  @JsonProperty("projectKey")
  private String projectKey;

  @JsonProperty("fallbackIsInStockValue")
  private Boolean fallbackIsInStockValue;

  public SourceCommercetools setStoreKeys(List<String> storeKeys) {
    this.storeKeys = storeKeys;
    return this;
  }

  public SourceCommercetools addStoreKeys(String storeKeysItem) {
    if (this.storeKeys == null) {
      this.storeKeys = new ArrayList<>();
    }
    this.storeKeys.add(storeKeysItem);
    return this;
  }

  /** Get storeKeys */
  @javax.annotation.Nullable
  public List<String> getStoreKeys() {
    return storeKeys;
  }

  public SourceCommercetools setLocales(List<String> locales) {
    this.locales = locales;
    return this;
  }

  public SourceCommercetools addLocales(String localesItem) {
    if (this.locales == null) {
      this.locales = new ArrayList<>();
    }
    this.locales.add(localesItem);
    return this;
  }

  /**
   * Array of locales that must match the following pattern: ^[a-z]{2}(-[A-Z]{2})?$. For example
   * [\"fr-FR\", \"en\"].
   */
  @javax.annotation.Nullable
  public List<String> getLocales() {
    return locales;
  }

  public SourceCommercetools setUrl(String url) {
    this.url = url;
    return this;
  }

  /** Get url */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public SourceCommercetools setProjectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

  /** Get projectKey */
  @javax.annotation.Nonnull
  public String getProjectKey() {
    return projectKey;
  }

  public SourceCommercetools setFallbackIsInStockValue(Boolean fallbackIsInStockValue) {
    this.fallbackIsInStockValue = fallbackIsInStockValue;
    return this;
  }

  /**
   * Determines the value that will be stored in the Algolia record if there's no inventory
   * information on the product.
   */
  @javax.annotation.Nullable
  public Boolean getFallbackIsInStockValue() {
    return fallbackIsInStockValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceCommercetools sourceCommercetools = (SourceCommercetools) o;
    return (
      Objects.equals(this.storeKeys, sourceCommercetools.storeKeys) &&
      Objects.equals(this.locales, sourceCommercetools.locales) &&
      Objects.equals(this.url, sourceCommercetools.url) &&
      Objects.equals(this.projectKey, sourceCommercetools.projectKey) &&
      Objects.equals(this.fallbackIsInStockValue, sourceCommercetools.fallbackIsInStockValue)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeKeys, locales, url, projectKey, fallbackIsInStockValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceCommercetools {\n");
    sb.append("    storeKeys: ").append(toIndentedString(storeKeys)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    fallbackIsInStockValue: ").append(toIndentedString(fallbackIsInStockValue)).append("\n");
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
