public class NetworkDevice {
    int deviceId;
    String deviceType;
    String ipAddress;
    String macAddress;
    String manufacturer;
    double bandwidth;
    boolean isWireless;

    public NetworkDevice(int deviceId, String deviceType, String ipAddress, String macAddress,
                         String manufacturer, double bandwidth, boolean isWireless) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
        this.manufacturer = manufacturer;
        this.bandwidth = bandwidth;
        this.isWireless = isWireless;
    }

    void getInfo() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Type: " + deviceType);
        System.out.println("IP Address: " + ipAddress);
        System.out.println("MAC Address: " + macAddress);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Bandwidth: " + bandwidth + " Mbps");
        System.out.println("Wireless: " + isWireless);
        System.out.println("------------------------------");
    }
}
