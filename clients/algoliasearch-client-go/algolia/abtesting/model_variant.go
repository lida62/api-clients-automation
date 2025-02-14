// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package abtesting

import (
	"encoding/json"
	"fmt"
)

// Variant struct for Variant.
type Variant struct {
	// Number of add-to-cart events for this variant.
	AddToCartCount int32 `json:"addToCartCount"`
	// Variant's [add-to-cart rate](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#add-to-cart-rate).
	AddToCartRate float64 `json:"addToCartRate"`
	// Variant's [average click position](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#click-position).
	AverageClickPosition int32 `json:"averageClickPosition"`
	// Number of click events for this variant.
	ClickCount int32 `json:"clickCount"`
	// Variant's [click-through rate](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#click-through-rate).
	ClickThroughRate float64 `json:"clickThroughRate"`
	// Number of click events for this variant.
	ConversionCount int32 `json:"conversionCount"`
	// Variant's [conversion rate](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#conversion-rate).
	ConversionRate float64 `json:"conversionRate"`
	// A/B test currencies.
	Currencies map[string]CurrenciesValue `json:"currencies"`
	// A/B test description.
	Description   string         `json:"description"`
	FilterEffects *FilterEffects `json:"filterEffects,omitempty"`
	// A/B test index.
	Index string `json:"index"`
	// Number of [searches without results](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#searches-without-results) for that variant.
	NoResultCount int32 `json:"noResultCount"`
	// Number of purchase events for this variant.
	PurchaseCount int32 `json:"purchaseCount"`
	// Variant's [purchase rate](https://www.algolia.com/doc/guides/search-analytics/concepts/metrics/#purchase-rate).
	PurchaseRate float64 `json:"purchaseRate"`
	// Number of searches carried out during the A/B test.
	SearchCount int32 `json:"searchCount"`
	// Number of tracked searches. This is the number of search requests where the `clickAnalytics` parameter is `true`.
	TrackedSearchCount int32 `json:"trackedSearchCount"`
	// A/B test traffic percentage.
	TrafficPercentage int32 `json:"trafficPercentage"`
	// Number of users during the A/B test.
	UserCount int32 `json:"userCount"`
}

type VariantOption func(f *Variant)

func WithVariantFilterEffects(val FilterEffects) VariantOption {
	return func(f *Variant) {
		f.FilterEffects = &val
	}
}

// NewVariant instantiates a new Variant object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewVariant(addToCartCount int32, addToCartRate float64, averageClickPosition int32, clickCount int32, clickThroughRate float64, conversionCount int32, conversionRate float64, currencies map[string]CurrenciesValue, description string, index string, noResultCount int32, purchaseCount int32, purchaseRate float64, searchCount int32, trackedSearchCount int32, trafficPercentage int32, userCount int32, opts ...VariantOption) *Variant {
	this := &Variant{}
	this.AddToCartCount = addToCartCount
	this.AddToCartRate = addToCartRate
	this.AverageClickPosition = averageClickPosition
	this.ClickCount = clickCount
	this.ClickThroughRate = clickThroughRate
	this.ConversionCount = conversionCount
	this.ConversionRate = conversionRate
	this.Currencies = currencies
	this.Description = description
	this.Index = index
	this.NoResultCount = noResultCount
	this.PurchaseCount = purchaseCount
	this.PurchaseRate = purchaseRate
	this.SearchCount = searchCount
	this.TrackedSearchCount = trackedSearchCount
	this.TrafficPercentage = trafficPercentage
	this.UserCount = userCount
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewVariantWithDefaults instantiates a new Variant object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewVariantWithDefaults() *Variant {
	this := &Variant{}
	return this
}

// GetAddToCartCount returns the AddToCartCount field value.
func (o *Variant) GetAddToCartCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.AddToCartCount
}

// GetAddToCartCountOk returns a tuple with the AddToCartCount field value
// and a boolean to check if the value has been set.
func (o *Variant) GetAddToCartCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AddToCartCount, true
}

// SetAddToCartCount sets field value.
func (o *Variant) SetAddToCartCount(v int32) {
	o.AddToCartCount = v
}

// GetAddToCartRate returns the AddToCartRate field value.
func (o *Variant) GetAddToCartRate() float64 {
	if o == nil {
		var ret float64
		return ret
	}

	return o.AddToCartRate
}

// GetAddToCartRateOk returns a tuple with the AddToCartRate field value
// and a boolean to check if the value has been set.
func (o *Variant) GetAddToCartRateOk() (*float64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AddToCartRate, true
}

// SetAddToCartRate sets field value.
func (o *Variant) SetAddToCartRate(v float64) {
	o.AddToCartRate = v
}

// GetAverageClickPosition returns the AverageClickPosition field value.
func (o *Variant) GetAverageClickPosition() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.AverageClickPosition
}

// GetAverageClickPositionOk returns a tuple with the AverageClickPosition field value
// and a boolean to check if the value has been set.
func (o *Variant) GetAverageClickPositionOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AverageClickPosition, true
}

// SetAverageClickPosition sets field value.
func (o *Variant) SetAverageClickPosition(v int32) {
	o.AverageClickPosition = v
}

// GetClickCount returns the ClickCount field value.
func (o *Variant) GetClickCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.ClickCount
}

// GetClickCountOk returns a tuple with the ClickCount field value
// and a boolean to check if the value has been set.
func (o *Variant) GetClickCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ClickCount, true
}

// SetClickCount sets field value.
func (o *Variant) SetClickCount(v int32) {
	o.ClickCount = v
}

// GetClickThroughRate returns the ClickThroughRate field value.
func (o *Variant) GetClickThroughRate() float64 {
	if o == nil {
		var ret float64
		return ret
	}

	return o.ClickThroughRate
}

// GetClickThroughRateOk returns a tuple with the ClickThroughRate field value
// and a boolean to check if the value has been set.
func (o *Variant) GetClickThroughRateOk() (*float64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ClickThroughRate, true
}

// SetClickThroughRate sets field value.
func (o *Variant) SetClickThroughRate(v float64) {
	o.ClickThroughRate = v
}

// GetConversionCount returns the ConversionCount field value.
func (o *Variant) GetConversionCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.ConversionCount
}

// GetConversionCountOk returns a tuple with the ConversionCount field value
// and a boolean to check if the value has been set.
func (o *Variant) GetConversionCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ConversionCount, true
}

// SetConversionCount sets field value.
func (o *Variant) SetConversionCount(v int32) {
	o.ConversionCount = v
}

// GetConversionRate returns the ConversionRate field value.
func (o *Variant) GetConversionRate() float64 {
	if o == nil {
		var ret float64
		return ret
	}

	return o.ConversionRate
}

// GetConversionRateOk returns a tuple with the ConversionRate field value
// and a boolean to check if the value has been set.
func (o *Variant) GetConversionRateOk() (*float64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ConversionRate, true
}

// SetConversionRate sets field value.
func (o *Variant) SetConversionRate(v float64) {
	o.ConversionRate = v
}

// GetCurrencies returns the Currencies field value.
func (o *Variant) GetCurrencies() map[string]CurrenciesValue {
	if o == nil {
		var ret map[string]CurrenciesValue
		return ret
	}

	return o.Currencies
}

// GetCurrenciesOk returns a tuple with the Currencies field value
// and a boolean to check if the value has been set.
func (o *Variant) GetCurrenciesOk() (*map[string]CurrenciesValue, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Currencies, true
}

// SetCurrencies sets field value.
func (o *Variant) SetCurrencies(v map[string]CurrenciesValue) {
	o.Currencies = v
}

// GetDescription returns the Description field value.
func (o *Variant) GetDescription() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Description
}

// GetDescriptionOk returns a tuple with the Description field value
// and a boolean to check if the value has been set.
func (o *Variant) GetDescriptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Description, true
}

// SetDescription sets field value.
func (o *Variant) SetDescription(v string) {
	o.Description = v
}

// GetFilterEffects returns the FilterEffects field value if set, zero value otherwise.
func (o *Variant) GetFilterEffects() FilterEffects {
	if o == nil || o.FilterEffects == nil {
		var ret FilterEffects
		return ret
	}
	return *o.FilterEffects
}

// GetFilterEffectsOk returns a tuple with the FilterEffects field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Variant) GetFilterEffectsOk() (*FilterEffects, bool) {
	if o == nil || o.FilterEffects == nil {
		return nil, false
	}
	return o.FilterEffects, true
}

// HasFilterEffects returns a boolean if a field has been set.
func (o *Variant) HasFilterEffects() bool {
	if o != nil && o.FilterEffects != nil {
		return true
	}

	return false
}

// SetFilterEffects gets a reference to the given FilterEffects and assigns it to the FilterEffects field.
func (o *Variant) SetFilterEffects(v FilterEffects) {
	o.FilterEffects = &v
}

// GetIndex returns the Index field value.
func (o *Variant) GetIndex() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Index
}

// GetIndexOk returns a tuple with the Index field value
// and a boolean to check if the value has been set.
func (o *Variant) GetIndexOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Index, true
}

// SetIndex sets field value.
func (o *Variant) SetIndex(v string) {
	o.Index = v
}

// GetNoResultCount returns the NoResultCount field value.
func (o *Variant) GetNoResultCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.NoResultCount
}

// GetNoResultCountOk returns a tuple with the NoResultCount field value
// and a boolean to check if the value has been set.
func (o *Variant) GetNoResultCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.NoResultCount, true
}

// SetNoResultCount sets field value.
func (o *Variant) SetNoResultCount(v int32) {
	o.NoResultCount = v
}

// GetPurchaseCount returns the PurchaseCount field value.
func (o *Variant) GetPurchaseCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.PurchaseCount
}

// GetPurchaseCountOk returns a tuple with the PurchaseCount field value
// and a boolean to check if the value has been set.
func (o *Variant) GetPurchaseCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.PurchaseCount, true
}

// SetPurchaseCount sets field value.
func (o *Variant) SetPurchaseCount(v int32) {
	o.PurchaseCount = v
}

// GetPurchaseRate returns the PurchaseRate field value.
func (o *Variant) GetPurchaseRate() float64 {
	if o == nil {
		var ret float64
		return ret
	}

	return o.PurchaseRate
}

// GetPurchaseRateOk returns a tuple with the PurchaseRate field value
// and a boolean to check if the value has been set.
func (o *Variant) GetPurchaseRateOk() (*float64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.PurchaseRate, true
}

// SetPurchaseRate sets field value.
func (o *Variant) SetPurchaseRate(v float64) {
	o.PurchaseRate = v
}

// GetSearchCount returns the SearchCount field value.
func (o *Variant) GetSearchCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.SearchCount
}

// GetSearchCountOk returns a tuple with the SearchCount field value
// and a boolean to check if the value has been set.
func (o *Variant) GetSearchCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SearchCount, true
}

// SetSearchCount sets field value.
func (o *Variant) SetSearchCount(v int32) {
	o.SearchCount = v
}

// GetTrackedSearchCount returns the TrackedSearchCount field value.
func (o *Variant) GetTrackedSearchCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.TrackedSearchCount
}

// GetTrackedSearchCountOk returns a tuple with the TrackedSearchCount field value
// and a boolean to check if the value has been set.
func (o *Variant) GetTrackedSearchCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TrackedSearchCount, true
}

// SetTrackedSearchCount sets field value.
func (o *Variant) SetTrackedSearchCount(v int32) {
	o.TrackedSearchCount = v
}

// GetTrafficPercentage returns the TrafficPercentage field value.
func (o *Variant) GetTrafficPercentage() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.TrafficPercentage
}

// GetTrafficPercentageOk returns a tuple with the TrafficPercentage field value
// and a boolean to check if the value has been set.
func (o *Variant) GetTrafficPercentageOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TrafficPercentage, true
}

// SetTrafficPercentage sets field value.
func (o *Variant) SetTrafficPercentage(v int32) {
	o.TrafficPercentage = v
}

// GetUserCount returns the UserCount field value.
func (o *Variant) GetUserCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.UserCount
}

// GetUserCountOk returns a tuple with the UserCount field value
// and a boolean to check if the value has been set.
func (o *Variant) GetUserCountOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UserCount, true
}

// SetUserCount sets field value.
func (o *Variant) SetUserCount(v int32) {
	o.UserCount = v
}

func (o Variant) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if true {
		toSerialize["addToCartCount"] = o.AddToCartCount
	}
	if true {
		toSerialize["addToCartRate"] = o.AddToCartRate
	}
	if true {
		toSerialize["averageClickPosition"] = o.AverageClickPosition
	}
	if true {
		toSerialize["clickCount"] = o.ClickCount
	}
	if true {
		toSerialize["clickThroughRate"] = o.ClickThroughRate
	}
	if true {
		toSerialize["conversionCount"] = o.ConversionCount
	}
	if true {
		toSerialize["conversionRate"] = o.ConversionRate
	}
	if true {
		toSerialize["currencies"] = o.Currencies
	}
	if true {
		toSerialize["description"] = o.Description
	}
	if o.FilterEffects != nil {
		toSerialize["filterEffects"] = o.FilterEffects
	}
	if true {
		toSerialize["index"] = o.Index
	}
	if true {
		toSerialize["noResultCount"] = o.NoResultCount
	}
	if true {
		toSerialize["purchaseCount"] = o.PurchaseCount
	}
	if true {
		toSerialize["purchaseRate"] = o.PurchaseRate
	}
	if true {
		toSerialize["searchCount"] = o.SearchCount
	}
	if true {
		toSerialize["trackedSearchCount"] = o.TrackedSearchCount
	}
	if true {
		toSerialize["trafficPercentage"] = o.TrafficPercentage
	}
	if true {
		toSerialize["userCount"] = o.UserCount
	}
	return json.Marshal(toSerialize)
}

func (o Variant) String() string {
	out := ""
	out += fmt.Sprintf("  addToCartCount=%v\n", o.AddToCartCount)
	out += fmt.Sprintf("  addToCartRate=%v\n", o.AddToCartRate)
	out += fmt.Sprintf("  averageClickPosition=%v\n", o.AverageClickPosition)
	out += fmt.Sprintf("  clickCount=%v\n", o.ClickCount)
	out += fmt.Sprintf("  clickThroughRate=%v\n", o.ClickThroughRate)
	out += fmt.Sprintf("  conversionCount=%v\n", o.ConversionCount)
	out += fmt.Sprintf("  conversionRate=%v\n", o.ConversionRate)
	out += fmt.Sprintf("  currencies=%v\n", o.Currencies)
	out += fmt.Sprintf("  description=%v\n", o.Description)
	out += fmt.Sprintf("  filterEffects=%v\n", o.FilterEffects)
	out += fmt.Sprintf("  index=%v\n", o.Index)
	out += fmt.Sprintf("  noResultCount=%v\n", o.NoResultCount)
	out += fmt.Sprintf("  purchaseCount=%v\n", o.PurchaseCount)
	out += fmt.Sprintf("  purchaseRate=%v\n", o.PurchaseRate)
	out += fmt.Sprintf("  searchCount=%v\n", o.SearchCount)
	out += fmt.Sprintf("  trackedSearchCount=%v\n", o.TrackedSearchCount)
	out += fmt.Sprintf("  trafficPercentage=%v\n", o.TrafficPercentage)
	out += fmt.Sprintf("  userCount=%v\n", o.UserCount)
	return fmt.Sprintf("Variant {\n%s}", out)
}

type NullableVariant struct {
	value *Variant
	isSet bool
}

func (v NullableVariant) Get() *Variant {
	return v.value
}

func (v *NullableVariant) Set(val *Variant) {
	v.value = val
	v.isSet = true
}

func (v NullableVariant) IsSet() bool {
	return v.isSet
}

func (v *NullableVariant) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVariant(val *Variant) *NullableVariant {
	return &NullableVariant{value: val, isSet: true}
}

func (v NullableVariant) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVariant) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
