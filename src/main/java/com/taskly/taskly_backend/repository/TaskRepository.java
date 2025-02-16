package com.taskly.taskly_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskly.taskly_backend.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
