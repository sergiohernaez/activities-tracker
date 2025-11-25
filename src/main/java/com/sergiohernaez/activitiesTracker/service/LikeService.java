package com.sergiohernaez.activitiesTracker.service;

import com.sergiohernaez.activitiesTracker.infrastructure.repository.PostRepository;
import com.sergiohernaez.activitiesTracker.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LikeService {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public Boolean addLike(String idPost, String idUser) {
        //TODO
        return true;
    }

    public Boolean removeLike(String idPost, String idUser) {
        //TODO
        return true;
    }

}
