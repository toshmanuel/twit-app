package com.twitapp.notification.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "notification")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    private Long receiver;
    private LocalDateTime sentAt = LocalDateTime.now();
}