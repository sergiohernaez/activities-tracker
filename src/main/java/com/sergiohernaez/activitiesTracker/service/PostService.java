package com.sergiohernaez.activitiesTracker.service;

import com.sergiohernaez.activitiesTracker.domain.Post;
import com.sergiohernaez.activitiesTracker.infrastructure.mapper.PostMapper;
import com.sergiohernaez.activitiesTracker.infrastructure.repository.PostRepository;
import com.sergiohernaez.activitiesTracker.controller.dto.PostDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
@AllArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public List<PostDTO> getPosts() {
        //TODO
        return postRepository.findAll().stream().map(post -> postMapper.postToDto(post)).toList();
    }

    public PostDTO getPost(Long postId) {
        //TODO
        return null;
    }

    public Boolean addPost(PostDTO postDTO) {
        //TODO
        try {
            if(Objects.isNull(postDTO.getId())) {
                Post Post = postMapper.dtoToPost(postDTO);
                postRepository.save(Post);
                return true;
            }
            return false;
        } catch(Exception ex) {
            return false;
        }
    }

    public Boolean updatePost(PostDTO postDTO) {
        //TODO
        try {
            Optional<Post> postOptional = postRepository.findById(postDTO.getId());
            if(postOptional.isPresent()) {
                postRepository.save(postMapper.dtoToPost(postDTO));
                return true;
            }
            return false;

        } catch (Exception ex) {
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
