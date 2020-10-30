package com.socialnetwork.repository.app_user;

import com.socialnetwork.model.App_User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface UserRepository extends PagingAndSortingRepository<App_User, Long> {
    Optional<App_User> findByUsername(String username);
}
