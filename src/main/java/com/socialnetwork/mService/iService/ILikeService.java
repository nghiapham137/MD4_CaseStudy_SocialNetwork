package com.socialnetwork.mService.iService;

import com.socialnetwork.model.Likes;

import java.util.Optional;

public interface ILikeService {
    Iterable<Likes> iFindAll();
    Optional<Likes> iFindById(Long id);
    Likes iSave(Likes Likes);
    void iRemove(Long id);
}
