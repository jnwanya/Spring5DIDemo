package com.jnwanya.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Jnwanya on
 * Thu, 04 Jan, 2018.
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Grüße aus Deutschland Service";
    }
}
