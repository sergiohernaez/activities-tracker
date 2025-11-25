package com.sergiohernaez.activitiesTracker.service;

import com.sergiohernaez.activitiesTracker.controller.dto.ActivityDTO;
import com.sergiohernaez.activitiesTracker.infrastructure.mapper.ActivityMapper;
import com.sergiohernaez.activitiesTracker.infrastructure.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final ActivityMapper activityMapper;
    private final ActivityRepository activityRepository;

    public List<ActivityDTO> getLogs(Long postId) {
        //TODO
        return new ArrayList<>();
    }
}
