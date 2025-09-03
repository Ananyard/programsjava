package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.movie.Movie;

public class Theatre {

    private Movie[] movies = new Movie[10];
    private int index;

    public boolean addMovie(Movie movie) {
        boolean isAdded = false;
        if (movie != null && index < movies.length) {
            movies[index++] = movie;
            isAdded = true;
        } else {
            System.out.println("Invalid Movie or No space left...");
        }
        return isAdded;
    }

    public void getAllMovies() {
        System.out.println("----- List of Movies -----");
        for (Movie movie : movies) {
            if (movie != null) {
                System.out.println("Movie ID: " + movie.getMovieId());
                System.out.println("Title: " + movie.getTitle());
                System.out.println("---------------------------");
            }
        }
    }
}
