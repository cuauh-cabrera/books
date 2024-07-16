package com.aluracursos.gutendexChallenge.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record AuthorData(
        @JsonAlias("name") String author,
        @JsonAlias("birth_year") String birthDate,
        @JsonAlias("death_year") String deathDate
) {
}
