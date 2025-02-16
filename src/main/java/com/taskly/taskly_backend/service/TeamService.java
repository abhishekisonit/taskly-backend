package com.taskly.taskly_backend.service;

import org.springframework.stereotype.Service;

import com.taskly.taskly_backend.repository.TeamRepository;

@Service
public class TeamService {
	private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    // CRUD methods for Team
}
