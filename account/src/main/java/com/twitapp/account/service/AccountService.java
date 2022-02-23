package com.twitapp.account.service;

import com.twitapp.account.dto.request.CreateAccountRequest;
import com.twitapp.account.dto.response.AccountResponse;

import java.util.List;

public interface AccountService {

    AccountResponse createAccount(CreateAccountRequest request);

    AccountResponse findAccount(Long id);

    List<AccountResponse> getAllAccount();
}
