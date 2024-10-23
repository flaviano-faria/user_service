package com.userservice.ports.repositories;

import com.userservice.domain.dto.UserDTO;

public interface UserRepositoryPort {
	
	public void insertUser(UserDTO userDTO);

}
