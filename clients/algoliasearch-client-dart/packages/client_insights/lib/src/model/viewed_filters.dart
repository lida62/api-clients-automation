// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
// ignore_for_file: unused_element
import 'package:algolia_client_insights/src/model/view_event.dart';

import 'package:json_annotation/json_annotation.dart';

part 'viewed_filters.g.dart';

@JsonSerializable()
final class ViewedFilters {
  /// Returns a new [ViewedFilters] instance.
  const ViewedFilters({
    required this.eventName,
    required this.eventType,
    required this.index,
    required this.filters,
    required this.userToken,
    this.timestamp,
    this.authenticatedUserToken,
  });

  /// Can contain up to 64 ASCII characters.   Consider naming events consistently—for example, by adopting Segment's [object-action](https://segment.com/academy/collecting-data/naming-conventions-for-clean-data/#the-object-action-framework) framework.
  @JsonKey(name: r'eventName')
  final String eventName;

  @JsonKey(name: r'eventType')
  final ViewEvent eventType;

  /// Name of the Algolia index.
  @JsonKey(name: r'index')
  final String index;

  /// Facet filters.  Each facet filter string must be URL-encoded, such as, `discount:10%25`.
  @JsonKey(name: r'filters')
  final List<String> filters;

  /// Anonymous or pseudonymous user identifier.   > **Note**: Never include personally identifiable information in user tokens.
  @JsonKey(name: r'userToken')
  final String userToken;

  /// Time of the event in milliseconds in [Unix epoch time](https://wikipedia.org/wiki/Unix_time). By default, the Insights API uses the time it receives an event as its timestamp.
  @JsonKey(name: r'timestamp')
  final int? timestamp;

  /// User token for authenticated users.
  @JsonKey(name: r'authenticatedUserToken')
  final String? authenticatedUserToken;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is ViewedFilters &&
          other.eventName == eventName &&
          other.eventType == eventType &&
          other.index == index &&
          other.filters == filters &&
          other.userToken == userToken &&
          other.timestamp == timestamp &&
          other.authenticatedUserToken == authenticatedUserToken;

  @override
  int get hashCode =>
      eventName.hashCode +
      eventType.hashCode +
      index.hashCode +
      filters.hashCode +
      userToken.hashCode +
      timestamp.hashCode +
      authenticatedUserToken.hashCode;

  factory ViewedFilters.fromJson(Map<String, dynamic> json) =>
      _$ViewedFiltersFromJson(json);

  Map<String, dynamic> toJson() => _$ViewedFiltersToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }
}
