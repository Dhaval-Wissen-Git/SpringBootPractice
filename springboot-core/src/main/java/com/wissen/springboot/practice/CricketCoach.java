package com.wissen.springboot.practice;

import org.springframework.stereotype.Component;

/** Component annotation is used to mark the class as a Spring bean. */
@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
