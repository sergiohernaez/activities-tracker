package com.sergiohernaez.activitiesTracker.controller;

import com.sergiohernaez.activitiesTracker.controller.dto.PostDTO;
import com.sergiohernaez.activitiesTracker.service.LikeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LikeController {

    private final LikeService likeService;

    @PostMapping("/like")
    public ResponseEntity<String> addLike(@RequestParam String postId, @RequestParam String userId) {
        if(likeService.addLike(postId, userId)) return new ResponseEntity<>("Added", HttpStatus.OK);
        else return new ResponseEntity<>("Could not be added",HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/unlike")
    public ResponseEntity<String> removeLike(@RequestParam String postId, @RequestParam String userId) {
        if(likeService.removeLike(postId, userId)) return new ResponseEntity<>("Added", HttpStatus.OK);
        else return new ResponseEntity<>("Could not be added",HttpStatus.BAD_REQUEST);
    }
}
