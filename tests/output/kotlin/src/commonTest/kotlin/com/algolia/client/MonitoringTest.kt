package com.algolia.client

import com.algolia.client.api.MonitoringClient
import com.algolia.client.configuration.*
import com.algolia.client.model.monitoring.*
import com.algolia.client.transport.*
import com.algolia.utils.*
import io.ktor.http.*
import kotlinx.coroutines.test.*
import kotlinx.serialization.json.*
import kotlin.test.*

class MonitoringTest {

  @Test
  fun `calls api with correct user agent`() = runTest {
    val client = MonitoringClient(appId = "appId", apiKey = "apiKey")
    client.runTest(
      call = {
        customPost(
          path = "/test",
        )
      },
      intercept = {
        val regexp = "^Algolia for Kotlin \\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*(; Monitoring (\\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)))(; [a-zA-Z. ]+ (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*$".toRegex()
        val header = it.headers["User-Agent"].orEmpty()
        assertTrue(actual = header.matches(regexp), message = "Expected $header to match the following regex: $regexp")
      },
    )
  }

  @Test
  fun `calls api with default read timeouts`() = runTest {
    val client = MonitoringClient(appId = "appId", apiKey = "apiKey")
    client.runTest(
      call = {
        customGet(
          path = "/test",
        )
      },
      intercept = {
        assertEquals(2000, it.connectTimeout)
        assertEquals(5000, it.socketTimeout)
      },
    )
  }

  @Test
  fun `calls api with default write timeouts`() = runTest {
    val client = MonitoringClient(appId = "appId", apiKey = "apiKey")
    client.runTest(
      call = {
        customPost(
          path = "/test",
        )
      },
      intercept = {
        assertEquals(2000, it.connectTimeout)
        assertEquals(30000, it.socketTimeout)
      },
    )
  }

  @Test
  fun `uses the correct region`() = runTest {
    val client = MonitoringClient(appId = "my-app-id", apiKey = "my-api-key")
  }
}
