package com.socialnetwork.mService.iService;

import com.socialnetwork.model.App_User;

import java.util.Optional;

public interface IAppUserService {
        Iterable<App_User> findAllAppUser();
        Optional<App_User> findAppUserById(Long id);
        void save(App_User user);
        void remove(Long id);
}
