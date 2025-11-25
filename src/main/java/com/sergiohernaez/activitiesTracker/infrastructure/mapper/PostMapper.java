package com.sergiohernaez.activitiesTracker.infrastructure.mapper;

import com.sergiohernaez.activitiesTracker.domain.Post;
import com.sergiohernaez.activitiesTracker.controller.dto.PostDTO;
import org.mapstruct.Mapper;

@Mapper
public interface PostMapper {

    PostDTO sourceToDestination(Post source);
    Post destinationToSource(PostDTO destination);
}
