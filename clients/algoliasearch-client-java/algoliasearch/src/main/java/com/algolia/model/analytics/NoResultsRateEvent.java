// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.analytics;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** NoResultsRateEvent */
public class NoResultsRateEvent {

  @JsonProperty("date")
  private String date;

  @JsonProperty("noResultCount")
  private Integer noResultCount;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("rate")
  private Double rate;

  public NoResultsRateEvent setDate(String date) {
    this.date = date;
    return this;
  }

  /** Date of the event in the format YYYY-MM-DD. */
  @javax.annotation.Nonnull
  public String getDate() {
    return date;
  }

  public NoResultsRateEvent setNoResultCount(Integer noResultCount) {
    this.noResultCount = noResultCount;
    return this;
  }

  /** Number of occurences. */
  @javax.annotation.Nonnull
  public Integer getNoResultCount() {
    return noResultCount;
  }

  public NoResultsRateEvent setCount(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of tracked _and_ untracked searches (where the `clickAnalytics` parameter isn't `true`).
   */
  @javax.annotation.Nonnull
  public Integer getCount() {
    return count;
  }

  public NoResultsRateEvent setRate(Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * [Click-through rate
   * (CTR)](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#click-through-rate).
   * minimum: 0 maximum: 1
   */
  @javax.annotation.Nonnull
  public Double getRate() {
    return rate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoResultsRateEvent noResultsRateEvent = (NoResultsRateEvent) o;
    return (
      Objects.equals(this.date, noResultsRateEvent.date) &&
      Objects.equals(this.noResultCount, noResultsRateEvent.noResultCount) &&
      Objects.equals(this.count, noResultsRateEvent.count) &&
      Objects.equals(this.rate, noResultsRateEvent.rate)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, noResultCount, count, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoResultsRateEvent {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    noResultCount: ").append(toIndentedString(noResultCount)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
