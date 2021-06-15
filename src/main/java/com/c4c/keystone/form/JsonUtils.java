package com.c4c.keystone.form;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class JsonUtils {
    public static class  FlagDeserializer extends JsonDeserializer<Boolean> {
        @Override
        public Boolean deserialize(JsonParser parser, DeserializationContext context) throws IOException {
            return !"0".equals(parser.getText());
        }
    }

    public static class FlagSerializer extends JsonSerializer<String> {
        @Override
        public void serialize(String str, JsonGenerator generator, SerializerProvider provider) throws IOException {
            generator.writeBoolean(str.equals("1"));
        }
    }
}
