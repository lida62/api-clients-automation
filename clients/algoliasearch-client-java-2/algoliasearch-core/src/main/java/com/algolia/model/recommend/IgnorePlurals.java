package com.algolia.model.recommend;

import com.algolia.utils.CompoundType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.List;

/**
 * Treats singular, plurals, and other forms of declensions as matching terms. ignorePlurals is used
 * in conjunction with the queryLanguages setting. list: language ISO codes for which ignoring
 * plurals should be enabled. This list will override any values that you may have set in
 * queryLanguages. true: enables the ignore plurals functionality, where singulars and plurals are
 * considered equivalent (foot = feet). The languages supported here are either every language (this
 * is the default, see list of languages below), or those set by queryLanguages. false: disables
 * ignore plurals, where singulars and plurals are not considered the same for matching purposes
 * (foot will not find feet).
 */
@JsonDeserialize(using = IgnorePlurals.IgnorePluralsDeserializer.class)
@JsonSerialize(using = IgnorePlurals.IgnorePluralsSerializer.class)
public abstract class IgnorePlurals implements CompoundType {

  public static IgnorePlurals of(Boolean inside) {
    return new IgnorePluralsBoolean(inside);
  }

  public static IgnorePlurals of(List<String> inside) {
    return new IgnorePluralsListOfString(inside);
  }

  public static class IgnorePluralsSerializer extends StdSerializer<IgnorePlurals> {

    public IgnorePluralsSerializer(Class<IgnorePlurals> t) {
      super(t);
    }

    public IgnorePluralsSerializer() {
      this(null);
    }

    @Override
    public void serialize(IgnorePlurals value, JsonGenerator jgen, SerializerProvider provider)
      throws IOException, JsonProcessingException {
      jgen.writeObject(value.getInsideValue());
    }
  }

  public static class IgnorePluralsDeserializer extends StdDeserializer<IgnorePlurals> {

    public IgnorePluralsDeserializer() {
      this(IgnorePlurals.class);
    }

    public IgnorePluralsDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public IgnorePlurals deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      IgnorePlurals deserialized = null;

      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      String currentType = "";
      // deserialize Boolean
      try {
        boolean attemptParsing = true;
        currentType = "Boolean";
        if (
          ((currentType.equals("Integer") || currentType.equals("Long")) && token == JsonToken.VALUE_NUMBER_INT) |
          ((currentType.equals("Float") || currentType.equals("Double")) && token == JsonToken.VALUE_NUMBER_FLOAT) |
          (currentType.equals("Boolean") && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE)) |
          (currentType.equals("String") && token == JsonToken.VALUE_STRING) |
          (currentType.startsWith("List<") && token == JsonToken.START_ARRAY)
        ) {
          deserialized = IgnorePlurals.of((Boolean) tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Boolean>() {}));
          match++;
        } else if (token == JsonToken.START_OBJECT) {
          try {
            deserialized = IgnorePlurals.of((Boolean) tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Boolean>() {}));
            match++;
          } catch (IOException e) {
            // do nothing
          }
        }
      } catch (Exception e) {
        // deserialization failed, continue
        System.err.println("Failed to deserialize oneOf Boolean (error: " + e.getMessage() + ") (type: " + currentType + ")");
      }

      // deserialize List<String>
      try {
        boolean attemptParsing = true;
        currentType = "List<String>";
        if (
          ((currentType.equals("Integer") || currentType.equals("Long")) && token == JsonToken.VALUE_NUMBER_INT) |
          ((currentType.equals("Float") || currentType.equals("Double")) && token == JsonToken.VALUE_NUMBER_FLOAT) |
          (currentType.equals("Boolean") && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE)) |
          (currentType.equals("String") && token == JsonToken.VALUE_STRING) |
          (currentType.startsWith("List<") && token == JsonToken.START_ARRAY)
        ) {
          deserialized = IgnorePlurals.of((List<String>) tree.traverse(jp.getCodec()).readValueAs(new TypeReference<List<String>>() {}));
          match++;
        } else if (token == JsonToken.START_OBJECT) {
          try {
            deserialized = IgnorePlurals.of((List<String>) tree.traverse(jp.getCodec()).readValueAs(new TypeReference<List<String>>() {}));
            match++;
          } catch (IOException e) {
            // do nothing
          }
        }
      } catch (Exception e) {
        // deserialization failed, continue
        System.err.println("Failed to deserialize oneOf List<String> (error: " + e.getMessage() + ") (type: " + currentType + ")");
      }

      if (match == 1) {
        return deserialized;
      }
      throw new IOException(String.format("Failed deserialization for IgnorePlurals: %d classes match result, expected 1", match));
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public IgnorePlurals getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "IgnorePlurals cannot be null");
    }
  }
}

class IgnorePluralsBoolean extends IgnorePlurals {

  private final Boolean insideValue;

  IgnorePluralsBoolean(Boolean insideValue) {
    this.insideValue = insideValue;
  }

  @Override
  public Boolean getInsideValue() {
    return insideValue;
  }
}

class IgnorePluralsListOfString extends IgnorePlurals {

  private final List<String> insideValue;

  IgnorePluralsListOfString(List<String> insideValue) {
    this.insideValue = insideValue;
  }

  @Override
  public List<String> getInsideValue() {
    return insideValue;
  }
}
