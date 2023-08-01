// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.search;

import com.algolia.exceptions.AlgoliaRuntimeException;
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
import java.util.logging.Logger;

/** SnippetResult */
@JsonDeserialize(using = SnippetResult.SnippetResultDeserializer.class)
@JsonSerialize(using = SnippetResult.SnippetResultSerializer.class)
public abstract class SnippetResult implements CompoundType {

  private static final Logger LOGGER = Logger.getLogger(SnippetResult.class.getName());

  public static SnippetResult of(List<SnippetResultOption> inside) {
    return new SnippetResultListOfSnippetResultOption(inside);
  }

  public static SnippetResult of(SnippetResultOption inside) {
    return new SnippetResultSnippetResultOption(inside);
  }

  public static class SnippetResultSerializer extends StdSerializer<SnippetResult> {

    public SnippetResultSerializer(Class<SnippetResult> t) {
      super(t);
    }

    public SnippetResultSerializer() {
      this(null);
    }

    @Override
    public void serialize(SnippetResult value, JsonGenerator jgen, SerializerProvider provider)
      throws IOException, JsonProcessingException {
      jgen.writeObject(value.getInsideValue());
    }
  }

  public static class SnippetResultDeserializer extends StdDeserializer<SnippetResult> {

    public SnippetResultDeserializer() {
      this(SnippetResult.class);
    }

    public SnippetResultDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public SnippetResult deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
      JsonNode tree = jp.readValueAsTree();

      // deserialize List<SnippetResultOption>
      if (tree.isArray()) {
        try (JsonParser parser = tree.traverse(jp.getCodec())) {
          List<SnippetResultOption> value = parser.readValueAs(new TypeReference<List<SnippetResultOption>>() {});
          return SnippetResult.of(value);
        } catch (Exception e) {
          // deserialization failed, continue
          LOGGER.finest(
            "Failed to deserialize oneOf List<SnippetResultOption> (error: " + e.getMessage() + ") (type: List<SnippetResultOption>)"
          );
        }
      }

      // deserialize SnippetResultOption
      if (tree.isObject()) {
        try (JsonParser parser = tree.traverse(jp.getCodec())) {
          SnippetResultOption value = parser.readValueAs(new TypeReference<SnippetResultOption>() {});
          return SnippetResult.of(value);
        } catch (Exception e) {
          // deserialization failed, continue
          LOGGER.finest("Failed to deserialize oneOf SnippetResultOption (error: " + e.getMessage() + ") (type: SnippetResultOption)");
        }
      }
      throw new AlgoliaRuntimeException(String.format("Failed to deserialize json element: %s", tree));
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public SnippetResult getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "SnippetResult cannot be null");
    }
  }
}

class SnippetResultListOfSnippetResultOption extends SnippetResult {

  private final List<SnippetResultOption> insideValue;

  SnippetResultListOfSnippetResultOption(List<SnippetResultOption> insideValue) {
    this.insideValue = insideValue;
  }

  @Override
  public List<SnippetResultOption> getInsideValue() {
    return insideValue;
  }
}

class SnippetResultSnippetResultOption extends SnippetResult {

  private final SnippetResultOption insideValue;

  SnippetResultSnippetResultOption(SnippetResultOption insideValue) {
    this.insideValue = insideValue;
  }

  @Override
  public SnippetResultOption getInsideValue() {
    return insideValue;
  }
}
