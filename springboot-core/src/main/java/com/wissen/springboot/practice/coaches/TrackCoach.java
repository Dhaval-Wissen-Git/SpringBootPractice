package com.wissen.springboot.practice.coaches;

import com.wissen.springboot.assistants.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("Inside Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
