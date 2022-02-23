package com.twitapp.tweet.service;

import com.twitapp.tweet.dto.request.TweetCreateRequest;
import com.twitapp.tweet.dto.request.TweetRetweetRequest;
import com.twitapp.tweet.dto.response.TweetResponse;
import com.twitapp.tweet.model.Tweet;
import com.twitapp.tweet.repository.TweetRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TweetServiceImpl implements TweetService{

    private final TweetRepository tweetRepository;
    private final  ModelMapper modelMapper;

    @Override
    public TweetResponse createTweet(TweetCreateRequest request) {
        Tweet tweet = modelMapper.map(request, Tweet.class);
        Tweet savedTweet = tweetRepository.save(tweet);

        return modelMapper.map(savedTweet, TweetResponse.class);
    }

    @Override
    public TweetResponse retweetTweet(TweetRetweetRequest request) {
        Tweet foundTweet = tweetRepository.getById(request.getOriginalTweetId());
        Tweet retweet = modelMapper.map(request, Tweet.class);
        retweet.setOriginalTweet(foundTweet);
        return modelMapper.map(tweetRepository.save(retweet), TweetResponse.class);
    }
}
