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

/** Response, taskID, and deletion timestamp.
  *
  * @param taskID
  *   Unique identifier of a task. A successful API response means that a task was added to a queue. It might not run
  *   immediately. You can check the task's progress with the `task` operation and this `taskID`.
  * @param deletedAt
  *   Timestamp of deletion in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
  */
case class DeletedAtResponse(
    taskID: Long,
    deletedAt: String
)
