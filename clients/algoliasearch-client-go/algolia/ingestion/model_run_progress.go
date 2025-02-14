// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package ingestion

import (
	"encoding/json"
	"fmt"
)

// RunProgress struct for RunProgress.
type RunProgress struct {
	ExpectedNbOfEvents *int32 `json:"expectedNbOfEvents,omitempty"`
	ReceivedNbOfEvents *int32 `json:"receivedNbOfEvents,omitempty"`
}

type RunProgressOption func(f *RunProgress)

func WithRunProgressExpectedNbOfEvents(val int32) RunProgressOption {
	return func(f *RunProgress) {
		f.ExpectedNbOfEvents = &val
	}
}

func WithRunProgressReceivedNbOfEvents(val int32) RunProgressOption {
	return func(f *RunProgress) {
		f.ReceivedNbOfEvents = &val
	}
}

// NewRunProgress instantiates a new RunProgress object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewRunProgress(opts ...RunProgressOption) *RunProgress {
	this := &RunProgress{}
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewRunProgressWithDefaults instantiates a new RunProgress object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewRunProgressWithDefaults() *RunProgress {
	this := &RunProgress{}
	return this
}

// GetExpectedNbOfEvents returns the ExpectedNbOfEvents field value if set, zero value otherwise.
func (o *RunProgress) GetExpectedNbOfEvents() int32 {
	if o == nil || o.ExpectedNbOfEvents == nil {
		var ret int32
		return ret
	}
	return *o.ExpectedNbOfEvents
}

// GetExpectedNbOfEventsOk returns a tuple with the ExpectedNbOfEvents field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RunProgress) GetExpectedNbOfEventsOk() (*int32, bool) {
	if o == nil || o.ExpectedNbOfEvents == nil {
		return nil, false
	}
	return o.ExpectedNbOfEvents, true
}

// HasExpectedNbOfEvents returns a boolean if a field has been set.
func (o *RunProgress) HasExpectedNbOfEvents() bool {
	if o != nil && o.ExpectedNbOfEvents != nil {
		return true
	}

	return false
}

// SetExpectedNbOfEvents gets a reference to the given int32 and assigns it to the ExpectedNbOfEvents field.
func (o *RunProgress) SetExpectedNbOfEvents(v int32) {
	o.ExpectedNbOfEvents = &v
}

// GetReceivedNbOfEvents returns the ReceivedNbOfEvents field value if set, zero value otherwise.
func (o *RunProgress) GetReceivedNbOfEvents() int32 {
	if o == nil || o.ReceivedNbOfEvents == nil {
		var ret int32
		return ret
	}
	return *o.ReceivedNbOfEvents
}

// GetReceivedNbOfEventsOk returns a tuple with the ReceivedNbOfEvents field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RunProgress) GetReceivedNbOfEventsOk() (*int32, bool) {
	if o == nil || o.ReceivedNbOfEvents == nil {
		return nil, false
	}
	return o.ReceivedNbOfEvents, true
}

// HasReceivedNbOfEvents returns a boolean if a field has been set.
func (o *RunProgress) HasReceivedNbOfEvents() bool {
	if o != nil && o.ReceivedNbOfEvents != nil {
		return true
	}

	return false
}

// SetReceivedNbOfEvents gets a reference to the given int32 and assigns it to the ReceivedNbOfEvents field.
func (o *RunProgress) SetReceivedNbOfEvents(v int32) {
	o.ReceivedNbOfEvents = &v
}

func (o RunProgress) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if o.ExpectedNbOfEvents != nil {
		toSerialize["expectedNbOfEvents"] = o.ExpectedNbOfEvents
	}
	if o.ReceivedNbOfEvents != nil {
		toSerialize["receivedNbOfEvents"] = o.ReceivedNbOfEvents
	}
	return json.Marshal(toSerialize)
}

func (o RunProgress) String() string {
	out := ""
	out += fmt.Sprintf("  expectedNbOfEvents=%v\n", o.ExpectedNbOfEvents)
	out += fmt.Sprintf("  receivedNbOfEvents=%v\n", o.ReceivedNbOfEvents)
	return fmt.Sprintf("RunProgress {\n%s}", out)
}

type NullableRunProgress struct {
	value *RunProgress
	isSet bool
}

func (v NullableRunProgress) Get() *RunProgress {
	return v.value
}

func (v *NullableRunProgress) Set(val *RunProgress) {
	v.value = val
	v.isSet = true
}

func (v NullableRunProgress) IsSet() bool {
	return v.isSet
}

func (v *NullableRunProgress) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRunProgress(val *RunProgress) *NullableRunProgress {
	return &NullableRunProgress{value: val, isSet: true}
}

func (v NullableRunProgress) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRunProgress) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
