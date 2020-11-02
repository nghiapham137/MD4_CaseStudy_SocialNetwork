package com.socialnetwork.mService.iService;

import com.socialnetwork.model.Dislikes;

import java.util.Optional;

public interface IDislikeService {
    Optional<Dislikes> findAllDislike();
    Dislikes findDislikeById(Long id);
    Dislikes saveDislike(Dislikes dislikes);
    void removeDislikeById(Long id);
}
