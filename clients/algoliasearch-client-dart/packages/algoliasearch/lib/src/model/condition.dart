// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
// ignore_for_file: unused_element
import 'package:algoliasearch/src/model/anchoring.dart';

import 'package:json_annotation/json_annotation.dart';

part 'condition.g.dart';

@JsonSerializable()
final class Condition {
  /// Returns a new [Condition] instance.
  const Condition({
    this.pattern,
    this.anchoring,
    this.alternatives,
    this.context,
  });

  /// Query pattern syntax.
  @JsonKey(name: r'pattern')
  final String? pattern;

  @JsonKey(name: r'anchoring')
  final Anchoring? anchoring;

  /// Whether the pattern matches on plurals, synonyms, and typos.
  @JsonKey(name: r'alternatives')
  final bool? alternatives;

  /// Rule context format: [A-Za-z0-9_-]+).
  @JsonKey(name: r'context')
  final String? context;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is Condition &&
          other.pattern == pattern &&
          other.anchoring == anchoring &&
          other.alternatives == alternatives &&
          other.context == context;

  @override
  int get hashCode =>
      pattern.hashCode +
      anchoring.hashCode +
      alternatives.hashCode +
      context.hashCode;

  factory Condition.fromJson(Map<String, dynamic> json) =>
      _$ConditionFromJson(json);

  Map<String, dynamic> toJson() => _$ConditionToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }
}
