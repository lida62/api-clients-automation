// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package ingestion

import (
	"encoding/json"
	"fmt"
)

// OnDemandTriggerInput The trigger information of a task of type `onDemand`.
type OnDemandTriggerInput struct {
	Type OnDemandTriggerType `json:"type"`
}

// NewOnDemandTriggerInput instantiates a new OnDemandTriggerInput object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewOnDemandTriggerInput(type_ OnDemandTriggerType) *OnDemandTriggerInput {
	this := &OnDemandTriggerInput{}
	this.Type = type_
	return this
}

// NewOnDemandTriggerInputWithDefaults instantiates a new OnDemandTriggerInput object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewOnDemandTriggerInputWithDefaults() *OnDemandTriggerInput {
	this := &OnDemandTriggerInput{}
	return this
}

// GetType returns the Type field value.
func (o *OnDemandTriggerInput) GetType() OnDemandTriggerType {
	if o == nil {
		var ret OnDemandTriggerType
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *OnDemandTriggerInput) GetTypeOk() (*OnDemandTriggerType, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value.
func (o *OnDemandTriggerInput) SetType(v OnDemandTriggerType) {
	o.Type = v
}

func (o OnDemandTriggerInput) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["type"] = o.Type
	}
	return json.Marshal(toSerialize)
}

func (o OnDemandTriggerInput) String() string {
	out := ""
	out += fmt.Sprintf("  type=%v\n", o.Type)
	return fmt.Sprintf("OnDemandTriggerInput {\n%s}", out)
}

type NullableOnDemandTriggerInput struct {
	value *OnDemandTriggerInput
	isSet bool
}

func (v NullableOnDemandTriggerInput) Get() *OnDemandTriggerInput {
	return v.value
}

func (v *NullableOnDemandTriggerInput) Set(val *OnDemandTriggerInput) {
	v.value = val
	v.isSet = true
}

func (v NullableOnDemandTriggerInput) IsSet() bool {
	return v.isSet
}

func (v *NullableOnDemandTriggerInput) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOnDemandTriggerInput(val *OnDemandTriggerInput) *NullableOnDemandTriggerInput {
	return &NullableOnDemandTriggerInput{value: val, isSet: true}
}

func (v NullableOnDemandTriggerInput) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOnDemandTriggerInput) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
