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
                "Ask yourself if what you're doing today is getting you closer to where you want to be tomorrow",
                greetingService.getGreeting("en"));
    }

    @Test
    void getGreeting_WithoutName_Spanish() {

        assertEquals(
                "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana",
                greetingService.getGreeting("es"));
    }

    @Test
    void getGreeting_ResetingName() {

        greetingService.Add_greeting_name("");


        assertEquals(
                "Ask yourself if what you're doing today is getting you closer to where you want to be tomorrow",
                greetingService.getGreeting("en"));
    }

    @Test
    void getGreeting_WithName() {

        greetingService.Add_greeting_name("Roberto");

        assertEquals(
                "Roberto. Ask yourself if what you're doing today is getting you closer to where you want to be tomorrow",
                greetingService.getGreeting("en"));
    }

    @Test
    void getGreeting_WithName_Spanish() {

        greetingService.Add_greeting_name("Roberto");

        assertEquals(
                "Roberto. Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana",
                greetingService.getGreeting("es"));
    }
}