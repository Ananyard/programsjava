package com.xworkz.theatreapp.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    private int movieId;
    private String title;
    private String genre;
    private String director;
    private int duration; // in minutes

}
