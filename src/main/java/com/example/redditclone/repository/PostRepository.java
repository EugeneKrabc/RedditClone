package com.example.redditclone.repository;

import com.example.redditclone.model.Post;
import com.example.redditclone.model.RedditUser;
import com.example.redditclone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByRedditUser(RedditUser redditUser);
    List<Post> findAllBySubreddit(Subreddit subreddit);
}
