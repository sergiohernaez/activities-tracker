package com.sergiohernaez.activitiesTracker.service;

import com.sergiohernaez.activitiesTracker.controller.dto.PostDTO;
import com.sergiohernaez.activitiesTracker.domain.Post;
import com.sergiohernaez.activitiesTracker.infrastructure.mapper.LikeMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@AllArgsConstructor
public class LikeService {

    private final LikeMapper likeMapper;

    //TODO la tabla de relacion va a necesitar una entidad propia

    public Boolean addLike(String idPost, String idUser) {
        //TODO
        return true;
    }

    public Boolean removeLike(String idPost, String idUser) {
        //TODO
        return true;
    }

}
