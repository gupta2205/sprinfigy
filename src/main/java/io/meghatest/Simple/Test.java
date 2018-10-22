package io.meghatest.Simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mgupta on Oct, 2018
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        Hello instance1 = context.getBean(Hello.class);
        instance1.sayHello();
        Hello instance2 = context.getBean(Hello.class);
        instance1.sayHello();
        System.out.println(instance1==instance2);

        context.close();

    }
}
