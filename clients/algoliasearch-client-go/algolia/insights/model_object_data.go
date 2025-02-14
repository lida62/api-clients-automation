// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package insights

import (
	"encoding/json"
	"fmt"
)

// ObjectData struct for ObjectData.
type ObjectData struct {
	Price *Price `json:"price,omitempty"`
	// The quantity of the purchased or added-to-cart item. The total value of a purchase is the sum of `quantity` multiplied with the `price` for each purchased item.
	Quantity *int32    `json:"quantity,omitempty"`
	Discount *Discount `json:"discount,omitempty"`
}

type ObjectDataOption func(f *ObjectData)

func WithObjectDataPrice(val Price) ObjectDataOption {
	return func(f *ObjectData) {
		f.Price = &val
	}
}

func WithObjectDataQuantity(val int32) ObjectDataOption {
	return func(f *ObjectData) {
		f.Quantity = &val
	}
}

func WithObjectDataDiscount(val Discount) ObjectDataOption {
	return func(f *ObjectData) {
		f.Discount = &val
	}
}

// NewObjectData instantiates a new ObjectData object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewObjectData(opts ...ObjectDataOption) *ObjectData {
	this := &ObjectData{}
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewObjectDataWithDefaults instantiates a new ObjectData object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewObjectDataWithDefaults() *ObjectData {
	this := &ObjectData{}
	return this
}

// GetPrice returns the Price field value if set, zero value otherwise.
func (o *ObjectData) GetPrice() Price {
	if o == nil || o.Price == nil {
		var ret Price
		return ret
	}
	return *o.Price
}

// GetPriceOk returns a tuple with the Price field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjectData) GetPriceOk() (*Price, bool) {
	if o == nil || o.Price == nil {
		return nil, false
	}
	return o.Price, true
}

// HasPrice returns a boolean if a field has been set.
func (o *ObjectData) HasPrice() bool {
	if o != nil && o.Price != nil {
		return true
	}

	return false
}

// SetPrice gets a reference to the given Price and assigns it to the Price field.
func (o *ObjectData) SetPrice(v Price) {
	o.Price = &v
}

// GetQuantity returns the Quantity field value if set, zero value otherwise.
func (o *ObjectData) GetQuantity() int32 {
	if o == nil || o.Quantity == nil {
		var ret int32
		return ret
	}
	return *o.Quantity
}

// GetQuantityOk returns a tuple with the Quantity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjectData) GetQuantityOk() (*int32, bool) {
	if o == nil || o.Quantity == nil {
		return nil, false
	}
	return o.Quantity, true
}

// HasQuantity returns a boolean if a field has been set.
func (o *ObjectData) HasQuantity() bool {
	if o != nil && o.Quantity != nil {
		return true
	}

	return false
}

// SetQuantity gets a reference to the given int32 and assigns it to the Quantity field.
func (o *ObjectData) SetQuantity(v int32) {
	o.Quantity = &v
}

// GetDiscount returns the Discount field value if set, zero value otherwise.
func (o *ObjectData) GetDiscount() Discount {
	if o == nil || o.Discount == nil {
		var ret Discount
		return ret
	}
	return *o.Discount
}

// GetDiscountOk returns a tuple with the Discount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjectData) GetDiscountOk() (*Discount, bool) {
	if o == nil || o.Discount == nil {
		return nil, false
	}
	return o.Discount, true
}

// HasDiscount returns a boolean if a field has been set.
func (o *ObjectData) HasDiscount() bool {
	if o != nil && o.Discount != nil {
		return true
	}

	return false
}

// SetDiscount gets a reference to the given Discount and assigns it to the Discount field.
func (o *ObjectData) SetDiscount(v Discount) {
	o.Discount = &v
}

func (o ObjectData) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if o.Price != nil {
		toSerialize["price"] = o.Price
	}
	if o.Quantity != nil {
		toSerialize["quantity"] = o.Quantity
	}
	if o.Discount != nil {
		toSerialize["discount"] = o.Discount
	}
	return json.Marshal(toSerialize)
}

func (o ObjectData) String() string {
	out := ""
	out += fmt.Sprintf("  price=%v\n", o.Price)
	out += fmt.Sprintf("  quantity=%v\n", o.Quantity)
	out += fmt.Sprintf("  discount=%v\n", o.Discount)
	return fmt.Sprintf("ObjectData {\n%s}", out)
}

type NullableObjectData struct {
	value *ObjectData
	isSet bool
}

func (v NullableObjectData) Get() *ObjectData {
	return v.value
}

func (v *NullableObjectData) Set(val *ObjectData) {
	v.value = val
	v.isSet = true
}

func (v NullableObjectData) IsSet() bool {
	return v.isSet
}

func (v *NullableObjectData) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObjectData(val *ObjectData) *NullableObjectData {
	return &NullableObjectData{value: val, isSet: true}
}

func (v NullableObjectData) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObjectData) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
