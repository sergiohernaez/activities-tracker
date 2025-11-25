package com.sergiohernaez.activitiesTracker.infrastructure.mapper;

import com.sergiohernaez.activitiesTracker.controller.dto.UserDTO;
import com.sergiohernaez.activitiesTracker.domain.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDTO sourceToDestination(User source);
    User destinationToSource(UserDTO destination);
}
