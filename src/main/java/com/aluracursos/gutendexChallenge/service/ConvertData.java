package com.aluracursos.gutendexChallenge.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertData implements IConvertData{
    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T getData(String json, Class<T> Tclass) {
        T result;
        try {
            result = mapper.readValue(json, Tclass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
