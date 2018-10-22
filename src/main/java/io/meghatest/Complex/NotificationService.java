package io.meghatest.Complex;

import io.meghatest.Complex.email.EmailService;
import org.springframework.stereotype.Component;

/**
 * Created by mgupta on Oct, 2018
 */

@Component
public class NotificationService {

    private EmailService emailService;
    public NotificationService(EmailService emailService){
        this.emailService= emailService;
    }
    public void sendNotification(String to, String message){
    this.emailService.sendEmail(to,message);

    }
}
