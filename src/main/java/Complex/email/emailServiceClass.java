package Complex.email;

import org.springframework.stereotype.Component;

/**
 * Created by mgupta on Oct, 2018
 */
@Component
public class emailServiceClass implements EmailService {

    public void sendEmail(String to, String message){
        System.out.println("Sending Email -----------------");
        System.out.println("To ---------------->"+ to );
        System.out.println("Messge ---------------->"   +message);
    }
}
