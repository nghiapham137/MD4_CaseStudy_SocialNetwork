package com.socialnetwork.mService.Implement;

import com.socialnetwork.mRepository.DislikeRepository;
import com.socialnetwork.mService.iService.IDislikeService;
import com.socialnetwork.model.Dislikes;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class DislikeService implements IDislikeService {

    @Autowired
    private DislikeRepository dislikeRepository;

    @Override
    public Optional<Dislikes> findAllDislike() {
        return dislikeRepository.findAllDislikes();
    }

    @Override
    public Dislikes findDislikeById(Long id) {
        return dislikeRepository.findDislikesById(id);
    }

    @Override
    public Dislikes saveDislike(Dislikes dislikes) {
        return dislikeRepository.save(dislikes);
    }

    @Override
    public void removeDislikeById(Long id) {
        dislikeRepository.deleteById(id);
    }
}
