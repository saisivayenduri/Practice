package com.example.practice.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
		System.out.println("From --> Feature2 Branch ... Testing conflict");
		System.out.println("From --> Master Branch");
		System.out.println("From --> Feature1 branch");
	}

}

