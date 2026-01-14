package com.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootValidationsAndExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootValidationsAndExceptionHandlingApplication.class, args);
	}

}
