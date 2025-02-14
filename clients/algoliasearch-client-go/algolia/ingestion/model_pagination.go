// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package ingestion

import (
	"encoding/json"
	"fmt"
)

// Pagination struct for Pagination.
type Pagination struct {
	NbPages      int32 `json:"nbPages"`
	Page         int32 `json:"page"`
	NbItems      int32 `json:"nbItems"`
	ItemsPerPage int32 `json:"itemsPerPage"`
}

// NewPagination instantiates a new Pagination object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewPagination(nbPages int32, page int32, nbItems int32, itemsPerPage int32) *Pagination {
	this := &Pagination{}
	this.NbPages = nbPages
	this.Page = page
	this.NbItems = nbItems
	this.ItemsPerPage = itemsPerPage
	return this
}

// NewPaginationWithDefaults instantiates a new Pagination object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewPaginationWithDefaults() *Pagination {
	this := &Pagination{}
	return this
}

// GetNbPages returns the NbPages field value.
func (o *Pagination) GetNbPages() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.NbPages
}

// GetNbPagesOk returns a tuple with the NbPages field value
// and a boolean to check if the value has been set.
func (o *Pagination) GetNbPagesOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.NbPages, true
}

// SetNbPages sets field value.
func (o *Pagination) SetNbPages(v int32) {
	o.NbPages = v
}

// GetPage returns the Page field value.
func (o *Pagination) GetPage() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Page
}

// GetPageOk returns a tuple with the Page field value
// and a boolean to check if the value has been set.
func (o *Pagination) GetPageOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Page, true
}

// SetPage sets field value.
func (o *Pagination) SetPage(v int32) {
	o.Page = v
}

// GetNbItems returns the NbItems field value.
func (o *Pagination) GetNbItems() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.NbItems
}

// GetNbItemsOk returns a tuple with the NbItems field value
// and a boolean to check if the value has been set.
func (o *Pagination) GetNbItemsOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.NbItems, true
}

// SetNbItems sets field value.
func (o *Pagination) SetNbItems(v int32) {
	o.NbItems = v
}

// GetItemsPerPage returns the ItemsPerPage field value.
func (o *Pagination) GetItemsPerPage() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.ItemsPerPage
}

// GetItemsPerPageOk returns a tuple with the ItemsPerPage field value
// and a boolean to check if the value has been set.
func (o *Pagination) GetItemsPerPageOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ItemsPerPage, true
}

// SetItemsPerPage sets field value.
func (o *Pagination) SetItemsPerPage(v int32) {
	o.ItemsPerPage = v
}

func (o Pagination) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["nbPages"] = o.NbPages
	}
	if true {
		toSerialize["page"] = o.Page
	}
	if true {
		toSerialize["nbItems"] = o.NbItems
	}
	if true {
		toSerialize["itemsPerPage"] = o.ItemsPerPage
	}
	return json.Marshal(toSerialize)
}

func (o Pagination) String() string {
	out := ""
	out += fmt.Sprintf("  nbPages=%v\n", o.NbPages)
	out += fmt.Sprintf("  page=%v\n", o.Page)
	out += fmt.Sprintf("  nbItems=%v\n", o.NbItems)
	out += fmt.Sprintf("  itemsPerPage=%v\n", o.ItemsPerPage)
	return fmt.Sprintf("Pagination {\n%s}", out)
}

type NullablePagination struct {
	value *Pagination
	isSet bool
}

func (v NullablePagination) Get() *Pagination {
	return v.value
}

func (v *NullablePagination) Set(val *Pagination) {
	v.value = val
	v.isSet = true
}

func (v NullablePagination) IsSet() bool {
	return v.isSet
}

func (v *NullablePagination) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePagination(val *Pagination) *NullablePagination {
	return &NullablePagination{value: val, isSet: true}
}

func (v NullablePagination) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePagination) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
