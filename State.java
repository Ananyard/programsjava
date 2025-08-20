class State {
    String stateName;
    String chiefMinister;
    City city;

    void getStateInfo() {
        System.out.println("State Info:");
        System.out.println("Name: " + stateName);
        System.out.println("Chief Minister: " + chiefMinister);
        city.getCityInfo();
    }
}
