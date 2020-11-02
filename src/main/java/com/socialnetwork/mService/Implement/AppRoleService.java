package com.socialnetwork.mService.Implement;

import com.socialnetwork.mRepository.AppRoleRepository;
import com.socialnetwork.mService.iService.IAppRoleService;
import com.socialnetwork.model.App_Role;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AppRoleService implements IAppRoleService {

    @Autowired
    private AppRoleRepository appRoleRepository;

    @Override
    public Iterable<App_Role> iFindAll() {
        return appRoleRepository.findAll();
    }

    @Override
    public Optional<App_Role> iFindById(Long id) {
        return appRoleRepository.findById(id);
    }

    @Override
    public void iSave(App_Role app_role) {
        appRoleRepository.save(app_role);
    }

    @Override
    public void iRemove(Long id) {
        appRoleRepository.deleteById(id);
    }
}
