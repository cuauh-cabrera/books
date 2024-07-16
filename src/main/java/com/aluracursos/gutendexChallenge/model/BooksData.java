package com.aluracursos.gutendexChallenge.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record BooksData(
        @JsonAlias("title") String title,
        @JsonAlias("authors") List<AuthorData> author,
        @JsonAlias("languages") List<String> language,
        @JsonAlias("download_count") Double downloads
) {
}
