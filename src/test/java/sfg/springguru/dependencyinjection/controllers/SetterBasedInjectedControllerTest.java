package sfg.springguru.dependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfg.springguru.dependencyinjection.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

//manually perform DI - without Spring framework

class SetterBasedInjectedControllerTest {

    SetterBasedInjectedController setterBasedInjectedController;

    @BeforeEach
    void setUp() {
        setterBasedInjectedController = new SetterBasedInjectedController();
        setterBasedInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterBasedInjectedController.getGreeting());
    }
}