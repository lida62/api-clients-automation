package com.algolia.methods.requests;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import com.algolia.EchoInterceptor;
import com.algolia.EchoResponse;
import com.algolia.api.RecommendClient;
import com.algolia.config.*;
import com.algolia.model.recommend.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.util.*;
import org.junit.jupiter.api.*;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RecommendClientRequestsTests {

  private RecommendClient client;
  private EchoInterceptor echo;
  private ObjectMapper json;

  @BeforeAll
  void init() {
    this.json = JsonMapper.builder().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build();
    this.echo = new EchoInterceptor();
    var options = ClientOptions.builder().setRequesterConfig(requester -> requester.addInterceptor(echo)).build();
    this.client = new RecommendClient("appId", "apiKey", options);
  }

  @AfterAll
  void tearUp() throws Exception {
    client.close();
  }

  @Test
  @DisplayName("allow del method for a custom path with minimal parameters")
  void customDeleteTest0() {
    String path0 = "/test/minimal";

    assertDoesNotThrow(() -> {
      client.customDelete(path0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/minimal", req.path);
    assertEquals("DELETE", req.method);
    assertNull(req.body);
  }

  @Test
  @DisplayName("allow del method for a custom path with all parameters")
  void customDeleteTest1() {
    String path0 = "/test/all";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }

    assertDoesNotThrow(() -> {
      client.customDelete(path0, parameters0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/all", req.path);
    assertEquals("DELETE", req.method);
    assertNull(req.body);

    try {
      Map<String, String> expectedQuery = json.readValue("{\"query\":\"parameters\"}", new TypeReference<HashMap<String, String>>() {});
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }
  }

  @Test
  @DisplayName("allow get method for a custom path with minimal parameters")
  void customGetTest0() {
    String path0 = "/test/minimal";

    assertDoesNotThrow(() -> {
      client.customGet(path0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/minimal", req.path);
    assertEquals("GET", req.method);
    assertNull(req.body);
  }

  @Test
  @DisplayName("allow get method for a custom path with all parameters")
  void customGetTest1() {
    String path0 = "/test/all";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }

    assertDoesNotThrow(() -> {
      client.customGet(path0, parameters0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/all", req.path);
    assertEquals("GET", req.method);
    assertNull(req.body);

    try {
      Map<String, String> expectedQuery = json.readValue("{\"query\":\"parameters\"}", new TypeReference<HashMap<String, String>>() {});
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }
  }

  @Test
  @DisplayName("allow post method for a custom path with minimal parameters")
  void customPostTest0() {
    String path0 = "/test/minimal";

    assertDoesNotThrow(() -> {
      client.customPost(path0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/minimal", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{}", req.body, JSONCompareMode.STRICT));
  }

  @Test
  @DisplayName("allow post method for a custom path with all parameters")
  void customPostTest1() {
    String path0 = "/test/all";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }
    Map<String, String> body0 = new HashMap<>();
    {
      String body1 = "parameters";
      body0.put("body", body1);
    }

    assertDoesNotThrow(() -> {
      client.customPost(path0, parameters0, body0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/all", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{\"body\":\"parameters\"}", req.body, JSONCompareMode.STRICT));

    try {
      Map<String, String> expectedQuery = json.readValue("{\"query\":\"parameters\"}", new TypeReference<HashMap<String, String>>() {});
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }
  }

  @Test
  @DisplayName("requestOptions can override default query parameters")
  void customPostTest2() {
    String path0 = "/test/requestOptions";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }
    Map<String, String> body0 = new HashMap<>();
    {
      String facet1 = "filters";
      body0.put("facet", facet1);
    }

    RequestOptions requestOptions = new RequestOptions();
    requestOptions.addExtraQueryParameters("query", "myQueryParameter");

    assertDoesNotThrow(() -> {
      client.customPost(path0, parameters0, body0, requestOptions);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/requestOptions", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{\"facet\":\"filters\"}", req.body, JSONCompareMode.STRICT));

    try {
      Map<String, String> expectedQuery = json.readValue(
        "{\"query\":\"myQueryParameter\"}",
        new TypeReference<HashMap<String, String>>() {}
      );
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }
  }

  @Test
  @DisplayName("requestOptions merges query parameters with default ones")
  void customPostTest3() {
    String path0 = "/test/requestOptions";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }
    Map<String, String> body0 = new HashMap<>();
    {
      String facet1 = "filters";
      body0.put("facet", facet1);
    }

    RequestOptions requestOptions = new RequestOptions();
    requestOptions.addExtraQueryParameters("query2", "myQueryParameter");

    assertDoesNotThrow(() -> {
      client.customPost(path0, parameters0, body0, requestOptions);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/requestOptions", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{\"facet\":\"filters\"}", req.body, JSONCompareMode.STRICT));

    try {
      Map<String, String> expectedQuery = json.readValue(
        "{\"query\":\"parameters\",\"query2\":\"myQueryParameter\"}",
        new TypeReference<HashMap<String, String>>() {}
      );
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }
  }

  @Test
  @DisplayName("requestOptions can override default headers")
  void customPostTest4() {
    String path0 = "/test/requestOptions";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }
    Map<String, String> body0 = new HashMap<>();
    {
      String facet1 = "filters";
      body0.put("facet", facet1);
    }

    RequestOptions requestOptions = new RequestOptions();
    requestOptions.addExtraHeader("x-algolia-api-key", "myApiKey");

    assertDoesNotThrow(() -> {
      client.customPost(path0, parameters0, body0, requestOptions);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/requestOptions", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{\"facet\":\"filters\"}", req.body, JSONCompareMode.STRICT));

    try {
      Map<String, String> expectedQuery = json.readValue("{\"query\":\"parameters\"}", new TypeReference<HashMap<String, String>>() {});
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }

    try {
      Map<String, String> expectedHeaders = json.readValue(
        "{\"x-algolia-api-key\":\"myApiKey\"}",
        new TypeReference<HashMap<String, String>>() {}
      );
      Map<String, String> actualHeaders = req.headers;

      for (Map.Entry<String, String> p : expectedHeaders.entrySet()) {
        assertEquals(p.getValue(), actualHeaders.get(p.getKey()));
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse headers json");
    }
  }

  @Test
  @DisplayName("requestOptions merges headers with default ones")
  void customPostTest5() {
    String path0 = "/test/requestOptions";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }
    Map<String, String> body0 = new HashMap<>();
    {
      String facet1 = "filters";
      body0.put("facet", facet1);
    }

    RequestOptions requestOptions = new RequestOptions();
    requestOptions.addExtraHeader("x-algolia-api-key", "myApiKey");

    assertDoesNotThrow(() -> {
      client.customPost(path0, parameters0, body0, requestOptions);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/requestOptions", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{\"facet\":\"filters\"}", req.body, JSONCompareMode.STRICT));

    try {
      Map<String, String> expectedQuery = json.readValue("{\"query\":\"parameters\"}", new TypeReference<HashMap<String, String>>() {});
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }

    try {
      Map<String, String> expectedHeaders = json.readValue(
        "{\"x-algolia-api-key\":\"myApiKey\"}",
        new TypeReference<HashMap<String, String>>() {}
      );
      Map<String, String> actualHeaders = req.headers;

      for (Map.Entry<String, String> p : expectedHeaders.entrySet()) {
        assertEquals(p.getValue(), actualHeaders.get(p.getKey()));
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse headers json");
    }
  }

  @Test
  @DisplayName("requestOptions queryParameters accepts booleans")
  void customPostTest6() {
    String path0 = "/test/requestOptions";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }
    Map<String, String> body0 = new HashMap<>();
    {
      String facet1 = "filters";
      body0.put("facet", facet1);
    }

    RequestOptions requestOptions = new RequestOptions();
    requestOptions.addExtraQueryParameters("isItWorking", true);

    assertDoesNotThrow(() -> {
      client.customPost(path0, parameters0, body0, requestOptions);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/requestOptions", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{\"facet\":\"filters\"}", req.body, JSONCompareMode.STRICT));

    try {
      Map<String, String> expectedQuery = json.readValue(
        "{\"query\":\"parameters\",\"isItWorking\":\"true\"}",
        new TypeReference<HashMap<String, String>>() {}
      );
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }
  }

  @Test
  @DisplayName("requestOptions queryParameters accepts integers")
  void customPostTest7() {
    String path0 = "/test/requestOptions";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }
    Map<String, String> body0 = new HashMap<>();
    {
      String facet1 = "filters";
      body0.put("facet", facet1);
    }

    RequestOptions requestOptions = new RequestOptions();
    requestOptions.addExtraQueryParameters("myParam", 2);

    assertDoesNotThrow(() -> {
      client.customPost(path0, parameters0, body0, requestOptions);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/requestOptions", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{\"facet\":\"filters\"}", req.body, JSONCompareMode.STRICT));

    try {
      Map<String, String> expectedQuery = json.readValue(
        "{\"query\":\"parameters\",\"myParam\":\"2\"}",
        new TypeReference<HashMap<String, String>>() {}
      );
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }
  }

  @Test
  @DisplayName("requestOptions queryParameters accepts list of string")
  void customPostTest8() {
    String path0 = "/test/requestOptions";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }
    Map<String, String> body0 = new HashMap<>();
    {
      String facet1 = "filters";
      body0.put("facet", facet1);
    }

    RequestOptions requestOptions = new RequestOptions();
    requestOptions.addExtraQueryParameters("myParam", Arrays.asList("c", "d"));

    assertDoesNotThrow(() -> {
      client.customPost(path0, parameters0, body0, requestOptions);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/requestOptions", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{\"facet\":\"filters\"}", req.body, JSONCompareMode.STRICT));

    try {
      Map<String, String> expectedQuery = json.readValue(
        "{\"query\":\"parameters\",\"myParam\":\"c,d\"}",
        new TypeReference<HashMap<String, String>>() {}
      );
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }
  }

  @Test
  @DisplayName("requestOptions queryParameters accepts list of booleans")
  void customPostTest9() {
    String path0 = "/test/requestOptions";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }
    Map<String, String> body0 = new HashMap<>();
    {
      String facet1 = "filters";
      body0.put("facet", facet1);
    }

    RequestOptions requestOptions = new RequestOptions();
    requestOptions.addExtraQueryParameters("myParam", Arrays.asList(true, true, false));

    assertDoesNotThrow(() -> {
      client.customPost(path0, parameters0, body0, requestOptions);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/requestOptions", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{\"facet\":\"filters\"}", req.body, JSONCompareMode.STRICT));

    try {
      Map<String, String> expectedQuery = json.readValue(
        "{\"query\":\"parameters\",\"myParam\":\"true,true,false\"}",
        new TypeReference<HashMap<String, String>>() {}
      );
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }
  }

  @Test
  @DisplayName("requestOptions queryParameters accepts list of integers")
  void customPostTest10() {
    String path0 = "/test/requestOptions";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }
    Map<String, String> body0 = new HashMap<>();
    {
      String facet1 = "filters";
      body0.put("facet", facet1);
    }

    RequestOptions requestOptions = new RequestOptions();
    requestOptions.addExtraQueryParameters("myParam", Arrays.asList(1, 2));

    assertDoesNotThrow(() -> {
      client.customPost(path0, parameters0, body0, requestOptions);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/requestOptions", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{\"facet\":\"filters\"}", req.body, JSONCompareMode.STRICT));

    try {
      Map<String, String> expectedQuery = json.readValue(
        "{\"query\":\"parameters\",\"myParam\":\"1,2\"}",
        new TypeReference<HashMap<String, String>>() {}
      );
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }
  }

  @Test
  @DisplayName("allow put method for a custom path with minimal parameters")
  void customPutTest0() {
    String path0 = "/test/minimal";

    assertDoesNotThrow(() -> {
      client.customPut(path0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/minimal", req.path);
    assertEquals("PUT", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{}", req.body, JSONCompareMode.STRICT));
  }

  @Test
  @DisplayName("allow put method for a custom path with all parameters")
  void customPutTest1() {
    String path0 = "/test/all";
    Map<String, Object> parameters0 = new HashMap<>();
    {
      String query1 = "parameters";
      parameters0.put("query", query1);
    }
    Map<String, String> body0 = new HashMap<>();
    {
      String body1 = "parameters";
      body0.put("body", body1);
    }

    assertDoesNotThrow(() -> {
      client.customPut(path0, parameters0, body0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/test/all", req.path);
    assertEquals("PUT", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{\"body\":\"parameters\"}", req.body, JSONCompareMode.STRICT));

    try {
      Map<String, String> expectedQuery = json.readValue("{\"query\":\"parameters\"}", new TypeReference<HashMap<String, String>>() {});
      Map<String, Object> actualQuery = req.queryParameters;

      assertEquals(expectedQuery.size(), actualQuery.size());
      for (Map.Entry<String, Object> p : actualQuery.entrySet()) {
        assertEquals(expectedQuery.get(p.getKey()), p.getValue());
      }
    } catch (JsonProcessingException e) {
      fail("failed to parse queryParameters json");
    }
  }

  @Test
  @DisplayName("deleteRecommendRule0")
  void deleteRecommendRuleTest0() {
    String indexName0 = "indexName";
    RecommendModels model0 = RecommendModels.fromValue("related-products");
    String objectID0 = "objectID";

    assertDoesNotThrow(() -> {
      client.deleteRecommendRule(indexName0, model0, objectID0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/indexes/indexName/related-products/recommend/rules/objectID", req.path);
    assertEquals("DELETE", req.method);
    assertNull(req.body);
  }

  @Test
  @DisplayName("getRecommendRule0")
  void getRecommendRuleTest0() {
    String indexName0 = "indexName";
    RecommendModels model0 = RecommendModels.fromValue("related-products");
    String objectID0 = "objectID";

    assertDoesNotThrow(() -> {
      client.getRecommendRule(indexName0, model0, objectID0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/indexes/indexName/related-products/recommend/rules/objectID", req.path);
    assertEquals("GET", req.method);
    assertNull(req.body);
  }

  @Test
  @DisplayName("getRecommendStatus0")
  void getRecommendStatusTest0() {
    String indexName0 = "indexName";
    RecommendModels model0 = RecommendModels.fromValue("related-products");
    long taskID0 = 12345L;

    assertDoesNotThrow(() -> {
      client.getRecommendStatus(indexName0, model0, taskID0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/indexes/indexName/related-products/task/12345", req.path);
    assertEquals("GET", req.method);
    assertNull(req.body);
  }

  @Test
  @DisplayName("get recommendations for recommend model with minimal parameters")
  void getRecommendationsTest0() {
    GetRecommendationsParams getRecommendationsParams0 = new GetRecommendationsParams();
    {
      List<RecommendationsRequest> requests1 = new ArrayList<>();
      {
        RecommendationsQuery requests_02 = new RecommendationsQuery();
        {
          String indexName3 = "indexName";
          requests_02.setIndexName(indexName3);
          String objectID3 = "objectID";
          requests_02.setObjectID(objectID3);
          RecommendationModels model3 = RecommendationModels.fromValue("related-products");
          requests_02.setModel(model3);
          int threshold3 = 42;
          requests_02.setThreshold(threshold3);
        }
        requests1.add(requests_02);
      }
      getRecommendationsParams0.setRequests(requests1);
    }

    assertDoesNotThrow(() -> {
      client.getRecommendations(getRecommendationsParams0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/indexes/*/recommendations", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() ->
      JSONAssert.assertEquals(
        "{\"requests\":[{\"indexName\":\"indexName\",\"objectID\":\"objectID\",\"model\":\"related-products\",\"threshold\":42}]}",
        req.body,
        JSONCompareMode.STRICT
      )
    );
  }

  @Test
  @DisplayName("get recommendations for recommend model with all parameters")
  void getRecommendationsTest1() {
    GetRecommendationsParams getRecommendationsParams0 = new GetRecommendationsParams();
    {
      List<RecommendationsRequest> requests1 = new ArrayList<>();
      {
        RecommendationsQuery requests_02 = new RecommendationsQuery();
        {
          String indexName3 = "indexName";
          requests_02.setIndexName(indexName3);
          String objectID3 = "objectID";
          requests_02.setObjectID(objectID3);
          RecommendationModels model3 = RecommendationModels.fromValue("related-products");
          requests_02.setModel(model3);
          int threshold3 = 42;
          requests_02.setThreshold(threshold3);
          int maxRecommendations3 = 10;
          requests_02.setMaxRecommendations(maxRecommendations3);
          SearchParamsObject queryParameters3 = new SearchParamsObject();
          {
            String query4 = "myQuery";
            queryParameters3.setQuery(query4);
            List<MixedSearchFilters> facetFilters4 = new ArrayList<>();
            {
              String facetFilters_05 = "query";
              facetFilters4.add(MixedSearchFilters.of(facetFilters_05));
            }
            queryParameters3.setFacetFilters(FacetFilters.of(facetFilters4));
          }
          requests_02.setQueryParameters(queryParameters3);
          SearchParamsObject fallbackParameters3 = new SearchParamsObject();
          {
            String query4 = "myQuery";
            fallbackParameters3.setQuery(query4);
            List<MixedSearchFilters> facetFilters4 = new ArrayList<>();
            {
              String facetFilters_05 = "fallback";
              facetFilters4.add(MixedSearchFilters.of(facetFilters_05));
            }
            fallbackParameters3.setFacetFilters(FacetFilters.of(facetFilters4));
          }
          requests_02.setFallbackParameters(fallbackParameters3);
        }
        requests1.add(requests_02);
      }
      getRecommendationsParams0.setRequests(requests1);
    }

    assertDoesNotThrow(() -> {
      client.getRecommendations(getRecommendationsParams0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/indexes/*/recommendations", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() ->
      JSONAssert.assertEquals(
        "{\"requests\":[{\"indexName\":\"indexName\",\"objectID\":\"objectID\",\"model\":\"related-products\",\"threshold\":42,\"maxRecommendations\":10,\"queryParameters\":{\"query\":\"myQuery\",\"facetFilters\":[\"query\"]},\"fallbackParameters\":{\"query\":\"myQuery\",\"facetFilters\":[\"fallback\"]}}]}",
        req.body,
        JSONCompareMode.STRICT
      )
    );
  }

  @Test
  @DisplayName("get recommendations for trending model with minimal parameters")
  void getRecommendationsTest2() {
    GetRecommendationsParams getRecommendationsParams0 = new GetRecommendationsParams();
    {
      List<RecommendationsRequest> requests1 = new ArrayList<>();
      {
        TrendingItemsQuery requests_02 = new TrendingItemsQuery();
        {
          String indexName3 = "indexName";
          requests_02.setIndexName(indexName3);
          TrendingItemsModel model3 = TrendingItemsModel.fromValue("trending-items");
          requests_02.setModel(model3);
          int threshold3 = 42;
          requests_02.setThreshold(threshold3);
        }
        requests1.add(requests_02);
      }
      getRecommendationsParams0.setRequests(requests1);
    }

    assertDoesNotThrow(() -> {
      client.getRecommendations(getRecommendationsParams0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/indexes/*/recommendations", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() ->
      JSONAssert.assertEquals(
        "{\"requests\":[{\"indexName\":\"indexName\",\"model\":\"trending-items\",\"threshold\":42}]}",
        req.body,
        JSONCompareMode.STRICT
      )
    );
  }

  @Test
  @DisplayName("get recommendations for trending model with all parameters")
  void getRecommendationsTest3() {
    GetRecommendationsParams getRecommendationsParams0 = new GetRecommendationsParams();
    {
      List<RecommendationsRequest> requests1 = new ArrayList<>();
      {
        TrendingItemsQuery requests_02 = new TrendingItemsQuery();
        {
          String indexName3 = "indexName";
          requests_02.setIndexName(indexName3);
          TrendingItemsModel model3 = TrendingItemsModel.fromValue("trending-items");
          requests_02.setModel(model3);
          int threshold3 = 42;
          requests_02.setThreshold(threshold3);
          int maxRecommendations3 = 10;
          requests_02.setMaxRecommendations(maxRecommendations3);
          String facetName3 = "myFacetName";
          requests_02.setFacetName(facetName3);
          String facetValue3 = "myFacetValue";
          requests_02.setFacetValue(facetValue3);
          SearchParamsObject queryParameters3 = new SearchParamsObject();
          {
            String query4 = "myQuery";
            queryParameters3.setQuery(query4);
            List<MixedSearchFilters> facetFilters4 = new ArrayList<>();
            {
              String facetFilters_05 = "query";
              facetFilters4.add(MixedSearchFilters.of(facetFilters_05));
            }
            queryParameters3.setFacetFilters(FacetFilters.of(facetFilters4));
          }
          requests_02.setQueryParameters(queryParameters3);
          SearchParamsObject fallbackParameters3 = new SearchParamsObject();
          {
            String query4 = "myQuery";
            fallbackParameters3.setQuery(query4);
            List<MixedSearchFilters> facetFilters4 = new ArrayList<>();
            {
              String facetFilters_05 = "fallback";
              facetFilters4.add(MixedSearchFilters.of(facetFilters_05));
            }
            fallbackParameters3.setFacetFilters(FacetFilters.of(facetFilters4));
          }
          requests_02.setFallbackParameters(fallbackParameters3);
        }
        requests1.add(requests_02);
      }
      getRecommendationsParams0.setRequests(requests1);
    }

    assertDoesNotThrow(() -> {
      client.getRecommendations(getRecommendationsParams0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/indexes/*/recommendations", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() ->
      JSONAssert.assertEquals(
        "{\"requests\":[{\"indexName\":\"indexName\",\"model\":\"trending-items\",\"threshold\":42,\"maxRecommendations\":10,\"facetName\":\"myFacetName\",\"facetValue\":\"myFacetValue\",\"queryParameters\":{\"query\":\"myQuery\",\"facetFilters\":[\"query\"]},\"fallbackParameters\":{\"query\":\"myQuery\",\"facetFilters\":[\"fallback\"]}}]}",
        req.body,
        JSONCompareMode.STRICT
      )
    );
  }

  @Test
  @DisplayName("get multiple recommendations with minimal parameters")
  void getRecommendationsTest4() {
    GetRecommendationsParams getRecommendationsParams0 = new GetRecommendationsParams();
    {
      List<RecommendationsRequest> requests1 = new ArrayList<>();
      {
        RecommendationsQuery requests_02 = new RecommendationsQuery();
        {
          String indexName3 = "indexName1";
          requests_02.setIndexName(indexName3);
          String objectID3 = "objectID1";
          requests_02.setObjectID(objectID3);
          RecommendationModels model3 = RecommendationModels.fromValue("related-products");
          requests_02.setModel(model3);
          int threshold3 = 21;
          requests_02.setThreshold(threshold3);
        }
        requests1.add(requests_02);
        RecommendationsQuery requests_12 = new RecommendationsQuery();
        {
          String indexName3 = "indexName2";
          requests_12.setIndexName(indexName3);
          String objectID3 = "objectID2";
          requests_12.setObjectID(objectID3);
          RecommendationModels model3 = RecommendationModels.fromValue("related-products");
          requests_12.setModel(model3);
          int threshold3 = 21;
          requests_12.setThreshold(threshold3);
        }
        requests1.add(requests_12);
      }
      getRecommendationsParams0.setRequests(requests1);
    }

    assertDoesNotThrow(() -> {
      client.getRecommendations(getRecommendationsParams0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/indexes/*/recommendations", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() ->
      JSONAssert.assertEquals(
        "{\"requests\":[{\"indexName\":\"indexName1\",\"objectID\":\"objectID1\",\"model\":\"related-products\",\"threshold\":21},{\"indexName\":\"indexName2\",\"objectID\":\"objectID2\",\"model\":\"related-products\",\"threshold\":21}]}",
        req.body,
        JSONCompareMode.STRICT
      )
    );
  }

  @Test
  @DisplayName("get multiple recommendations with all parameters")
  void getRecommendationsTest5() {
    GetRecommendationsParams getRecommendationsParams0 = new GetRecommendationsParams();
    {
      List<RecommendationsRequest> requests1 = new ArrayList<>();
      {
        RecommendationsQuery requests_02 = new RecommendationsQuery();
        {
          String indexName3 = "indexName1";
          requests_02.setIndexName(indexName3);
          String objectID3 = "objectID1";
          requests_02.setObjectID(objectID3);
          RecommendationModels model3 = RecommendationModels.fromValue("related-products");
          requests_02.setModel(model3);
          int threshold3 = 21;
          requests_02.setThreshold(threshold3);
          int maxRecommendations3 = 10;
          requests_02.setMaxRecommendations(maxRecommendations3);
          SearchParamsObject queryParameters3 = new SearchParamsObject();
          {
            String query4 = "myQuery";
            queryParameters3.setQuery(query4);
            List<MixedSearchFilters> facetFilters4 = new ArrayList<>();
            {
              String facetFilters_05 = "query1";
              facetFilters4.add(MixedSearchFilters.of(facetFilters_05));
            }
            queryParameters3.setFacetFilters(FacetFilters.of(facetFilters4));
          }
          requests_02.setQueryParameters(queryParameters3);
          SearchParamsObject fallbackParameters3 = new SearchParamsObject();
          {
            String query4 = "myQuery";
            fallbackParameters3.setQuery(query4);
            List<MixedSearchFilters> facetFilters4 = new ArrayList<>();
            {
              String facetFilters_05 = "fallback1";
              facetFilters4.add(MixedSearchFilters.of(facetFilters_05));
            }
            fallbackParameters3.setFacetFilters(FacetFilters.of(facetFilters4));
          }
          requests_02.setFallbackParameters(fallbackParameters3);
        }
        requests1.add(requests_02);
        RecommendationsQuery requests_12 = new RecommendationsQuery();
        {
          String indexName3 = "indexName2";
          requests_12.setIndexName(indexName3);
          String objectID3 = "objectID2";
          requests_12.setObjectID(objectID3);
          RecommendationModels model3 = RecommendationModels.fromValue("related-products");
          requests_12.setModel(model3);
          int threshold3 = 21;
          requests_12.setThreshold(threshold3);
          int maxRecommendations3 = 10;
          requests_12.setMaxRecommendations(maxRecommendations3);
          SearchParamsObject queryParameters3 = new SearchParamsObject();
          {
            String query4 = "myQuery";
            queryParameters3.setQuery(query4);
            List<MixedSearchFilters> facetFilters4 = new ArrayList<>();
            {
              String facetFilters_05 = "query2";
              facetFilters4.add(MixedSearchFilters.of(facetFilters_05));
            }
            queryParameters3.setFacetFilters(FacetFilters.of(facetFilters4));
          }
          requests_12.setQueryParameters(queryParameters3);
          SearchParamsObject fallbackParameters3 = new SearchParamsObject();
          {
            String query4 = "myQuery";
            fallbackParameters3.setQuery(query4);
            List<MixedSearchFilters> facetFilters4 = new ArrayList<>();
            {
              String facetFilters_05 = "fallback2";
              facetFilters4.add(MixedSearchFilters.of(facetFilters_05));
            }
            fallbackParameters3.setFacetFilters(FacetFilters.of(facetFilters4));
          }
          requests_12.setFallbackParameters(fallbackParameters3);
        }
        requests1.add(requests_12);
      }
      getRecommendationsParams0.setRequests(requests1);
    }

    assertDoesNotThrow(() -> {
      client.getRecommendations(getRecommendationsParams0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/indexes/*/recommendations", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() ->
      JSONAssert.assertEquals(
        "{\"requests\":[{\"indexName\":\"indexName1\",\"objectID\":\"objectID1\",\"model\":\"related-products\",\"threshold\":21,\"maxRecommendations\":10,\"queryParameters\":{\"query\":\"myQuery\",\"facetFilters\":[\"query1\"]},\"fallbackParameters\":{\"query\":\"myQuery\",\"facetFilters\":[\"fallback1\"]}},{\"indexName\":\"indexName2\",\"objectID\":\"objectID2\",\"model\":\"related-products\",\"threshold\":21,\"maxRecommendations\":10,\"queryParameters\":{\"query\":\"myQuery\",\"facetFilters\":[\"query2\"]},\"fallbackParameters\":{\"query\":\"myQuery\",\"facetFilters\":[\"fallback2\"]}}]}",
        req.body,
        JSONCompareMode.STRICT
      )
    );
  }

  @Test
  @DisplayName("get frequently bought together recommendations")
  void getRecommendationsTest6() {
    GetRecommendationsParams getRecommendationsParams0 = new GetRecommendationsParams();
    {
      List<RecommendationsRequest> requests1 = new ArrayList<>();
      {
        RecommendationsQuery requests_02 = new RecommendationsQuery();
        {
          String indexName3 = "indexName1";
          requests_02.setIndexName(indexName3);
          String objectID3 = "objectID1";
          requests_02.setObjectID(objectID3);
          RecommendationModels model3 = RecommendationModels.fromValue("bought-together");
          requests_02.setModel(model3);
          int threshold3 = 42;
          requests_02.setThreshold(threshold3);
        }
        requests1.add(requests_02);
      }
      getRecommendationsParams0.setRequests(requests1);
    }

    assertDoesNotThrow(() -> {
      client.getRecommendations(getRecommendationsParams0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/indexes/*/recommendations", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() ->
      JSONAssert.assertEquals(
        "{\"requests\":[{\"indexName\":\"indexName1\",\"objectID\":\"objectID1\",\"model\":\"bought-together\",\"threshold\":42}]}",
        req.body,
        JSONCompareMode.STRICT
      )
    );
  }

  @Test
  @DisplayName("searchRecommendRules0")
  void searchRecommendRulesTest0() {
    String indexName0 = "indexName";
    RecommendModels model0 = RecommendModels.fromValue("related-products");

    assertDoesNotThrow(() -> {
      client.searchRecommendRules(indexName0, model0);
    });
    EchoResponse req = echo.getLastResponse();
    assertEquals("/1/indexes/indexName/related-products/recommend/rules/search", req.path);
    assertEquals("POST", req.method);
    assertDoesNotThrow(() -> JSONAssert.assertEquals("{}", req.body, JSONCompareMode.STRICT));
  }
}
