package com.jnwanya.controllers;

import com.jnwanya.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Jnwanya on
 * Thu, 04 Jan, 2018.
 */
@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayGreetingToUser(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService){
       this.greetingService = greetingService;
    }
}
