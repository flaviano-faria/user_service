package com.userservice.infra.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.userservice.adapter.service.UsuarioServiceImpl;
import com.userservice.domain.ports.repository.UsuarioRepositoryPort;
import com.userservice.ports.interfaces.UsuarioServicePort;

@Configuration
public class BeanConfiguracao {
	
	@Bean
    UsuarioServicePort usuarioService(UsuarioRepositoryPort userRepositoryPort) {
        return new UsuarioServiceImpl(userRepositoryPort);
    }

}
