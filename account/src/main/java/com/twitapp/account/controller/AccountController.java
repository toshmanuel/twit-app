package com.twitapp.account.controller;

import com.twitapp.account.dto.request.CreateAccountRequest;
import com.twitapp.account.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/accounts")
@AllArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody CreateAccountRequest request){
        return new ResponseEntity<>(accountService.createAccount(request), HttpStatus.CREATED);
    }
}
