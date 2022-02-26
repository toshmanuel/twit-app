package com.twitapp.clients.account;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "account", path = "/api/v1/accounts")
public interface AccountClient {

    @GetMapping("/{id}")
    ResponseEntity<?> findAccount(@PathVariable(value="id") Long id);
}
