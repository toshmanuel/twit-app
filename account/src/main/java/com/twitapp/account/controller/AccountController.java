package com.twitapp.account.controller;

import com.twitapp.account.dto.request.CreateAccountRequest;
import com.twitapp.account.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/accounts")
@AllArgsConstructor
@Slf4j
public class AccountController {

    private final AccountService accountService;

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody CreateAccountRequest request){
        log.info("About to register a new account -> {}", request);
        return new ResponseEntity<>(accountService.createAccount(request), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findAccount(@PathVariable(value = "id") Long id){

        System.out.println("I think I was called");
        return new ResponseEntity<>(accountService.findAccount(id), HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<?> findAllAccount(){
        return new ResponseEntity<>(accountService.getAllAccount(), HttpStatus.OK);
    }
}
