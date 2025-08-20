 class Crackers {
    int crackerId;
    String crackerName;
    String crackerType;
    int duration;
    double price;
    boolean isSafe;

    void getCrackerInfo() {
        System.out.println("Cracker ID: " + crackerId);
        System.out.println("Cracker Name: " + crackerName);
        System.out.println("Cracker Type: " + crackerType);
        System.out.println("Duration (seconds): " + duration);
        System.out.println("Price (INR): " + price);
        System.out.println("Is Safe: " + isSafe);
        System.out.println();
    }
}
