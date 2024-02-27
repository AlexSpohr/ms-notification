package com.compassuol.sp.challenge.msnotification.domain.notification.repository;

import com.compassuol.sp.challenge.msnotification.domain.notification.entity.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends MongoRepository<Notification, String> {
}
