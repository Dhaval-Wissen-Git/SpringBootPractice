package com.wissen.springboot.practice.rest;

import com.wissen.springboot.assistants.Coach;
import com.wissen.springboot.assistants.CricketCoach;
import com.wissen.springboot.practice.coaches.SwimCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class DemoController {

    private Coach myCoach;

    private Coach anotherCoach;

    private Coach swimCoach;

    @Autowired
    public DemoController(@Qualifier("trackCoach") Coach myCoach, Coach anotherCoach, @Qualifier("aquaman") Coach swimCoach) {
        System.out.println("Inside Constructor: " + getClass().getSimpleName());
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;

        this.swimCoach = swimCoach;
    }

    // Set specific coach
    public void setCricketCoach(CricketCoach cricketCoach) {
        this.myCoach = cricketCoach;
        cricketCoach.setWorkout("New specific workout: Practice sprint run-up for 15 minutes");
    }

    // Setter Injection example
//    public void setMyCoach(@Qualifier("cricketCoach") Coach myCoach) {
//        this.myCoach = myCoach;
//
//        if ( myCoach.getClass().equals(CricketCoach.class) ) {
//            CricketCoach cricketCoach = (CricketCoach) myCoach;
//            cricketCoach.setWorkout("New specific workout: Practice sprint run-up for 15 minutes");
//        }
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/extrapractice")
    public String getExtraPractice() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/checkBeanScope")
    public String checkBeanScope() {
        return "Comparing Bean Scope: myCoach and anotherCoach"
                + (myCoach == anotherCoach ? " - SAME BEAN" : " - DIFFERENT BEAN ")
                + "\n myCoach Annotations: " + Arrays.toString(myCoach.getClass().getAnnotations());
    }

    @GetMapping("/swim")
    public String getSwim() {
        return swimCoach.getDailyWorkout();
    }
}
