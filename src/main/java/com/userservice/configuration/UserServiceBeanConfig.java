package com.userservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.userservice.domain.adapter.service.UserServiceImpl;
import com.userservice.domain.ports.interfaces.UsuarioServicePort;
import com.userservice.ports.repositories.UserRepositoryPort;

@Configuration
public class UserServiceBeanConfig {
	

	@Bean
	UsuarioServicePort userService(UserRepositoryPort userRepositoryPort) {
		return new UserServiceImpl(userRepositoryPort);
	}

}
