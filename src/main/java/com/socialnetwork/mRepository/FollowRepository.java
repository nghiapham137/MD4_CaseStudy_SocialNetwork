package com.socialnetwork.mRepository;

import com.socialnetwork.model.Follow;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FollowRepository extends CrudRepository<Follow, Long> {
    Iterable<Follow> findAll();
    Optional<Follow> findById(Long id);
}
