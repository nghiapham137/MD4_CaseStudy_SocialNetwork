package com.socialnetwork.mService.iService;

import com.socialnetwork.model.Posts;

import java.util.Optional;

public interface IPostService {
    Iterable<Posts> iFindAll();
    Optional<Posts> iFindById(Long id);
    Posts iSave(Posts Posts);
    void iRemove(Long id);
}
