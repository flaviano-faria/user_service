package com.userservice.domain.adapter.service;

import com.userservice.domain.dto.UserDTO;
import com.userservice.domain.ports.interfaces.UsuarioServicePort;

public class UserServiceImpl implements UsuarioServicePort{

	@Override
	public void insertUser(UserDTO usuarioDTO) {
		System.out.println("inserted");
		
	}

}
