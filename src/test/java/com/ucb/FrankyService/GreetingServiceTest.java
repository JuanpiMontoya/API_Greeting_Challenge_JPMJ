package com.ucb.FrankyService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GreetingServiceTest {

    @Autowired
    GreetingService greetingService;

    @Test
    void getGreeting_WithoutName() {

        assertEquals(
                "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana",
                greetingService.getGreeting());
    }

    @Test
    void getGreeting_ResetingName() {

        greetingService.Add_greeting_name("");

        assertEquals(
                "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana",
                greetingService.getGreeting());
    }

    @Test
    void getGreeting_WithName() {

        greetingService.Add_greeting_name("Carlos");

        assertEquals(
                "Carlos. Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana",
                greetingService.getGreeting());
    }
}