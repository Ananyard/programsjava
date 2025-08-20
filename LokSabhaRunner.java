class LokSabhaRunner {
    public static void main(String[] args) {
        Politician politician = new Politician();
        politician.name = "Rahul Sharma";
        politician.party = "Unity Party";
        politician.age = 47;

        Seat seat = new Seat();
        seat.seatNumber = 132;
        seat.constituency = "North Delhi";
        seat.politician = politician;

        LokSabha lokSabha = new LokSabha();
        lokSabha.name = "17th Lok Sabha";
        lokSabha.location = "New Delhi";
        lokSabha.seat = seat;

        lokSabha.getLokSabhaInfo();
    }
}
