package com.socialnetwork.mRepository;

import com.socialnetwork.model.App_Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AppRoleRepository extends CrudRepository<App_Role, Long> {
    Iterable<App_Role> findAll();
    Optional<App_Role> findByName(String name);
    Optional<App_Role> findById(Long id);
}
