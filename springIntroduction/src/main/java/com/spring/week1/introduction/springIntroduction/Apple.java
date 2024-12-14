package com.spring.week1.introduction.springIntroduction;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple {


    void eatApple(){
        System.out.println("Eating apple is good for health");

    }

    @PostConstruct
    void callBeforeAppleUsed(){
        System.out.println("Before Apple is used ");
    }
    @PreDestroy
    void callBeforeDestroy(){
        System.out.print("Before destroying the bean");
    }

}
