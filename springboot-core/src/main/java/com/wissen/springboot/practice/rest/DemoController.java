package com.wissen.springboot.practice.rest;

import com.wissen.springboot.assistants.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    public DemoController(Coach myCoach) {
        this.myCoach = myCoach;
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
