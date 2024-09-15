package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class GreetingService {

    @Value("${greeting-message}")
    String greet;

    String greeting_name = "";

    public String getGreeting() {
        if (Objects.equals(greeting_name, ""))
        {
            return greet;
        }
        else
        {
           return greeting_name + ". "+ greet;
        }

    }

    public void Add_greeting_name(String name) {
        greeting_name = name;
    }
}
