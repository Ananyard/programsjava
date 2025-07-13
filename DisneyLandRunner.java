class DisneyLandRunner {

    public static void main(String[] args) {
        String location = DisneyLand.getLocation();
        System.out.println("Disneyland is in: " + location);

        int rides = DisneyLand.getNumberOfRides();
        System.out.println("Number of rides: " + rides);

        double fee = DisneyLand.getEntryFee();
        System.out.println("Entry fee: $" + fee);

        boolean parade = DisneyLand.getHasParade();
        System.out.println("Has Parade? " + parade);

        String mascot = DisneyLand.getMascot();
        System.out.println("Mascot is: " + mascot);

        boolean open = DisneyLand.getOpenAllYear();
        System.out.println("Open all year? " + open);
    }
}