package com.socialnetwork.mRepository;

import com.socialnetwork.model.Comments;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CommentRepository extends CrudRepository<Comments, Long> {
    Optional<Comments> findAllComments();
    Comments findCommentsById(Long id);
}
