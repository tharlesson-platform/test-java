package com.taskflowpro.api.service;

import com.taskflowpro.api.dto.TeamDto;
import com.taskflowpro.api.entity.Team;
import com.taskflowpro.api.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<TeamDto> getAllTeams() {
        return teamRepository.findAll().stream()
                .map(Team::toDto)
                .collect(Collectors.toList());
    }
}