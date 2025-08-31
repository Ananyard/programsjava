package com.xworkx.loksabha.validation;

import com.xworkx.loksabha.politician.Politician;

public class ValidatePolitician {
    private Politician politician;

    public boolean validatePoliticianInfo(Politician politician) {
        boolean validId = false;
        boolean validName = false;
        boolean validParty = false;
        boolean validState = false;
        boolean validAge = false;
        boolean validExperience = false;

        if (politician.getPoliticianId() > 0) {
            validId = true;
        } else System.out.println("Invalid Politician ID");

        if (politician.getName() != null && !politician.getName().isEmpty()) {
            validName = true;
        } else System.out.println("Invalid Politician name");

        if (politician.getParty() != null && !politician.getParty().isEmpty()) {
            validParty = true;
        } else System.out.println("Invalid Party");

        if (politician.getState() != null && !politician.getState().isEmpty()) {
            validState = true;
        } else System.out.println("Invalid State");

        if (politician.getAge() > 25) {
            validAge = true;
        } else System.out.println("Invalid Age (must be above 25)");

        if (politician.getExperience() >= 0) {
            validExperience = true;
        } else System.out.println("Invalid Experience");

        if (validId && validName && validParty && validState && validAge && validExperience) {
            this.politician = politician;
            return true;
        }
        return false;
    }
}
