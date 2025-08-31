package com.xworkx.watchshop.watch;

public class Watch {
    private int watchId;
    private String brand;
    private String model;
    private double price;
    private String type; // Analog / Digital / Smartwatch
    private String material;

    public void setWatchId(int watchId) {
        this.watchId = watchId;
    }
    public int getWatchId() {
        return watchId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
}
