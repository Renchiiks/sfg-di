package com.example.sfgdi.controllers;

import com.example.services.ConstructorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}