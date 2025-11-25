package com.sergiohernaez.activitiesTracker.controller;

import com.sergiohernaez.activitiesTracker.controller.dto.ActivityDTO;
import com.sergiohernaez.activitiesTracker.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ActivityController {

    private final ActivityService logService;

    @GetMapping("/log/{postId}/")
    public List<ActivityDTO> getLogs(@PathVariable Long postId) {
        return logService.getLogs(postId);
    }


}
