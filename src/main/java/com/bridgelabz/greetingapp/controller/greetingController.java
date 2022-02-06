package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greets")
public class greetingController {
    private static final String message="Hey hi ,%s!";
    private final AtomicLong id = new AtomicLong();

    @GetMapping(value = {"","/","home"})
    public Greeting greets (@RequestParam(value = "name",defaultValue = "Welcome")String name){
        return new Greeting(id.incrementAndGet(),String.format(message,name));
    }
    @GetMapping("/path/{name}")
    public Greeting hellopath (@PathVariable(value = "name") String name){
        return new Greeting(id.incrementAndGet(),String.format(message,name));
    }
    @PostMapping("/post")
    public Greeting hellopost(@RequestBody User user){
        return new Greeting(id.incrementAndGet(),String.format(message,user.getFirstName(),user.getLastName()));
    }
    @PutMapping("/put/{fName}")
    public Greeting helloput (@PathVariable String fName,@RequestParam (value= "lName") String lName){
        return new Greeting(id.incrementAndGet(),String.format(message,fName,lName));
    }
}
