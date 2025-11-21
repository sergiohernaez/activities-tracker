package com.sergiohernaez.activitiesTracker.controller;

import com.sergiohernaez.activitiesTracker.service.PostService;
import com.sergiohernaez.activitiesTracker.controller.dto.PostDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/post")
    public List<PostDTO> getPosts() {
        return postService.getPosts();
    }

    @GetMapping("/post/{postId}/")
    public PostDTO getPost(@PathVariable Long postId) {
        return postService.getPost(postId);
    }

    @PostMapping("/post")
    public ResponseEntity<String> addPost(@RequestBody PostDTO postDTO) {
        if(postService.addPost(postDTO)) return new ResponseEntity<>("Added",HttpStatus.OK);
        else return new ResponseEntity<>("Could not be added",HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/post")
    public ResponseEntity<String> updatePost(@RequestBody PostDTO postDTO) {
        if(postService.updatePost(postDTO)) return new ResponseEntity<>("Updated",HttpStatus.OK);
        else return new ResponseEntity<>("Could not be updated",HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/post/{postId}/")
    public ResponseEntity<String> deletePost(@PathVariable Long postId) {
        if(postService.deletePost(postId)) return new ResponseEntity<>("Deleted",HttpStatus.OK);
        else return new ResponseEntity<>("Could not be deleted",HttpStatus.BAD_REQUEST);
    }


}
