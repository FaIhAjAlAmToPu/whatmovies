package com.movies.sample_movies.service;

import com.movies.sample_movies.model.User;
import com.movies.sample_movies.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id)
    {
        return userRepository.findById(id).orElse(null);
    }
}
