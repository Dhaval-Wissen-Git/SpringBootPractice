package com.wissen.springboot.practice.coaches;

import com.wissen.springboot.assistants.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("Inside Constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void setTennisHandlers() {
        System.out.println("Lay the net. Inside setTennisHandlers: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand and forehand volleies for 30 minutes";
    }

    @PreDestroy
    public void destroyTennisHandlers() {
        System.out.println("Collect and fold the net. Inside destroyTennisHandlers: " + getClass().getSimpleName());
    }
}
