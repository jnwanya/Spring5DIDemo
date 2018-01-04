package com.jnwanya.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Jnwanya on
 * Thu, 04 Jan, 2018.
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello World");
        return "foo";
    }
}
