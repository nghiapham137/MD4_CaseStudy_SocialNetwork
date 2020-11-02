package com.socialnetwork.mService.iService;

import com.socialnetwork.model.Dislikes;

import java.util.Optional;

public interface IDislikeService {
    Iterable<Dislikes> iFindAll();
    Optional<Dislikes> iFindById(Long id);
    Dislikes iSave(Dislikes dislikes);
    void iRemove(Long id);
}
