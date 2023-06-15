package org.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    private NotificationService notificationService;

    public UserService(NotificationService notificationService){
        System.out.println("Ejecutando en el constructor de UserService");
        this.notificationService =notificationService;
    }

    public NotificationService getNotificacionService() {
        return notificationService;
    }
}
