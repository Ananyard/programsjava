class Payment {
    public static void pay(String movie, String time, String seatType, int price) {
        System.out.println("Ticket Price: ₹" + price);
        System.out.println("Processing payment...");
        System.out.println("Payment successful!");

        TicketGeneration.generate(movie, time, seatType, price);
    }
}
