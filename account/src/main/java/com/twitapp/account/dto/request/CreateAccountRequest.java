package com.twitapp.account.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CreateAccountRequest {
    private String name;
    private String phone;
    private String email;
    private String password;
}
