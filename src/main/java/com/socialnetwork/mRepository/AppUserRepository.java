package com.socialnetwork.mRepository;

import com.socialnetwork.model.App_User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AppUserRepository extends CrudRepository<App_User, Long> {
    Optional<App_User> findAllAppUser();
    Optional<App_User> findByFullName(String name);
    App_User findApp_UserById(Long id);
    Optional<App_User> findApp_UserByActive(boolean active);
    Optional<App_User> findApp_UserBySex(Integer sex);
}
