package com.example.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Constructor";
    }
}
