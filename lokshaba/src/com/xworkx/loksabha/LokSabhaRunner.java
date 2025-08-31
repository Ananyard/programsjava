package com.xworkx.loksabha;

import com.xworkx.loksabha.politician.Politician;
import com.xworkx.loksabha.details.LokSabhaDetails;

public class LokSabhaRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Politician politician = new Politician();
        politician.setPoliticianId(101);
        politician.setName("Rahul Sharma");
        politician.setParty("Congress");
        politician.setState("Maharashtra");
        politician.setAge(48);
        politician.setExperience(15);

        LokSabhaDetails details = new LokSabhaDetails();
        boolean added = details.addPolitician(politician);
        System.out.println("Politician added: " + added);

        if (added) {
            details.showPoliticianDetails();
        }

        System.out.println("Main ended");
    }
}
