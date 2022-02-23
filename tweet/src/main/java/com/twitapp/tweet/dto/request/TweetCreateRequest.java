package com.twitapp.tweet.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TweetCreateRequest {
    private String content;
    private Long author;
}
