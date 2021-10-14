package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class MyAzureProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAzureProjectApplication.class, args);
	}


	@GetMapping("/myFirstAzureApp")
	public String getMessage(){
		return "This is Simash's first Azure app";
	}
}
