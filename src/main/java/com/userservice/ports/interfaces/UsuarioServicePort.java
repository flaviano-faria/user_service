package com.userservice.ports.interfaces;

import com.userservice.domain.dto.UserDTO;

public interface UsuarioServicePort {
	
	public void insertUser(UserDTO usuarioDTO);

}
