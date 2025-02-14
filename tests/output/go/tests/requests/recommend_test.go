package tests

import (
	"encoding/json"
	"net/url"
	"testing"

	"github.com/kinbiko/jsonassert"
	"github.com/stretchr/testify/require"

	"github.com/algolia/algoliasearch-client-go/v4/algolia/recommend"
)

func createRecommendClient() (*recommend.APIClient, *echoRequester) {
	echo := &echoRequester{}
	cfg := recommend.Configuration{
		AppID:     "appID",
		ApiKey:    "apiKey",
		Requester: echo,
	}
	client := recommend.NewClientWithConfig(cfg)

	// so that the linter doesn't complain
	_ = jsonassert.New(nil)

	return client, echo
}

func TestRecommend_CustomDelete(t *testing.T) {
	client, echo := createRecommendClient()

	tests := []struct {
		name     string
		testFunc func(t *testing.T)
	}{
		{
			name: "allow del method for a custom path with minimal parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/minimal"}`
				req := recommend.ApiCustomDeleteRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.CustomDelete(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/minimal")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "DELETE", echo.method)

				require.Nil(t, echo.body)
			},
		},
		{
			name: "allow del method for a custom path with all parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/all","parameters":{"query":"parameters"}}`
				req := recommend.ApiCustomDeleteRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.CustomDelete(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/all")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "DELETE", echo.method)

				require.Nil(t, echo.body)
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"parameters"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
	}
	for _, test := range tests {
		test := test
		t.Run(test.name, func(t *testing.T) {
			test.testFunc(t)
		})
	}
}

func TestRecommend_CustomGet(t *testing.T) {
	client, echo := createRecommendClient()

	tests := []struct {
		name     string
		testFunc func(t *testing.T)
	}{
		{
			name: "allow get method for a custom path with minimal parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/minimal"}`
				req := recommend.ApiCustomGetRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.CustomGet(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/minimal")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "GET", echo.method)

				require.Nil(t, echo.body)
			},
		},
		{
			name: "allow get method for a custom path with all parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/all","parameters":{"query":"parameters"}}`
				req := recommend.ApiCustomGetRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.CustomGet(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/all")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "GET", echo.method)

				require.Nil(t, echo.body)
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"parameters"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
	}
	for _, test := range tests {
		test := test
		t.Run(test.name, func(t *testing.T) {
			test.testFunc(t)
		})
	}
}

func TestRecommend_CustomPost(t *testing.T) {
	client, echo := createRecommendClient()

	tests := []struct {
		name     string
		testFunc func(t *testing.T)
	}{
		{
			name: "allow post method for a custom path with minimal parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/minimal"}`
				req := recommend.ApiCustomPostRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.CustomPost(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/minimal")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{}`)
			},
		},
		{
			name: "allow post method for a custom path with all parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/all","parameters":{"query":"parameters"},"body":{"body":"parameters"}}`
				req := recommend.ApiCustomPostRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.CustomPost(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/all")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"body":"parameters"}`)
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"parameters"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
		{
			name: "requestOptions can override default query parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/requestOptions","parameters":{"query":"parameters"},"body":{"facet":"filters"}}`
				req := recommend.ApiCustomPostRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				var opts []recommend.Option
				requestOptionParameters := map[string]any{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"myQueryParameter"}`), &requestOptionParameters))
				for k, v := range requestOptionParameters {
					opts = append(opts, recommend.QueryParamOption(k, v))
				}
				_, err := client.CustomPost(req, opts...)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/requestOptions")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"facet":"filters"}`)
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"myQueryParameter"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
		{
			name: "requestOptions merges query parameters with default ones",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/requestOptions","parameters":{"query":"parameters"},"body":{"facet":"filters"}}`
				req := recommend.ApiCustomPostRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				var opts []recommend.Option
				requestOptionParameters := map[string]any{}
				require.NoError(t, json.Unmarshal([]byte(`{"query2":"myQueryParameter"}`), &requestOptionParameters))
				for k, v := range requestOptionParameters {
					opts = append(opts, recommend.QueryParamOption(k, v))
				}
				_, err := client.CustomPost(req, opts...)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/requestOptions")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"facet":"filters"}`)
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"parameters","query2":"myQueryParameter"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
		{
			name: "requestOptions can override default headers",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/requestOptions","parameters":{"query":"parameters"},"body":{"facet":"filters"}}`
				req := recommend.ApiCustomPostRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				var opts []recommend.Option
				requestOptionHeaders := map[string]any{}
				require.NoError(t, json.Unmarshal([]byte(`{"x-algolia-api-key":"myApiKey"}`), &requestOptionHeaders))
				for k, v := range requestOptionHeaders {
					opts = append(opts, recommend.HeaderParamOption(k, v))
				}
				_, err := client.CustomPost(req, opts...)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/requestOptions")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"facet":"filters"}`)
				headers := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"x-algolia-api-key":"myApiKey"}`), &headers))
				for k, v := range headers {
					require.Equal(t, v, echo.header.Get(k))
				}
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"parameters"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
		{
			name: "requestOptions merges headers with default ones",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/requestOptions","parameters":{"query":"parameters"},"body":{"facet":"filters"}}`
				req := recommend.ApiCustomPostRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				var opts []recommend.Option
				requestOptionHeaders := map[string]any{}
				require.NoError(t, json.Unmarshal([]byte(`{"x-algolia-api-key":"myApiKey"}`), &requestOptionHeaders))
				for k, v := range requestOptionHeaders {
					opts = append(opts, recommend.HeaderParamOption(k, v))
				}
				_, err := client.CustomPost(req, opts...)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/requestOptions")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"facet":"filters"}`)
				headers := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"x-algolia-api-key":"myApiKey"}`), &headers))
				for k, v := range headers {
					require.Equal(t, v, echo.header.Get(k))
				}
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"parameters"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
		{
			name: "requestOptions queryParameters accepts booleans",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/requestOptions","parameters":{"query":"parameters"},"body":{"facet":"filters"}}`
				req := recommend.ApiCustomPostRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				var opts []recommend.Option
				requestOptionParameters := map[string]any{}
				require.NoError(t, json.Unmarshal([]byte(`{"isItWorking":true}`), &requestOptionParameters))
				for k, v := range requestOptionParameters {
					opts = append(opts, recommend.QueryParamOption(k, v))
				}
				_, err := client.CustomPost(req, opts...)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/requestOptions")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"facet":"filters"}`)
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"parameters","isItWorking":"true"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
		{
			name: "requestOptions queryParameters accepts integers",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/requestOptions","parameters":{"query":"parameters"},"body":{"facet":"filters"}}`
				req := recommend.ApiCustomPostRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				var opts []recommend.Option
				requestOptionParameters := map[string]any{}
				require.NoError(t, json.Unmarshal([]byte(`{"myParam":2}`), &requestOptionParameters))
				for k, v := range requestOptionParameters {
					opts = append(opts, recommend.QueryParamOption(k, v))
				}
				_, err := client.CustomPost(req, opts...)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/requestOptions")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"facet":"filters"}`)
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"parameters","myParam":"2"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
		{
			name: "requestOptions queryParameters accepts list of string",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/requestOptions","parameters":{"query":"parameters"},"body":{"facet":"filters"}}`
				req := recommend.ApiCustomPostRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				var opts []recommend.Option
				requestOptionParameters := map[string]any{}
				require.NoError(t, json.Unmarshal([]byte(`{"myParam":["c","d"]}`), &requestOptionParameters))
				for k, v := range requestOptionParameters {
					opts = append(opts, recommend.QueryParamOption(k, v))
				}
				_, err := client.CustomPost(req, opts...)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/requestOptions")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"facet":"filters"}`)
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"parameters","myParam":"c,d"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
		{
			name: "requestOptions queryParameters accepts list of booleans",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/requestOptions","parameters":{"query":"parameters"},"body":{"facet":"filters"}}`
				req := recommend.ApiCustomPostRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				var opts []recommend.Option
				requestOptionParameters := map[string]any{}
				require.NoError(t, json.Unmarshal([]byte(`{"myParam":[true,true,false]}`), &requestOptionParameters))
				for k, v := range requestOptionParameters {
					opts = append(opts, recommend.QueryParamOption(k, v))
				}
				_, err := client.CustomPost(req, opts...)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/requestOptions")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"facet":"filters"}`)
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"parameters","myParam":"true,true,false"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
		{
			name: "requestOptions queryParameters accepts list of integers",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/requestOptions","parameters":{"query":"parameters"},"body":{"facet":"filters"}}`
				req := recommend.ApiCustomPostRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				var opts []recommend.Option
				requestOptionParameters := map[string]any{}
				require.NoError(t, json.Unmarshal([]byte(`{"myParam":[1,2]}`), &requestOptionParameters))
				for k, v := range requestOptionParameters {
					opts = append(opts, recommend.QueryParamOption(k, v))
				}
				_, err := client.CustomPost(req, opts...)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/requestOptions")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"facet":"filters"}`)
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"parameters","myParam":"1,2"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
	}
	for _, test := range tests {
		test := test
		t.Run(test.name, func(t *testing.T) {
			test.testFunc(t)
		})
	}
}

func TestRecommend_CustomPut(t *testing.T) {
	client, echo := createRecommendClient()

	tests := []struct {
		name     string
		testFunc func(t *testing.T)
	}{
		{
			name: "allow put method for a custom path with minimal parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/minimal"}`
				req := recommend.ApiCustomPutRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.CustomPut(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/minimal")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "PUT", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{}`)
			},
		},
		{
			name: "allow put method for a custom path with all parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"path":"/test/all","parameters":{"query":"parameters"},"body":{"body":"parameters"}}`
				req := recommend.ApiCustomPutRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.CustomPut(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/test/all")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "PUT", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"body":"parameters"}`)
				queryParams := map[string]string{}
				require.NoError(t, json.Unmarshal([]byte(`{"query":"parameters"}`), &queryParams))
				for k, v := range queryParams {
					require.Equal(t, v, echo.query.Get(k))
				}
			},
		},
	}
	for _, test := range tests {
		test := test
		t.Run(test.name, func(t *testing.T) {
			test.testFunc(t)
		})
	}
}

func TestRecommend_DeleteRecommendRule(t *testing.T) {
	client, echo := createRecommendClient()

	tests := []struct {
		name     string
		testFunc func(t *testing.T)
	}{
		{
			name: "deleteRecommendRule0",
			testFunc: func(t *testing.T) {
				parametersStr := `{"indexName":"indexName","model":"related-products","objectID":"objectID"}`
				req := recommend.ApiDeleteRecommendRuleRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.DeleteRecommendRule(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/indexes/indexName/related-products/recommend/rules/objectID")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "DELETE", echo.method)

				require.Nil(t, echo.body)
			},
		},
	}
	for _, test := range tests {
		test := test
		t.Run(test.name, func(t *testing.T) {
			test.testFunc(t)
		})
	}
}

func TestRecommend_GetRecommendRule(t *testing.T) {
	client, echo := createRecommendClient()

	tests := []struct {
		name     string
		testFunc func(t *testing.T)
	}{
		{
			name: "getRecommendRule0",
			testFunc: func(t *testing.T) {
				parametersStr := `{"indexName":"indexName","model":"related-products","objectID":"objectID"}`
				req := recommend.ApiGetRecommendRuleRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.GetRecommendRule(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/indexes/indexName/related-products/recommend/rules/objectID")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "GET", echo.method)

				require.Nil(t, echo.body)
			},
		},
	}
	for _, test := range tests {
		test := test
		t.Run(test.name, func(t *testing.T) {
			test.testFunc(t)
		})
	}
}

func TestRecommend_GetRecommendStatus(t *testing.T) {
	client, echo := createRecommendClient()

	tests := []struct {
		name     string
		testFunc func(t *testing.T)
	}{
		{
			name: "getRecommendStatus0",
			testFunc: func(t *testing.T) {
				parametersStr := `{"indexName":"indexName","model":"related-products","taskID":12345}`
				req := recommend.ApiGetRecommendStatusRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.GetRecommendStatus(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/indexes/indexName/related-products/task/12345")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "GET", echo.method)

				require.Nil(t, echo.body)
			},
		},
	}
	for _, test := range tests {
		test := test
		t.Run(test.name, func(t *testing.T) {
			test.testFunc(t)
		})
	}
}

func TestRecommend_GetRecommendations(t *testing.T) {
	client, echo := createRecommendClient()

	tests := []struct {
		name     string
		testFunc func(t *testing.T)
	}{
		{
			name: "get recommendations for recommend model with minimal parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"requests":[{"indexName":"indexName","objectID":"objectID","model":"related-products","threshold":42}]}`
				req := recommend.ApiGetRecommendationsRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.GetRecommendations(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/indexes/*/recommendations")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"requests":[{"indexName":"indexName","objectID":"objectID","model":"related-products","threshold":42}]}`)
			},
		},
		{
			name: "get recommendations for recommend model with all parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"requests":[{"indexName":"indexName","objectID":"objectID","model":"related-products","threshold":42,"maxRecommendations":10,"queryParameters":{"query":"myQuery","facetFilters":["query"]},"fallbackParameters":{"query":"myQuery","facetFilters":["fallback"]}}]}`
				req := recommend.ApiGetRecommendationsRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.GetRecommendations(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/indexes/*/recommendations")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"requests":[{"indexName":"indexName","objectID":"objectID","model":"related-products","threshold":42,"maxRecommendations":10,"queryParameters":{"query":"myQuery","facetFilters":["query"]},"fallbackParameters":{"query":"myQuery","facetFilters":["fallback"]}}]}`)
			},
		},
		{
			name: "get recommendations for trending model with minimal parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"requests":[{"indexName":"indexName","model":"trending-items","threshold":42}]}`
				req := recommend.ApiGetRecommendationsRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.GetRecommendations(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/indexes/*/recommendations")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"requests":[{"indexName":"indexName","model":"trending-items","threshold":42}]}`)
			},
		},
		{
			name: "get recommendations for trending model with all parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"requests":[{"indexName":"indexName","model":"trending-items","threshold":42,"maxRecommendations":10,"facetName":"myFacetName","facetValue":"myFacetValue","queryParameters":{"query":"myQuery","facetFilters":["query"]},"fallbackParameters":{"query":"myQuery","facetFilters":["fallback"]}}]}`
				req := recommend.ApiGetRecommendationsRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.GetRecommendations(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/indexes/*/recommendations")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"requests":[{"indexName":"indexName","model":"trending-items","threshold":42,"maxRecommendations":10,"facetName":"myFacetName","facetValue":"myFacetValue","queryParameters":{"query":"myQuery","facetFilters":["query"]},"fallbackParameters":{"query":"myQuery","facetFilters":["fallback"]}}]}`)
			},
		},
		{
			name: "get multiple recommendations with minimal parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"requests":[{"indexName":"indexName1","objectID":"objectID1","model":"related-products","threshold":21},{"indexName":"indexName2","objectID":"objectID2","model":"related-products","threshold":21}]}`
				req := recommend.ApiGetRecommendationsRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.GetRecommendations(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/indexes/*/recommendations")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"requests":[{"indexName":"indexName1","objectID":"objectID1","model":"related-products","threshold":21},{"indexName":"indexName2","objectID":"objectID2","model":"related-products","threshold":21}]}`)
			},
		},
		{
			name: "get multiple recommendations with all parameters",
			testFunc: func(t *testing.T) {
				parametersStr := `{"requests":[{"indexName":"indexName1","objectID":"objectID1","model":"related-products","threshold":21,"maxRecommendations":10,"queryParameters":{"query":"myQuery","facetFilters":["query1"]},"fallbackParameters":{"query":"myQuery","facetFilters":["fallback1"]}},{"indexName":"indexName2","objectID":"objectID2","model":"related-products","threshold":21,"maxRecommendations":10,"queryParameters":{"query":"myQuery","facetFilters":["query2"]},"fallbackParameters":{"query":"myQuery","facetFilters":["fallback2"]}}]}`
				req := recommend.ApiGetRecommendationsRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.GetRecommendations(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/indexes/*/recommendations")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"requests":[{"indexName":"indexName1","objectID":"objectID1","model":"related-products","threshold":21,"maxRecommendations":10,"queryParameters":{"query":"myQuery","facetFilters":["query1"]},"fallbackParameters":{"query":"myQuery","facetFilters":["fallback1"]}},{"indexName":"indexName2","objectID":"objectID2","model":"related-products","threshold":21,"maxRecommendations":10,"queryParameters":{"query":"myQuery","facetFilters":["query2"]},"fallbackParameters":{"query":"myQuery","facetFilters":["fallback2"]}}]}`)
			},
		},
		{
			name: "get frequently bought together recommendations",
			testFunc: func(t *testing.T) {
				parametersStr := `{"requests":[{"indexName":"indexName1","objectID":"objectID1","model":"bought-together","threshold":42}]}`
				req := recommend.ApiGetRecommendationsRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.GetRecommendations(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/indexes/*/recommendations")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{"requests":[{"indexName":"indexName1","objectID":"objectID1","model":"bought-together","threshold":42}]}`)
			},
		},
	}
	for _, test := range tests {
		test := test
		t.Run(test.name, func(t *testing.T) {
			test.testFunc(t)
		})
	}
}

func TestRecommend_SearchRecommendRules(t *testing.T) {
	client, echo := createRecommendClient()

	tests := []struct {
		name     string
		testFunc func(t *testing.T)
	}{
		{
			name: "searchRecommendRules0",
			testFunc: func(t *testing.T) {
				parametersStr := `{"indexName":"indexName","model":"related-products"}`
				req := recommend.ApiSearchRecommendRulesRequest{}
				require.NoError(t, json.Unmarshal([]byte(parametersStr), &req))
				_, err := client.SearchRecommendRules(req)
				require.NoError(t, err)

				expectedPath, err := url.QueryUnescape("/1/indexes/indexName/related-products/recommend/rules/search")
				require.NoError(t, err)
				require.Equal(t, expectedPath, echo.path)
				require.Equal(t, "POST", echo.method)

				ja := jsonassert.New(t)
				ja.Assertf(*echo.body, `{}`)
			},
		},
	}
	for _, test := range tests {
		test := test
		t.Run(test.name, func(t *testing.T) {
			test.testFunc(t)
		})
	}
}
