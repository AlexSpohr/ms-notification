package com.compassuol.sp.challenge.msnotification.domain.notification.consumer;

import com.compassuol.sp.challenge.msnotification.domain.notification.entity.Notification;
import com.compassuol.sp.challenge.msnotification.domain.notification.service.NotificationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NotificationConsumer {
    private final NotificationService notificationService;

    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void receive(String fileBody){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Notification notification = objectMapper.readValue(fileBody, Notification.class);
            notificationService.saveNotification(notification);
        } catch (Exception e) {
            throw new RuntimeException("Error converting fileBody to Notification");
        }
    }
}
