package com.twitapp.account.service;

import com.twitapp.account.dto.request.CreateAccountRequest;
import com.twitapp.account.dto.response.AccountResponse;

public interface AccountService {

    AccountResponse createAccount(CreateAccountRequest request);
}
