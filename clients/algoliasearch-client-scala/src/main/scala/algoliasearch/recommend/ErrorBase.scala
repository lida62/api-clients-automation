/** Recommend API The Recommend API lets you generate recommendations with several AI models. > **Note**: You should use
  * Algolia's [libraries and
  * tools](https://www.algolia.com/doc/guides/getting-started/how-algolia-works/in-depth/ecosystem/) to interact with
  * the Recommend API. Using the HTTP endpoints directly is not covered by the
  * [SLA](https://www.algolia.com/policies/sla/).
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.recommend

import org.json4s.MonadicJValue.jvalueToMonadic
import org.json4s.{Extraction, Formats, JField, JObject, JValue, Serializer, TypeInfo}

/** Error.
  */
case class ErrorBase(
    message: Option[String] = scala.None,
    additionalProperties: Option[List[JField]] = None
)

class ErrorBaseSerializer extends Serializer[ErrorBase] {

  override def deserialize(implicit format: Formats): PartialFunction[(TypeInfo, JValue), ErrorBase] = {
    case (TypeInfo(clazz, _), json) if clazz == classOf[ErrorBase] =>
      json match {
        case jobject: JObject =>
          val formats = format - this
          val mf = manifest[ErrorBase]
          val obj = Extraction.extract[ErrorBase](jobject)(formats, mf)

          val fields = Set("message")
          val additionalProperties = jobject removeField {
            case (name, _) if fields.contains(name) => true
            case _                                  => false
          }
          additionalProperties.values match {
            case JObject(fieldsList) => obj copy (additionalProperties = Some(fieldsList))
            case _                   => obj
          }
        case _ => throw new IllegalArgumentException(s"Can't deserialize $json as ErrorBase")
      }
  }

  override def serialize(implicit format: Formats): PartialFunction[Any, JValue] = { case value: ErrorBase =>
    val formats = format - this // remove current serializer from formats to avoid stackoverflow
    value.additionalProperties match {
      case Some(fields) => Extraction.decompose(value.copy(additionalProperties = None))(formats) merge JObject(fields)
      case None         => Extraction.decompose(value)(formats)
    }
  }
}
