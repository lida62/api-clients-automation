# Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

require 'date'
require 'time'

module Algolia
  module QuerySuggestions
    class QuerySuggestionsConfigurationResponse
      # Your Algolia application ID.
      attr_accessor :app_id

      # API key used to read from your source index.
      attr_accessor :source_indices_api_key

      # API key used to write and configure your Query Suggestions index.
      attr_accessor :suggestions_indices_api_key

      # API key used to read from external Algolia indices.
      attr_accessor :external_indices_api_key

      # Query Suggestions index name.
      attr_accessor :index_name

      # Algolia indices from which to get the popular searches for query suggestions.
      attr_accessor :source_indices

      attr_accessor :languages

      # Patterns to exclude from query suggestions.
      attr_accessor :exclude

      # Turn on personalized query suggestions.
      attr_accessor :enable_personalization

      # Allow suggestions with special characters.
      attr_accessor :allow_special_characters

      # Attribute mapping from ruby-style variable name to JSON key.
      def self.attribute_map
        {
          :app_id => :appId,
          :source_indices_api_key => :sourceIndicesAPIKey,
          :suggestions_indices_api_key => :suggestionsIndicesAPIKey,
          :external_indices_api_key => :externalIndicesAPIKey,
          :index_name => :indexName,
          :source_indices => :sourceIndices,
          :languages => :languages,
          :exclude => :exclude,
          :enable_personalization => :enablePersonalization,
          :allow_special_characters => :allowSpecialCharacters
        }
      end

      # Returns all the JSON keys this model knows about
      def self.acceptable_attributes
        attribute_map.values
      end

      # Attribute type mapping.
      def self.types_mapping
        {
          :app_id => :String,
          :source_indices_api_key => :String,
          :suggestions_indices_api_key => :String,
          :external_indices_api_key => :String,
          :index_name => :String,
          :source_indices => :'Array<SourceIndex>',
          :languages => :Languages,
          :exclude => :'Array<String>',
          :enable_personalization => :Boolean,
          :allow_special_characters => :Boolean
        }
      end

      # List of attributes with nullable: true
      def self.openapi_nullable
        Set.new([
                  :exclude
                ])
      end

      # List of class defined in allOf (OpenAPI v3)
      def self.openapi_all_of
        [
          :BaseQuerySuggestionsConfigurationResponse,
          :QuerySuggestionsConfigurationWithIndex
        ]
      end

      # Initializes the object
      # @param [Hash] attributes Model attributes in the form of hash
      def initialize(attributes = {})
        unless attributes.is_a?(Hash)
          raise ArgumentError, "The input argument (attributes) must be a hash in `Algolia::QuerySuggestionsConfigurationResponse` initialize method"
        end

        # check to see if the attribute exists and convert string to symbol for hash key
        attributes = attributes.each_with_object({}) do |(k, v), h|
          unless self.class.attribute_map.key?(k.to_sym)
            raise ArgumentError,
                  "`#{k}` is not a valid attribute in `Algolia::QuerySuggestionsConfigurationResponse`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
          end

          h[k.to_sym] = v
        end

        if attributes.key?(:app_id)
          self.app_id = attributes[:app_id]
        end

        if attributes.key?(:source_indices_api_key)
          self.source_indices_api_key = attributes[:source_indices_api_key]
        end

        if attributes.key?(:suggestions_indices_api_key)
          self.suggestions_indices_api_key = attributes[:suggestions_indices_api_key]
        end

        if attributes.key?(:external_indices_api_key)
          self.external_indices_api_key = attributes[:external_indices_api_key]
        end

        if attributes.key?(:index_name)
          self.index_name = attributes[:index_name]
        else
          self.index_name = nil
        end

        if attributes.key?(:source_indices)
          if (value = attributes[:source_indices]).is_a?(Array)
            self.source_indices = value
          end
        else
          self.source_indices = nil
        end

        if attributes.key?(:languages)
          self.languages = attributes[:languages]
        end

        if attributes.key?(:exclude)
          if (value = attributes[:exclude]).is_a?(Array)
            self.exclude = value
          end
        end

        if attributes.key?(:enable_personalization)
          self.enable_personalization = attributes[:enable_personalization]
        end

        if attributes.key?(:allow_special_characters)
          self.allow_special_characters = attributes[:allow_special_characters]
        end
      end

      # Custom attribute writer method with validation
      # @param [Object] source_indices Value to be assigned
      def source_indices=(source_indices)
        if source_indices.nil?
          raise ArgumentError, 'source_indices cannot be nil'
        end

        if source_indices.length < 1
          raise ArgumentError, 'invalid value for "source_indices", number of items must be greater than or equal to 1.'
        end

        @source_indices = source_indices
      end

      # Checks equality by comparing each attribute.
      # @param [Object] Object to be compared
      def ==(other)
        return true if equal?(other)

        self.class == other.class &&
          app_id == other.app_id &&
          source_indices_api_key == other.source_indices_api_key &&
          suggestions_indices_api_key == other.suggestions_indices_api_key &&
          external_indices_api_key == other.external_indices_api_key &&
          index_name == other.index_name &&
          source_indices == other.source_indices &&
          languages == other.languages &&
          exclude == other.exclude &&
          enable_personalization == other.enable_personalization &&
          allow_special_characters == other.allow_special_characters
      end

      # @see the `==` method
      # @param [Object] Object to be compared
      def eql?(other)
        self == other
      end

      # Calculates hash code according to all attributes.
      # @return [Integer] Hash code
      def hash
        [app_id, source_indices_api_key, suggestions_indices_api_key, external_indices_api_key, index_name, source_indices, languages, exclude, enable_personalization,
         allow_special_characters].hash
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
          klass = Algolia::QuerySuggestions.const_get(type)
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
