package com.twitapp.tweet.service;

import com.twitapp.tweet.dto.request.TweetCreateRequest;
import com.twitapp.tweet.dto.request.TweetRetweetRequest;
import com.twitapp.tweet.dto.response.TweetResponse;

public interface TweetService {

    TweetResponse createTweet(TweetCreateRequest request);
    TweetResponse retweetTweet(TweetRetweetRequest request);
}
