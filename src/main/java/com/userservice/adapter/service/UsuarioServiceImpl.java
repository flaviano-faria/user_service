package com.userservice.adapter.service;

import com.userservice.domain.dto.UserDTO;
import com.userservice.domain.ports.repository.UsuarioRepositoryPort;
import com.userservice.ports.interfaces.UsuarioServicePort;

public class UsuarioServiceImpl implements UsuarioServicePort{

	private UsuarioRepositoryPort usuarioRepositoryPort;

	public UsuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
		this.usuarioRepositoryPort = usuarioRepositoryPort;
	}
	
	@Override
	public void insertUser(UserDTO usuarioDTO) {
		usuarioRepositoryPort.insertUser(usuarioDTO);
		
	}

}
