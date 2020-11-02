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
    public Iterable<Dislikes> iFindAll() {
        return dislikeRepository.findAll();
    }

    @Override
    public Optional<Dislikes> iFindById(Long id) {
        return dislikeRepository.findById(id);
    }

    @Override
    public Dislikes iSave(Dislikes dislikes) {
        return dislikeRepository.save(dislikes);
    }

    @Override
    public void iRemove(Long id) {
        dislikeRepository.deleteById(id);
    }
}
