package com.socialnetwork.service.impl;

import com.socialnetwork.model.App_User;
import com.socialnetwork.model.Posts;
import com.socialnetwork.repository.app_user.UserRepository;
import com.socialnetwork.repository.post.PostRepository;
import com.socialnetwork.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<Posts> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Posts> findById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public void save(Posts posts) {
        postRepository.save(posts);
    }

    @Override
    public void remove(Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public int countPostByAuthor(Long id) {
        Optional<App_User> user = userRepository.findById(id);
        Iterable<Posts> posts = postRepository.findAllByAuthor(user);
        int count = 0;
        for(Posts post : posts) {
            count++;
        }
        return count;


    }
}
