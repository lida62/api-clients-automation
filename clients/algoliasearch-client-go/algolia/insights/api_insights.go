// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package insights

import (
	"bytes"
	"context"
	"encoding/json"
	"io"
	"net/http"
	"net/url"
	"strings"

	"github.com/algolia/algoliasearch-client-go/v4/algolia/call"
)

type Option struct {
	optionType string
	name       string
	value      string
}

func QueryParamOption(name string, val any) Option {
	return Option{
		optionType: "query",
		name:       name,
		value:      parameterToString(val),
	}
}

func HeaderParamOption(name string, val any) Option {
	return Option{
		optionType: "header",
		name:       name,
		value:      parameterToString(val),
	}
}

func (r *ApiCustomDeleteRequest) UnmarshalJSON(b []byte) error {
	req := map[string]json.RawMessage{}
	err := json.Unmarshal(b, &req)
	if err != nil {
		return err
	}
	if v, ok := req["path"]; ok {
		err = json.Unmarshal(v, &r.path)
		if err != nil {
			err = json.Unmarshal(b, &r.path)
			if err != nil {
				return err
			}
		}
	}
	if v, ok := req["parameters"]; ok {
		err = json.Unmarshal(v, &r.parameters)
		if err != nil {
			err = json.Unmarshal(b, &r.parameters)
			if err != nil {
				return err
			}
		}
	}

	return nil
}

// ApiCustomDeleteRequest represents the request with all the parameters for the API call.
type ApiCustomDeleteRequest struct {
	path       string
	parameters map[string]interface{}
}

// NewApiCustomDeleteRequest creates an instance of the ApiCustomDeleteRequest to be used for the API call.
func (c *APIClient) NewApiCustomDeleteRequest(path string) ApiCustomDeleteRequest {
	return ApiCustomDeleteRequest{
		path: path,
	}
}

// WithParameters adds the parameters to the ApiCustomDeleteRequest and returns the request for chaining.
func (r ApiCustomDeleteRequest) WithParameters(parameters map[string]interface{}) ApiCustomDeleteRequest {
	r.parameters = parameters
	return r
}

/*
CustomDelete Send requests to the Algolia REST API. Wraps CustomDeleteWithContext using context.Background.

This method allow you to send requests to the Algolia REST API.

Request can be constructed by NewApiCustomDeleteRequest with parameters below.

	@param path string - Path of the endpoint, anything after \"/1\" must be specified.
	@param parameters map[string]interface{} - Query parameters to apply to the current query.
	@return map[string]interface{}
*/
func (c *APIClient) CustomDelete(r ApiCustomDeleteRequest, opts ...Option) (map[string]interface{}, error) {
	return c.CustomDeleteWithContext(context.Background(), r, opts...)
}

/*
CustomDelete Send requests to the Algolia REST API.

This method allow you to send requests to the Algolia REST API.

Request can be constructed by NewApiCustomDeleteRequest with parameters below.

	@param path string - Path of the endpoint, anything after \"/1\" must be specified.
	@param parameters map[string]interface{} - Query parameters to apply to the current query.
	@return map[string]interface{}
*/
func (c *APIClient) CustomDeleteWithContext(ctx context.Context, r ApiCustomDeleteRequest, opts ...Option) (map[string]interface{}, error) {
	var (
		postBody    any
		returnValue map[string]interface{}
	)

	requestPath := "/1{path}"
	requestPath = strings.ReplaceAll(requestPath, "{"+"path"+"}", url.PathEscape(parameterToString(r.path)))

	headers := make(map[string]string)
	queryParams := url.Values{}

	if !isNilorEmpty(r.parameters) {
		for k, v := range r.parameters {
			queryParams.Set(k, parameterToString(v))
		}
	}

	// optional params if any
	for _, opt := range opts {
		switch opt.optionType {
		case "query":
			queryParams.Set(opt.name, opt.value)
		case "header":
			headers[opt.name] = opt.value
		}
	}

	req, err := c.prepareRequest(ctx, requestPath, http.MethodDelete, postBody, headers, queryParams)
	if err != nil {
		return returnValue, err
	}

	res, err := c.callAPI(req, call.Write)
	if err != nil {
		return returnValue, err
	}
	if res == nil {
		return returnValue, reportError("res is nil")
	}

	resBody, err := io.ReadAll(res.Body)
	res.Body.Close()
	res.Body = io.NopCloser(bytes.NewBuffer(resBody))
	if err != nil {
		return returnValue, err
	}

	if res.StatusCode >= 300 {
		newErr := &APIError{
			Message: string(resBody),
			Status:  res.StatusCode,
		}

		var v ErrorBase
		err = c.decode(&v, resBody, res.Header.Get("Content-Type"))
		if err != nil {
			newErr.Message = err.Error()
			return returnValue, newErr
		}

		return returnValue, newErr
	}

	err = c.decode(&returnValue, resBody, res.Header.Get("Content-Type"))
	if err != nil {
		return returnValue, reportError("cannot decode result: %w", err)
	}

	return returnValue, nil
}

func (r *ApiCustomGetRequest) UnmarshalJSON(b []byte) error {
	req := map[string]json.RawMessage{}
	err := json.Unmarshal(b, &req)
	if err != nil {
		return err
	}
	if v, ok := req["path"]; ok {
		err = json.Unmarshal(v, &r.path)
		if err != nil {
			err = json.Unmarshal(b, &r.path)
			if err != nil {
				return err
			}
		}
	}
	if v, ok := req["parameters"]; ok {
		err = json.Unmarshal(v, &r.parameters)
		if err != nil {
			err = json.Unmarshal(b, &r.parameters)
			if err != nil {
				return err
			}
		}
	}

	return nil
}

// ApiCustomGetRequest represents the request with all the parameters for the API call.
type ApiCustomGetRequest struct {
	path       string
	parameters map[string]interface{}
}

// NewApiCustomGetRequest creates an instance of the ApiCustomGetRequest to be used for the API call.
func (c *APIClient) NewApiCustomGetRequest(path string) ApiCustomGetRequest {
	return ApiCustomGetRequest{
		path: path,
	}
}

// WithParameters adds the parameters to the ApiCustomGetRequest and returns the request for chaining.
func (r ApiCustomGetRequest) WithParameters(parameters map[string]interface{}) ApiCustomGetRequest {
	r.parameters = parameters
	return r
}

/*
CustomGet Send requests to the Algolia REST API. Wraps CustomGetWithContext using context.Background.

This method allow you to send requests to the Algolia REST API.

Request can be constructed by NewApiCustomGetRequest with parameters below.

	@param path string - Path of the endpoint, anything after \"/1\" must be specified.
	@param parameters map[string]interface{} - Query parameters to apply to the current query.
	@return map[string]interface{}
*/
func (c *APIClient) CustomGet(r ApiCustomGetRequest, opts ...Option) (map[string]interface{}, error) {
	return c.CustomGetWithContext(context.Background(), r, opts...)
}

/*
CustomGet Send requests to the Algolia REST API.

This method allow you to send requests to the Algolia REST API.

Request can be constructed by NewApiCustomGetRequest with parameters below.

	@param path string - Path of the endpoint, anything after \"/1\" must be specified.
	@param parameters map[string]interface{} - Query parameters to apply to the current query.
	@return map[string]interface{}
*/
func (c *APIClient) CustomGetWithContext(ctx context.Context, r ApiCustomGetRequest, opts ...Option) (map[string]interface{}, error) {
	var (
		postBody    any
		returnValue map[string]interface{}
	)

	requestPath := "/1{path}"
	requestPath = strings.ReplaceAll(requestPath, "{"+"path"+"}", url.PathEscape(parameterToString(r.path)))

	headers := make(map[string]string)
	queryParams := url.Values{}

	if !isNilorEmpty(r.parameters) {
		for k, v := range r.parameters {
			queryParams.Set(k, parameterToString(v))
		}
	}

	// optional params if any
	for _, opt := range opts {
		switch opt.optionType {
		case "query":
			queryParams.Set(opt.name, opt.value)
		case "header":
			headers[opt.name] = opt.value
		}
	}

	req, err := c.prepareRequest(ctx, requestPath, http.MethodGet, postBody, headers, queryParams)
	if err != nil {
		return returnValue, err
	}

	res, err := c.callAPI(req, call.Write)
	if err != nil {
		return returnValue, err
	}
	if res == nil {
		return returnValue, reportError("res is nil")
	}

	resBody, err := io.ReadAll(res.Body)
	res.Body.Close()
	res.Body = io.NopCloser(bytes.NewBuffer(resBody))
	if err != nil {
		return returnValue, err
	}

	if res.StatusCode >= 300 {
		newErr := &APIError{
			Message: string(resBody),
			Status:  res.StatusCode,
		}

		var v ErrorBase
		err = c.decode(&v, resBody, res.Header.Get("Content-Type"))
		if err != nil {
			newErr.Message = err.Error()
			return returnValue, newErr
		}

		return returnValue, newErr
	}

	err = c.decode(&returnValue, resBody, res.Header.Get("Content-Type"))
	if err != nil {
		return returnValue, reportError("cannot decode result: %w", err)
	}

	return returnValue, nil
}

func (r *ApiCustomPostRequest) UnmarshalJSON(b []byte) error {
	req := map[string]json.RawMessage{}
	err := json.Unmarshal(b, &req)
	if err != nil {
		return err
	}
	if v, ok := req["path"]; ok {
		err = json.Unmarshal(v, &r.path)
		if err != nil {
			err = json.Unmarshal(b, &r.path)
			if err != nil {
				return err
			}
		}
	}
	if v, ok := req["parameters"]; ok {
		err = json.Unmarshal(v, &r.parameters)
		if err != nil {
			err = json.Unmarshal(b, &r.parameters)
			if err != nil {
				return err
			}
		}
	}
	if v, ok := req["body"]; ok {
		err = json.Unmarshal(v, &r.body)
		if err != nil {
			err = json.Unmarshal(b, &r.body)
			if err != nil {
				return err
			}
		}
	}

	return nil
}

// ApiCustomPostRequest represents the request with all the parameters for the API call.
type ApiCustomPostRequest struct {
	path       string
	parameters map[string]interface{}
	body       map[string]interface{}
}

// NewApiCustomPostRequest creates an instance of the ApiCustomPostRequest to be used for the API call.
func (c *APIClient) NewApiCustomPostRequest(path string) ApiCustomPostRequest {
	return ApiCustomPostRequest{
		path: path,
	}
}

// WithParameters adds the parameters to the ApiCustomPostRequest and returns the request for chaining.
func (r ApiCustomPostRequest) WithParameters(parameters map[string]interface{}) ApiCustomPostRequest {
	r.parameters = parameters
	return r
}

// WithBody adds the body to the ApiCustomPostRequest and returns the request for chaining.
func (r ApiCustomPostRequest) WithBody(body map[string]interface{}) ApiCustomPostRequest {
	r.body = body
	return r
}

/*
CustomPost Send requests to the Algolia REST API. Wraps CustomPostWithContext using context.Background.

This method allow you to send requests to the Algolia REST API.

Request can be constructed by NewApiCustomPostRequest with parameters below.

	@param path string - Path of the endpoint, anything after \"/1\" must be specified.
	@param parameters map[string]interface{} - Query parameters to apply to the current query.
	@param body map[string]interface{} - Parameters to send with the custom request.
	@return map[string]interface{}
*/
func (c *APIClient) CustomPost(r ApiCustomPostRequest, opts ...Option) (map[string]interface{}, error) {
	return c.CustomPostWithContext(context.Background(), r, opts...)
}

/*
CustomPost Send requests to the Algolia REST API.

This method allow you to send requests to the Algolia REST API.

Request can be constructed by NewApiCustomPostRequest with parameters below.

	@param path string - Path of the endpoint, anything after \"/1\" must be specified.
	@param parameters map[string]interface{} - Query parameters to apply to the current query.
	@param body map[string]interface{} - Parameters to send with the custom request.
	@return map[string]interface{}
*/
func (c *APIClient) CustomPostWithContext(ctx context.Context, r ApiCustomPostRequest, opts ...Option) (map[string]interface{}, error) {
	var (
		postBody    any
		returnValue map[string]interface{}
	)

	requestPath := "/1{path}"
	requestPath = strings.ReplaceAll(requestPath, "{"+"path"+"}", url.PathEscape(parameterToString(r.path)))

	headers := make(map[string]string)
	queryParams := url.Values{}

	if !isNilorEmpty(r.parameters) {
		for k, v := range r.parameters {
			queryParams.Set(k, parameterToString(v))
		}
	}

	// optional params if any
	for _, opt := range opts {
		switch opt.optionType {
		case "query":
			queryParams.Set(opt.name, opt.value)
		case "header":
			headers[opt.name] = opt.value
		}
	}

	// body params
	if isNilorEmpty(r.body) {
		postBody = "{}"
	} else {
		postBody = r.body
	}
	req, err := c.prepareRequest(ctx, requestPath, http.MethodPost, postBody, headers, queryParams)
	if err != nil {
		return returnValue, err
	}

	res, err := c.callAPI(req, call.Write)
	if err != nil {
		return returnValue, err
	}
	if res == nil {
		return returnValue, reportError("res is nil")
	}

	resBody, err := io.ReadAll(res.Body)
	res.Body.Close()
	res.Body = io.NopCloser(bytes.NewBuffer(resBody))
	if err != nil {
		return returnValue, err
	}

	if res.StatusCode >= 300 {
		newErr := &APIError{
			Message: string(resBody),
			Status:  res.StatusCode,
		}

		var v ErrorBase
		err = c.decode(&v, resBody, res.Header.Get("Content-Type"))
		if err != nil {
			newErr.Message = err.Error()
			return returnValue, newErr
		}

		return returnValue, newErr
	}

	err = c.decode(&returnValue, resBody, res.Header.Get("Content-Type"))
	if err != nil {
		return returnValue, reportError("cannot decode result: %w", err)
	}

	return returnValue, nil
}

func (r *ApiCustomPutRequest) UnmarshalJSON(b []byte) error {
	req := map[string]json.RawMessage{}
	err := json.Unmarshal(b, &req)
	if err != nil {
		return err
	}
	if v, ok := req["path"]; ok {
		err = json.Unmarshal(v, &r.path)
		if err != nil {
			err = json.Unmarshal(b, &r.path)
			if err != nil {
				return err
			}
		}
	}
	if v, ok := req["parameters"]; ok {
		err = json.Unmarshal(v, &r.parameters)
		if err != nil {
			err = json.Unmarshal(b, &r.parameters)
			if err != nil {
				return err
			}
		}
	}
	if v, ok := req["body"]; ok {
		err = json.Unmarshal(v, &r.body)
		if err != nil {
			err = json.Unmarshal(b, &r.body)
			if err != nil {
				return err
			}
		}
	}

	return nil
}

// ApiCustomPutRequest represents the request with all the parameters for the API call.
type ApiCustomPutRequest struct {
	path       string
	parameters map[string]interface{}
	body       map[string]interface{}
}

// NewApiCustomPutRequest creates an instance of the ApiCustomPutRequest to be used for the API call.
func (c *APIClient) NewApiCustomPutRequest(path string) ApiCustomPutRequest {
	return ApiCustomPutRequest{
		path: path,
	}
}

// WithParameters adds the parameters to the ApiCustomPutRequest and returns the request for chaining.
func (r ApiCustomPutRequest) WithParameters(parameters map[string]interface{}) ApiCustomPutRequest {
	r.parameters = parameters
	return r
}

// WithBody adds the body to the ApiCustomPutRequest and returns the request for chaining.
func (r ApiCustomPutRequest) WithBody(body map[string]interface{}) ApiCustomPutRequest {
	r.body = body
	return r
}

/*
CustomPut Send requests to the Algolia REST API. Wraps CustomPutWithContext using context.Background.

This method allow you to send requests to the Algolia REST API.

Request can be constructed by NewApiCustomPutRequest with parameters below.

	@param path string - Path of the endpoint, anything after \"/1\" must be specified.
	@param parameters map[string]interface{} - Query parameters to apply to the current query.
	@param body map[string]interface{} - Parameters to send with the custom request.
	@return map[string]interface{}
*/
func (c *APIClient) CustomPut(r ApiCustomPutRequest, opts ...Option) (map[string]interface{}, error) {
	return c.CustomPutWithContext(context.Background(), r, opts...)
}

/*
CustomPut Send requests to the Algolia REST API.

This method allow you to send requests to the Algolia REST API.

Request can be constructed by NewApiCustomPutRequest with parameters below.

	@param path string - Path of the endpoint, anything after \"/1\" must be specified.
	@param parameters map[string]interface{} - Query parameters to apply to the current query.
	@param body map[string]interface{} - Parameters to send with the custom request.
	@return map[string]interface{}
*/
func (c *APIClient) CustomPutWithContext(ctx context.Context, r ApiCustomPutRequest, opts ...Option) (map[string]interface{}, error) {
	var (
		postBody    any
		returnValue map[string]interface{}
	)

	requestPath := "/1{path}"
	requestPath = strings.ReplaceAll(requestPath, "{"+"path"+"}", url.PathEscape(parameterToString(r.path)))

	headers := make(map[string]string)
	queryParams := url.Values{}

	if !isNilorEmpty(r.parameters) {
		for k, v := range r.parameters {
			queryParams.Set(k, parameterToString(v))
		}
	}

	// optional params if any
	for _, opt := range opts {
		switch opt.optionType {
		case "query":
			queryParams.Set(opt.name, opt.value)
		case "header":
			headers[opt.name] = opt.value
		}
	}

	// body params
	if isNilorEmpty(r.body) {
		postBody = "{}"
	} else {
		postBody = r.body
	}
	req, err := c.prepareRequest(ctx, requestPath, http.MethodPut, postBody, headers, queryParams)
	if err != nil {
		return returnValue, err
	}

	res, err := c.callAPI(req, call.Write)
	if err != nil {
		return returnValue, err
	}
	if res == nil {
		return returnValue, reportError("res is nil")
	}

	resBody, err := io.ReadAll(res.Body)
	res.Body.Close()
	res.Body = io.NopCloser(bytes.NewBuffer(resBody))
	if err != nil {
		return returnValue, err
	}

	if res.StatusCode >= 300 {
		newErr := &APIError{
			Message: string(resBody),
			Status:  res.StatusCode,
		}

		var v ErrorBase
		err = c.decode(&v, resBody, res.Header.Get("Content-Type"))
		if err != nil {
			newErr.Message = err.Error()
			return returnValue, newErr
		}

		return returnValue, newErr
	}

	err = c.decode(&returnValue, resBody, res.Header.Get("Content-Type"))
	if err != nil {
		return returnValue, reportError("cannot decode result: %w", err)
	}

	return returnValue, nil
}

func (r *ApiPushEventsRequest) UnmarshalJSON(b []byte) error {
	req := map[string]json.RawMessage{}
	err := json.Unmarshal(b, &req)
	if err != nil {
		return err
	}
	if v, ok := req["insightsEvents"]; ok {
		err = json.Unmarshal(v, &r.insightsEvents)
		if err != nil {
			err = json.Unmarshal(b, &r.insightsEvents)
			if err != nil {
				return err
			}
		}
	} else {
		err = json.Unmarshal(b, &r.insightsEvents)
		if err != nil {
			return err
		}
	}

	return nil
}

// ApiPushEventsRequest represents the request with all the parameters for the API call.
type ApiPushEventsRequest struct {
	insightsEvents *InsightsEvents
}

// NewApiPushEventsRequest creates an instance of the ApiPushEventsRequest to be used for the API call.
func (c *APIClient) NewApiPushEventsRequest(insightsEvents *InsightsEvents) ApiPushEventsRequest {
	return ApiPushEventsRequest{
		insightsEvents: insightsEvents,
	}
}

/*
PushEvents Send events. Wraps PushEventsWithContext using context.Background.

Send a list of events to the Insights API.

You can include up to 1,000 events in a single request,
but the request body must be smaller than 2&nbsp;MB.

Request can be constructed by NewApiPushEventsRequest with parameters below.

	@param insightsEvents InsightsEvents
	@return EventsResponse
*/
func (c *APIClient) PushEvents(r ApiPushEventsRequest, opts ...Option) (*EventsResponse, error) {
	return c.PushEventsWithContext(context.Background(), r, opts...)
}

/*
PushEvents Send events.

Send a list of events to the Insights API.

You can include up to 1,000 events in a single request,
but the request body must be smaller than 2&nbsp;MB.

Request can be constructed by NewApiPushEventsRequest with parameters below.

	@param insightsEvents InsightsEvents
	@return EventsResponse
*/
func (c *APIClient) PushEventsWithContext(ctx context.Context, r ApiPushEventsRequest, opts ...Option) (*EventsResponse, error) {
	var (
		postBody    any
		returnValue *EventsResponse
	)

	requestPath := "/1/events"

	headers := make(map[string]string)
	queryParams := url.Values{}
	if r.insightsEvents == nil {
		return returnValue, reportError("insightsEvents is required and must be specified")
	}

	// optional params if any
	for _, opt := range opts {
		switch opt.optionType {
		case "query":
			queryParams.Set(opt.name, opt.value)
		case "header":
			headers[opt.name] = opt.value
		}
	}

	// body params
	postBody = r.insightsEvents
	req, err := c.prepareRequest(ctx, requestPath, http.MethodPost, postBody, headers, queryParams)
	if err != nil {
		return returnValue, err
	}

	res, err := c.callAPI(req, call.Write)
	if err != nil {
		return returnValue, err
	}
	if res == nil {
		return returnValue, reportError("res is nil")
	}

	resBody, err := io.ReadAll(res.Body)
	res.Body.Close()
	res.Body = io.NopCloser(bytes.NewBuffer(resBody))
	if err != nil {
		return returnValue, err
	}

	if res.StatusCode >= 300 {
		newErr := &APIError{
			Message: string(resBody),
			Status:  res.StatusCode,
		}

		var v ErrorBase
		err = c.decode(&v, resBody, res.Header.Get("Content-Type"))
		if err != nil {
			newErr.Message = err.Error()
			return returnValue, newErr
		}

		return returnValue, newErr
	}

	err = c.decode(&returnValue, resBody, res.Header.Get("Content-Type"))
	if err != nil {
		return returnValue, reportError("cannot decode result: %w", err)
	}

	return returnValue, nil
}
