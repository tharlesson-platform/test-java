package com.taskflowpro.api.repository;

import com.taskflowpro.api.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    List<Organization> findAll();
}