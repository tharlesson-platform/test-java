// src/main/java/com/taskflowpro/api/mapper/ProjectMapper.java
package com.taskflowpro.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProjectMapper {
    ProjectMapper INSTANCE = Mappers.getMapper(ProjectMapper.class);

    // Implement your mappings here
}