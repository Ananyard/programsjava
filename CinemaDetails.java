class CinemaDetails {

    public static void main(String[] args) {
        movieName();
        ticketPrice(2, 150);
        showTime("7:30 PM");
        screenNumber(3);
    }

    public static void movieName() {
        System.out.println("Now Showing: Dune Part II");
    }

    public static void ticketPrice(int tickets, int pricePerTicket) {
        int total = tickets * pricePerTicket;
        System.out.println("Total Ticket Price: ₹" + total);
    }

    public static void showTime(String time) {
        System.out.println("Show Time: " + time);
    }

    public static void screenNumber(int screen) {
        System.out.println("Screen Number: " + screen);
    }
}
