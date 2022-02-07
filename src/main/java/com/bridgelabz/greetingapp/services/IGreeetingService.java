package com.bridgelabz.greetingapp.services;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;

public interface IGreeetingService {
    Greeting save(Greeting greeting);
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
    Greeting updateGreeting(long id,User user);
    Greeting deleteGreeting(Long id);


}
