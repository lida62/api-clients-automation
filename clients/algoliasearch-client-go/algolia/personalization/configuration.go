// File generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation.
package personalization

import (
	"net/http"
	"time"

	"github.com/algolia/algoliasearch-client-go/v4/algolia/compression"
)

type Requester interface {
	Request(*http.Request) (*http.Response, error)
}

type defaultRequester struct {
	client *http.Client
}

func newDefaultRequester() *defaultRequester {
	return &defaultRequester{
		client: http.DefaultClient,
	}
}

func (r *defaultRequester) Request(req *http.Request) (*http.Response, error) {
	return r.client.Do(req)
}

type Region string

const (
	EU Region = "eu"
	US Region = "us"
)

// Configuration stores the configuration of the API client.
type Configuration struct {
	AppID  string
	ApiKey string
	Region Region

	Hosts         []string          `json:"host,omitempty"`
	DefaultHeader map[string]string `json:"defaultHeader,omitempty"`
	UserAgent     string            `json:"userAgent,omitempty"`
	Debug         bool              `json:"debug,omitempty"`
	Requester     Requester
	ReadTimeout   time.Duration
	WriteTimeout  time.Duration
	Compression   compression.Compression
}
