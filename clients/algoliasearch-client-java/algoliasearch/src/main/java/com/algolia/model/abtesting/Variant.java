// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.abtesting;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Variant */
public class Variant {

  @JsonProperty("addToCartCount")
  private Integer addToCartCount;

  @JsonProperty("addToCartRate")
  private Double addToCartRate;

  @JsonProperty("averageClickPosition")
  private Integer averageClickPosition;

  @JsonProperty("clickCount")
  private Integer clickCount;

  @JsonProperty("clickThroughRate")
  private Double clickThroughRate;

  @JsonProperty("conversionCount")
  private Integer conversionCount;

  @JsonProperty("conversionRate")
  private Double conversionRate;

  @JsonProperty("currencies")
  private Map<String, CurrenciesValue> currencies = new HashMap<>();

  @JsonProperty("description")
  private String description;

  @JsonProperty("filterEffects")
  private FilterEffects filterEffects;

  @JsonProperty("index")
  private String index;

  @JsonProperty("noResultCount")
  private Integer noResultCount;

  @JsonProperty("purchaseCount")
  private Integer purchaseCount;

  @JsonProperty("purchaseRate")
  private Double purchaseRate;

  @JsonProperty("searchCount")
  private Integer searchCount;

  @JsonProperty("trackedSearchCount")
  private Integer trackedSearchCount;

  @JsonProperty("trafficPercentage")
  private Integer trafficPercentage;

  @JsonProperty("userCount")
  private Integer userCount;

  public Variant setAddToCartCount(Integer addToCartCount) {
    this.addToCartCount = addToCartCount;
    return this;
  }

  /** Number of add-to-cart events for this variant. */
  @javax.annotation.Nonnull
  public Integer getAddToCartCount() {
    return addToCartCount;
  }

  public Variant setAddToCartRate(Double addToCartRate) {
    this.addToCartRate = addToCartRate;
    return this;
  }

  /**
   * Variant's [add-to-cart
   * rate](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#add-to-cart-rate).
   */
  @javax.annotation.Nonnull
  public Double getAddToCartRate() {
    return addToCartRate;
  }

  public Variant setAverageClickPosition(Integer averageClickPosition) {
    this.averageClickPosition = averageClickPosition;
    return this;
  }

  /**
   * Variant's [average click
   * position](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#click-position).
   */
  @javax.annotation.Nonnull
  public Integer getAverageClickPosition() {
    return averageClickPosition;
  }

  public Variant setClickCount(Integer clickCount) {
    this.clickCount = clickCount;
    return this;
  }

  /** Number of click events for this variant. */
  @javax.annotation.Nonnull
  public Integer getClickCount() {
    return clickCount;
  }

  public Variant setClickThroughRate(Double clickThroughRate) {
    this.clickThroughRate = clickThroughRate;
    return this;
  }

  /**
   * Variant's [click-through
   * rate](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#click-through-rate).
   */
  @javax.annotation.Nonnull
  public Double getClickThroughRate() {
    return clickThroughRate;
  }

  public Variant setConversionCount(Integer conversionCount) {
    this.conversionCount = conversionCount;
    return this;
  }

  /** Number of click events for this variant. */
  @javax.annotation.Nonnull
  public Integer getConversionCount() {
    return conversionCount;
  }

  public Variant setConversionRate(Double conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

  /**
   * Variant's [conversion
   * rate](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#conversion-rate).
   */
  @javax.annotation.Nonnull
  public Double getConversionRate() {
    return conversionRate;
  }

  public Variant setCurrencies(Map<String, CurrenciesValue> currencies) {
    this.currencies = currencies;
    return this;
  }

  public Variant putCurrencies(String key, CurrenciesValue currenciesItem) {
    this.currencies.put(key, currenciesItem);
    return this;
  }

  /** A/B test currencies. */
  @javax.annotation.Nonnull
  public Map<String, CurrenciesValue> getCurrencies() {
    return currencies;
  }

  public Variant setDescription(String description) {
    this.description = description;
    return this;
  }

  /** A/B test description. */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public Variant setFilterEffects(FilterEffects filterEffects) {
    this.filterEffects = filterEffects;
    return this;
  }

  /** Get filterEffects */
  @javax.annotation.Nullable
  public FilterEffects getFilterEffects() {
    return filterEffects;
  }

  public Variant setIndex(String index) {
    this.index = index;
    return this;
  }

  /** A/B test index. */
  @javax.annotation.Nonnull
  public String getIndex() {
    return index;
  }

  public Variant setNoResultCount(Integer noResultCount) {
    this.noResultCount = noResultCount;
    return this;
  }

  /**
   * Number of [searches without
   * results](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#searches-without-results)
   * for that variant.
   */
  @javax.annotation.Nonnull
  public Integer getNoResultCount() {
    return noResultCount;
  }

  public Variant setPurchaseCount(Integer purchaseCount) {
    this.purchaseCount = purchaseCount;
    return this;
  }

  /** Number of purchase events for this variant. */
  @javax.annotation.Nonnull
  public Integer getPurchaseCount() {
    return purchaseCount;
  }

  public Variant setPurchaseRate(Double purchaseRate) {
    this.purchaseRate = purchaseRate;
    return this;
  }

  /**
   * Variant's [purchase
   * rate](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#purchase-rate).
   */
  @javax.annotation.Nonnull
  public Double getPurchaseRate() {
    return purchaseRate;
  }

  public Variant setSearchCount(Integer searchCount) {
    this.searchCount = searchCount;
    return this;
  }

  /** Number of searches carried out during the A/B test. */
  @javax.annotation.Nonnull
  public Integer getSearchCount() {
    return searchCount;
  }

  public Variant setTrackedSearchCount(Integer trackedSearchCount) {
    this.trackedSearchCount = trackedSearchCount;
    return this;
  }

  /**
   * Number of tracked searches. This is the number of search requests where the `clickAnalytics`
   * parameter is `true`.
   */
  @javax.annotation.Nonnull
  public Integer getTrackedSearchCount() {
    return trackedSearchCount;
  }

  public Variant setTrafficPercentage(Integer trafficPercentage) {
    this.trafficPercentage = trafficPercentage;
    return this;
  }

  /** A/B test traffic percentage. */
  @javax.annotation.Nonnull
  public Integer getTrafficPercentage() {
    return trafficPercentage;
  }

  public Variant setUserCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

  /** Number of users during the A/B test. */
  @javax.annotation.Nonnull
  public Integer getUserCount() {
    return userCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Variant variant = (Variant) o;
    return (
      Objects.equals(this.addToCartCount, variant.addToCartCount) &&
      Objects.equals(this.addToCartRate, variant.addToCartRate) &&
      Objects.equals(this.averageClickPosition, variant.averageClickPosition) &&
      Objects.equals(this.clickCount, variant.clickCount) &&
      Objects.equals(this.clickThroughRate, variant.clickThroughRate) &&
      Objects.equals(this.conversionCount, variant.conversionCount) &&
      Objects.equals(this.conversionRate, variant.conversionRate) &&
      Objects.equals(this.currencies, variant.currencies) &&
      Objects.equals(this.description, variant.description) &&
      Objects.equals(this.filterEffects, variant.filterEffects) &&
      Objects.equals(this.index, variant.index) &&
      Objects.equals(this.noResultCount, variant.noResultCount) &&
      Objects.equals(this.purchaseCount, variant.purchaseCount) &&
      Objects.equals(this.purchaseRate, variant.purchaseRate) &&
      Objects.equals(this.searchCount, variant.searchCount) &&
      Objects.equals(this.trackedSearchCount, variant.trackedSearchCount) &&
      Objects.equals(this.trafficPercentage, variant.trafficPercentage) &&
      Objects.equals(this.userCount, variant.userCount)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      addToCartCount,
      addToCartRate,
      averageClickPosition,
      clickCount,
      clickThroughRate,
      conversionCount,
      conversionRate,
      currencies,
      description,
      filterEffects,
      index,
      noResultCount,
      purchaseCount,
      purchaseRate,
      searchCount,
      trackedSearchCount,
      trafficPercentage,
      userCount
    );
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variant {\n");
    sb.append("    addToCartCount: ").append(toIndentedString(addToCartCount)).append("\n");
    sb.append("    addToCartRate: ").append(toIndentedString(addToCartRate)).append("\n");
    sb.append("    averageClickPosition: ").append(toIndentedString(averageClickPosition)).append("\n");
    sb.append("    clickCount: ").append(toIndentedString(clickCount)).append("\n");
    sb.append("    clickThroughRate: ").append(toIndentedString(clickThroughRate)).append("\n");
    sb.append("    conversionCount: ").append(toIndentedString(conversionCount)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filterEffects: ").append(toIndentedString(filterEffects)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    noResultCount: ").append(toIndentedString(noResultCount)).append("\n");
    sb.append("    purchaseCount: ").append(toIndentedString(purchaseCount)).append("\n");
    sb.append("    purchaseRate: ").append(toIndentedString(purchaseRate)).append("\n");
    sb.append("    searchCount: ").append(toIndentedString(searchCount)).append("\n");
    sb.append("    trackedSearchCount: ").append(toIndentedString(trackedSearchCount)).append("\n");
    sb.append("    trafficPercentage: ").append(toIndentedString(trafficPercentage)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
