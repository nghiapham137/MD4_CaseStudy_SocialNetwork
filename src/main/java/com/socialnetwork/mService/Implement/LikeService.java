package com.socialnetwork.mService.Implement;

import com.socialnetwork.mRepository.LikeRepository;
import com.socialnetwork.mService.iService.ILikeService;
import com.socialnetwork.model.Likes;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class LikeService implements ILikeService {

    @Autowired
    private LikeRepository likeRepository;

    @Override
    public Iterable<Likes> iFindAll() {
        return likeRepository.findAll();
    }

    @Override
    public Optional<Likes> iFindById(Long id) {
        return likeRepository.findById(id);
    }

    @Override
    public Likes iSave(Likes like) {
        return likeRepository.save(like);
    }

    @Override
    public void iRemove(Long id) {
        likeRepository.deleteById(id);
    }
}
