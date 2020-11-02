package com.socialnetwork.mService.iService;

import com.socialnetwork.model.Comments;

import java.util.Optional;

public interface ICommentService {
    Iterable<Comments> iFindAll();
    Optional<Comments> iFindById(Long id);
    Comments iSave(Comments comments);
    void iRemove(Long id);
}
