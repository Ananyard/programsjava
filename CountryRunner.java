class CountryRunner {
    public static void main(String[] args) {

        Country country = new Country();
        country.countryName = "India";
        country.continent = "Asia";

        State state = new State();
        state.stateName = "Karnataka";
        state.chiefMinister = "Siddaramaiah";

        City city = new City();
        city.cityName = "Bengaluru";
        city.population = 8700000;

        
        state.city = city;
        country.state = state;

       
        country.getCountryInfo();
    }
}
