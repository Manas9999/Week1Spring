package com.spring.week1.introduction.springIntroduction;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue="production")
public class ProdDB implements DBIterface {

    public String getData(){
        return "This is prod data";
    }
    @PostConstruct
    void callBeforeAppleUsed(){
        System.out.println("Before Prod db is used ");
    }
}
