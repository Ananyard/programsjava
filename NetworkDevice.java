class NetworkDevice {
    int deviceId;
    String deviceType;
    String ipAddress;
    String macAddress;
    String manufacturer;
    double bandwidth;
    boolean isWireless;

  public  void getInfo() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Type: " + deviceType);
        System.out.println("IP Address: " + ipAddress);
        System.out.println("MAC Address: " + macAddress);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Bandwidth (Mbps): " + bandwidth);
        System.out.println("Is Wireless: " + isWireless);
        System.out.println();
    }
}
