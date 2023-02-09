package com.example.redditclone.repository;

import com.example.redditclone.model.RedditUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<RedditUser, Long> {
    Optional<RedditUser> findByUsername(String username);
}
