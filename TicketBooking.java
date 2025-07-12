class TicketBooking {
    public static void main(String[] args) {
        System.out.println("Welcome to Movie Ticket Booking Portal!");

        String movie = "Avengers";
        String time = "7:30 PM";
        String seatType = "Premium";
        int price = 250;

        MovieSelection.selectMovie(movie, time, seatType, price);
    }
}
