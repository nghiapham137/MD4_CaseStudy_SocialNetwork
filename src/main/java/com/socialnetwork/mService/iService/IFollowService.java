package com.socialnetwork.mService.iService;


import com.socialnetwork.model.Follow;

import java.util.Optional;

public interface IFollowService {
    Optional<Follow> findAllFollow();
    Follow findFollowById(Long id);
    void saveFollow(Follow follow);
    void removeFollowById(Long id);
}
