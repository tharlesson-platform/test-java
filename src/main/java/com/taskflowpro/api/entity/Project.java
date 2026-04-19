package com.taskflowpro.api.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String status;
    private String priority;
    private String startDate;
    private String endDate;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @ManyToMany(mappedBy = "projects")
    private List<Team> teams;

    @OneToMany(mappedBy = "project")
    private List<Task> tasks;
}