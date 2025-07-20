package com.cicd_demo_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdPracticeApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to my cicd project!";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicdPracticeApplication.class, args);
	}

}
