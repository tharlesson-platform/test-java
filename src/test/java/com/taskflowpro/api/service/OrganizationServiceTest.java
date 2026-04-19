package com.taskflowpro.api.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OrganizationServiceTest {

    @Autowired
    private OrganizationService organizationService;

    @Test
    public void shouldInjectOrganizationService() {
        assertNotNull(organizationService);
    }
}