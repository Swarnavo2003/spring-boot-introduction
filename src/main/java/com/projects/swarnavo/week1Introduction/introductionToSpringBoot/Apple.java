package com.projects.swarnavo.week1Introduction.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Apple {
    public void eatApple() {
        System.out.println("I am eating the apple");
    }

    @PostConstruct
    public void callThisBeforeAppleIsUsed() {
        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    public void callThisBeforeDestroy() {
        System.out.println("Destroying the Apple Bean");
    }
}
