package com.movies.sample_movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Awards {
    private Integer wins;
    private Integer nominations;
    private String text;
}
