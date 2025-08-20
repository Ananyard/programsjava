class LokSabha {
    String name;
    String location;
    Seat seat;

    void getLokSabhaInfo() {
        System.out.println("LokSabha Name: " + name);
        System.out.println("Location: " + location);
        if (seat != null) {
            seat.getSeatInfo();
        }
    }
}
