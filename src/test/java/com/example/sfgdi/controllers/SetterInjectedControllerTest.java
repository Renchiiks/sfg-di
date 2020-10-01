package com.example.sfgdi.controllers;

import com.example.sfgdi.services.ConstructorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}