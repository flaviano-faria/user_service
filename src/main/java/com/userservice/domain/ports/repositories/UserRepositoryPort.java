package com.userservice.domain.ports.repositories;

import java.util.List;

import com.userservice.adapters.entity.UserEntity;
import com.userservice.domain.dto.UserDTO;

public interface UserRepositoryPort {
	
	public void insertUser(UserDTO userDTO);
	
	public List <UserEntity> listAll();

}
