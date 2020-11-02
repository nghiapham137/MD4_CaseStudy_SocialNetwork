package com.socialnetwork.mRepository;

import com.socialnetwork.model.Likes;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LikeRepository extends CrudRepository<Likes, Long> {
    Optional<Likes> findAllLikes();
    Likes findLikesById(Long id);
}
