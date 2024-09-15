package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class GreetingService {

    @Autowired
    private Environment env;

    private String greetingName = "";

    public String getGreeting(String language) {
        String key = "greeting." + language;

        String greet = env.getProperty(key);

        if (greet == null) {
            greet = env.getProperty("greeting.en");
        }

        if (Objects.equals(greetingName, "")) {
            return greet;
        } else {
            return greetingName + ". " + greet;
        }
    }

    public void Add_greeting_name(String name) {
        greetingName = name;
    }
}
