package com.wissen.springboot.assistants;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

/** Component annotation is used to mark the class as a Spring bean. */
@Component
public class CricketCoach implements Coach {

    private String workout;

    public CricketCoach(){
        System.out.println("Inside Constructor: " + getClass().getSimpleName());
         this.workout = "Default Daily workout: Practice fast bowling for 15 minutes";
    }

    @PostConstruct
    public void setCricketHandlers() {
        System.out.println("Set stumps. Inside setCricketHandlers: " + getClass().getSimpleName());
    }

    public void setWorkout(String workout) {
        this.workout = workout;
    }

    @Override
    public String getDailyWorkout() {
        return workout;
    }

    @PreDestroy
    public void destroyCricketHandlers() {
        System.out.println("Take off stumps and get the pitch covers. Inside destroyCricketHandlers: " + getClass().getSimpleName());
    }
}
