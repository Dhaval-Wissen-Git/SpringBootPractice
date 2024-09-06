package com.wissen.springboot.practice.coaches;

import com.wissen.springboot.assistants.Coach;

// Not using @Component Annotation purposely to show bean initialization using bean config
public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("Inside Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters";
    }
}
