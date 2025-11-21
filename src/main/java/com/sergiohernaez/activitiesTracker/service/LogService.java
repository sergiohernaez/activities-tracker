package com.sergiohernaez.activitiesTracker.service;

import com.sergiohernaez.activitiesTracker.controller.dto.LogDTO;
import com.sergiohernaez.activitiesTracker.infrastructure.mapper.LogMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class LogService {

    private final LogMapper logMapper;

    public List<LogDTO> getLogs(Long postId) {
        //TODO
        return new ArrayList<>();
    }
}
