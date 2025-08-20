class CasinoRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Casino casino1 = new Casino(1, "Golden Nugget", "Las Vegas", 150, 120.5, true, "John Smith", 50000, 300, "Blackjack");
        Casino casino2 = new Casino(2, "Bellagio", "Las Vegas", 200, 250.0, true, "Emma Watson", 100000, 500, "Poker");
        Casino casino3 = new Casino(3, "Marina Bay Sands", "Singapore", 180, 300.3, true, "Lee Hsien", 120000, 450, "Roulette");
        Casino casino4 = new Casino(4, "Monte Carlo", "Monaco", 100, 180.8, false, "Charles Leclerc", 75000, 200, "Baccarat");
        Casino casino5 = new Casino(5, "The Venetian", "Macau", 220, 400.6, true, "David Wong", 130000, 600, "Sic Bo");
        Casino casino6 = new Casino(6, "Caesars Palace", "Las Vegas", 190, 280.1, true, "Linda Gray", 95000, 420, "Craps");
        Casino casino7 = new Casino(7, "Sun City", "South Africa", 130, 150.5, false, "Nelson Dlamini", 70000, 350, "Slots");
        Casino casino8 = new Casino(8, "Crown Casino", "Melbourne", 160, 220.0, true, "Steve Irwin", 90000, 400, "Keno");
        Casino casino9 = new Casino(9, "Foxwoods", "Connecticut", 210, 310.4, true, "Sarah Johnson", 110000, 470, "Texas Hold'em");
        Casino casino10 = new Casino(10, "Resorts World", "Las Vegas", 170, 275.9, true, "Tom Hanks", 102000, 390, "Pai Gow");
        Casino casino11 = new Casino(11, "WinStar World", "Oklahoma", 250, 450.2, true, "Mary Sue", 200000, 800, "Three Card Poker");
        Casino casino12 = new Casino(12, "Galaxy Macau", "Macau", 230, 360.0, true, "Tony Chan", 125000, 510, "Fan Tan");
        Casino casino13 = new Casino(13, "Atlantis Casino", "Bahamas", 140, 190.3, false, "Nancy Drew", 80000, 270, "Caribbean Stud Poker");
        Casino casino14 = new Casino(14, "Hippodrome Casino", "London", 120, 170.5, false, "Arthur Doyle", 60000, 250, "Pontoon");
        Casino casino15 = new Casino(15, "Casino Lisboa", "Lisbon", 110, 145.0, true, "Luis Figo", 68000, 300, "Rummy");
        Casino casino16 = new Casino(16, "Treasure Island", "Las Vegas", 150, 210.4, true, "Tina Fey", 85000, 330, "Let It Ride");
        Casino casino17 = new Casino(17, "Harrah's", "New Orleans", 160, 205.2, true, "Steve Nash", 87000, 340, "Chuck-a-luck");
        Casino casino18 = new Casino(18, "Mohegan Sun", "Connecticut", 200, 325.6, true, "Jessica Alba", 100000, 460, "Big Six Wheel");
        Casino casino19 = new Casino(19, "Red Rock Casino", "Las Vegas", 170, 195.7, true, "George Clooney", 91000, 380, "Crapless Craps");
        Casino casino20 = new Casino(20, "The Mirage", "Las Vegas", 190, 220.8, true, "Morgan Freeman", 96000, 400, "Roulette");

casino.getCasinoInfo();
casino1.getCasinoInfo();
casino2.getCasinoInfo();
casino3.getCasinoInfo();
casino4.getCasinoInfo();
casino5.getCasinoInfo();
casino6.getCasinoInfo();
casino7.getCasinoInfo();
casino8.getCasinoInfo();
casino9.getCasinoInfo();
casino10.getCasinoInfo();
casino11.getCasinoInfo();
casino12.getCasinoInfo();
casino13.getCasinoInfo();
casino14.getCasinoInfo();
casino15.getCasinoInfo();
casino16.getCasinoInfo();
casino17.getCasinoInfo();
casino18.getCasinoInfo();
casino19.getCasinoInfo();

        System.out.println("main ended");
    }
}
