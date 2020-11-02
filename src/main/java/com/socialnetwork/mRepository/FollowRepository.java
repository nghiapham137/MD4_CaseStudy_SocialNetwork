package com.socialnetwork.mRepository;

import com.socialnetwork.model.Follow;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FollowRepository extends CrudRepository<Follow, Long> {
    Optional<Follow> findAllFollow();
    Follow findFollowById(Long id);
}
