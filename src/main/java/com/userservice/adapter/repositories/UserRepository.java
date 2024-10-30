package com.userservice.adapter.repositories;

import org.springframework.stereotype.Component;

import com.userservice.domain.dto.UserDTO;
import com.userservice.ports.repositories.UserRepositoryPort;

@Component
public class UserRepository implements UserRepositoryPort{

	private SpringUserRepository springUserRepository;
	
	public UserRepository(SpringUserRepository springUserRepository) {
		this.springUserRepository = springUserRepository;
	}
	
	@Override
	public void insertUser(UserDTO userDTO) {
		springUserRepository.save(null);
		
	}

}
