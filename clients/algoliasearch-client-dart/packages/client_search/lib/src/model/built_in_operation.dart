// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
// ignore_for_file: unused_element
import 'package:algolia_client_search/src/model/built_in_operation_type.dart';

import 'package:json_annotation/json_annotation.dart';

part 'built_in_operation.g.dart';

@JsonSerializable()
final class BuiltInOperation {
  /// Returns a new [BuiltInOperation] instance.
  const BuiltInOperation({
    required this.operation,
    required this.value,
  });

  @JsonKey(name: r'_operation')
  final BuiltInOperationType operation;

  /// Value that corresponds to the operation, for example an `Increment` or `Decrement` step, `Add` or `Remove` value.
  @JsonKey(name: r'value')
  final String value;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is BuiltInOperation &&
          other.operation == operation &&
          other.value == value;

  @override
  int get hashCode => operation.hashCode + value.hashCode;

  factory BuiltInOperation.fromJson(Map<String, dynamic> json) =>
      _$BuiltInOperationFromJson(json);

  Map<String, dynamic> toJson() => _$BuiltInOperationToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }
}
