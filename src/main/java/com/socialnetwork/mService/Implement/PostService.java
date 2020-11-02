package com.socialnetwork.mService.Implement;

import com.socialnetwork.mRepository.PostRepository;
import com.socialnetwork.mService.iService.IPostService;
import com.socialnetwork.model.Posts;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PostService implements IPostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public Iterable<Posts> iFindAll() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Posts> iFindById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public Posts iSave(Posts post) {
        return postRepository.save(post);
    }

    @Override
    public void iRemove(Long id) {
        postRepository.deleteById(id);
    }
}
