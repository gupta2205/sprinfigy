package io.meghatest.Complex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mgupta on Oct, 2018
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  context;
        context = new AnnotationConfigApplicationContext(Application.class);

        NotificationService service= context.getBean(NotificationService.class);

        service.sendNotification("megha.gupta2205@gmail.com", "HI");

        context.close();
    }
}
