package com.twitapp.notification.service;

import com.twitapp.clients.notification.NotificationRequest;

public interface NotificationService {

    void sendNotification(NotificationRequest request);
}
