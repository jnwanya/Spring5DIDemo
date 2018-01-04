package com.jnwanya.services;

import org.springframework.stereotype.Service;

/**
 * Created by Jnwanya on
 * Thu, 04 Jan, 2018.
 */
@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, I am implemented via Setter";
    }
}
