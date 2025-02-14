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

/** MixedSearchFilters
  */
sealed trait MixedSearchFilters

object MixedSearchFilters {

  case class SeqOfString(value: Seq[String]) extends MixedSearchFilters
  case class StringValue(value: String) extends MixedSearchFilters

  def apply(value: Seq[String]): MixedSearchFilters = {
    MixedSearchFilters.SeqOfString(value)
  }
  def apply(value: String): MixedSearchFilters = {
    MixedSearchFilters.StringValue(value)
  }
}

object MixedSearchFiltersSerializer extends Serializer[MixedSearchFilters] {
  override def deserialize(implicit format: Formats): PartialFunction[(TypeInfo, JValue), MixedSearchFilters] = {

    case (TypeInfo(clazz, _), json) if clazz == classOf[MixedSearchFilters] =>
      json match {
        case JArray(value) if value.forall(_.isInstanceOf[JArray]) =>
          MixedSearchFilters.SeqOfString(value.map(_.extract))
        case JString(value) => MixedSearchFilters.StringValue(value)
        case _              => throw new MappingException("Can't convert " + json + " to MixedSearchFilters")
      }
  }

  override def serialize(implicit format: Formats): PartialFunction[Any, JValue] = { case value: MixedSearchFilters =>
    value match {
      case MixedSearchFilters.SeqOfString(value) => JArray(value.map(Extraction.decompose).toList)
      case MixedSearchFilters.StringValue(value) => JString(value)
    }
  }
}
