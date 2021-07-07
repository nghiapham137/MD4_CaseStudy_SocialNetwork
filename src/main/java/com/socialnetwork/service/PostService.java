package com.socialnetwork.service;

import com.socialnetwork.model.Posts;

import java.util.Optional;

public interface PostService {
    Iterable<Posts> findAll();
    Optional<Posts> findById(Long id);
    void save(Posts posts);
    void remove(Long id);
    int countPostByAuthor(Long id);
}
