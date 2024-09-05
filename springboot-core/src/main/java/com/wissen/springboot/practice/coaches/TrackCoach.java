package com.wissen.springboot.practice.coaches;

import com.wissen.springboot.assistants.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Will generate multiple seperate objects
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("Inside Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
