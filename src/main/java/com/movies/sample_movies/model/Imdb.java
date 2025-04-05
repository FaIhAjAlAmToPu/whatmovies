package com.movies.sample_movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Imdb {
    private Double rating;
    private Integer votes;
    private Integer id;


}
