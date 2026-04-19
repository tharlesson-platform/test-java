// src/main/java/com/taskflowpro/api/mapper/TeamMapper.java
package com.taskflowpro.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamMapper {
    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);

    // Implement your mappings here
}