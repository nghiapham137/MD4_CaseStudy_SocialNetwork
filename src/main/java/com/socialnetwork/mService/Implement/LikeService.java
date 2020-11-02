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
    public Optional<Likes> findAllLike() {
        return likeRepository.findAllLikes();
    }

    @Override
    public Likes findLikeById(Long id) {
        return likeRepository.findLikesById(id);
    }

    @Override
    public Likes saveLike(Likes likes) {
        return likeRepository.save(likes);
    }

    @Override
    public void removeLikeById(Long id) {
        likeRepository.deleteById(id);
    }
}
