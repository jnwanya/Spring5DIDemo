package com.jnwanya.controllers;

import com.jnwanya.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Jnwanya on
 * Thu, 04 Jan, 2018.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    private GreetingService greetingServiceImpl;

    public String greetUser(){
        return greetingServiceImpl.sayGreeting();
    }
}
