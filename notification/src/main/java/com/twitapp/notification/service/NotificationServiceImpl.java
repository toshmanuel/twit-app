package com.twitapp.notification.service;

import com.twitapp.clients.notification.NotificationRequest;
import com.twitapp.notification.model.Notification;
import com.twitapp.notification.repository.NotificationRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificationServiceImpl implements NotificationService{
    private final ModelMapper modelMapper;
    private final NotificationRepository notificationRepository;

    @Override
    public void sendNotification(NotificationRequest request) {
        Notification notification = modelMapper.map(request, Notification.class);
        notificationRepository.save(notification);
    }
}
