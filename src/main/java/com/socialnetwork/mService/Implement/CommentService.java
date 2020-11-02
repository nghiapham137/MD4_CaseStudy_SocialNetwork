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
    public Iterable<Comments> iFindAll() {
        return commentRepository.findAll();
    }

    @Override
    public Optional<Comments> iFindById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public Comments iSave(Comments comments) {
        return commentRepository.save(comments);
    }

    @Override
    public void iRemove(Long id) {
        commentRepository.deleteById(id);
    }
}
