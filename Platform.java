class Platform {
    int platformNumber;
    Bus bus;

    void getPlatformInfo() {
        System.out.println("Platform Number: " + platformNumber);
        bus.getBusInfo();
    }
