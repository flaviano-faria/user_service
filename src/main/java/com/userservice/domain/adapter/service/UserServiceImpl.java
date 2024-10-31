package com.userservice.domain.adapter.service;

import org.springframework.stereotype.Service;

import com.userservice.domain.dto.UserDTO;
import com.userservice.domain.ports.interfaces.UsuarioServicePort;
import com.userservice.ports.repositories.UserRepositoryPort;

@Service
public class UserServiceImpl implements UsuarioServicePort{
	
	private final UserRepositoryPort userRepositoryPort;
	
	public UserServiceImpl(UserRepositoryPort userRepositoryPort) {
		this.userRepositoryPort = userRepositoryPort;
	}

	@Override
	public void insertUser(UserDTO userDTO) {
		userRepositoryPort.insertUser(userDTO);
	}

}
