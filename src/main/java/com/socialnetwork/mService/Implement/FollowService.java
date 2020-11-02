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
    public Iterable<Follow> iFindAll() {
        return followRepository.findAll();
    }

    @Override
    public Optional<Follow> iFindById(Long id) {
        return followRepository.findById(id);
    }

    @Override
    public Follow iSave(Follow follow) {
        return followRepository.save(follow);
    }

    @Override
    public void iRemove(Long id) {
        followRepository.deleteById(id);
    }
}
