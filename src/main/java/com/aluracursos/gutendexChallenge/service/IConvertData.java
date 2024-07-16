package com.aluracursos.gutendexChallenge.service;

public interface IConvertData {
    static <T> T getData(String json, Class<T> Tclass);
}
