package com.socialnetwork.mService.Implement;

import com.socialnetwork.mRepository.AppRoleRepository;
import com.socialnetwork.mRepository.AppUserRepository;
import com.socialnetwork.mService.iService.IAppRoleService;
import com.socialnetwork.model.App_Role;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AppRoleService implements IAppRoleService {

    @Autowired
    private AppRoleRepository appRoleRepository;

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public Optional<App_Role> findAllAppRole() {
        return appRoleRepository.findAllAppRole();
    }

    @Override
    public App_Role findAppRoleById(Long id) {
        return appRoleRepository.findAppRoleById(id);
    }

    @Override
    public void saveApp_Role(App_Role app_role) {
        appRoleRepository.save(app_role);
    }

    @Override
    public void removeApp_Role(Long id) {
        appRoleRepository.deleteById(id);
    }
}
