package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = { "com.example.demo", "service", "repository", "model" })
public class Simplemvcproject1Application {

	public static void main(String[] args) {
		SpringApplication.run(Simplemvcproject1Application.class, args);
	}

}
