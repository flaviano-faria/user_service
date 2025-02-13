package com.userservice.adapter.repositories;

import java.util.List;

import org.springframework.stereotype.Component;

import com.userservice.adapters.entity.UserEntity;
import com.userservice.domain.dto.UserDTO;
import com.userservice.domain.ports.repositories.UserRepositoryPort;

@Component
public class UserRepository implements UserRepositoryPort{

	private SpringUserRepository springUserRepository;
	
	public UserRepository(SpringUserRepository springUserRepository) {
		this.springUserRepository = springUserRepository;
	}
	
	@Override
	public void insertUser(UserDTO userDTO) {
		
		UserEntity userEntity = new UserEntity(
				userDTO.getUserId(), userDTO.getPassword());
		
		springUserRepository.save(userEntity);
	}

	@Override
	public List<UserEntity> listAll() {
		
		return springUserRepository.findAll();
	}

}
