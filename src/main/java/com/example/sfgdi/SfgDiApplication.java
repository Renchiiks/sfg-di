package com.example.sfgdi;

import com.example.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        PetController petController = (PetController) ctx.getBean("petController");
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest() + "\n");

        System.out.println("_________________Profile");
        I18NController i18NController = (I18NController) ctx.getBean("i18NController");
        System.out.println(i18NController.sayHello() + "\n");


        System.out.println("_______________Primary Bean");
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello() + "\n");

        System.out.println("_______________Property Injected Controller");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting() + "\n");

        System.out.println("_______________Setter Injected Controller");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting() + "\n");

        System.out.println("______________Constructor Injected Controller");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting() + "\n");
    }

}
