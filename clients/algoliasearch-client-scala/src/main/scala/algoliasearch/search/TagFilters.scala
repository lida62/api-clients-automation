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

/** [Filter hits by tags](https://www.algolia.com/doc/api-reference/api-parameters/tagFilters/).
  */
sealed trait TagFilters

object TagFilters {

  case class SeqOfMixedSearchFilters(value: Seq[MixedSearchFilters]) extends TagFilters
  case class StringValue(value: String) extends TagFilters

  def apply(value: Seq[MixedSearchFilters]): TagFilters = {
    TagFilters.SeqOfMixedSearchFilters(value)
  }
  def apply(value: String): TagFilters = {
    TagFilters.StringValue(value)
  }
}

object TagFiltersSerializer extends Serializer[TagFilters] {
  override def deserialize(implicit format: Formats): PartialFunction[(TypeInfo, JValue), TagFilters] = {

    case (TypeInfo(clazz, _), json) if clazz == classOf[TagFilters] =>
      json match {
        case JArray(value) if value.forall(_.isInstanceOf[JArray]) =>
          TagFilters.SeqOfMixedSearchFilters(value.map(_.extract))
        case JString(value) => TagFilters.StringValue(value)
        case _              => throw new MappingException("Can't convert " + json + " to TagFilters")
      }
  }

  override def serialize(implicit format: Formats): PartialFunction[Any, JValue] = { case value: TagFilters =>
    value match {
      case TagFilters.SeqOfMixedSearchFilters(value) => JArray(value.map(Extraction.decompose).toList)
      case TagFilters.StringValue(value)             => JString(value)
    }
  }
}
