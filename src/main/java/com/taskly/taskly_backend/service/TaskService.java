package com.taskly.taskly_backend.service;

import org.springframework.stereotype.Service;

import com.taskly.taskly_backend.repository.TaskRepository;

@Service
public class TaskService {
	private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}
