package com.sergiohernaez.activitiesTracker.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PostDTO {

    private Long id;
    private String name;
    private String yearOfCreation;
    private Long championshipsWon;
    private Boolean entryFeePaid;

}
