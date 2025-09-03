package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.politician.Politician;

public class LokSabha {

    private Politician[] politicians = new Politician[12];
    private int index;

    public boolean addPolitician(Politician politician) {
        boolean isAdded = false;
        if (politician != null && index < politicians.length) {
            politicians[index++] = politician;
            isAdded = true;
        } else {
            System.out.println("Invalid Politician or No space left...");
        }
        return isAdded;
    }

    public void getAllPoliticians() {
        System.out.println("----- List of Politicians -----");
        for (Politician politician : politicians) {
            if (politician != null) {
                System.out.println("ID: " + politician.getPoliticianId());
                System.out.println("Name: " + politician.getName());
                System.out.println("---------------------------");
            }
        }
    }
}
