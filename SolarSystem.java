class SolarSystem{
    String systemName;
    int numberOfPlanets;
    Planet planet;
	
	void getSolarSystemInfo() {
        System.out.println("Solar System Info:");
        System.out.println("System Name: " + systemName);
        System.out.println("Number of Planets: " + numberOfPlanets);
        planet.getPlanetInfo();
    }
}