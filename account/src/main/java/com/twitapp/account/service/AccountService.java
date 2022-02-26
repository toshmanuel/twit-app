package com.twitapp.account.service;

import com.twitapp.account.dto.request.CreateAccountRequest;
import com.twitapp.clients.account.AccountResponse;

import java.util.List;

public interface AccountService {

    AccountResponse createAccount(CreateAccountRequest request);

    AccountResponse findAccount(Long id);

    List<AccountResponse> getAllAccount();
}
