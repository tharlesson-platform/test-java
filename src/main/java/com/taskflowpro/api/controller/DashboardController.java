package com.taskflowpro.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    @Autowired
    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/project-summary")
    public ResponseEntity<Object> getProjectSummary() {
        return ResponseEntity.ok(dashboardService.getProjectSummary());
    }

    @GetMapping("/tasks-by-status")
    public ResponseEntity<Object> getTasksByStatus() {
        return ResponseEntity.ok(dashboardService.getTasksByStatus());
    }

    @GetMapping("/tasks-by-priority")
    public ResponseEntity<Object> getTasksByPriority() {
        return ResponseEntity.ok(dashboardService.getTasksByPriority());
    }

    @GetMapping("/late-tasks")
    public ResponseEntity<Object> getLateTasks() {
        return ResponseEntity.ok(dashboardService.getLateTasks());
    }

    @GetMapping("/tasks-by-user/{userId}")
    public ResponseEntity<Object> getTasksByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(dashboardService.getTasksByUser(userId));
    }

    @GetMapping("/projects-with-largest-backlog")
    public ResponseEntity<Object> getProjectsLargestBacklog() {
        return ResponseEntity.ok(dashboardService.getProjectsLargestBacklog());
    }

    @GetMapping("/dashboard-indicators")
    public ResponseEntity<Object> getDashboardIndicators() {
        return ResponseEntity.ok(dashboardService.getDashboardIndicators());
    }
}