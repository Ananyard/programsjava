package com.xworkx.policestation.police;

public class Police {
    private int badgeNumber;
    private String name;
    private String rank;
    private String joiningDate;
    private String stationLocation;
    private int age;

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }
    public int getBadgeNumber() {
        return badgeNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getRank() {
        return rank;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }
    public String getJoiningDate() {
        return joiningDate;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }
    public String getStationLocation() {
        return stationLocation;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

}
