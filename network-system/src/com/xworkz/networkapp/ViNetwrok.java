package com.xworkz.networkapp;
import com.xworkz.networkapp.airtel.AirtelRunner;

import java.sql.SQLOutput;

public class ViNetwrok {
    public static void main(String[] args) {
        AirtelRunner airtelRunner = new AirtelRunner();
        airtelRunner.networkId = 1;
        airtelRunner.planName = "month";
        airtelRunner.planPrise = 899;
        airtelRunner.network = "2g";
        airtelRunner.netwrokName = "Airtel";
        System.out.println("id is " + airtelRunner.networkId);
        System.out.println("plan name is " + airtelRunner.planName);
        System.out.println("price is " + airtelRunner.planPrise);
        System.out.println("network is " + airtelRunner.network);
        System.out.println("network name is " + airtelRunner.netwrokName);

    }
}
