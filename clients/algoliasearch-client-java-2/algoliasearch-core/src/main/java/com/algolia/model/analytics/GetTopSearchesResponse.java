package com.algolia.model.analytics;

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

/** GetTopSearchesResponse */
@JsonDeserialize(using = GetTopSearchesResponse.GetTopSearchesResponseDeserializer.class)
@JsonSerialize(using = GetTopSearchesResponse.GetTopSearchesResponseSerializer.class)
public abstract class GetTopSearchesResponse implements CompoundType {

  public static GetTopSearchesResponse of(TopSearchesResponse inside) {
    return new GetTopSearchesResponseTopSearchesResponse(inside);
  }

  public static GetTopSearchesResponse of(TopSearchesResponseWithAnalytics inside) {
    return new GetTopSearchesResponseTopSearchesResponseWithAnalytics(inside);
  }

  public static class GetTopSearchesResponseSerializer extends StdSerializer<GetTopSearchesResponse> {

    public GetTopSearchesResponseSerializer(Class<GetTopSearchesResponse> t) {
      super(t);
    }

    public GetTopSearchesResponseSerializer() {
      this(null);
    }

    @Override
    public void serialize(GetTopSearchesResponse value, JsonGenerator jgen, SerializerProvider provider)
      throws IOException, JsonProcessingException {
      jgen.writeObject(value.getInsideValue());
    }
  }

  public static class GetTopSearchesResponseDeserializer extends StdDeserializer<GetTopSearchesResponse> {

    public GetTopSearchesResponseDeserializer() {
      this(GetTopSearchesResponse.class);
    }

    public GetTopSearchesResponseDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public GetTopSearchesResponse deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      GetTopSearchesResponse deserialized = null;

      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      String currentType = "";
      // deserialize TopSearchesResponse
      try {
        boolean attemptParsing = true;
        currentType = "TopSearchesResponse";
        if (
          ((currentType.equals("Integer") || currentType.equals("Long")) && token == JsonToken.VALUE_NUMBER_INT) |
          ((currentType.equals("Float") || currentType.equals("Double")) && token == JsonToken.VALUE_NUMBER_FLOAT) |
          (currentType.equals("Boolean") && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE)) |
          (currentType.equals("String") && token == JsonToken.VALUE_STRING) |
          (currentType.startsWith("List<") && token == JsonToken.START_ARRAY)
        ) {
          deserialized =
            GetTopSearchesResponse.of(
              (TopSearchesResponse) tree.traverse(jp.getCodec()).readValueAs(new TypeReference<TopSearchesResponse>() {})
            );
          match++;
        } else if (token == JsonToken.START_OBJECT) {
          try {
            deserialized =
              GetTopSearchesResponse.of(
                (TopSearchesResponse) tree.traverse(jp.getCodec()).readValueAs(new TypeReference<TopSearchesResponse>() {})
              );
            match++;
          } catch (IOException e) {
            // do nothing
          }
        }
      } catch (Exception e) {
        // deserialization failed, continue
        System.err.println("Failed to deserialize oneOf TopSearchesResponse (error: " + e.getMessage() + ") (type: " + currentType + ")");
      }

      // deserialize TopSearchesResponseWithAnalytics
      try {
        boolean attemptParsing = true;
        currentType = "TopSearchesResponseWithAnalytics";
        if (
          ((currentType.equals("Integer") || currentType.equals("Long")) && token == JsonToken.VALUE_NUMBER_INT) |
          ((currentType.equals("Float") || currentType.equals("Double")) && token == JsonToken.VALUE_NUMBER_FLOAT) |
          (currentType.equals("Boolean") && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE)) |
          (currentType.equals("String") && token == JsonToken.VALUE_STRING) |
          (currentType.startsWith("List<") && token == JsonToken.START_ARRAY)
        ) {
          deserialized =
            GetTopSearchesResponse.of(
              (TopSearchesResponseWithAnalytics) tree
                .traverse(jp.getCodec())
                .readValueAs(new TypeReference<TopSearchesResponseWithAnalytics>() {})
            );
          match++;
        } else if (token == JsonToken.START_OBJECT) {
          try {
            deserialized =
              GetTopSearchesResponse.of(
                (TopSearchesResponseWithAnalytics) tree
                  .traverse(jp.getCodec())
                  .readValueAs(new TypeReference<TopSearchesResponseWithAnalytics>() {})
              );
            match++;
          } catch (IOException e) {
            // do nothing
          }
        }
      } catch (Exception e) {
        // deserialization failed, continue
        System.err.println(
          "Failed to deserialize oneOf TopSearchesResponseWithAnalytics (error: " + e.getMessage() + ") (type: " + currentType + ")"
        );
      }

      if (match == 1) {
        return deserialized;
      }
      throw new IOException(
        String.format("Failed deserialization for GetTopSearchesResponse: %d classes match result, expected" + " 1", match)
      );
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public GetTopSearchesResponse getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "GetTopSearchesResponse cannot be null");
    }
  }
}

class GetTopSearchesResponseTopSearchesResponse extends GetTopSearchesResponse {

  private final TopSearchesResponse insideValue;

  GetTopSearchesResponseTopSearchesResponse(TopSearchesResponse insideValue) {
    this.insideValue = insideValue;
  }

  @Override
  public TopSearchesResponse getInsideValue() {
    return insideValue;
  }
}

class GetTopSearchesResponseTopSearchesResponseWithAnalytics extends GetTopSearchesResponse {

  private final TopSearchesResponseWithAnalytics insideValue;

  GetTopSearchesResponseTopSearchesResponseWithAnalytics(TopSearchesResponseWithAnalytics insideValue) {
    this.insideValue = insideValue;
  }

  @Override
  public TopSearchesResponseWithAnalytics getInsideValue() {
    return insideValue;
  }
}
