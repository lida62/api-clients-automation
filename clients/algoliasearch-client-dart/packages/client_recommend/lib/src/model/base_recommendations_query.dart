// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
// ignore_for_file: unused_element
import 'package:algolia_client_recommend/src/model/recommendation_models.dart';
import 'package:algolia_client_recommend/src/model/search_params_object.dart';

import 'package:json_annotation/json_annotation.dart';

part 'base_recommendations_query.g.dart';

@JsonSerializable()
final class BaseRecommendationsQuery {
  /// Returns a new [BaseRecommendationsQuery] instance.
  const BaseRecommendationsQuery({
    required this.model,
    required this.objectID,
    this.queryParameters,
    this.fallbackParameters,
  });

  @JsonKey(name: r'model')
  final RecommendationModels model;

  /// Unique object identifier.
  @JsonKey(name: r'objectID')
  final String objectID;

  @JsonKey(name: r'queryParameters')
  final SearchParamsObject? queryParameters;

  @JsonKey(name: r'fallbackParameters')
  final SearchParamsObject? fallbackParameters;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is BaseRecommendationsQuery &&
          other.model == model &&
          other.objectID == objectID &&
          other.queryParameters == queryParameters &&
          other.fallbackParameters == fallbackParameters;

  @override
  int get hashCode =>
      model.hashCode +
      objectID.hashCode +
      queryParameters.hashCode +
      fallbackParameters.hashCode;

  factory BaseRecommendationsQuery.fromJson(Map<String, dynamic> json) =>
      _$BaseRecommendationsQueryFromJson(json);

  Map<String, dynamic> toJson() => _$BaseRecommendationsQueryToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }
}
