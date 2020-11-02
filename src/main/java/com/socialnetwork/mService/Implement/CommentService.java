package com.socialnetwork.mService.Implement;

import com.socialnetwork.mRepository.CommentRepository;
import com.socialnetwork.mService.iService.ICommentService;
import com.socialnetwork.model.Comments;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CommentService implements ICommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Optional<Comments> findAllComments() {
        return commentRepository.findAllComments();
    }

    @Override
    public Comments findCommentsById(Long id) {
        return commentRepository.findCommentsById(id);
    }

    @Override
    public Comments saveComments(Comments comments) {
        return commentRepository.save(comments);
    }

    @Override
    public void removeCommentsById(Long id) {
        commentRepository.deleteById(id);
    }
}
