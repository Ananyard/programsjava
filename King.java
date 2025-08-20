public class King {
    int kingId;
    String kingName;
    String kingdom;
    int reignStartYear;
    int reignEndYear;
    boolean isFamous;

    void getKingInfo() {
        System.out.println("King ID: " + kingId);
        System.out.println("King Name: " + kingName);
        System.out.println("Kingdom: " + kingdom);
        System.out.println("Reign Start Year: " + reignStartYear);
        System.out.println("Reign End Year: " + reignEndYear);
        System.out.println("Is Famous: " + isFamous);
        System.out.println();
    }
}
