package com.xworkz.policestationapp.policestation;

import com.xworkz.policestationapp.police.Police;

public class PoliceStation {

    private Police[] polices = new Police[6];
    private int index;

    public void addPolice(Police police) {
        if (index < polices.length) {
            polices[index] = police;
            index++;
        } else {
            System.out.println("No space to add more police...");
        }
    }

    public void getAllPolice() {
        for (Police police : polices) {
            if (police != null) {
                System.out.println(police.getPoliceId() + " "
                        + police.getPoliceName() + " "
                        + police.getRank() + " "
                        + police.getAge() + " "
                        + police.getStationName());
            }
        }
    }
}
