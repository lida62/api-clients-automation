// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package ingestion

import (
	"encoding/json"
	"fmt"
)

// SubscriptionTrigger The trigger input for a task of type 'subscription'.
type SubscriptionTrigger struct {
	Type SubscriptionTriggerType `json:"type"`
}

// NewSubscriptionTrigger instantiates a new SubscriptionTrigger object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewSubscriptionTrigger(type_ SubscriptionTriggerType) *SubscriptionTrigger {
	this := &SubscriptionTrigger{}
	this.Type = type_
	return this
}

// NewSubscriptionTriggerWithDefaults instantiates a new SubscriptionTrigger object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewSubscriptionTriggerWithDefaults() *SubscriptionTrigger {
	this := &SubscriptionTrigger{}
	return this
}

// GetType returns the Type field value.
func (o *SubscriptionTrigger) GetType() SubscriptionTriggerType {
	if o == nil {
		var ret SubscriptionTriggerType
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *SubscriptionTrigger) GetTypeOk() (*SubscriptionTriggerType, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value.
func (o *SubscriptionTrigger) SetType(v SubscriptionTriggerType) {
	o.Type = v
}

func (o SubscriptionTrigger) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["type"] = o.Type
	}
	return json.Marshal(toSerialize)
}

func (o SubscriptionTrigger) String() string {
	out := ""
	out += fmt.Sprintf("  type=%v\n", o.Type)
	return fmt.Sprintf("SubscriptionTrigger {\n%s}", out)
}

type NullableSubscriptionTrigger struct {
	value *SubscriptionTrigger
	isSet bool
}

func (v NullableSubscriptionTrigger) Get() *SubscriptionTrigger {
	return v.value
}

func (v *NullableSubscriptionTrigger) Set(val *SubscriptionTrigger) {
	v.value = val
	v.isSet = true
}

func (v NullableSubscriptionTrigger) IsSet() bool {
	return v.isSet
}

func (v *NullableSubscriptionTrigger) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSubscriptionTrigger(val *SubscriptionTrigger) *NullableSubscriptionTrigger {
	return &NullableSubscriptionTrigger{value: val, isSet: true}
}

func (v NullableSubscriptionTrigger) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSubscriptionTrigger) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
