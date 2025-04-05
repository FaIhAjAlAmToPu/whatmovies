package com.movies.sample_movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tomatoes {
    private Viewer viewer;
    private Integer fresh;
    private Critic critic;
    private Integer rotten;
    private Date dvd;
    private Date lastUpdated;
    private String production;
}
