package com.socialnetwork.service.impl;

import com.socialnetwork.model.App_User;
import com.socialnetwork.repository.app_user.UserRepository;
import com.socialnetwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<App_User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<App_User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(App_User user) {
        userRepository.save(user);
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void blockUser(Long id) {
        Optional<App_User> user = findById(id);
        if (user.isPresent()) {
           // user.get().setActive(false);
        }else {
            System.out.println("User is not existed");
        }
    }
}
