// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package ingestion

import (
	"encoding/json"
	"fmt"
)

// TaskInput - struct for TaskInput.
type TaskInput struct {
	OnDemandDateUtilsInput *OnDemandDateUtilsInput
	ScheduleDateUtilsInput *ScheduleDateUtilsInput
}

// OnDemandDateUtilsInputAsTaskInput is a convenience function that returns OnDemandDateUtilsInput wrapped in TaskInput.
func OnDemandDateUtilsInputAsTaskInput(v *OnDemandDateUtilsInput) TaskInput {
	return TaskInput{
		OnDemandDateUtilsInput: v,
	}
}

// ScheduleDateUtilsInputAsTaskInput is a convenience function that returns ScheduleDateUtilsInput wrapped in TaskInput.
func ScheduleDateUtilsInputAsTaskInput(v *ScheduleDateUtilsInput) TaskInput {
	return TaskInput{
		ScheduleDateUtilsInput: v,
	}
}

// Unmarshal JSON data into one of the pointers in the struct.
func (dst *TaskInput) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal data into OnDemandDateUtilsInput
	err = newStrictDecoder(data).Decode(&dst.OnDemandDateUtilsInput)
	if err == nil && validateStruct(dst.OnDemandDateUtilsInput) == nil {
		jsonOnDemandDateUtilsInput, _ := json.Marshal(dst.OnDemandDateUtilsInput)
		if string(jsonOnDemandDateUtilsInput) == "{}" { // empty struct
			dst.OnDemandDateUtilsInput = nil
		} else {
			return nil
		}
	} else {
		dst.OnDemandDateUtilsInput = nil
	}

	// try to unmarshal data into ScheduleDateUtilsInput
	err = newStrictDecoder(data).Decode(&dst.ScheduleDateUtilsInput)
	if err == nil && validateStruct(dst.ScheduleDateUtilsInput) == nil {
		jsonScheduleDateUtilsInput, _ := json.Marshal(dst.ScheduleDateUtilsInput)
		if string(jsonScheduleDateUtilsInput) == "{}" { // empty struct
			dst.ScheduleDateUtilsInput = nil
		} else {
			return nil
		}
	} else {
		dst.ScheduleDateUtilsInput = nil
	}

	return fmt.Errorf("Data failed to match schemas in oneOf(TaskInput)")
}

// Marshal data from the first non-nil pointers in the struct to JSON.
func (src TaskInput) MarshalJSON() ([]byte, error) {
	if src.OnDemandDateUtilsInput != nil {
		return json.Marshal(&src.OnDemandDateUtilsInput)
	}

	if src.ScheduleDateUtilsInput != nil {
		return json.Marshal(&src.ScheduleDateUtilsInput)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance.
func (obj *TaskInput) GetActualInstance() any {
	if obj == nil {
		return nil
	}
	if obj.OnDemandDateUtilsInput != nil {
		return obj.OnDemandDateUtilsInput
	}

	if obj.ScheduleDateUtilsInput != nil {
		return obj.ScheduleDateUtilsInput
	}

	// all schemas are nil
	return nil
}

type NullableTaskInput struct {
	value *TaskInput
	isSet bool
}

func (v NullableTaskInput) Get() *TaskInput {
	return v.value
}

func (v *NullableTaskInput) Set(val *TaskInput) {
	v.value = val
	v.isSet = true
}

func (v NullableTaskInput) IsSet() bool {
	return v.isSet
}

func (v *NullableTaskInput) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTaskInput(val *TaskInput) *NullableTaskInput {
	return &NullableTaskInput{value: val, isSet: true}
}

func (v NullableTaskInput) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTaskInput) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
