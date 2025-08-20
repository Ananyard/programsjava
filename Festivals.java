public class Festivals {
    int festId;
    String name;
    String region;
    String mainDeityOrTheme;
    boolean isNationalHoliday;
    int durationDays;

    // Constructor
    Festivals(int festId, String name, String region, String mainDeityOrTheme, boolean isNationalHoliday, int durationDays) {
        this.festId = festId;
        this.name = name;
        this.region = region;
        this.mainDeityOrTheme = mainDeityOrTheme;
        this.isNationalHoliday = isNationalHoliday;
        this.durationDays = durationDays;
    }

    // Method to print festival information
    void getInfo() {
        System.out.println("Festival ID: " + festId);
        System.out.println("Name: " + name);
        System.out.println("Region: " + region);
        System.out.println("Theme/Deity: " + mainDeityOrTheme);
        System.out.println("Is National Holiday: " + isNationalHoliday);
        System.out.println("Duration (Days): " + durationDays);
        System.out.println("-----------------------------");
    }
}
