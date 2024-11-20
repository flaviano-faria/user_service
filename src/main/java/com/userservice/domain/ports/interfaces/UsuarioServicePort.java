package com.userservice.domain.ports.interfaces;

import java.util.List;

import com.userservice.domain.dto.UserDTO;

public interface UsuarioServicePort {
	
	public void insertUser(UserDTO usuarioDTO);
	
	public List<UserDTO> findAll();

}
