package com.socialnetwork.mRepository;

import com.socialnetwork.model.Posts;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PostRepository extends CrudRepository<Posts, Long> {
    Optional<Posts> findAllPosts();
    Posts findPostsById(Long id);
}
