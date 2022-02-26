package com.twitapp.clients.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse {
    private String name;
    private String phone;
    private String email;
    private LocalDateTime createdAt;
}
