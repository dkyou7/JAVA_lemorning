package com.example.lemorning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LemorningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LemorningApplication.class, args);
	}

	@GetMapping("/")
	public String helloWorld(){
		return "hello world";
	}
}
