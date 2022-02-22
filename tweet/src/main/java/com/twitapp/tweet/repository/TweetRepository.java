package com.twitapp.tweet.repository;

import com.twitapp.tweet.model.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}