package com.socialnetwork.mService.iService;

import com.socialnetwork.model.Comments;

import java.util.Optional;

public interface ICommentService {
    Optional<Comments> findAllComments();
    Optional<Comments> findCommentsById(Long id);
    Comments saveComments(Comments comments);
    void removeCommentsById(Long id);
}
