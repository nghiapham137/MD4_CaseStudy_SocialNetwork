package com.socialnetwork.mService.Implement;

import com.socialnetwork.mRepository.AppUserRepository;
import com.socialnetwork.mService.iService.IAppUserService;
import com.socialnetwork.model.App_User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AppUserService implements IAppUserService {

    @Autowired
    private AppUserRepository appUserRepository;


    @Override
    public Iterable<App_User> iFindAll() {
        return appUserRepository.findAll();
    }

    @Override
    public Optional<App_User> iFindById(Long id) {
        return appUserRepository.findById(id);
    }

    @Override
    public void iSave(App_User user) {
        appUserRepository.save(user);
    }

    @Override
    public void iRemove(Long id) {
        appUserRepository.deleteById(id);
    }
}
