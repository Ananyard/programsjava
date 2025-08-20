class RailwayRunner {
    public static void main(String[] args) {
        Train train = new Train("SBC Express", 12627);
        RailwayStation station = new RailwayStation("KSR Bengaluru", train);
        station.display();
    }
}