package com.taskflowpro.api.dto;

import lombok.Data;

@Data
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private String deadline;
    private Double estimateHours;
    private Double hoursWorked;
}