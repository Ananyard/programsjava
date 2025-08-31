package com.xworkx.theatre.details;

import com.xworkx.theatre.movie.Movie;
import com.xworkx.theatre.validation.ValidateMovie;

public class TheatreDetails {
    private Movie movie;

    public boolean addMovie(Movie movie) {
        ValidateMovie validateMovie = new ValidateMovie();
        boolean isValid = validateMovie.validateMovieInfo(movie);

        if (isValid) {
            this.movie = movie;
            return true;
        }
        return false;
    }

    public void showMovieDetails() {
        System.out.println("Movie ID: " + movie.getMovieId());
        System.out.println("Movie Name: " + movie.getMovieName());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Language: " + movie.getLanguage());
        System.out.println("Release Date: " + movie.getReleaseDate());
        System.out.println("Duration: " + movie.getDuration() + " hours");
    }
}

