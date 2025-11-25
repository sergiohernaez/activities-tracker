package com.sergiohernaez.activitiesTracker.service;

import com.sergiohernaez.activitiesTracker.domain.Post;
import com.sergiohernaez.activitiesTracker.infrastructure.mapper.PostMapper;
import com.sergiohernaez.activitiesTracker.infrastructure.repository.PostRepository;
import com.sergiohernaez.activitiesTracker.controller.dto.PostDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public List<PostDTO> getPosts() {
        //TODO
        return postRepository.findAll().stream().map(postMapper::sourceToDestination).toList();
    }

    public PostDTO getPost(Long postId) {
        //TODO
        return null;
    }

    public Boolean addPost(PostDTO postDTO) {
        //TODO
        try {
            Post Post = postMapper.destinationToSource(postDTO);
            postRepository.save(Post);
            return true;
        } catch(Exception ex) {
            return false;
        }
    }

    public Boolean updatePost(PostDTO postDTO) {
        //TODO
        try {
            if(Objects.isNull(postDTO.getId())) {
                Post Post = postMapper.destinationToSource(postDTO);
                postRepository.save(Post);
                return true;
            }
            return false;
        } catch(Exception ex) {
            return false;
        }
    }

    public Boolean deletePost(Long PostId) {
        //TODO
        try {
            postRepository.deleteById(PostId);
            return true;
        }catch(Exception ex) {
            return false;
        }
    }
}
