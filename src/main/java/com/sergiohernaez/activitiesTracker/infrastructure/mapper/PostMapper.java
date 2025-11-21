package com.sergiohernaez.activitiesTracker.infrastructure.mapper;

import com.sergiohernaez.activitiesTracker.domain.Post;
import com.sergiohernaez.activitiesTracker.controller.dto.PostDTO;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {

    public PostDTO postToDto(Post post) {
        //todo
        return PostDTO.builder().build();
    }

    public Post dtoToPost(PostDTO postDto) {
        //todo
        return Post.builder().build();
    }
    }
