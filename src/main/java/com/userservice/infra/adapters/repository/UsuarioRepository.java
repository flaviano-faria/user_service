package com.userservice.infra.adapters.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.userservice.adapters.entity.UserEntity;
import com.userservice.domain.dto.UserDTO;
import com.userservice.domain.ports.repository.UsuarioRepositoryPort;

@Component
public class UsuarioRepository implements UsuarioRepositoryPort {

	private final SpringUsuarioRepository springUsuarioRepository;
	
	public UsuarioRepository(SpringUsuarioRepository springUsuarioRepository) {
        this.springUsuarioRepository = springUsuarioRepository;
    }
	@Override
	public List<UserDTO> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUser(UserDTO usuarioDTO) {
		UserEntity userEntity = new UserEntity(usuarioDTO.getId(), usuarioDTO.getPassword());
		springUsuarioRepository.save(userEntity);

	}

	@Override
	public UserDTO buscarId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
