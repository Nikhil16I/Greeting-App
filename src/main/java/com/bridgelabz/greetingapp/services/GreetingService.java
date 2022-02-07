package com.bridgelabz.greetingapp.services;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService  implements  IGreeetingService{
    @Autowired
    private IGreeetingService greetingRepository;

    private static final String template="Hey hi ,%s!";
    private final AtomicLong id = new AtomicLong();

    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hey hi" : user.toString());
        return greetingRepository.save(new Greeting(id.incrementAndGet(), message));
    }

    @Override
    public Greeting getGreetingById(long id) {
        return null;
    }

    @Override
    public Greeting updateGreeting(long id, User user) {
        return null;
    }

    @Override
    public Greeting deleteGreeting(Long id) {
        return null;
    }

    @Override
    public Greeting save(Greeting greeting) {
        return null;
    }
}
