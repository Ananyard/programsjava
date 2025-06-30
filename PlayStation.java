/*class PlayStation {
    static String games[] = {"God of War", "Spider-Man", "FREEFIRE", "FIFA", "NBA 2K", "Call of Duty", "Uncharted", "Gran Turismo", "The Last of Us", "Bloodborne"};

    public static void main(String[] games) {
        System.out.println( games[0] + " " + games[1] + " " + games[2] + " " + games[3] + " " + games[4] + " " +games[5] +
		" " + games[6] + " " + games[7] + " " + games[8] + " " + games[9]);
    }
}*/



class AppStore {
    static String appNames[] = {
        "WhatsApp", "Instagram", "YouTube", "Snapchat", "Telegram",
        "Spotify", "Netflix", "Zoom", "TempleRun", "HayDay"
    };

    public static void main(String[] apps) {
        for (String app : appNames) {
            System.out.println(app);
        }
    }
}
