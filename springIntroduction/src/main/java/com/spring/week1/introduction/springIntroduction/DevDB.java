package com.spring.week1.introduction.springIntroduction;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue="dev")
public class DevDB  implements DBIterface{


    @Override
    public String getData() {
        return "This is Dev data";
    }
    @PostConstruct
    void callBeforeAppleUsed(){
        System.out.println("Before DEVDB is used ");
    }
}
