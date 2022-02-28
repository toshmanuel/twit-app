package com.twitapp.notification.controller;

import com.twitapp.clients.notification.NotificationRequest;
import com.twitapp.notification.service.NotificationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/notification")
@AllArgsConstructor
public class NotificationController {


    private final NotificationService notificationService;

    @PostMapping
    public ResponseEntity<Void> sendNotification(@RequestBody NotificationRequest request){
        notificationService.sendNotification(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
