package com.wissen.springboot.practice.rest;

import com.wissen.springboot.assistants.Coach;
import com.wissen.springboot.assistants.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

//    public DemoController(Coach myCoach) {
//        this.myCoach = myCoach;
//    }

    @Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;

        if ( myCoach.getClass().equals(CricketCoach.class) ) {
            CricketCoach cricketCoach = (CricketCoach) myCoach;
            cricketCoach.setWorkout("New specific workout: Practice sprint run-up for 15 minutes");
        }
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/extrapractice")
    public String getExtraPractice() {
        return myCoach.getDailyWorkout();
    }
}
