package com.twitapp.account.service;

import com.twitapp.account.dto.request.CreateAccountRequest;
import com.twitapp.account.model.Account;
import com.twitapp.account.repository.AccountRepository;
import com.twitapp.clients.account.AccountResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final ModelMapper modelMapper;

    @Override
    public AccountResponse createAccount(CreateAccountRequest request) {
        // TODO: validate email and phone number
        // TODO: check if phone number, email, and username does not exists
        Account account = modelMapper.map(request, Account.class);
        System.out.println();
        accountRepository.save(account);
        return modelMapper.map(account, AccountResponse.class);
    }

    @Override
    public AccountResponse findAccount(Long id) {
        return accountRepository.findById(id).map(
                (account) -> new AccountResponse(
                        account.getName(),
                        account.getPhone(),
                        account.getEmail(),
                        account.getCreatedAt()
                )).orElseThrow();
    }

    @Override
    public List<AccountResponse> getAllAccount() {
        return accountRepository.findAll().stream().map((account) -> new AccountResponse(
                        account.getName(),
                        account.getPhone(),
                        account.getEmail(),
                        account.getCreatedAt()
                )
        ).collect(Collectors.toList());
    }


}
