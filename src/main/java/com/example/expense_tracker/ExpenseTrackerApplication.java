package com.example.expense_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExpenseTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerApplication.class, args);
	}

	@GetMapping("/aryan")
	public String sayHello() {
		return "Welcome to the server";
	}

	@GetMapping("/")
	public String Aryan() {
		return "This is Aryan's Sping boot server";
	}

	@GetMapping("/rustagi")
	public String rustagi() {
		return "This is Aryan with Rustagi";
	}

}
