package com.userservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.userservice.configuration, com.userservice.controller")
public class UserservicerefApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserservicerefApplication.class, args);
	}

}
