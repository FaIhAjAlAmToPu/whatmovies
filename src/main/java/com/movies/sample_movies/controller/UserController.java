package com.movies.sample_movies.controller;

import com.movies.sample_movies.model.User;
import com.movies.sample_movies.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/register")
    public String createUser() {
        return "signup";
    }

    @PostMapping("/create_account")
    public String createUser(@ModelAttribute User user,
                             @RequestParam String confirmPassword) {
        if (!confirmPassword.equals(user.getPassword())) {
            return "redirect:/signup?error=passwordsDoNotMatch";
        }
        System.out.println("inside createUser method");

        userService.createUser(user);
        return "signup_success";
    }

    @GetMapping("/login")
    public String login() {
        return "sign-in";
    }
}
