class Galaxy {
    String galaxyName;
    String type;
    SolarSystem solarSystem;

    void getGalaxyInfo() {
        System.out.println("Galaxy Info:");
        System.out.println("Name: " + galaxyName);
        System.out.println("Type: " + type);
        solarSystem.getSolarSystemInfo();
    }
}