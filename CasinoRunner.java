class CasinoRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Casino casino1 = new Casino(); // default
        Casino casino2 = new Casino(1, "Golden Palace");
        Casino casino3 = new Casino("Macau", 400.5);
        Casino casino4 = new Casino("Roulette", true);
        Casino casino5 = new Casino(5, "Bellagio", "Las Vegas", 200, 250.0, true,
                "Emma Watson", 100000, 500, "Poker");
        Casino casino6 = new Casino(6, "Monte Carlo", "Monaco", 180, 180.0, false,
                "Charles Leclerc", 75000, 300, "Baccarat");

        // Print details
        casino1.getCasinoInfo();
        casino2.getCasinoInfo();
        casino3.getCasinoInfo();
        casino4.getCasinoInfo();
        casino5.getCasinoInfo();
        casino6.getCasinoInfo();

        System.out.println("Main ended");
    }
}
