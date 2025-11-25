package com.sergiohernaez.activitiesTracker.controller.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    private Long id;
    private String title;
    private String description;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private UserDTO authorUserId;
    private List<UserDTO> likes;
    private List<ActivityDTO> activities;

}
