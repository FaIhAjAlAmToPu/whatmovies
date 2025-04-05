package com.movies.sample_movies.controller;

import com.movies.sample_movies.model.Movie;
import com.movies.sample_movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping("/movies")
    public List<Movie> getMovies() {
        System.out.println("MovieController.getMovies");
        return movieService.getAllMovies();
    }
    @GetMapping("/movies/{movieId}")
    public Movie getMovies(@PathVariable String movieId) {
        System.out.println("MovieController.getMovie "+ movieId);
        return movieService.getMovieById(movieId);
    }
}
