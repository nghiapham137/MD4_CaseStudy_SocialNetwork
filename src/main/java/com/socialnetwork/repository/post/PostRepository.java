package com.socialnetwork.repository.post;

import com.socialnetwork.model.App_User;
import com.socialnetwork.model.Posts;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Posts, Long> {
//    Iterable<Posts> findAllByAuthor(App_User author);
}
