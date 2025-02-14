// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.recommend;

import com.algolia.exceptions.AlgoliaRuntimeException;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.io.IOException;
import java.util.logging.Logger;

/** Promote */
@JsonDeserialize(using = Promote.Deserializer.class)
public interface Promote {
  class Deserializer extends JsonDeserializer<Promote> {

    private static final Logger LOGGER = Logger.getLogger(Deserializer.class.getName());

    @Override
    public Promote deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
      JsonNode tree = jp.readValueAsTree();
      // deserialize PromoteObjectIDs
      if (tree.isObject()) {
        try (JsonParser parser = tree.traverse(jp.getCodec())) {
          return parser.readValueAs(PromoteObjectIDs.class);
        } catch (Exception e) {
          // deserialization failed, continue
          LOGGER.finest("Failed to deserialize oneOf PromoteObjectIDs (error: " + e.getMessage() + ") (type: PromoteObjectIDs)");
        }
      }
      // deserialize PromoteObjectID
      if (tree.isObject()) {
        try (JsonParser parser = tree.traverse(jp.getCodec())) {
          return parser.readValueAs(PromoteObjectID.class);
        } catch (Exception e) {
          // deserialization failed, continue
          LOGGER.finest("Failed to deserialize oneOf PromoteObjectID (error: " + e.getMessage() + ") (type: PromoteObjectID)");
        }
      }
      throw new AlgoliaRuntimeException(String.format("Failed to deserialize json element: %s", tree));
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public Promote getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "Promote cannot be null");
    }
  }
}
