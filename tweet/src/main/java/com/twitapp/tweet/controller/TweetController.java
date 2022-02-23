package com.twitapp.tweet.controller;

import com.twitapp.tweet.dto.request.TweetCreateRequest;
import com.twitapp.tweet.dto.request.TweetRetweetRequest;
import com.twitapp.tweet.service.TweetService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api/v1/tweets")
@AllArgsConstructor
public class TweetController {
    private final TweetService tweetService;

    @PostMapping(value = "")
    public ResponseEntity<?> createTweet(@RequestBody TweetCreateRequest request){
        return new ResponseEntity<>(tweetService.createTweet(request), HttpStatus.CREATED);
    }
    @PostMapping(value = "/retweet")
    public ResponseEntity<?> createTweet(@RequestBody TweetRetweetRequest request){
        return new ResponseEntity<>(tweetService.retweetTweet(request), HttpStatus.CREATED);
    }

}
