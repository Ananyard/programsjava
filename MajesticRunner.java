class MajesticRunner {
    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.busNumber = "KA-09-BB-1234";
        bus.destination = "Gokarna";

        Platform platform = new Platform();
        platform.platformNumber = 5;
        platform.bus = bus;

        BusStand busStand = new BusStand();
        busStand.standName = "Central KSRTC";
        busStand.platform = platform;

        Majestic majestic = new Majestic();
        majestic.place = "Majestic Bangalore";
        majestic.busStand = busStand;

        majestic.getMajesticInfo();
    }
}