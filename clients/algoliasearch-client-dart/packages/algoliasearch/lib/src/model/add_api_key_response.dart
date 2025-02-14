// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
// ignore_for_file: unused_element

import 'package:json_annotation/json_annotation.dart';

part 'add_api_key_response.g.dart';

@JsonSerializable()
final class AddApiKeyResponse {
  /// Returns a new [AddApiKeyResponse] instance.
  const AddApiKeyResponse({
    required this.key,
    required this.createdAt,
  });

  /// API key.
  @JsonKey(name: r'key')
  final String key;

  /// Timestamp of creation in [ISO-8601](https://wikipedia.org/wiki/ISO_8601) format.
  @JsonKey(name: r'createdAt')
  final String createdAt;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is AddApiKeyResponse &&
          other.key == key &&
          other.createdAt == createdAt;

  @override
  int get hashCode => key.hashCode + createdAt.hashCode;

  factory AddApiKeyResponse.fromJson(Map<String, dynamic> json) =>
      _$AddApiKeyResponseFromJson(json);

  Map<String, dynamic> toJson() => _$AddApiKeyResponseToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }
}
