class SeatAvailability {
    public static void checkSeats(String movie, String time, String seatType, int price) {
        System.out.println("Checking availability for " + seatType + " seat...");
        System.out.println("Seats are available!");

        Payment.pay(movie, time, seatType, price);
    }
}
