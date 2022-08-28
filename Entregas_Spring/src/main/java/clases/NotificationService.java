package clases;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){

    }

    public void saludarUser(){

        System.out.println("Saludos usuario desde Spring");

    }

}
