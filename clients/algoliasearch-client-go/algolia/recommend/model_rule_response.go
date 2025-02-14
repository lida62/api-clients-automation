// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package recommend

import (
	"encoding/json"
	"fmt"
)

// RuleResponse Rule object.
type RuleResponse struct {
	Metadata *RuleResponseMetadata `json:"_metadata,omitempty"`
	// Unique identifier for a rule object.
	ObjectID string `json:"objectID"`
	// [Conditions](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/#conditions) required to activate a rule. You can use up to 25 conditions per rule.
	Conditions  []Condition  `json:"conditions,omitempty"`
	Consequence *Consequence `json:"consequence,omitempty"`
	// Description of the rule's purpose. This can be helpful for display in the Algolia dashboard.
	Description *string `json:"description,omitempty"`
	// Indicates whether to enable the rule. If it isn't enabled, it isn't applied at query time.
	Enabled *bool `json:"enabled,omitempty"`
}

type RuleResponseOption func(f *RuleResponse)

func WithRuleResponseMetadata(val RuleResponseMetadata) RuleResponseOption {
	return func(f *RuleResponse) {
		f.Metadata = &val
	}
}

func WithRuleResponseConditions(val []Condition) RuleResponseOption {
	return func(f *RuleResponse) {
		f.Conditions = val
	}
}

func WithRuleResponseConsequence(val Consequence) RuleResponseOption {
	return func(f *RuleResponse) {
		f.Consequence = &val
	}
}

func WithRuleResponseDescription(val string) RuleResponseOption {
	return func(f *RuleResponse) {
		f.Description = &val
	}
}

func WithRuleResponseEnabled(val bool) RuleResponseOption {
	return func(f *RuleResponse) {
		f.Enabled = &val
	}
}

// NewRuleResponse instantiates a new RuleResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed.
func NewRuleResponse(objectID string, opts ...RuleResponseOption) *RuleResponse {
	this := &RuleResponse{}
	this.ObjectID = objectID
	for _, opt := range opts {
		opt(this)
	}
	return this
}

// NewRuleResponseWithDefaults instantiates a new RuleResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set.
func NewRuleResponseWithDefaults() *RuleResponse {
	this := &RuleResponse{}
	var enabled bool = true
	this.Enabled = &enabled
	return this
}

// GetMetadata returns the Metadata field value if set, zero value otherwise.
func (o *RuleResponse) GetMetadata() RuleResponseMetadata {
	if o == nil || o.Metadata == nil {
		var ret RuleResponseMetadata
		return ret
	}
	return *o.Metadata
}

// GetMetadataOk returns a tuple with the Metadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RuleResponse) GetMetadataOk() (*RuleResponseMetadata, bool) {
	if o == nil || o.Metadata == nil {
		return nil, false
	}
	return o.Metadata, true
}

// HasMetadata returns a boolean if a field has been set.
func (o *RuleResponse) HasMetadata() bool {
	if o != nil && o.Metadata != nil {
		return true
	}

	return false
}

// SetMetadata gets a reference to the given RuleResponseMetadata and assigns it to the Metadata field.
func (o *RuleResponse) SetMetadata(v RuleResponseMetadata) {
	o.Metadata = &v
}

// GetObjectID returns the ObjectID field value.
func (o *RuleResponse) GetObjectID() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ObjectID
}

// GetObjectIDOk returns a tuple with the ObjectID field value
// and a boolean to check if the value has been set.
func (o *RuleResponse) GetObjectIDOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ObjectID, true
}

// SetObjectID sets field value.
func (o *RuleResponse) SetObjectID(v string) {
	o.ObjectID = v
}

// GetConditions returns the Conditions field value if set, zero value otherwise.
func (o *RuleResponse) GetConditions() []Condition {
	if o == nil || o.Conditions == nil {
		var ret []Condition
		return ret
	}
	return o.Conditions
}

// GetConditionsOk returns a tuple with the Conditions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RuleResponse) GetConditionsOk() ([]Condition, bool) {
	if o == nil || o.Conditions == nil {
		return nil, false
	}
	return o.Conditions, true
}

// HasConditions returns a boolean if a field has been set.
func (o *RuleResponse) HasConditions() bool {
	if o != nil && o.Conditions != nil {
		return true
	}

	return false
}

// SetConditions gets a reference to the given []Condition and assigns it to the Conditions field.
func (o *RuleResponse) SetConditions(v []Condition) {
	o.Conditions = v
}

// GetConsequence returns the Consequence field value if set, zero value otherwise.
func (o *RuleResponse) GetConsequence() Consequence {
	if o == nil || o.Consequence == nil {
		var ret Consequence
		return ret
	}
	return *o.Consequence
}

// GetConsequenceOk returns a tuple with the Consequence field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RuleResponse) GetConsequenceOk() (*Consequence, bool) {
	if o == nil || o.Consequence == nil {
		return nil, false
	}
	return o.Consequence, true
}

// HasConsequence returns a boolean if a field has been set.
func (o *RuleResponse) HasConsequence() bool {
	if o != nil && o.Consequence != nil {
		return true
	}

	return false
}

// SetConsequence gets a reference to the given Consequence and assigns it to the Consequence field.
func (o *RuleResponse) SetConsequence(v Consequence) {
	o.Consequence = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *RuleResponse) GetDescription() string {
	if o == nil || o.Description == nil {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RuleResponse) GetDescriptionOk() (*string, bool) {
	if o == nil || o.Description == nil {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *RuleResponse) HasDescription() bool {
	if o != nil && o.Description != nil {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *RuleResponse) SetDescription(v string) {
	o.Description = &v
}

// GetEnabled returns the Enabled field value if set, zero value otherwise.
func (o *RuleResponse) GetEnabled() bool {
	if o == nil || o.Enabled == nil {
		var ret bool
		return ret
	}
	return *o.Enabled
}

// GetEnabledOk returns a tuple with the Enabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RuleResponse) GetEnabledOk() (*bool, bool) {
	if o == nil || o.Enabled == nil {
		return nil, false
	}
	return o.Enabled, true
}

// HasEnabled returns a boolean if a field has been set.
func (o *RuleResponse) HasEnabled() bool {
	if o != nil && o.Enabled != nil {
		return true
	}

	return false
}

// SetEnabled gets a reference to the given bool and assigns it to the Enabled field.
func (o *RuleResponse) SetEnabled(v bool) {
	o.Enabled = &v
}

func (o RuleResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]any{}
	if o.Metadata != nil {
		toSerialize["_metadata"] = o.Metadata
	}
	if true {
		toSerialize["objectID"] = o.ObjectID
	}
	if o.Conditions != nil {
		toSerialize["conditions"] = o.Conditions
	}
	if o.Consequence != nil {
		toSerialize["consequence"] = o.Consequence
	}
	if o.Description != nil {
		toSerialize["description"] = o.Description
	}
	if o.Enabled != nil {
		toSerialize["enabled"] = o.Enabled
	}
	return json.Marshal(toSerialize)
}

func (o RuleResponse) String() string {
	out := ""
	out += fmt.Sprintf("  _metadata=%v\n", o.Metadata)
	out += fmt.Sprintf("  objectID=%v\n", o.ObjectID)
	out += fmt.Sprintf("  conditions=%v\n", o.Conditions)
	out += fmt.Sprintf("  consequence=%v\n", o.Consequence)
	out += fmt.Sprintf("  description=%v\n", o.Description)
	out += fmt.Sprintf("  enabled=%v\n", o.Enabled)
	return fmt.Sprintf("RuleResponse {\n%s}", out)
}

type NullableRuleResponse struct {
	value *RuleResponse
	isSet bool
}

func (v NullableRuleResponse) Get() *RuleResponse {
	return v.value
}

func (v *NullableRuleResponse) Set(val *RuleResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableRuleResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableRuleResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRuleResponse(val *RuleResponse) *NullableRuleResponse {
	return &NullableRuleResponse{value: val, isSet: true}
}

func (v NullableRuleResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRuleResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
