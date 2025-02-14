// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package analytics

import (
	"encoding/json"
	"fmt"
)

// SearchEvent struct for SearchEvent.
type SearchEvent struct {
	// Date of the event in the format YYYY-MM-DD.
	Date string `json:"date"`
	// Number of occurrences.
	Count int32 `json:"count"`
}

// NewSearchEvent instantiates a new SearchEvent object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewSearchEvent(date string, count int32) *SearchEvent {
	this := &SearchEvent{}
	this.Date = date
	this.Count = count
	return this
}

// NewSearchEventWithDefaults instantiates a new SearchEvent object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewSearchEventWithDefaults() *SearchEvent {
	this := &SearchEvent{}
	return this
}

// GetDate returns the Date field value.
func (o *SearchEvent) GetDate() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Date
}

// GetDateOk returns a tuple with the Date field value
// and a boolean to check if the value has been set.
func (o *SearchEvent) GetDateOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Date, true
}

// SetDate sets field value.
func (o *SearchEvent) SetDate(v string) {
	o.Date = v
}

// GetCount returns the Count field value.
func (o *SearchEvent) GetCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Count
}

// GetCountOk returns a tuple with the Count field value
// and a boolean to check if the value has been set.
func (o *SearchEvent) GetCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Count, true
}

// SetCount sets field value.
func (o *SearchEvent) SetCount(v int32) {
	o.Count = v
}

func (o SearchEvent) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["date"] = o.Date
	}
	if true {
		toSerialize["count"] = o.Count
	}
	return json.Marshal(toSerialize)
}

func (o SearchEvent) String() string {
	out := ""
	out += fmt.Sprintf("  date=%v\n", o.Date)
	out += fmt.Sprintf("  count=%v\n", o.Count)
	return fmt.Sprintf("SearchEvent {\n%s}", out)
}

type NullableSearchEvent struct {
	value *SearchEvent
	isSet bool
}

func (v NullableSearchEvent) Get() *SearchEvent {
	return v.value
}

func (v *NullableSearchEvent) Set(val *SearchEvent) {
	v.value = val
	v.isSet = true
}

func (v NullableSearchEvent) IsSet() bool {
	return v.isSet
}

func (v *NullableSearchEvent) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSearchEvent(val *SearchEvent) *NullableSearchEvent {
	return &NullableSearchEvent{value: val, isSet: true}
}

func (v NullableSearchEvent) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSearchEvent) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
