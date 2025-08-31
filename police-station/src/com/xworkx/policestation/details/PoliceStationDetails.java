package com.xworkx.policestation.details;

import com.xworkx.policestation.details.PoliceStationDetails;
import com.xworkx.policestation.police.Police;
import com.xworkx.policestation.validation.ValidatePolice;
public class PoliceStationDetails {
    private Police police;

    public boolean addPolice(Police police) {
        ValidatePolice validatePolice = new ValidatePolice();
        boolean isValid = validatePolice.validatePoliceInfo(police);

        if (isValid) {
            this.police = police;
            return true;
        }
        return false;
    }

    public void showPoliceDetails() {
        System.out.println("Badge Number: " + police.getBadgeNumber());
        System.out.println("Name: " + police.getName());
        System.out.println("Rank: " + police.getRank());
        System.out.println("Joining Date: " + police.getJoiningDate());
        System.out.println("Station Location: " + police.getStationLocation());
        System.out.println("Age: " + police.getAge());
    }
}
