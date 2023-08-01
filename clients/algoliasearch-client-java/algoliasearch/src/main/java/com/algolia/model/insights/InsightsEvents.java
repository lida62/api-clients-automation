// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.insights;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** InsightsEvents */
public class InsightsEvents {

  @JsonProperty("events")
  private List<EventsItems> events = new ArrayList<>();

  public InsightsEvents setEvents(List<EventsItems> events) {
    this.events = events;
    return this;
  }

  public InsightsEvents addEvents(EventsItems eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

  /**
   * List of click and conversion events. An event is an object representing a user interaction.
   * Events have attributes that describe the interaction, such as an event name, a type, or a user
   * token. Some attributes require other attributes to be declared, and some attributes can't be
   * declared at the same time. **All** events must be valid, otherwise the API returns an error.
   *
   * @return events
   */
  @javax.annotation.Nonnull
  public List<EventsItems> getEvents() {
    return events;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightsEvents insightsEvents = (InsightsEvents) o;
    return Objects.equals(this.events, insightsEvents.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsEvents {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
