package com.movies.sample_movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Critic {
    private Double rating;
    private Integer numReviews;
    private Integer meter;
}
