package com.xworks.device.mbl;

public class Mobile {
    public String deviceName;
    public int price;

    public String getDeviceName(){
        return deviceName;
    }
    public int getPrice(){
        return  price;
    }
    public void price(int price){
        this.price = price;
    }
    public void deviceName(String name){
        this.deviceName = name;
    }
}
