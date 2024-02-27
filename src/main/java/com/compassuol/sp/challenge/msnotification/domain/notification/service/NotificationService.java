package com.compassuol.sp.challenge.msnotification.domain.notification.service;

import com.compassuol.sp.challenge.msnotification.domain.notification.entity.Notification;
import com.compassuol.sp.challenge.msnotification.domain.notification.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;

    @Transactional
    public void saveNotification(Notification fileBody) {
            notificationRepository.insert(fileBody);
    }

}
