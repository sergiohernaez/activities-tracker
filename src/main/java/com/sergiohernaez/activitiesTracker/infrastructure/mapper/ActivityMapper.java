package com.sergiohernaez.activitiesTracker.infrastructure.mapper;

import com.sergiohernaez.activitiesTracker.controller.dto.ActivityDTO;
import com.sergiohernaez.activitiesTracker.domain.Activity;
import org.mapstruct.Mapper;

@Mapper
public interface ActivityMapper {

    ActivityDTO sourceToDestination(Activity source);
    Activity destinationToSource(ActivityDTO destination);
}
