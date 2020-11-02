package com.socialnetwork.mService.iService;

import com.socialnetwork.model.App_Role;

import java.util.Optional;

public interface IAppRoleService {
    Iterable<App_Role> iFindAll();
    Optional<App_Role> iFindById(Long id);
    void iSave (App_Role app_role);
    void iRemove (Long id);
}
