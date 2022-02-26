package com.twitapp.tweet.dto.response;

import com.twitapp.clients.account.AccountResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TweetResponse {
    private Long id;
    private String content;
    private AccountResponse accountResponse;
    private LocalDateTime createdAt;
}
