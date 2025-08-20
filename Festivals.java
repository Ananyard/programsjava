class Festivals {
    public int festId;
    public String name;
    public String region;
    public String mainDeityOrTheme;
    public boolean isNationalHoliday;
    public int durationDays;

    public void getInfo() {
        System.out.println("Fest ID: " + festId);
        System.out.println("Name: " + name);
        System.out.println("Region: " + region);
        System.out.println("Main Deity or Theme: " + mainDeityOrTheme);
        System.out.println("National Holiday: " + isNationalHoliday);
        System.out.println("Duration (days): " + durationDays);
        System.out.println("---------------------------");
    }
}
