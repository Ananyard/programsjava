class PvrRunner {
    public static void main(String[] args) {
       
	      PVR pvr = new PVR("PVR Cinemas", "Bangalore", 10 );
		  
        Screen screen = new Screen(1, 200, "IMAX", pvr);
    
		 Movie movie = new Movie("Inception", "English", "Sci-Fi", 148, 4.8,screen);

        movie.getMovieInfo();
    }
}