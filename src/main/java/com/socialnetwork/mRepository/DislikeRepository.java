package com.socialnetwork.mRepository;

import com.socialnetwork.model.Dislikes;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DislikeRepository extends CrudRepository<Dislikes, Long> {
    Optional<Dislikes> findAllDislikes();
    Dislikes findDislikesById(Long id);
}
