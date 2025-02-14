// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package analytics

import (
	"encoding/json"
	"fmt"
)

// SearchNoClickEvent struct for SearchNoClickEvent.
type SearchNoClickEvent struct {
	// User query.
	Search string `json:"search"`
	// Number of occurrences.
	Count int32 `json:"count"`
	// Number of occurrences.
	WithFilterCount int32 `json:"withFilterCount"`
}

// NewSearchNoClickEvent instantiates a new SearchNoClickEvent object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewSearchNoClickEvent(search string, count int32, withFilterCount int32) *SearchNoClickEvent {
	this := &SearchNoClickEvent{}
	this.Search = search
	this.Count = count
	this.WithFilterCount = withFilterCount
	return this
}

// NewSearchNoClickEventWithDefaults instantiates a new SearchNoClickEvent object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewSearchNoClickEventWithDefaults() *SearchNoClickEvent {
	this := &SearchNoClickEvent{}
	return this
}

// GetSearch returns the Search field value.
func (o *SearchNoClickEvent) GetSearch() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Search
}

// GetSearchOk returns a tuple with the Search field value
// and a boolean to check if the value has been set.
func (o *SearchNoClickEvent) GetSearchOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Search, true
}

// SetSearch sets field value.
func (o *SearchNoClickEvent) SetSearch(v string) {
	o.Search = v
}

// GetCount returns the Count field value.
func (o *SearchNoClickEvent) GetCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Count
}

// GetCountOk returns a tuple with the Count field value
// and a boolean to check if the value has been set.
func (o *SearchNoClickEvent) GetCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Count, true
}

// SetCount sets field value.
func (o *SearchNoClickEvent) SetCount(v int32) {
	o.Count = v
}

// GetWithFilterCount returns the WithFilterCount field value.
func (o *SearchNoClickEvent) GetWithFilterCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.WithFilterCount
}

// GetWithFilterCountOk returns a tuple with the WithFilterCount field value
// and a boolean to check if the value has been set.
func (o *SearchNoClickEvent) GetWithFilterCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.WithFilterCount, true
}

// SetWithFilterCount sets field value.
func (o *SearchNoClickEvent) SetWithFilterCount(v int32) {
	o.WithFilterCount = v
}

func (o SearchNoClickEvent) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["search"] = o.Search
	}
	if true {
		toSerialize["count"] = o.Count
	}
	if true {
		toSerialize["withFilterCount"] = o.WithFilterCount
	}
	return json.Marshal(toSerialize)
}

func (o SearchNoClickEvent) String() string {
	out := ""
	out += fmt.Sprintf("  search=%v\n", o.Search)
	out += fmt.Sprintf("  count=%v\n", o.Count)
	out += fmt.Sprintf("  withFilterCount=%v\n", o.WithFilterCount)
	return fmt.Sprintf("SearchNoClickEvent {\n%s}", out)
}

type NullableSearchNoClickEvent struct {
	value *SearchNoClickEvent
	isSet bool
}

func (v NullableSearchNoClickEvent) Get() *SearchNoClickEvent {
	return v.value
}

func (v *NullableSearchNoClickEvent) Set(val *SearchNoClickEvent) {
	v.value = val
	v.isSet = true
}

func (v NullableSearchNoClickEvent) IsSet() bool {
	return v.isSet
}

func (v *NullableSearchNoClickEvent) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSearchNoClickEvent(val *SearchNoClickEvent) *NullableSearchNoClickEvent {
	return &NullableSearchNoClickEvent{value: val, isSet: true}
}

func (v NullableSearchNoClickEvent) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSearchNoClickEvent) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
