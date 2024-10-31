package com.userservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.userservice.adapter.repositories.SpringUserRepository;

@SpringBootApplication
@ComponentScan(basePackages = "com.userservice.configuration, com.userservice.controller, com.userservice.adapter.repositories")
@EnableJpaRepositories (basePackageClasses = SpringUserRepository.class)
@EntityScan(basePackages = {"com.userservice.adapters.entity"}) 
public class UserservicerefApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserservicerefApplication.class, args);
	}

}
