package com.aluracursos.gutendexChallenge;

import com.aluracursos.gutendexChallenge.index.Index;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GutendexChallengeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GutendexChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Index index = new Index();
		index.showAllBooks();
	}
}
