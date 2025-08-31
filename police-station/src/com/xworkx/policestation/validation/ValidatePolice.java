package com.xworkx.policestation.validation;
import com.xworkx.policestation.police.Police;
public class ValidatePolice {
    private Police police;

    public boolean validatePoliceInfo(Police police) {
        boolean validBadge = false;
        boolean validName = false;
        boolean validRank = false;
        boolean validDate = false;
        boolean validLocation = false;
        boolean validAge = false;

        if (police.getBadgeNumber() > 0) {
            validBadge = true;
        } else System.out.println("Invalid badge number");

        if (police.getName() != null && !police.getName().isEmpty()) {
            validName = true;
        } else System.out.println("Invalid name");

        if (police.getRank() != null && !police.getRank().isEmpty()) {
            validRank = true;
        } else System.out.println("Invalid rank");

        if (police.getJoiningDate() != null && !police.getJoiningDate().isEmpty()) {
            validDate = true;
        } else System.out.println("Invalid joining date");

        if (police.getStationLocation() != null && !police.getStationLocation().isEmpty()) {
            validLocation = true;
        } else System.out.println("Invalid station location");

        if (police.getAge() > 0) {
            validAge = true;
        } else System.out.println("Invalid age");

        if (validBadge && validName && validRank && validDate && validLocation && validAge) {
            this.police = police;
            return true;
        }
        return false;
    }
}
