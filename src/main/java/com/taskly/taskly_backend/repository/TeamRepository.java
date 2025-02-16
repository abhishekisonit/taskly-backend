package com.taskly.taskly_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskly.taskly_backend.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
