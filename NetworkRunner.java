public class NetworkRunner {
    public static void main(String[] args) {

        System.out.println("main started");

        NetworkDevice d1 = new NetworkDevice(401, "Router", "192.168.1.1", "00:1A:2B:3C:4D:5E", "Cisco", 1000.0, true);
        NetworkDevice d2 = new NetworkDevice(402, "Switch", "192.168.1.2", "00:1A:2B:3C:4D:5F", "Netgear", 100.0, false);
        NetworkDevice d3 = new NetworkDevice(403, "Access Point", "192.168.1.3", "00:1A:2B:3C:4D:60", "TP-Link", 300.0, true);
        NetworkDevice d4 = new NetworkDevice(404, "Modem", "192.168.1.4", "00:1A:2B:3C:4D:61", "Motorola", 150.0, false);
        NetworkDevice d5 = new NetworkDevice(405, "Firewall", "192.168.1.5", "00:1A:2B:3C:4D:62", "Palo Alto", 500.0, false);
        NetworkDevice d6 = new NetworkDevice(406, "Repeater", "192.168.1.6", "00:1A:2B:3C:4D:63", "D-Link", 200.0, true);
        NetworkDevice d7 = new NetworkDevice(407, "Bridge", "192.168.1.7", "00:1A:2B:3C:4D:64", "Cisco", 100.0, false);
        NetworkDevice d8 = new NetworkDevice(408, "Gateway", "192.168.1.8", "00:1A:2B:3C:4D:65", "Juniper", 1000.0, false);
        NetworkDevice d9 = new NetworkDevice(409, "Hub", "192.168.1.9", "00:1A:2B:3C:4D:66", "HP", 10.0, false);
        NetworkDevice d10 = new NetworkDevice(410, "Router", "192.168.1.10", "00:1A:2B:3C:4D:67", "Asus", 600.0, true);
        NetworkDevice d11 = new NetworkDevice(411, "Switch", "192.168.1.11", "00:1A:2B:3C:4D:68", "D-Link", 100.0, false);
        NetworkDevice d12 = new NetworkDevice(412, "Access Point", "192.168.1.12", "00:1A:2B:3C:4D:69", "Linksys", 450.0, true);
        NetworkDevice d13 = new NetworkDevice(413, "Modem", "192.168.1.13", "00:1A:2B:3C:4D:70", "Netgear", 200.0, false);
        NetworkDevice d14 = new NetworkDevice(414, "Firewall", "192.168.1.14", "00:1A:2B:3C:4D:71", "Fortinet", 700.0, false);
        NetworkDevice d15 = new NetworkDevice(415, "Repeater", "192.168.1.15", "00:1A:2B:3C:4D:72", "Tenda", 250.0, true);
        NetworkDevice d16 = new NetworkDevice(416, "Bridge", "192.168.1.16", "00:1A:2B:3C:4D:73", "TP-Link", 120.0, false);
        NetworkDevice d17 = new NetworkDevice(417, "Gateway", "192.168.1.17", "00:1A:2B:3C:4D:74", "Cisco", 900.0, false);
        NetworkDevice d18 = new NetworkDevice(418, "Hub", "192.168.1.18", "00:1A:2B:3C:4D:75", "Belkin", 20.0, false);
        NetworkDevice d19 = new NetworkDevice(419, "Router", "192.168.1.19", "00:1A:2B:3C:4D:76", "Zyxel", 850.0, true);
        NetworkDevice d20 = new NetworkDevice(420, "Access Point", "192.168.1.20", "00:1A:2B:3C:4D:77", "Ubiquiti", 500.0, true);

        d1.getInfo();   d2.getInfo();   d3.getInfo();   d4.getInfo();   d5.getInfo();
        d6.getInfo();   d7.getInfo();   d8.getInfo();   d9.getInfo();   d10.getInfo();
        d11.getInfo();  d12.getInfo();  d13.getInfo();  d14.getInfo();  d15.getInfo();
        d16.getInfo();  d17.getInfo();  d18.getInfo();  d19.getInfo();  d20.getInfo();

        System.out.println("main ended");
    }
}
