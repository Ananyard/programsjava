package com.xworks.device;
import com.xworks.device.mbl.Mobile;
public class Runner {
    public static void main(String[] args) {
        System.out.println("main started");
        Mobile mobile = new Mobile();
        mobile.deviceName("laptop");
        mobile.price(270000);
        System.out.println(mobile.getDeviceName());
        System.out.println(mobile.getPrice());
    }
}
