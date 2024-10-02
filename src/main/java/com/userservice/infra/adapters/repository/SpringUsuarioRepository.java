package com.userservice.infra.adapters.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userservice.adapters.entity.UserEntity;

public interface SpringUsuarioRepository extends JpaRepository<UserEntity, Long>{
	

}
