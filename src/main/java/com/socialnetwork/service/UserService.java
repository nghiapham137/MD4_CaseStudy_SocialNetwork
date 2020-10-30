package com.socialnetwork.service;

import com.socialnetwork.model.App_User;

import java.util.Optional;

public interface UserService {
    Iterable<App_User> findAll();
    Optional<App_User> findById(Long id);
    void save(App_User user);
    void remove(Long id);
    void blockUser(Long id);
}
