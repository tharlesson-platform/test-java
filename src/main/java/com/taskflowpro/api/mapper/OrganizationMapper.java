// src/main/java/com/taskflowpro/api/mapper/OrganizationMapper.java
package com.taskflowpro.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrganizationMapper {
    OrganizationMapper INSTANCE = Mappers.getMapper(OrganizationMapper.class);

    // Implement your mappings here
}