package com.wissen.springboot.practice.coaches;

import com.wissen.springboot.assistants.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("Inside Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand and forehand volleies for 30 minutes";
    }
}
