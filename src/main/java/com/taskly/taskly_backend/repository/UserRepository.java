package com.taskly.taskly_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskly.taskly_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
