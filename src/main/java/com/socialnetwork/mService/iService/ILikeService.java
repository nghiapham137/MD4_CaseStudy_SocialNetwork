package com.socialnetwork.mService.iService;

import com.socialnetwork.model.Likes;

import java.util.Optional;

public interface ILikeService {
    Optional<Likes> findAllLike();
    Likes findLikeById(Long id);
    void saveLike(Likes Likes);
    void removeLikeById(Long id);
}
