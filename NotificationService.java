package org.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public void imprimeSaludo(){
        System.out.println("Hola desde la clase NotificationService");
    }

    public NotificationService(){
        System.out.println("Ejecutando desde el constructor de NotificacionService");
    }
}
