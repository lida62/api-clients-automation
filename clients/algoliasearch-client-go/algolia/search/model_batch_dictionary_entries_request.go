// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package search

import (
	"encoding/json"
	"fmt"
)

// BatchDictionaryEntriesRequest struct for BatchDictionaryEntriesRequest.
type BatchDictionaryEntriesRequest struct {
	Action DictionaryAction `json:"action"`
	Body   DictionaryEntry  `json:"body"`
}

// NewBatchDictionaryEntriesRequest instantiates a new BatchDictionaryEntriesRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewBatchDictionaryEntriesRequest(action DictionaryAction, body DictionaryEntry) *BatchDictionaryEntriesRequest {
	this := &BatchDictionaryEntriesRequest{}
	this.Action = action
	this.Body = body
	return this
}

// NewBatchDictionaryEntriesRequestWithDefaults instantiates a new BatchDictionaryEntriesRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewBatchDictionaryEntriesRequestWithDefaults() *BatchDictionaryEntriesRequest {
	this := &BatchDictionaryEntriesRequest{}
	return this
}

// GetAction returns the Action field value.
func (o *BatchDictionaryEntriesRequest) GetAction() DictionaryAction {
	if o == nil {
		var ret DictionaryAction
		return ret
	}

	return o.Action
}

// GetActionOk returns a tuple with the Action field value
// and a boolean to check if the value has been set.
func (o *BatchDictionaryEntriesRequest) GetActionOk() (*DictionaryAction, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Action, true
}

// SetAction sets field value.
func (o *BatchDictionaryEntriesRequest) SetAction(v DictionaryAction) {
	o.Action = v
}

// GetBody returns the Body field value.
func (o *BatchDictionaryEntriesRequest) GetBody() DictionaryEntry {
	if o == nil {
		var ret DictionaryEntry
		return ret
	}

	return o.Body
}

// GetBodyOk returns a tuple with the Body field value
// and a boolean to check if the value has been set.
func (o *BatchDictionaryEntriesRequest) GetBodyOk() (*DictionaryEntry, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Body, true
}

// SetBody sets field value.
func (o *BatchDictionaryEntriesRequest) SetBody(v DictionaryEntry) {
	o.Body = v
}

func (o BatchDictionaryEntriesRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["action"] = o.Action
	}
	if true {
		toSerialize["body"] = o.Body
	}
	return json.Marshal(toSerialize)
}

func (o BatchDictionaryEntriesRequest) String() string {
	out := ""
	out += fmt.Sprintf("  action=%v\n", o.Action)
	out += fmt.Sprintf("  body=%v\n", o.Body)
	return fmt.Sprintf("BatchDictionaryEntriesRequest {\n%s}", out)
}

type NullableBatchDictionaryEntriesRequest struct {
	value *BatchDictionaryEntriesRequest
	isSet bool
}

func (v NullableBatchDictionaryEntriesRequest) Get() *BatchDictionaryEntriesRequest {
	return v.value
}

func (v *NullableBatchDictionaryEntriesRequest) Set(val *BatchDictionaryEntriesRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableBatchDictionaryEntriesRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableBatchDictionaryEntriesRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBatchDictionaryEntriesRequest(val *BatchDictionaryEntriesRequest) *NullableBatchDictionaryEntriesRequest {
	return &NullableBatchDictionaryEntriesRequest{value: val, isSet: true}
}

func (v NullableBatchDictionaryEntriesRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBatchDictionaryEntriesRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
