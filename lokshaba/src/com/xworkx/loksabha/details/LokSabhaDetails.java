package com.xworkx.loksabha.details;

import com.xworkx.loksabha.politician.Politician;
import com.xworkx.loksabha.validation.ValidatePolitician;

public class LokSabhaDetails {
    private Politician politician;

    public boolean addPolitician(Politician politician) {
        ValidatePolitician validatePolitician = new ValidatePolitician();
        boolean isValid = validatePolitician.validatePoliticianInfo(politician);

        if (isValid) {
            this.politician = politician;
            return true;
        }
        return false;
    }

    public void showPoliticianDetails() {
        System.out.println("Politician ID: " + politician.getPoliticianId());
        System.out.println("Name: " + politician.getName());
        System.out.println("Party: " + politician.getParty());
        System.out.println("State: " + politician.getState());
        System.out.println("Age: " + politician.getAge());
        System.out.println("Experience: " + politician.getExperience() + " years");
    }
}
