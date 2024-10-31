package com.userservice.adapters.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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

}
