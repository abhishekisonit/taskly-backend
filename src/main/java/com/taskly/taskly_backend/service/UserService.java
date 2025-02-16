package com.taskly.taskly_backend.service;

import org.springframework.stereotype.Service;

import com.taskly.taskly_backend.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // CRUD methods for User
}
