package com.algolia.model.analytics;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GetUsersCountResponse */
public class GetUsersCountResponse {

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("dates")
  private List<UserWithDate> dates = new ArrayList<>();

  public GetUsersCountResponse setCount(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The number of occurrences.
   *
   * @return count
   */
  @javax.annotation.Nonnull
  public Integer getCount() {
    return count;
  }

  public GetUsersCountResponse setDates(List<UserWithDate> dates) {
    this.dates = dates;
    return this;
  }

  public GetUsersCountResponse addDates(UserWithDate datesItem) {
    this.dates.add(datesItem);
    return this;
  }

  /**
   * A list of users count with their date.
   *
   * @return dates
   */
  @javax.annotation.Nonnull
  public List<UserWithDate> getDates() {
    return dates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUsersCountResponse getUsersCountResponse = (GetUsersCountResponse) o;
    return Objects.equals(this.count, getUsersCountResponse.count) && Objects.equals(this.dates, getUsersCountResponse.dates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, dates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUsersCountResponse {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
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
