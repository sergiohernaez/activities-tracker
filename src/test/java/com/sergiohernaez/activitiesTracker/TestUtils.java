package com.sergiohernaez.activitiesTracker;

import com.sergiohernaez.activitiesTracker.domain.Post;
import com.sergiohernaez.activitiesTracker.controller.dto.PostDTO;

public class TestUtils {

    public static Post getPost() {
        return Post.builder()
                .id(1L)
                .title("Example0")
                .build();
    }

    public static Post getPostWithoutId() {
        return Post.builder()
                .title("Example0")
                .build();
    }

    public static PostDTO getPostDTO() {
        return PostDTO.builder()
                .id(1L)
                .title("Example0")
                .build();
    }

    public static PostDTO getPostDTOWithoutId() {
        return PostDTO.builder()
                .id(1L)
                .title("Example0")
                .build();
    }
}
