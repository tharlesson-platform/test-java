package com.taskflowpro.api.service;

import com.taskflowpro.api.dto.ProjectDto;
import com.taskflowpro.api.entity.Project;
import com.taskflowpro.api.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<ProjectDto> getAllProjects() {
        return projectRepository.findAll().stream()
                .map(Project::toDto)
                .collect(Collectors.toList());
    }
}