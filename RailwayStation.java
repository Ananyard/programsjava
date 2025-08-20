class RailwayStation {
    String stationName;
    Train train;

    RailwayStation(String stationName, Train train) {
        this.stationName = stationName;
        this.train = train;
    }

    void display() {
        System.out.println("Station: " + this.stationName);
        this.train.display();
    }
}