# Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

require 'date'
require 'time'

module Algolia
  module Recommend
    class BaseSearchParams
      # Text to search for in an index.
      attr_accessor :query

      # Overrides the query parameter and performs a more generic search.
      attr_accessor :similar_query

      # [Filter](https://www.algolia.com/doc/guides/managing-results/refine-results/filtering/) the query with numeric, facet, or tag filters.
      attr_accessor :filters

      attr_accessor :facet_filters

      attr_accessor :optional_filters

      attr_accessor :numeric_filters

      attr_accessor :tag_filters

      # Determines how to calculate [filter scores](https://www.algolia.com/doc/guides/managing-results/refine-results/filtering/in-depth/filter-scoring/#accumulating-scores-with-sumorfiltersscores). If `false`, maximum score is kept. If `true`, score is summed.
      attr_accessor :sum_or_filters_scores

      # Restricts a query to only look at a subset of your [searchable attributes](https://www.algolia.com/doc/guides/managing-results/must-do/searchable-attributes/).
      attr_accessor :restrict_searchable_attributes

      # Returns [facets](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/#contextual-facet-values-and-counts), their facet values, and the number of matching facet values.
      attr_accessor :facets

      # Forces faceting to be applied after [de-duplication](https://www.algolia.com/doc/guides/managing-results/refine-results/grouping/) (with the distinct feature). Alternatively, the `afterDistinct` [modifier](https://www.algolia.com/doc/api-reference/api-parameters/attributesForFaceting/#modifiers) of `attributesForFaceting` allows for more granular control.
      attr_accessor :faceting_after_distinct

      # Page to retrieve (the first page is `0`, not `1`).
      attr_accessor :page

      # Specifies the offset of the first hit to return. > **Note**: Using `page` and `hitsPerPage` is the recommended method for [paging results](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/). However, you can use `offset` and `length` to implement [an alternative approach to paging](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/#retrieving-a-subset-of-records-with-offset-and-length).
      attr_accessor :offset

      # Sets the number of hits to retrieve (for use with `offset`). > **Note**: Using `page` and `hitsPerPage` is the recommended method for [paging results](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/). However, you can use `offset` and `length` to implement [an alternative approach to paging](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/#retrieving-a-subset-of-records-with-offset-and-length).
      attr_accessor :length

      # Search for entries [around a central location](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filter-around-a-central-point), enabling a geographical search within a circular area.
      attr_accessor :around_lat_lng

      # Search for entries around a location. The location is automatically computed from the requester's IP address.
      attr_accessor :around_lat_lng_via_ip

      attr_accessor :around_radius

      attr_accessor :around_precision

      # Minimum radius (in meters) used for a geographical search when `aroundRadius` isn't set.
      attr_accessor :minimum_around_radius

      # Search inside a [rectangular area](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filtering-inside-rectangular-or-polygonal-areas) (in geographical coordinates).
      attr_accessor :inside_bounding_box

      # Search inside a [polygon](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filtering-inside-rectangular-or-polygonal-areas) (in geographical coordinates).
      attr_accessor :inside_polygon

      # Changes the default values of parameters that work best for a natural language query, such as `ignorePlurals`, `removeStopWords`, `removeWordsIfNoResults`, `analyticsTags`, and `ruleContexts`. These parameters work well together when the query consists of fuller natural language strings instead of keywords, for example when processing voice search queries.
      attr_accessor :natural_languages

      # Assigns [rule contexts](https://www.algolia.com/doc/guides/managing-results/rules/rules-overview/how-to/customize-search-results-by-platform/#whats-a-context) to search queries.
      attr_accessor :rule_contexts

      # Defines how much [Personalization affects results](https://www.algolia.com/doc/guides/personalization/personalizing-results/in-depth/configuring-personalization/#understanding-personalization-impact).
      attr_accessor :personalization_impact

      # Associates a [user token](https://www.algolia.com/doc/guides/sending-events/concepts/usertoken/) with the current search.
      attr_accessor :user_token

      # Incidates whether the search response includes [detailed ranking information](https://www.algolia.com/doc/guides/building-search-ui/going-further/backend-search/in-depth/understanding-the-api-response/#ranking-information).
      attr_accessor :get_ranking_info

      # Enriches the API's response with information about how the query was processed.
      attr_accessor :explain

      # Whether to take into account an index's synonyms for a particular search.
      attr_accessor :synonyms

      # Indicates whether a query ID parameter is included in the search response. This is required for [tracking click and conversion events](https://www.algolia.com/doc/guides/sending-events/concepts/event-types/#events-related-to-algolia-requests).
      attr_accessor :click_analytics

      # Indicates whether this query will be included in [analytics](https://www.algolia.com/doc/guides/search-analytics/guides/exclude-queries/).
      attr_accessor :analytics

      # Tags to apply to the query for [segmenting analytics data](https://www.algolia.com/doc/guides/search-analytics/guides/segments/).
      attr_accessor :analytics_tags

      # Whether to include or exclude a query from the processing-time percentile computation.
      attr_accessor :percentile_computation

      # Incidates whether this search will be considered in A/B testing.
      attr_accessor :enable_ab_test

      # Attribute mapping from ruby-style variable name to JSON key.
      def self.attribute_map
        {
          :query => :query,
          :similar_query => :similarQuery,
          :filters => :filters,
          :facet_filters => :facetFilters,
          :optional_filters => :optionalFilters,
          :numeric_filters => :numericFilters,
          :tag_filters => :tagFilters,
          :sum_or_filters_scores => :sumOrFiltersScores,
          :restrict_searchable_attributes => :restrictSearchableAttributes,
          :facets => :facets,
          :faceting_after_distinct => :facetingAfterDistinct,
          :page => :page,
          :offset => :offset,
          :length => :length,
          :around_lat_lng => :aroundLatLng,
          :around_lat_lng_via_ip => :aroundLatLngViaIP,
          :around_radius => :aroundRadius,
          :around_precision => :aroundPrecision,
          :minimum_around_radius => :minimumAroundRadius,
          :inside_bounding_box => :insideBoundingBox,
          :inside_polygon => :insidePolygon,
          :natural_languages => :naturalLanguages,
          :rule_contexts => :ruleContexts,
          :personalization_impact => :personalizationImpact,
          :user_token => :userToken,
          :get_ranking_info => :getRankingInfo,
          :explain => :explain,
          :synonyms => :synonyms,
          :click_analytics => :clickAnalytics,
          :analytics => :analytics,
          :analytics_tags => :analyticsTags,
          :percentile_computation => :percentileComputation,
          :enable_ab_test => :enableABTest
        }
      end

      # Returns all the JSON keys this model knows about
      def self.acceptable_attributes
        attribute_map.values
      end

      # Attribute type mapping.
      def self.types_mapping
        {
          :query => :String,
          :similar_query => :String,
          :filters => :String,
          :facet_filters => :FacetFilters,
          :optional_filters => :OptionalFilters,
          :numeric_filters => :NumericFilters,
          :tag_filters => :TagFilters,
          :sum_or_filters_scores => :Boolean,
          :restrict_searchable_attributes => :'Array<String>',
          :facets => :'Array<String>',
          :faceting_after_distinct => :Boolean,
          :page => :Integer,
          :offset => :Integer,
          :length => :Integer,
          :around_lat_lng => :String,
          :around_lat_lng_via_ip => :Boolean,
          :around_radius => :AroundRadius,
          :around_precision => :AroundPrecision,
          :minimum_around_radius => :Integer,
          :inside_bounding_box => :'Array<Array<Float>>',
          :inside_polygon => :'Array<Array<Float>>',
          :natural_languages => :'Array<String>',
          :rule_contexts => :'Array<String>',
          :personalization_impact => :Integer,
          :user_token => :String,
          :get_ranking_info => :Boolean,
          :explain => :'Array<String>',
          :synonyms => :Boolean,
          :click_analytics => :Boolean,
          :analytics => :Boolean,
          :analytics_tags => :'Array<String>',
          :percentile_computation => :Boolean,
          :enable_ab_test => :Boolean
        }
      end

      # List of attributes with nullable: true
      def self.openapi_nullable
        Set.new([])
      end

      # List of class defined in allOf (OpenAPI v3)
      def self.openapi_all_of
        [
          :BaseSearchParamsWithoutQuery,
          :SearchParamsQuery
        ]
      end

      # Initializes the object
      # @param [Hash] attributes Model attributes in the form of hash
      def initialize(attributes = {})
        unless attributes.is_a?(Hash)
          raise ArgumentError, "The input argument (attributes) must be a hash in `Algolia::BaseSearchParams` initialize method"
        end

        # check to see if the attribute exists and convert string to symbol for hash key
        attributes = attributes.each_with_object({}) do |(k, v), h|
          unless self.class.attribute_map.key?(k.to_sym)
            raise ArgumentError,
                  "`#{k}` is not a valid attribute in `Algolia::BaseSearchParams`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
          end

          h[k.to_sym] = v
        end

        if attributes.key?(:query)
          self.query = attributes[:query]
        end

        if attributes.key?(:similar_query)
          self.similar_query = attributes[:similar_query]
        end

        if attributes.key?(:filters)
          self.filters = attributes[:filters]
        end

        if attributes.key?(:facet_filters)
          self.facet_filters = attributes[:facet_filters]
        end

        if attributes.key?(:optional_filters)
          self.optional_filters = attributes[:optional_filters]
        end

        if attributes.key?(:numeric_filters)
          self.numeric_filters = attributes[:numeric_filters]
        end

        if attributes.key?(:tag_filters)
          self.tag_filters = attributes[:tag_filters]
        end

        if attributes.key?(:sum_or_filters_scores)
          self.sum_or_filters_scores = attributes[:sum_or_filters_scores]
        end

        if attributes.key?(:restrict_searchable_attributes)
          if (value = attributes[:restrict_searchable_attributes]).is_a?(Array)
            self.restrict_searchable_attributes = value
          end
        end

        if attributes.key?(:facets)
          if (value = attributes[:facets]).is_a?(Array)
            self.facets = value
          end
        end

        if attributes.key?(:faceting_after_distinct)
          self.faceting_after_distinct = attributes[:faceting_after_distinct]
        end

        if attributes.key?(:page)
          self.page = attributes[:page]
        end

        if attributes.key?(:offset)
          self.offset = attributes[:offset]
        end

        if attributes.key?(:length)
          self.length = attributes[:length]
        end

        if attributes.key?(:around_lat_lng)
          self.around_lat_lng = attributes[:around_lat_lng]
        end

        if attributes.key?(:around_lat_lng_via_ip)
          self.around_lat_lng_via_ip = attributes[:around_lat_lng_via_ip]
        end

        if attributes.key?(:around_radius)
          self.around_radius = attributes[:around_radius]
        end

        if attributes.key?(:around_precision)
          self.around_precision = attributes[:around_precision]
        end

        if attributes.key?(:minimum_around_radius)
          self.minimum_around_radius = attributes[:minimum_around_radius]
        end

        if attributes.key?(:inside_bounding_box)
          if (value = attributes[:inside_bounding_box]).is_a?(Array)
            self.inside_bounding_box = value
          end
        end

        if attributes.key?(:inside_polygon)
          if (value = attributes[:inside_polygon]).is_a?(Array)
            self.inside_polygon = value
          end
        end

        if attributes.key?(:natural_languages)
          if (value = attributes[:natural_languages]).is_a?(Array)
            self.natural_languages = value
          end
        end

        if attributes.key?(:rule_contexts)
          if (value = attributes[:rule_contexts]).is_a?(Array)
            self.rule_contexts = value
          end
        end

        if attributes.key?(:personalization_impact)
          self.personalization_impact = attributes[:personalization_impact]
        end

        if attributes.key?(:user_token)
          self.user_token = attributes[:user_token]
        end

        if attributes.key?(:get_ranking_info)
          self.get_ranking_info = attributes[:get_ranking_info]
        end

        if attributes.key?(:explain)
          if (value = attributes[:explain]).is_a?(Array)
            self.explain = value
          end
        end

        if attributes.key?(:synonyms)
          self.synonyms = attributes[:synonyms]
        end

        if attributes.key?(:click_analytics)
          self.click_analytics = attributes[:click_analytics]
        end

        if attributes.key?(:analytics)
          self.analytics = attributes[:analytics]
        end

        if attributes.key?(:analytics_tags)
          if (value = attributes[:analytics_tags]).is_a?(Array)
            self.analytics_tags = value
          end
        end

        if attributes.key?(:percentile_computation)
          self.percentile_computation = attributes[:percentile_computation]
        end

        if attributes.key?(:enable_ab_test)
          self.enable_ab_test = attributes[:enable_ab_test]
        end
      end

      # Custom attribute writer method with validation
      # @param [Object] length Value to be assigned
      def length=(length)
        if length.nil?
          raise ArgumentError, 'length cannot be nil'
        end

        if length > 1000
          raise ArgumentError, 'invalid value for "length", must be smaller than or equal to 1000.'
        end

        if length < 1
          raise ArgumentError, 'invalid value for "length", must be greater than or equal to 1.'
        end

        @length = length
      end

      # Custom attribute writer method with validation
      # @param [Object] minimum_around_radius Value to be assigned
      def minimum_around_radius=(minimum_around_radius)
        if minimum_around_radius.nil?
          raise ArgumentError, 'minimum_around_radius cannot be nil'
        end

        if minimum_around_radius < 1
          raise ArgumentError, 'invalid value for "minimum_around_radius", must be greater than or equal to 1.'
        end

        @minimum_around_radius = minimum_around_radius
      end

      # Checks equality by comparing each attribute.
      # @param [Object] Object to be compared
      def ==(other)
        return true if equal?(other)

        self.class == other.class &&
          query == other.query &&
          similar_query == other.similar_query &&
          filters == other.filters &&
          facet_filters == other.facet_filters &&
          optional_filters == other.optional_filters &&
          numeric_filters == other.numeric_filters &&
          tag_filters == other.tag_filters &&
          sum_or_filters_scores == other.sum_or_filters_scores &&
          restrict_searchable_attributes == other.restrict_searchable_attributes &&
          facets == other.facets &&
          faceting_after_distinct == other.faceting_after_distinct &&
          page == other.page &&
          offset == other.offset &&
          length == other.length &&
          around_lat_lng == other.around_lat_lng &&
          around_lat_lng_via_ip == other.around_lat_lng_via_ip &&
          around_radius == other.around_radius &&
          around_precision == other.around_precision &&
          minimum_around_radius == other.minimum_around_radius &&
          inside_bounding_box == other.inside_bounding_box &&
          inside_polygon == other.inside_polygon &&
          natural_languages == other.natural_languages &&
          rule_contexts == other.rule_contexts &&
          personalization_impact == other.personalization_impact &&
          user_token == other.user_token &&
          get_ranking_info == other.get_ranking_info &&
          explain == other.explain &&
          synonyms == other.synonyms &&
          click_analytics == other.click_analytics &&
          analytics == other.analytics &&
          analytics_tags == other.analytics_tags &&
          percentile_computation == other.percentile_computation &&
          enable_ab_test == other.enable_ab_test
      end

      # @see the `==` method
      # @param [Object] Object to be compared
      def eql?(other)
        self == other
      end

      # Calculates hash code according to all attributes.
      # @return [Integer] Hash code
      def hash
        [query, similar_query, filters, facet_filters, optional_filters, numeric_filters, tag_filters, sum_or_filters_scores, restrict_searchable_attributes, facets,
         faceting_after_distinct, page, offset, length, around_lat_lng, around_lat_lng_via_ip, around_radius, around_precision, minimum_around_radius, inside_bounding_box, inside_polygon, natural_languages, rule_contexts, personalization_impact, user_token, get_ranking_info, explain, synonyms, click_analytics, analytics, analytics_tags, percentile_computation, enable_ab_test].hash
      end

      # Builds the object from hash
      # @param [Hash] attributes Model attributes in the form of hash
      # @return [Object] Returns the model itself
      def self.build_from_hash(attributes)
        return nil unless attributes.is_a?(Hash)

        attributes = attributes.transform_keys(&:to_sym)
        transformed_hash = {}
        types_mapping.each_pair do |key, type|
          if attributes.key?(attribute_map[key]) && attributes[attribute_map[key]].nil?
            transformed_hash[key.to_s] = nil
          elsif type =~ /\AArray<(.*)>/i
            # check to ensure the input is an array given that the attribute
            # is documented as an array but the input is not
            if attributes[attribute_map[key]].is_a?(Array)
              transformed_hash[key.to_s] = attributes[attribute_map[key]].map { |v| _deserialize(::Regexp.last_match(1), v) }
            end
          elsif !attributes[attribute_map[key]].nil?
            transformed_hash[key.to_s] = _deserialize(type, attributes[attribute_map[key]])
          end
        end
        new(transformed_hash)
      end

      # Deserializes the data based on type
      # @param string type Data type
      # @param string value Value to be deserialized
      # @return [Object] Deserialized data
      def self._deserialize(type, value)
        case type.to_sym
        when :Time
          Time.parse(value)
        when :Date
          Date.parse(value)
        when :String
          value.to_s
        when :Integer
          value.to_i
        when :Float
          value.to_f
        when :Boolean
          if value.to_s =~ /\A(true|t|yes|y|1)\z/i
            true
          else
            false
          end
        when :Object
          # generic object (usually a Hash), return directly
          value
        when /\AArray<(?<inner_type>.+)>\z/
          inner_type = Regexp.last_match[:inner_type]
          value.map { |v| _deserialize(inner_type, v) }
        when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
          k_type = Regexp.last_match[:k_type]
          v_type = Regexp.last_match[:v_type]
          {}.tap do |hash|
            value.each do |k, v|
              hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
            end
          end
        else # model
          # models (e.g. Pet) or oneOf
          klass = Algolia::Recommend.const_get(type)
          klass.respond_to?(:openapi_any_of) || klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
        end
      end

      # Returns the string representation of the object
      # @return [String] String presentation of the object
      def to_s
        to_hash.to_s
      end

      # to_body is an alias to to_hash (backward compatibility)
      # @return [Hash] Returns the object in the form of hash
      def to_body
        to_hash
      end

      # Returns the object in the form of hash
      # @return [Hash] Returns the object in the form of hash
      def to_hash
        hash = {}
        self.class.attribute_map.each_pair do |attr, param|
          value = send(attr)
          if value.nil?
            is_nullable = self.class.openapi_nullable.include?(attr)
            next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
          end

          hash[param] = _to_hash(value)
        end
        hash
      end

      # Outputs non-array value in the form of hash
      # For object, use to_hash. Otherwise, just return the value
      # @param [Object] value Any valid value
      # @return [Hash] Returns the value in the form of hash
      def _to_hash(value)
        if value.is_a?(Array)
          value.compact.map { |v| _to_hash(v) }
        elsif value.is_a?(Hash)
          {}.tap do |hash|
            value.each { |k, v| hash[k] = _to_hash(v) }
          end
        elsif value.respond_to? :to_hash
          value.to_hash
        else
          value
        end
      end
    end
  end
end
