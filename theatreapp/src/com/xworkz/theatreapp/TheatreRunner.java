package com.xworkz.theatreapp;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.theatre.Theatre;

public class TheatreRunner {
    public static void main(String[] args) {

        Movie m1 = new Movie();
        m1.setMovieId(1);
        m1.setTitle("Inception");

        Movie m2 = new Movie();
        m2.setMovieId(2);
        m2.setTitle("The Dark Knight");

        Movie m3 = new Movie();
        m3.setMovieId(3);
        m3.setTitle("Avengers: Endgame");

        Movie m4 = new Movie();
        m4.setMovieId(4);
        m4.setTitle("Titanic");

        Movie m5 = new Movie();
        m5.setMovieId(5);
        m5.setTitle("Interstellar");

        Movie m6 = new Movie();
        m6.setMovieId(6);
        m6.setTitle("Jurassic Park");

        Movie m7 = new Movie();
        m7.setMovieId(7);
        m7.setTitle("The Matrix");

        Movie m8 = new Movie();
        m8.setMovieId(8);
        m8.setTitle("Gladiator");

        Movie m9 = new Movie();
        m9.setMovieId(9);
        m9.setTitle("Avatar");

        Movie m10 = new Movie();
        m10.setMovieId(10);
        m10.setTitle("Forrest Gump");

        Theatre theatre = new Theatre();

        theatre.addMovie(m1);
        theatre.addMovie(m2);
        theatre.addMovie(m3);
        theatre.addMovie(m4);
        theatre.addMovie(m5);
        theatre.addMovie(m6);
        theatre.addMovie(m7);
        theatre.addMovie(m8);
        theatre.addMovie(m9);
        theatre.addMovie(m10);

        theatre.getAllMovies();
    }
}
