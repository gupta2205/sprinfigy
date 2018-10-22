package io.meghatest.Simple;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by mgupta on Oct, 2018
 */

@Component
@Scope("prototype")
public class Hello {


    public void sayHello(){
        System.out.println("from hello");
    }
}
