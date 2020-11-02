package com.socialnetwork.mService.iService;

import com.socialnetwork.model.App_User;

import java.util.Optional;

public interface IAppUserService {
        Iterable<App_User> iFindAll();
        Optional<App_User> iFindById(Long id);
        void iSave(App_User user);
        void iRemove(Long id);
}
