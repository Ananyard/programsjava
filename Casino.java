class Casino {
    int casinoId;
    String name;
    String location;
    int numberOfGames;
    double revenue;
    boolean isOpen24Hours;
    String managerName;
    int areaInSqFt;
    int employeeCount;
    String specialtyGame;

	Casino(){
	
	System.out.println(" Default Constructor invoked for");
	
	
	}


    Casino(int casinoId, String name, String location, int numberOfGames, double revenue, boolean isOpen24Hours,
           String managerName, int areaInSqFt, int employeeCount, String specialtyGame) {
        this.casinoId = casinoId;
        this.name = name;
        this.location = location;
        this.numberOfGames = numberOfGames;
        this.revenue = revenue;
        this.isOpen24Hours = isOpen24Hours;
        this.managerName = managerName;
        this.areaInSqFt = areaInSqFt;
        this.employeeCount = employeeCount;
        this.specialtyGame = specialtyGame;
        System.out.println("Constructor invoked for");
    }

    public void getCasinoInfo() {
        System.out.println("ID: " + casinoId + ", Name: " + name + ", Location: " + location + ", Games: " + numberOfGames +
                           ", Revenue: $" + revenue + "M, 24x7: " + isOpen24Hours + ", Manager: " + managerName +
                           ", Area: " + areaInSqFt + " sq.ft, Employees: " + employeeCount + ", Specialty: " + specialtyGame);
    }
}
