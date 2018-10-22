package io.meghatest.Simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class Application {

//    @Bean // only for singloton
//    @Scope("prototype")
//    public Hello testFunction(){
//        return new Hello();
//    }
}
