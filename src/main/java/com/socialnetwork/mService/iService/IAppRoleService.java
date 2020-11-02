package com.socialnetwork.mService.iService;

import com.socialnetwork.model.App_Role;

import java.util.Optional;

public interface IAppRoleService {
    Optional<App_Role> findAllAppRole();
    App_Role findAppRoleById(Long id);
    void saveApp_Role (App_Role app_role);
    void removeApp_Role (Long id);
}
