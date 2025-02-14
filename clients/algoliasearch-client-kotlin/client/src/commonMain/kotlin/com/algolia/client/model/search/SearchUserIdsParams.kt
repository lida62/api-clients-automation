/** Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT. */
package com.algolia.client.model.search

import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * OK
 *
 * @param query Query to search. The search is a prefix search with [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/) enabled. An empty query will retrieve all users.
 * @param clusterName Cluster name.
 * @param page Page to retrieve (the first page is `0`, not `1`).
 * @param hitsPerPage Number of hits per page.
 */
@Serializable
public data class SearchUserIdsParams(

  /** Query to search. The search is a prefix search with [typo tolerance](https://www.algolia.com/doc/guides/managing-results/optimize-search-results/typo-tolerance/) enabled. An empty query will retrieve all users. */
  @SerialName(value = "query") val query: String,

  /** Cluster name. */
  @SerialName(value = "clusterName") val clusterName: String? = null,

  /** Page to retrieve (the first page is `0`, not `1`). */
  @SerialName(value = "page") val page: Int? = null,

  /** Number of hits per page. */
  @SerialName(value = "hitsPerPage") val hitsPerPage: Int? = null,
)
