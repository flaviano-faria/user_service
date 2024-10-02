package com.userservice.domain.ports.repository;

import java.util.List;

import com.userservice.domain.dto.UserDTO;

public interface UsuarioRepositoryPort {
	
	public List<UserDTO> buscarTodos();
	public void insertUser(UserDTO usuarioDTO);
	public UserDTO buscarId(String id);

}
