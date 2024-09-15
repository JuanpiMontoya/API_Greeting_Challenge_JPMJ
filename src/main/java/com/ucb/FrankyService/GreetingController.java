package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String greeting() {
        return greetingService.getGreeting();
    }

    @PostMapping()
    public void save(
            @RequestBody GreetingDto greetingDto
    ){
        this.greetingService.Add_greeting_name(
                greetingDto.name()
        );
    }
}
