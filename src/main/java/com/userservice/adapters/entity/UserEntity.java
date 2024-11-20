package com.userservice.adapters.entity;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.userservice.domain.dto.UserDTO;

@Entity
@Table(name = "user")
public class UserEntity {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(length = 30)
	private String userId;
	
	@Column(length = 32)
	private String password;
	
	public UserEntity(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	
	public UserEntity() {
	}
	
	public void update(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	

	public long getId() {
		return id;
	}

	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

}
