package com.compassuol.sp.challenge.msnotification.domain.notification.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "notifications")
public class Notification implements Serializable {

    @Id
    private String id;

    private String email;

    private String event;

    private Date date;

}
