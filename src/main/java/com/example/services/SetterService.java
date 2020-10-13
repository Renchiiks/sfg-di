package com.example.services;

import org.springframework.stereotype.Service;

@Service
public class SetterService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world! - Setter";
    }
}
