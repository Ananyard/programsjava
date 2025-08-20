public class NetworkRunner {
    public static void main(String[] args) {
        NetworkDevice device1 = new NetworkDevice();
        device1.deviceId = 401;
        device1.deviceType = "Router";
        device1.ipAddress = "192.168.1.1";
        device1.macAddress = "00:1A:2B:3C:4D:5E";
        device1.manufacturer = "Cisco";
        device1.bandwidth = 1000.0;
        device1.isWireless = true;
        device1.getInfo();

        NetworkDevice device2 = new NetworkDevice();
        device2.deviceId = 402;
        device2.deviceType = "Switch";
        device2.ipAddress = "192.168.1.2";
        device2.macAddress = "00:1A:2B:3C:4D:5F";
        device2.manufacturer = "Netgear";
        device2.bandwidth = 100.0;
        device2.isWireless = false;
        device2.getInfo();

        NetworkDevice device3 = new NetworkDevice();
        device3.deviceId = 403;
        device3.deviceType = "Access Point";
        device3.ipAddress = "192.168.1.3";
        device3.macAddress = "00:1A:2B:3C:4D:60";
        device3.manufacturer = "TP-Link";
        device3.bandwidth = 300.0;
        device3.isWireless = true;
        device3.getInfo();

        NetworkDevice device4 = new NetworkDevice();
        device4.deviceId = 404;
        device4.deviceType = "Modem";
        device4.ipAddress = "192.168.1.4";
        device4.macAddress = "00:1A:2B:3C:4D:61";
        device4.manufacturer = "Motorola";
        device4.bandwidth = 150.0;
        device4.isWireless = false;
        device4.getInfo();

        NetworkDevice device5 = new NetworkDevice();
        device5.deviceId = 405;
        device5.deviceType = "Firewall";
        device5.ipAddress = "192.168.1.5";
        device5.macAddress = "00:1A:2B:3C:4D:62";
        device5.manufacturer = "Palo Alto";
        device5.bandwidth = 500.0;
        device5.isWireless = false;
        device5.getInfo();

        NetworkDevice device6 = new NetworkDevice();
        device6.deviceId = 406;
        device6.deviceType = "Repeater";
        device6.ipAddress = "192.168.1.6";
        device6.macAddress = "00:1A:2B:3C:4D:63";
        device6.manufacturer = "D-Link";
        device6.bandwidth = 200.0;
        device6.isWireless = true;
        device6.getInfo();

        NetworkDevice device7 = new NetworkDevice();
        device7.deviceId = 407;
        device7.deviceType = "Bridge";
        device7.ipAddress = "192.168.1.7";
        device7.macAddress = "00:1A:2B:3C:4D:64";
        device7.manufacturer = "Cisco";
        device7.bandwidth = 100.0;
        device7.isWireless = false;
        device7.getInfo();

        NetworkDevice device8 = new NetworkDevice();
        device8.deviceId = 408;
        device8.deviceType = "Gateway";
        device8.ipAddress = "192.168.1.8";
        device8.macAddress = "00:1A:2B:3C:4D:65";
        device8.manufacturer = "Juniper";
        device8.bandwidth = 1000.0;
        device8.isWireless = false;
        device8.getInfo();

        NetworkDevice device9 = new NetworkDevice();
        device9.deviceId = 409;
        device9.deviceType = "Hub";
        device9.ipAddress = "192.168.1.9";
        device9.macAddress = "00:1A:2B:3C:4D:66";
        device9.manufacturer = "HP";
        device9.bandwidth = 10.0;
        device9.isWireless = false;
        device9.getInfo();

        NetworkDevice device10 = new NetworkDevice();
        device10.deviceId = 410;
        device10.deviceType = "Router";
        device10.ipAddress = "192.168.1.10";
        device10.macAddress = "00:1A:2B:3C:4D:67";
        device10.manufacturer = "Asus";
        device10.bandwidth = 600.0;
        device10.isWireless = true;
        device10.getInfo();

        NetworkDevice device11 = new NetworkDevice();
        device11.deviceId = 411;
        device11.deviceType = "Switch";
        device11.ipAddress = "192.168.1.11";
        device11.macAddress = "00:1A:2B:3C:4D:68";
        device11.manufacturer = "D-Link";
        device11.bandwidth = 100.0;
        device11.isWireless = false;
        device11.getInfo();

        NetworkDevice device12 = new NetworkDevice();
        device12.deviceId = 412;
        device12.deviceType = "Access Point";
        device12.ipAddress = "192.168.1.12";
        device12.macAddress = "00:1A:2B:3C:4D:69";
        device12.manufacturer = "Linksys";
        device12.bandwidth = 450.0;
        device12.isWireless = true;
        device12.getInfo();

        NetworkDevice device13 = new NetworkDevice();
        device13.deviceId = 413;
        device13.deviceType = "Modem";
        device13.ipAddress = "192.168.1.13";
        device13.macAddress = "00:1A:2B:3C:4D:70";
        device13.manufacturer = "Netgear";
        device13.bandwidth = 200.0;
        device13.isWireless = false;
        device13.getInfo();

        NetworkDevice device14 = new NetworkDevice();
        device14.deviceId = 414;
        device14.deviceType = "Firewall";
        device14.ipAddress = "192.168.1.14";
        device14.macAddress = "00:1A:2B:3C:4D:71";
        device14.manufacturer = "Fortinet";
        device14.bandwidth = 700.0;
        device14.isWireless = false;
        device14.getInfo();

        NetworkDevice device15 = new NetworkDevice();
        device15.deviceId = 415;
        device15.deviceType = "Repeater";
        device15.ipAddress = "192.168.1.15";
        device15.macAddress = "00:1A:2B:3C:4D:72";
        device15.manufacturer = "Tenda";
        device15.bandwidth = 250.0;
        device15.isWireless = true;
        device15.getInfo();

        NetworkDevice device16 = new NetworkDevice();
        device16.deviceId = 416;
        device16.deviceType = "Bridge";
        device16.ipAddress = "192.168.1.16";
        device16.macAddress = "00:1A:2B:3C:4D:73";
        device16.manufacturer = "TP-Link";
        device16.bandwidth = 120.0;
        device16.isWireless = false;
        device16.getInfo();

        NetworkDevice device17 = new NetworkDevice();
        device17.deviceId = 417;
        device17.deviceType = "Gateway";
        device17.ipAddress = "192.168.1.17";
        device17.macAddress = "00:1A:2B:3C:4D:74";
        device17.manufacturer = "Cisco";
        device17.bandwidth = 900.0;
        device17.isWireless = false;
        device17.getInfo();

        NetworkDevice device18 = new NetworkDevice();
        device18.deviceId = 418;
        device18.deviceType = "Hub";
        device18.ipAddress = "192.168.1.18";
        device18.macAddress = "00:1A:2B:3C:4D:75";
        device18.manufacturer = "Belkin";
        device18.bandwidth = 20.0;
        device18.isWireless = false;
        device18.getInfo();

        NetworkDevice device19 = new NetworkDevice();
        device19.deviceId = 419;
        device19.deviceType = "Router";
        device19.ipAddress = "192.168.1.19";
        device19.macAddress = "00:1A:2B:3C:4D:76";
        device19.manufacturer = "Zyxel";
        device19.bandwidth = 850.0;
        device19.isWireless = true;
        device19.getInfo();

        NetworkDevice device20 = new NetworkDevice();
        device20.deviceId = 420;
        device20.deviceType = "Access Point";
        device20.ipAddress = "192.168.1.20";
        device20.macAddress = "00:1A:2B:3C:4D:77";
        device20.manufacturer = "Ubiquiti";
        device20.bandwidth = 500.0;
        device20.isWireless = true;
        device20.getInfo();
    }
}
