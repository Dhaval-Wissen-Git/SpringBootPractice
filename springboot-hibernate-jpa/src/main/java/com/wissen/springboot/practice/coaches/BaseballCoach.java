package com.wissen.springboot.practice.coaches;

import com.wissen.springboot.assistants.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("Inside Constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void setBaseballHandlers() {
        System.out.println("Check baseball ground and cut grass. Inside setBaseballHandlers: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @PreDestroy
    public void destroyBaseballHandlers() {
        System.out.println("Clean the baseball ground. Inside destroyBaseballHandlers: " + getClass().getSimpleName());
    }
}
