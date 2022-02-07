package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;
import com.bridgelabz.greetingapp.services.GreetingService;
import com.bridgelabz.greetingapp.services.IGreeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

       //private static final String template = "Hello, %s!";
      //private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingService greetingService;

    @GetMapping(value = {"", "/"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
       //return new Greeting(counter.incrementAndGet(), String.format(template, name));
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }
}
