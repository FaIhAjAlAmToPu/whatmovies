package com.movies.sample_movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "movies")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {

    @Id
    private String id;
    private String plot;

    private List<String> genres;

    private Integer runtime;
    private List<String> cast;
    private String poster;
    private String title;
    private String fullplot;
    private List<String> languages;
    private Date released;
    private List<String> directors;
    private List<String> writers;
    private String rated;
    private Awards awards;
    private String lastupdated;
    private String year;
    private String metacritic;
    private Imdb imdb;
    private List<String> countries;
    private String type;
    private Tomatoes tomatoes;


    private Integer num_mflix_comments;

}
