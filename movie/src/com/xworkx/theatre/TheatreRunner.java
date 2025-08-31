package com.xworkx.theatre;

import com.xworkx.theatre.movie.Movie;
import com.xworkx.theatre.details.TheatreDetails;

public class TheatreRunner {
    public static void main(String[] args) {
        System.out.println("Main started...");

        // Create Movie object
        Movie movie = new Movie();
        movie.setMovieId(101);
        movie.setMovieName("KGF Chapter 2");
        movie.setGenre("Action/Drama");
        movie.setLanguage("Kannada");
        movie.setReleaseDate("14-Apr-2022");
        movie.setDuration(2.48);

        // Create TheatreDetails and validate/add movie
        TheatreDetails theatreDetails = new TheatreDetails();
        boolean added = theatreDetails.addMovie(movie);

        if (added) {
            System.out.println("Movie added successfully!\n");
            theatreDetails.showMovieDetails();
        } else {
            System.out.println("Failed to add movie. Please check the details.");
        }

        System.out.println("Main ended...");
    }
}
