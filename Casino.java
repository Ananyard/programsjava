 class Casino {
    int casinoId;
    String name;
    String location;
    int numberOfGames;
    double revenue; // in millions
    boolean isOpen24Hours;
    String managerName;
    double areaInSqFt;
    int employeeCount;
    String specialtyGame;
	
	public getCasinoInfo(){
	System.out.println("Casino ID: " + casinoId);
    System.out.println("Name: " + name);
    System.out.println("Location: " + location);
    System.out.println("Number of Games: " + numberOfGames);
    System.out.println("Revenue (in millions): " + revenue);
    System.out.println("Open 24 Hours: " + isOpen24Hours);
    System.out.println("Manager Name: " + managerName);
    System.out.println("Area (sq ft): " + areaInSqFt);
    System.out.println("Employee Count: " + employeeCount);
    System.out.println("Specialty Game: " + specialtyGame);
	
	}
}
