package com.xworkx.theatre.validation;

import com.xworkx.theatre.movie.Movie;

public class ValidateMovie {
    private Movie movie;

    public boolean validateMovieInfo(Movie movie) {
        boolean validId = false;
        boolean validName = false;
        boolean validGenre = false;
        boolean validLang = false;
        boolean validRelease = false;
        boolean validDuration = false;

        if (movie.getMovieId() > 0) {
            validId = true;
        } else System.out.println("Invalid movie ID");

        if (movie.getMovieName() != null && !movie.getMovieName().isEmpty()) {
            validName = true;
        } else System.out.println("Invalid movie name");

        if (movie.getGenre() != null && !movie.getGenre().isEmpty()) {
            validGenre = true;
        } else System.out.println("Invalid genre");

        if (movie.getLanguage() != null && !movie.getLanguage().isEmpty()) {
            validLang = true;
        } else System.out.println("Invalid language");

        if (movie.getReleaseDate() != null && !movie.getReleaseDate().isEmpty()) {
            validRelease = true;
        } else System.out.println("Invalid release date");

        if (movie.getDuration() > 0) {
            validDuration = true;
        } else System.out.println("Invalid duration");

        if (validId && validName && validGenre && validLang && validRelease && validDuration) {
            this.movie = movie;
            return true;
        }
        return false;
    }
}
