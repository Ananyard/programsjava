class BusStand {
    String standName;
    Platform platform;

    void getBusStandInfo() {
        System.out.println("Bus Stand: " + standName);
        platform.getPlatformInfo();
    }
}