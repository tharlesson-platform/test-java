// src/main/java/com/taskflowpro/api/service/TaskService.java
package com.taskflowpro.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // Implement your methods here
}