package com.xworks.cricket.player;

// Parent class
public class Player {
    public String name;
    public String teamPlayed;

    public String getName() {
        return name;
    }

    public String getTeamPlayed() {
        return teamPlayed;
    }

    public void played(String team) {
        System.out.println(name + " played for " + team);
    }
}
