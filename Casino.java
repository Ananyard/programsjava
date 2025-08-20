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

    // Default constructor
    Casino() {
        System.out.println("Default constructor invoked");
    }

    // Constructor with id and name
    Casino(int casinoId, String name) {
        this.casinoId = casinoId;
        this.name = name;
        System.out.println("Constructor invoked for: " + name);
    }

    // Constructor with location and revenue
    Casino(String location, double revenue) {
        this.location = location;
        this.revenue = revenue;
        System.out.println("Constructor invoked for location: " + location);
    }

    // Constructor with specialtyGame and isOpen24Hours
    Casino(String specialtyGame, boolean isOpen24Hours) {
        this.specialtyGame = specialtyGame;
        this.isOpen24Hours = isOpen24Hours;
        System.out.println("Constructor invoked for game: " + specialtyGame);
    }

    // Constructor with full details
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
        System.out.println("Full constructor invoked for: " + name);
    }

    void getCasinoInfo() {
        System.out.println("Casino ID: " + casinoId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Games: " + numberOfGames);
        System.out.println("Revenue: $" + revenue + "M");
        System.out.println("24/7 Open: " + isOpen24Hours);
        System.out.println("Manager: " + managerName);
        System.out.println("Area: " + areaInSqFt + " sq.ft");
        System.out.println("Employees: " + employeeCount);
        System.out.println("Specialty Game: " + specialtyGame);
        System.out.println("----------------------------------");
    }
}
