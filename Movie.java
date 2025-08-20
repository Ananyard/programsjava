class Movie {
    String movieName;
    String language;
    String genre;
    int duration; 
    double rating;

	Screen screen;
	
    Movie(String movieName, String language, String genre, int duration, double rating,Screen screen) {
        this.movieName = movieName;
        this.language = language;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
		this.screen = screen;
    }

    void getMovieInfo() {
        System.out.println("Movie Info:");
        System.out.println("Name: " + movieName);
        System.out.println("Language: " + language);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Rating: " + rating + "/5");
		this.screen.getScreenInfo();
    }
}