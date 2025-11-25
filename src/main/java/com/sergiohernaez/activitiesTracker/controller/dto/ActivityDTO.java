package com.sergiohernaez.activitiesTracker.controller.dto;

import com.sergiohernaez.activitiesTracker.domain.Operation;
import com.sergiohernaez.activitiesTracker.domain.Post;
import com.sergiohernaez.activitiesTracker.domain.User;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityDTO {

    private Long id;
    private Long userId;
    private Post postId;
    private Operation operation;
    private LocalDate occurredAt;
}
