package com.jnwanya.services;

/**
 * Created by Jnwanya on
 * Fri, 05 Jan, 2018.
 */
public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang){
        switch (lang){
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
        default:
            return new PrimaryGreetingService(greetingRepository);

        }
    }
}
