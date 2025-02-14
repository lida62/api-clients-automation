// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package search

import (
	"encoding/json"
	"fmt"
)

// SaveSynonymResponse struct for SaveSynonymResponse.
type SaveSynonymResponse struct {
	// Unique identifier of a task. A successful API response means that a task was added to a queue. It might not run immediately. You can check the task's progress with the `task` operation and this `taskID`.
	TaskID int64 `json:"taskID"`
	// Timestamp of the last update in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
	UpdatedAt string `json:"updatedAt"`
	// Unique identifier of a synonym object.
	Id string `json:"id"`
}

// NewSaveSynonymResponse instantiates a new SaveSynonymResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewSaveSynonymResponse(taskID int64, updatedAt string, id string) *SaveSynonymResponse {
	this := &SaveSynonymResponse{}
	this.TaskID = taskID
	this.UpdatedAt = updatedAt
	this.Id = id
	return this
}

// NewSaveSynonymResponseWithDefaults instantiates a new SaveSynonymResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewSaveSynonymResponseWithDefaults() *SaveSynonymResponse {
	this := &SaveSynonymResponse{}
	return this
}

// GetTaskID returns the TaskID field value.
func (o *SaveSynonymResponse) GetTaskID() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.TaskID
}

// GetTaskIDOk returns a tuple with the TaskID field value
// and a boolean to check if the value has been set.
func (o *SaveSynonymResponse) GetTaskIDOk() (*int64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TaskID, true
}

// SetTaskID sets field value.
func (o *SaveSynonymResponse) SetTaskID(v int64) {
	o.TaskID = v
}

// GetUpdatedAt returns the UpdatedAt field value.
func (o *SaveSynonymResponse) GetUpdatedAt() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value
// and a boolean to check if the value has been set.
func (o *SaveSynonymResponse) GetUpdatedAtOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UpdatedAt, true
}

// SetUpdatedAt sets field value.
func (o *SaveSynonymResponse) SetUpdatedAt(v string) {
	o.UpdatedAt = v
}

// GetId returns the Id field value.
func (o *SaveSynonymResponse) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *SaveSynonymResponse) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value.
func (o *SaveSynonymResponse) SetId(v string) {
	o.Id = v
}

func (o SaveSynonymResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["taskID"] = o.TaskID
	}
	if true {
		toSerialize["updatedAt"] = o.UpdatedAt
	}
	if true {
		toSerialize["id"] = o.Id
	}
	return json.Marshal(toSerialize)
}

func (o SaveSynonymResponse) String() string {
	out := ""
	out += fmt.Sprintf("  taskID=%v\n", o.TaskID)
	out += fmt.Sprintf("  updatedAt=%v\n", o.UpdatedAt)
	out += fmt.Sprintf("  id=%v\n", o.Id)
	return fmt.Sprintf("SaveSynonymResponse {\n%s}", out)
}

type NullableSaveSynonymResponse struct {
	value *SaveSynonymResponse
	isSet bool
}

func (v NullableSaveSynonymResponse) Get() *SaveSynonymResponse {
	return v.value
}

func (v *NullableSaveSynonymResponse) Set(val *SaveSynonymResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableSaveSynonymResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableSaveSynonymResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSaveSynonymResponse(val *SaveSynonymResponse) *NullableSaveSynonymResponse {
	return &NullableSaveSynonymResponse{value: val, isSet: true}
}

func (v NullableSaveSynonymResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSaveSynonymResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
