package com.taskly.taskly_backend.service;

import org.springframework.stereotype.Service;

import com.taskly.taskly_backend.repository.CommentRepository;

@Service
public class CommentService {
	private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    // CRUD methods for Comment
}
