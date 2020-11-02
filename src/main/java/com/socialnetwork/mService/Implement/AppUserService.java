package com.socialnetwork.mService.Implement;

import com.socialnetwork.mRepository.AppRoleRepository;
import com.socialnetwork.mRepository.AppUserRepository;
import com.socialnetwork.mService.iService.IAppUserService;
import com.socialnetwork.model.App_User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AppUserService implements IAppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private AppRoleRepository appRoleRepository;

    @Override
    public Iterable<App_User> findAllAppUser() {
        return appUserRepository.findAll();
    }

    @Override
    public App_User findAppUserById(Long id) {
        return appUserRepository.findApp_UserById(id);
    }

    @Override
    public void save(App_User user) {
        appUserRepository.save(user);
    }

    @Override
    public void remove(Long id) {
        appUserRepository.deleteById(id);
    }
}
