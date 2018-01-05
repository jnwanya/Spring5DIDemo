package com.jnwanya.config;

import com.jnwanya.services.GreetingServiceFactory;
import com.jnwanya.services.GreetingRepository;
import com.jnwanya.services.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by Jnwanya on
 * Fri, 05 Jan, 2018.
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingServiceFactory greetServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"en", "default"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile({"es"})
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile({"de"})
    GreetingService primaryGermanyGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("de");
    }
}
