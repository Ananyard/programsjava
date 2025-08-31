package com.xworkx.theatre.movie;

public class Movie {
    private int movieId;
    private String movieName;
    private String genre;
    private String language;
    private String releaseDate;
    private double duration; // in hours

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public int getMovieId() {
        return movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieName() {
        return movieName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    public double getDuration() {
        return duration;
    }
}
