class GalaxyRunner {
    public static void main(String[] args) {
	
	
	Galaxy galaxy = new Galaxy();
	 galaxy.galaxyName = "milky way";
   galaxy.type = "Spiral";
  
  
  
  SolarSystem solarSystem = new SolarSystem();
  solarSystem.systemName="solor";
  solarSystem.numberOfPlanets = 8;
  
  
  Planet planet =new Planet();
  	planet.planetName = "earth";
   planet.numberOfMoons = 1;
	
	
	
galaxy.solarSystem = solarSystem;
solarSystem.planet = planet;

galaxy.getGalaxyInfo();
}
}