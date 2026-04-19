// src/main/java/com/taskflowpro/api/mapper/TaskMapper.java
package com.taskflowpro.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    // Implement your mappings here
}