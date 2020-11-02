package com.socialnetwork.mRepository;

import com.socialnetwork.model.Comments;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CommentRepository extends CrudRepository<Comments, Long> {
    Iterable<Comments> findAll();
    Optional<Comments> findById(Long id);
}
