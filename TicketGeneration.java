class TicketGeneration {
    public static void generate(String movie, String time, String seatType, int price) {
        System.out.println("Generating ticket...");
        System.out.println("Movie: " + movie);
        System.out.println("Time: " + time);
        System.out.println("Seat Type: " + seatType);
        System.out.println("Price: ₹" + price);

        Confirmation.confirm(movie);
    }
}
