package com.sergiohernaez.activitiesTracker.controller;

import com.sergiohernaez.activitiesTracker.controller.dto.LogDTO;
import com.sergiohernaez.activitiesTracker.service.LogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class LogController {

    private final LogService logService;

    @GetMapping("/log/{postId}/")
    public List<LogDTO> getLogs(@PathVariable Long postId) {
        return logService.getLogs(postId);
    }


}
