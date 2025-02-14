// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package ingestion

import (
	"encoding/json"
	"fmt"
)

// ListAuthenticationsResponse struct for ListAuthenticationsResponse.
type ListAuthenticationsResponse struct {
	Authentications []Authentication `json:"authentications"`
	Pagination      Pagination       `json:"pagination"`
}

// NewListAuthenticationsResponse instantiates a new ListAuthenticationsResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewListAuthenticationsResponse(authentications []Authentication, pagination Pagination) *ListAuthenticationsResponse {
	this := &ListAuthenticationsResponse{}
	this.Authentications = authentications
	this.Pagination = pagination
	return this
}

// NewListAuthenticationsResponseWithDefaults instantiates a new ListAuthenticationsResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewListAuthenticationsResponseWithDefaults() *ListAuthenticationsResponse {
	this := &ListAuthenticationsResponse{}
	return this
}

// GetAuthentications returns the Authentications field value.
func (o *ListAuthenticationsResponse) GetAuthentications() []Authentication {
	if o == nil {
		var ret []Authentication
		return ret
	}

	return o.Authentications
}

// GetAuthenticationsOk returns a tuple with the Authentications field value
// and a boolean to check if the value has been set.
func (o *ListAuthenticationsResponse) GetAuthenticationsOk() ([]Authentication, bool) {
	if o == nil {
		return nil, false
	}
	return o.Authentications, true
}

// SetAuthentications sets field value.
func (o *ListAuthenticationsResponse) SetAuthentications(v []Authentication) {
	o.Authentications = v
}

// GetPagination returns the Pagination field value.
func (o *ListAuthenticationsResponse) GetPagination() Pagination {
	if o == nil {
		var ret Pagination
		return ret
	}

	return o.Pagination
}

// GetPaginationOk returns a tuple with the Pagination field value
// and a boolean to check if the value has been set.
func (o *ListAuthenticationsResponse) GetPaginationOk() (*Pagination, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Pagination, true
}

// SetPagination sets field value.
func (o *ListAuthenticationsResponse) SetPagination(v Pagination) {
	o.Pagination = v
}

func (o ListAuthenticationsResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["authentications"] = o.Authentications
	}
	if true {
		toSerialize["pagination"] = o.Pagination
	}
	return json.Marshal(toSerialize)
}

func (o ListAuthenticationsResponse) String() string {
	out := ""
	out += fmt.Sprintf("  authentications=%v\n", o.Authentications)
	out += fmt.Sprintf("  pagination=%v\n", o.Pagination)
	return fmt.Sprintf("ListAuthenticationsResponse {\n%s}", out)
}

type NullableListAuthenticationsResponse struct {
	value *ListAuthenticationsResponse
	isSet bool
}

func (v NullableListAuthenticationsResponse) Get() *ListAuthenticationsResponse {
	return v.value
}

func (v *NullableListAuthenticationsResponse) Set(val *ListAuthenticationsResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableListAuthenticationsResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableListAuthenticationsResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableListAuthenticationsResponse(val *ListAuthenticationsResponse) *NullableListAuthenticationsResponse {
	return &NullableListAuthenticationsResponse{value: val, isSet: true}
}

func (v NullableListAuthenticationsResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableListAuthenticationsResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
