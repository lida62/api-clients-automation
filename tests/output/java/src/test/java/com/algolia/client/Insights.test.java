package com.algolia.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.algolia.EchoInterceptor;
import com.algolia.EchoResponse;
import com.algolia.api.InsightsClient;
import com.algolia.config.*;
import com.algolia.model.insights.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class InsightsClientClientTests {

  private EchoInterceptor echo = new EchoInterceptor();

  InsightsClient createClient() {
    return new InsightsClient("appId", "apiKey", "us", buildClientOptions());
  }

  private ClientOptions buildClientOptions() {
    return ClientOptions.builder().setRequesterConfig(requester -> requester.addInterceptor(echo)).build();
  }

  @Test
  @DisplayName("calls api with correct user agent")
  void commonApiTest0() {
    InsightsClient client = createClient();

    String path0 = "/test";

    client.customPost(path0);
    EchoResponse result = echo.getLastResponse();

    {
      String regexp =
        "^Algolia for Java \\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)(; [a-zA-Z. ]+" +
        " (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*(; Insights" +
        " (\\(\\d+\\.\\d+\\.\\d+(-?.*)?\\)))(; [a-zA-Z. ]+" +
        " (\\(\\d+((\\.\\d+)?\\.\\d+)?(-?.*)?\\))?)*$";
      assertTrue(
        result.headers.get("user-agent").matches(regexp),
        "Expected " + result.headers.get("user-agent") + " to match the following regex: " + regexp
      );
    }
  }

  @Test
  @DisplayName("calls api with default read timeouts")
  void commonApiTest1() {
    InsightsClient client = createClient();

    String path0 = "/test";

    client.customGet(path0);
    EchoResponse result = echo.getLastResponse();

    assertEquals(2000, result.connectTimeout);
    assertEquals(5000, result.responseTimeout);
  }

  @Test
  @DisplayName("calls api with default write timeouts")
  void commonApiTest2() {
    InsightsClient client = createClient();

    String path0 = "/test";

    client.customPost(path0);
    EchoResponse result = echo.getLastResponse();

    assertEquals(2000, result.connectTimeout);
    assertEquals(30000, result.responseTimeout);
  }

  @Test
  @DisplayName("fallbacks to the alias when region is not given")
  void parametersTest0() {
    InsightsClient client = new InsightsClient("my-app-id", "my-api-key", buildClientOptions());

    InsightsEvents insightsEvents0 = new InsightsEvents();
    {
      List<EventsItems> events1 = new ArrayList<>();
      {
        ClickedObjectIDsAfterSearch events_02 = new ClickedObjectIDsAfterSearch();
        {
          ClickEvent eventType3 = ClickEvent.fromValue("click");
          events_02.setEventType(eventType3);
          String eventName3 = "Product Clicked";
          events_02.setEventName(eventName3);
          String index3 = "products";
          events_02.setIndex(index3);
          String userToken3 = "user-123456";
          events_02.setUserToken(userToken3);
          String authenticatedUserToken3 = "user-123456";
          events_02.setAuthenticatedUserToken(authenticatedUserToken3);
          long timestamp3 = 1641290601962L;
          events_02.setTimestamp(timestamp3);
          List<String> objectIDs3 = new ArrayList<>();
          {
            String objectIDs_04 = "9780545139700";
            objectIDs3.add(objectIDs_04);
            String objectIDs_14 = "9780439784542";
            objectIDs3.add(objectIDs_14);
          }
          events_02.setObjectIDs(objectIDs3);
          String queryID3 = "43b15df305339e827f0ac0bdc5ebcaa7";
          events_02.setQueryID(queryID3);
          List<Integer> positions3 = new ArrayList<>();
          {
            int positions_04 = 7;
            positions3.add(positions_04);
            int positions_14 = 6;
            positions3.add(positions_14);
          }
          events_02.setPositions(positions3);
        }
        events1.add(events_02);
      }
      insightsEvents0.setEvents(events1);
    }

    client.pushEvents(insightsEvents0);
    EchoResponse result = echo.getLastResponse();

    assertEquals("insights.algolia.io", result.host);
  }

  @Test
  @DisplayName("uses the correct region")
  void parametersTest1() {
    InsightsClient client = new InsightsClient("my-app-id", "my-api-key", "us", buildClientOptions());

    String path0 = "/test";

    client.customDelete(path0);
    EchoResponse result = echo.getLastResponse();

    assertEquals("insights.us.algolia.io", result.host);
  }

  @Test
  @DisplayName("throws when incorrect region is given")
  void parametersTest2() {
    {
      Exception exception = assertThrows(
        Exception.class,
        () -> {
          InsightsClient client = new InsightsClient("my-app-id", "my-api-key", "not_a_region", buildClientOptions());
        }
      );
      assertEquals("`region` must be one of the following: de, us", exception.getMessage());
    }
  }
}
