package com.twitapp.tweet.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TweetRetweetRequest {
    private String content;
    private Long authorId;
    private Long originalTweetId;
}
