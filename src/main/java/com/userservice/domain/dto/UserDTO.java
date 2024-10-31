package com.userservice.domain.dto;

import com.userservice.adapters.entity.UserEntity;

public class UserDTO {
	
	
	private long id;
	private String userId;
	private String password;

	public long getId() {
		return id;
	}
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserDTO() {
	}
	
	
	
}
