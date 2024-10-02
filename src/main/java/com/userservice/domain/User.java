package com.userservice.domain;

import com.userservice.domain.dto.UserDTO;

public class User {
	
	private String id;
	private String password;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public User(UserDTO usuarioDTO) {
		super();
		this.id = usuarioDTO.getId();
		this.password = usuarioDTO.getPassword();
	}

}
