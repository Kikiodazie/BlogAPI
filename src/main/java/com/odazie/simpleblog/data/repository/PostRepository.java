package com.odazie.simpleblog.data.repository;

import com.odazie.simpleblog.data.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Post findByPostId(Long postId);

}
