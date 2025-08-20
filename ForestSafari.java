class ForestSafari {
     int safariId;
     String forestName;
     String state;
     boolean hasTigerReserve;
     double ticketPrice;
     int maxVisitorsPerDay;

    public void getForestSafariInfo() {
        System.out.println("Safari ID: " + safariId);
        System.out.println("Forest Name: " + forestName);
        System.out.println("State: " + state);
        System.out.println("Has Tiger Reserve: " + hasTigerReserve);
        System.out.println("Ticket Price: ₹" + ticketPrice);
        System.out.println("Max Visitors Per Day: " + maxVisitorsPerDay);
        System.out.println("----------------------------------");
    }
}
