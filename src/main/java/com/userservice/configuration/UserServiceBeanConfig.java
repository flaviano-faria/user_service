package com.userservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.userservice.domain.adapter.service.UserServiceImpl;
import com.userservice.domain.ports.interfaces.UsuarioServicePort;

@Configuration
public class UserServiceBeanConfig {
	
	@Bean
	UsuarioServicePort userService() {
		return new UserServiceImpl();
	}

}
