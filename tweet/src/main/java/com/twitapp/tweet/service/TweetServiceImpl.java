package com.twitapp.tweet.service;

import com.twitapp.clients.account.AccountClient;
import com.twitapp.clients.account.AccountResponse;
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
    private final AccountClient accountClient;
    private final  ModelMapper modelMapper;

    @Override
    public TweetResponse createTweet(TweetCreateRequest request) {
        // TODO: date created for account response is return null, to be fixed
        AccountResponse accountResponse = modelMapper.map(accountClient.findAccount(request.getAuthor()).getBody(), AccountResponse.class);
        Tweet tweet = modelMapper.map(request, Tweet.class);
        Tweet savedTweet = tweetRepository.save(tweet);

        TweetResponse response = modelMapper.map(savedTweet, TweetResponse.class);
        response.setAccountResponse(accountResponse);
        return response;
    }

    @Override
    public TweetResponse retweetTweet(TweetRetweetRequest request) {
        Tweet foundTweet = tweetRepository.getById(request.getOriginalTweetId());
        Tweet retweet = modelMapper.map(request, Tweet.class);
        retweet.setOriginalTweet(foundTweet);
        return modelMapper.map(tweetRepository.save(retweet), TweetResponse.class);
    }
}
