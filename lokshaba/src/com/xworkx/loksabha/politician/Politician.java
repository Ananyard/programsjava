package com.xworkx.loksabha.politician;

public class Politician {
    private int politicianId;
    private String name;
    private String party;
    private String state;
    private int age;
    private int experience;

    public void setPoliticianId(int politicianId) {
        this.politicianId = politicianId;
    }
    public int getPoliticianId() {
        return politicianId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setParty(String party) {
        this.party = party;
    }
    public String getParty() {
        return party;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getExperience() {
        return experience;
    }
}
