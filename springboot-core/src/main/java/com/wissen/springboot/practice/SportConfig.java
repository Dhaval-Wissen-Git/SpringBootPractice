package com.wissen.springboot.practice;

import com.wissen.springboot.assistants.Coach;
import com.wissen.springboot.practice.coaches.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // Bean Id defaults to method name. Thus bean id = swimCoach
    @Bean("aquaman")    // Custom Bean id = aquaman
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
