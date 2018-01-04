package com.jnwanya.services;

import org.springframework.stereotype.Service;

/**
 * Created by Jnwanya on
 * Thu, 04 Jan, 2018.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String GREETING_MESSAGE = "Hello Service Greeting";

    @Override
    public String sayGreeting() {
        return GREETING_MESSAGE;
    }
}
