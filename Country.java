class Country {
    String countryName;
    String continent;
    State state;

    void getCountryInfo() {
        System.out.println("Country Info:");
        System.out.println("Name: " + countryName);
        System.out.println("Continent: " + continent);
        state.getStateInfo();
    }
}
