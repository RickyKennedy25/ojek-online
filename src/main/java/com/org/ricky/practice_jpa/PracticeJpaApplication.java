package com.org.ricky.practice_jpa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class PracticeJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeJpaApplication.class, args);
	}

}

