package com.movies.sample_movies.repository;

import com.movies.sample_movies.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {

    List<Movie> findTopByAwards_Wins(Integer awardsWins);

    List<Movie> findDistinctTopByAwards_WinsOrderByYearDesc(Integer awardsWins);
}
