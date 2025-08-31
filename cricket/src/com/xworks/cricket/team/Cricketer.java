package com.xworks.cricket.team;

import com.xworks.cricket.player.Player;

public class Cricketer extends Player {


    public String role = "Wicket-Keeper Batsman";

    public void showDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Team: " + getTeamPlayed());
        System.out.println("Role: " + role);
    }
}
