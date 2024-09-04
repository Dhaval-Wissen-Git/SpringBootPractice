package com.wissen.springboot.assistants;

import org.springframework.stereotype.Component;

/** Component annotation is used to mark the class as a Spring bean. */
@Component
public class CricketCoach implements Coach {

    private String workout;

    public CricketCoach(){
         this.workout = "Default Daily workout: Practice fast bowling for 15 minutes";
    }

    public void setWorkout(String workout) {
        this.workout = workout;
    }

    @Override
    public String getDailyWorkout() {
        return workout;
    }
}
