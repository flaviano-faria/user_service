package com.userservice.adapter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userservice.adapters.entity.UserEntity;

public interface SpringUserRepository extends JpaRepository<UserEntity, Long>{

}
