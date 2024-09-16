package com.wissen.springboot.practice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.wissen.springboot")
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(){
//		return args -> {
//			System.out.println("Hello World!! Inside Command Line Runner");
//		};
//	}
}
