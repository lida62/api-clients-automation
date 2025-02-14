// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.insights;

import com.algolia.exceptions.AlgoliaRuntimeException;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.io.IOException;
import java.util.logging.Logger;

/** Absolute value of the discount in effect for this object, measured in `currency`. */
@JsonDeserialize(using = Discount.Deserializer.class)
public interface Discount {
  /** Discount as Double wrapper. */
  static Discount of(Double value) {
    return new DoubleWrapper(value);
  }

  /** Discount as String wrapper. */
  static Discount of(String value) {
    return new StringWrapper(value);
  }

  /** Discount as Double wrapper. */
  @JsonSerialize(using = DoubleWrapper.Serializer.class)
  class DoubleWrapper implements Discount {

    private final Double value;

    DoubleWrapper(Double value) {
      this.value = value;
    }

    public Double getValue() {
      return value;
    }

    static class Serializer extends JsonSerializer<DoubleWrapper> {

      @Override
      public void serialize(DoubleWrapper value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeObject(value.getValue());
      }
    }
  }

  /** Discount as String wrapper. */
  @JsonSerialize(using = StringWrapper.Serializer.class)
  class StringWrapper implements Discount {

    private final String value;

    StringWrapper(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    static class Serializer extends JsonSerializer<StringWrapper> {

      @Override
      public void serialize(StringWrapper value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeObject(value.getValue());
      }
    }
  }

  class Deserializer extends JsonDeserializer<Discount> {

    private static final Logger LOGGER = Logger.getLogger(Deserializer.class.getName());

    @Override
    public Discount deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
      JsonNode tree = jp.readValueAsTree();
      // deserialize Double
      if (tree.isDouble()) {
        try (JsonParser parser = tree.traverse(jp.getCodec())) {
          Double value = parser.readValueAs(Double.class);
          return new Discount.DoubleWrapper(value);
        } catch (Exception e) {
          // deserialization failed, continue
          LOGGER.finest("Failed to deserialize oneOf Double (error: " + e.getMessage() + ") (type: Double)");
        }
      }
      // deserialize String
      if (tree.isTextual()) {
        try (JsonParser parser = tree.traverse(jp.getCodec())) {
          String value = parser.readValueAs(String.class);
          return new Discount.StringWrapper(value);
        } catch (Exception e) {
          // deserialization failed, continue
          LOGGER.finest("Failed to deserialize oneOf String (error: " + e.getMessage() + ") (type: String)");
        }
      }
      throw new AlgoliaRuntimeException(String.format("Failed to deserialize json element: %s", tree));
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public Discount getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "Discount cannot be null");
    }
  }
}
