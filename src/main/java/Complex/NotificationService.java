package Complex;

import Complex.email.emailService;
import org.springframework.stereotype.Component;

/**
 * Created by mgupta on Oct, 2018
 */

@Component
public class NotificationService {

    private emailService emailService;
    public void NotificationService(emailService emailService){
        this.emailService= emailService;
    }
    public void sendNotification(String To, String message){
    emailService.sendEmail(To,message);

    }
}
