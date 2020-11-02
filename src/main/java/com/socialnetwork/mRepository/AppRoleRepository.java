package com.socialnetwork.mRepository;

import com.socialnetwork.model.App_Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AppRoleRepository extends CrudRepository<App_Role, Long> {
    Optional<App_Role> findAllAppRole();
    Optional<App_Role> findAllAppRoleByName(String name);
    App_Role findApp_RoleById(Long id);
}
