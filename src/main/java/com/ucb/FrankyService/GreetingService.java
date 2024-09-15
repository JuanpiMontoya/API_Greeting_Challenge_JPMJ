package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${greeting-message}")
    String greet;

    public String getGreeting() {
        return greet;
    }
}
