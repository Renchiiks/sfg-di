package com.example.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello World! - Primary Bean";
    }
}
