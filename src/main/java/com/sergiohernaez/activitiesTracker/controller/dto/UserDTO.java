package com.sergiohernaez.activitiesTracker.controller.dto;

import com.sergiohernaez.activitiesTracker.domain.Activity;
import com.sergiohernaez.activitiesTracker.domain.Post;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private List<PostDTO> items;
    List<PostDTO> likes;
    private List<ActivityDTO> activities;
}
