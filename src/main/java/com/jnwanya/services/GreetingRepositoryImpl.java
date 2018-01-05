package com.jnwanya.services;

import org.springframework.stereotype.Component;

/**
 * Created by Jnwanya on
 * Fri, 05 Jan, 2018.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}
