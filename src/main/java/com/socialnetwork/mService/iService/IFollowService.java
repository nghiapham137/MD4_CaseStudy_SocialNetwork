package com.socialnetwork.mService.iService;


import com.socialnetwork.model.Follow;

import java.util.Optional;

public interface IFollowService {
    Iterable<Follow> iFindAll();
    Optional<Follow> iFindById(Long id);
    Follow iSave(Follow follow);
    void iRemove(Long id);
}
