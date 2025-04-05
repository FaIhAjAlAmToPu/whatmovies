package com.movies.sample_movies.service;

import com.movies.sample_movies.model.Movie;
import com.movies.sample_movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Movie getMovieById(String id) {
        return movieRepository.findById(id).orElse(null);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
