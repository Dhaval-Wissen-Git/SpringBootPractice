package com.wissen.springboot.practice.coaches;

import com.wissen.springboot.assistants.Coach;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("Inside Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
