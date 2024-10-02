package com.userservice.adapters.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(length = 30)
	private String userId;
	
	@Column(length = 32)
	private String name;
	
	public UserEntity(String userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	
	public void update(String userId, String name) {
		this.userId = userId;
		this.name = name;
	}

}
