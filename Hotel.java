class Hotel {

    static String itemNames[] = {
        "Paneer Tikka", "Idli", "Dosa", "Vada", "Upma", "Puri", "Biryani", "Fried Rice", "Noodles", "South Thali",
        "Paratha", "Chole Bature", "Samosa", "Pakoda", "Korma", "Thali", "North Thali", "Soya Chunks Fry", "Curd Rice",
        "Veg Pulao", "Roti", "Dal", "Gobi", "Tikka", "Soup", "Sweet Pongal"
    };

    public static void names() {
        for (String item : itemNames) {
            System.out.println(item);
        }
    }
}