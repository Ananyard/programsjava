package com.xworkx.policestation;

import com.xworkx.policestation.details.PoliceStationDetails;
import com.xworkx.policestation.police.Police;
import com.xworkx.policestation.validation.ValidatePolice;
public class PoliceStationRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Police police = new Police();
        police.setBadgeNumber(1011);
        police.setName("Rajesh Kumar");
        police.setRank("Inspector");
        police.setJoiningDate("10 Jan 2010");
        police.setStationLocation("Bengaluru Central");
        police.setAge(42);

        PoliceStationDetails details = new PoliceStationDetails();
        boolean added = details.addPolice(police);
        System.out.println("Police added: " + added);

        if (added) {
            details.showPoliceDetails();
        }

        System.out.println("Main ended");
    }
}
