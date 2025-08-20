public class King {
    int kingId;
    String kingName;
    String kingdom;
    int reignStartYear;
    int reignEndYear;
    boolean isFamous;

    // Constructor
    public King(int kingId, String kingName, String kingdom, int reignStartYear, int reignEndYear, boolean isFamous) {
        this.kingId = kingId;
        this.kingName = kingName;
        this.kingdom = kingdom;
        this.reignStartYear = reignStartYear;
        this.reignEndYear = reignEndYear;
        this.isFamous = isFamous;
    }

    // Method to display king details
    public void getKingInfo() {
        System.out.println("------ King Info ------");
        System.out.println("ID: " + kingId);
        System.out.println("Name: " + kingName);
        System.out.println("Kingdom: " + kingdom);
        System.out.println("Reign: " + reignStartYear + " to " + reignEndYear);
        System.out.println("Famous: " + isFamous);
        System.out.println("------------------------");
    }
}
