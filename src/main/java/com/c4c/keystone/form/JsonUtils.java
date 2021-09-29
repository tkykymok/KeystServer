package com.c4c.keystone.form;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class JsonUtils {
    public static class FlagDeserializer extends JsonDeserializer<Integer> {
        @Override
        public Integer deserialize(JsonParser parser, DeserializationContext context) throws IOException {
            return parser.getBooleanValue() ? 1 : 0;
        }
    }

    public static class FlagSerializer extends JsonSerializer<Integer> {
        @Override
        public void serialize(Integer flag, JsonGenerator generator, SerializerProvider provider) throws IOException {
            generator.writeBoolean(flag.equals(1));
        }
    }
}
