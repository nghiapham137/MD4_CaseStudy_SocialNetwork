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
    public Optional<Posts> findAllPosts() {
        return postRepository.findAllPosts();
    }

    @Override
    public Posts findPostsById(Long id) {
        return postRepository.findPostsById(id);
    }

    @Override
    public Posts savePosts(Posts posts) {
        return postRepository.save(posts);
    }

    @Override
    public void removePostsById(Long id) {
        postRepository.deleteById(id);
    }
}
