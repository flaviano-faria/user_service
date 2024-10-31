package com.userservice.adapter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userservice.adapters.entity.UserEntity;

@Repository
public interface SpringUserRepository extends JpaRepository<UserEntity, Long>{

}
