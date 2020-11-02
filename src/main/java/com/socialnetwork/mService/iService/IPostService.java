package com.socialnetwork.mService.iService;

import com.socialnetwork.model.Posts;

import java.util.Optional;

public interface IPostService {
    Optional<Posts> findAllPosts();
    Posts findPostsById(Long id);
    Posts savePosts(Posts Posts);
    void removePostsById(Long id);
}
