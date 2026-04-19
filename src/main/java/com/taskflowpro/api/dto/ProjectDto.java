package com.taskflowpro.api.dto;

import lombok.Data;

@Data
public class ProjectDto {
    private Long id;
    private String name;
    private String description;
    private String status;
    private String priority;
    private String startDate;
    private String endDate;
    private Long responsibleUserId;
}