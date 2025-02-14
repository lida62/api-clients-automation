// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package ingestion

import (
	"encoding/json"
	"fmt"
)

// BigCommerceChannel struct for BigCommerceChannel.
type BigCommerceChannel struct {
	// The ID of the bigcommerce channel.
	Id int32 `json:"id"`
	// An array of currencies for the given channel `ID`, a currency is a trigram string that represents the currency code.
	Currencies []string `json:"currencies,omitempty"`
}

type BigCommerceChannelOption func(f *BigCommerceChannel)

func WithBigCommerceChannelCurrencies(val []string) BigCommerceChannelOption {
	return func(f *BigCommerceChannel) {
		f.Currencies = val
	}
}

// NewBigCommerceChannel instantiates a new BigCommerceChannel object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewBigCommerceChannel(id int32, opts ...BigCommerceChannelOption) *BigCommerceChannel {
	this := &BigCommerceChannel{}
	this.Id = id
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewBigCommerceChannelWithDefaults instantiates a new BigCommerceChannel object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewBigCommerceChannelWithDefaults() *BigCommerceChannel {
	this := &BigCommerceChannel{}
	return this
}

// GetId returns the Id field value.
func (o *BigCommerceChannel) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *BigCommerceChannel) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value.
func (o *BigCommerceChannel) SetId(v int32) {
	o.Id = v
}

// GetCurrencies returns the Currencies field value if set, zero value otherwise.
func (o *BigCommerceChannel) GetCurrencies() []string {
	if o == nil || o.Currencies == nil {
		var ret []string
		return ret
	}
	return o.Currencies
}

// GetCurrenciesOk returns a tuple with the Currencies field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BigCommerceChannel) GetCurrenciesOk() ([]string, bool) {
	if o == nil || o.Currencies == nil {
		return nil, false
	}
	return o.Currencies, true
}

// HasCurrencies returns a boolean if a field has been set.
func (o *BigCommerceChannel) HasCurrencies() bool {
	if o != nil && o.Currencies != nil {
		return true
	}

	return false
}

// SetCurrencies gets a reference to the given []string and assigns it to the Currencies field.
func (o *BigCommerceChannel) SetCurrencies(v []string) {
	o.Currencies = v
}

func (o BigCommerceChannel) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["id"] = o.Id
	}
	if o.Currencies != nil {
		toSerialize["currencies"] = o.Currencies
	}
	return json.Marshal(toSerialize)
}

func (o BigCommerceChannel) String() string {
	out := ""
	out += fmt.Sprintf("  id=%v\n", o.Id)
	out += fmt.Sprintf("  currencies=%v\n", o.Currencies)
	return fmt.Sprintf("BigCommerceChannel {\n%s}", out)
}

type NullableBigCommerceChannel struct {
	value *BigCommerceChannel
	isSet bool
}

func (v NullableBigCommerceChannel) Get() *BigCommerceChannel {
	return v.value
}

func (v *NullableBigCommerceChannel) Set(val *BigCommerceChannel) {
	v.value = val
	v.isSet = true
}

func (v NullableBigCommerceChannel) IsSet() bool {
	return v.isSet
}

func (v *NullableBigCommerceChannel) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBigCommerceChannel(val *BigCommerceChannel) *NullableBigCommerceChannel {
	return &NullableBigCommerceChannel{value: val, isSet: true}
}

func (v NullableBigCommerceChannel) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBigCommerceChannel) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
