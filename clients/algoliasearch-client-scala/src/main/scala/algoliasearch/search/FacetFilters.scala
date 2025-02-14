/** Search API Use the Search REST API to manage your data (indices and records), implement search, and improve
  * relevance (with Rules, synonyms, and language dictionaries). Although Algolia provides a REST API, you should use
  * the official open source API [clients, libraries, and
  * tools](https://www.algolia.com/doc/guides/getting-started/how-algolia-works/in-depth/ecosystem/) instead. There's no
  * [SLA](https://www.algolia.com/policies/sla/) if you use the REST API directly.
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.search

import org.json4s._

/** [Filter hits by facet value](https://www.algolia.com/doc/api-reference/api-parameters/facetFilters/).
  */
sealed trait FacetFilters

object FacetFilters {

  case class SeqOfMixedSearchFilters(value: Seq[MixedSearchFilters]) extends FacetFilters
  case class StringValue(value: String) extends FacetFilters

  def apply(value: Seq[MixedSearchFilters]): FacetFilters = {
    FacetFilters.SeqOfMixedSearchFilters(value)
  }
  def apply(value: String): FacetFilters = {
    FacetFilters.StringValue(value)
  }
}

object FacetFiltersSerializer extends Serializer[FacetFilters] {
  override def deserialize(implicit format: Formats): PartialFunction[(TypeInfo, JValue), FacetFilters] = {

    case (TypeInfo(clazz, _), json) if clazz == classOf[FacetFilters] =>
      json match {
        case JArray(value) if value.forall(_.isInstanceOf[JArray]) =>
          FacetFilters.SeqOfMixedSearchFilters(value.map(_.extract))
        case JString(value) => FacetFilters.StringValue(value)
        case _              => throw new MappingException("Can't convert " + json + " to FacetFilters")
      }
  }

  override def serialize(implicit format: Formats): PartialFunction[Any, JValue] = { case value: FacetFilters =>
    value match {
      case FacetFilters.SeqOfMixedSearchFilters(value) => JArray(value.map(Extraction.decompose).toList)
      case FacetFilters.StringValue(value)             => JString(value)
    }
  }
}
