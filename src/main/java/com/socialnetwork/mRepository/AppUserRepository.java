package com.socialnetwork.mRepository;

import com.socialnetwork.model.App_User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AppUserRepository extends CrudRepository<App_User, Long> {
    Iterable<App_User> findAll();
    Optional<App_User> findByFullName(String name);
    Optional<App_User> findById(Long id);
    Optional<App_User> findByActive(boolean active);
}
