package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world! property service" ;
    }
}
