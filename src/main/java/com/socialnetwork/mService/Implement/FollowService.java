package com.socialnetwork.mService.Implement;

import com.socialnetwork.mRepository.FollowRepository;
import com.socialnetwork.mService.iService.IFollowService;
import com.socialnetwork.model.Follow;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class FollowService implements IFollowService {

    @Autowired
    private FollowRepository followRepository;

    @Override
    public Optional<Follow> findAllFollow() {
        return followRepository.findAllFollow();
    }

    @Override
    public Follow findFollowById(Long id) {
        return followRepository.findFollowById(id);
    }

    @Override
    public Follow saveFollow(Follow follow) {
        return followRepository.save(follow);
    }

    @Override
    public void removeFollowById(Long id) {
        followRepository.deleteById(id);
    }
}
