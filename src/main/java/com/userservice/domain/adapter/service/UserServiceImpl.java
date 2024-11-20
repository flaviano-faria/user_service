package com.userservice.domain.adapter.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.userservice.adapters.entity.UserEntity;
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

	@Override
	public List<UserDTO> findAll() {
		List <UserEntity> listEntity = this.userRepositoryPort.listAll();
		return toUserDTOList(listEntity);
	}
	
	public List<UserDTO> toUserDTOList(List<UserEntity> userEntityList){
		return userEntityList.stream()
			             .map(user->new UserDTO(user.getId(), user.getUserId(), user.getPassword()))
			             .collect(Collectors.toList());
	}

}
