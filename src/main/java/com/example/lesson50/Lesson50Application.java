package com.example.lesson50;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class Lesson50Application {

	public static void main(String[] args) {
		SpringApplication.run(Lesson50Application.class, args);
	}

}
