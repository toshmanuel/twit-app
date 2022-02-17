package com.twitapp.account.service;

import com.twitapp.account.dto.request.CreateAccountRequest;
import com.twitapp.account.dto.response.AccountResponse;
import com.twitapp.account.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService{

    private final AccountRepository accountRepository;

    @Override
    public AccountResponse createAccount(CreateAccountRequest request) {
        return null;
    }
}
