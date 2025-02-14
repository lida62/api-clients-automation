// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package ingestion

import (
	"encoding/json"
	"fmt"
)

// SourceCreateResponse struct for SourceCreateResponse.
type SourceCreateResponse struct {
	// The source UUID.
	SourceID string `json:"sourceID"`
	Name     string `json:"name"`
	// Date of creation (RFC3339 format).
	CreatedAt string `json:"createdAt"`
}

// NewSourceCreateResponse instantiates a new SourceCreateResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewSourceCreateResponse(sourceID string, name string, createdAt string) *SourceCreateResponse {
	this := &SourceCreateResponse{}
	this.SourceID = sourceID
	this.Name = name
	this.CreatedAt = createdAt
	return this
}

// NewSourceCreateResponseWithDefaults instantiates a new SourceCreateResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewSourceCreateResponseWithDefaults() *SourceCreateResponse {
	this := &SourceCreateResponse{}
	return this
}

// GetSourceID returns the SourceID field value.
func (o *SourceCreateResponse) GetSourceID() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SourceID
}

// GetSourceIDOk returns a tuple with the SourceID field value
// and a boolean to check if the value has been set.
func (o *SourceCreateResponse) GetSourceIDOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SourceID, true
}

// SetSourceID sets field value.
func (o *SourceCreateResponse) SetSourceID(v string) {
	o.SourceID = v
}

// GetName returns the Name field value.
func (o *SourceCreateResponse) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *SourceCreateResponse) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value.
func (o *SourceCreateResponse) SetName(v string) {
	o.Name = v
}

// GetCreatedAt returns the CreatedAt field value.
func (o *SourceCreateResponse) GetCreatedAt() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value
// and a boolean to check if the value has been set.
func (o *SourceCreateResponse) GetCreatedAtOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CreatedAt, true
}

// SetCreatedAt sets field value.
func (o *SourceCreateResponse) SetCreatedAt(v string) {
	o.CreatedAt = v
}

func (o SourceCreateResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["sourceID"] = o.SourceID
	}
	if true {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["createdAt"] = o.CreatedAt
	}
	return json.Marshal(toSerialize)
}

func (o SourceCreateResponse) String() string {
	out := ""
	out += fmt.Sprintf("  sourceID=%v\n", o.SourceID)
	out += fmt.Sprintf("  name=%v\n", o.Name)
	out += fmt.Sprintf("  createdAt=%v\n", o.CreatedAt)
	return fmt.Sprintf("SourceCreateResponse {\n%s}", out)
}

type NullableSourceCreateResponse struct {
	value *SourceCreateResponse
	isSet bool
}

func (v NullableSourceCreateResponse) Get() *SourceCreateResponse {
	return v.value
}

func (v *NullableSourceCreateResponse) Set(val *SourceCreateResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableSourceCreateResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableSourceCreateResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSourceCreateResponse(val *SourceCreateResponse) *NullableSourceCreateResponse {
	return &NullableSourceCreateResponse{value: val, isSet: true}
}

func (v NullableSourceCreateResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSourceCreateResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
