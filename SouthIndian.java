class SouthIndian {
    public static double takeOrder(String foodName) {
        double price = 0.0;

        if (foodName == "Idli") {
            price = 30;
        } else if (foodName == "Vada") {
            price = 20;
        } else if (foodName == "Masala Dosa") {
            price = 60;
        } else if (foodName == "Plain Dosa") {
            price = 45;
        } else if (foodName == "Rava Dosa") {
            price = 55;
        } else if (foodName == "Onion Uttapam") {
            price = 70;
        } else if (foodName == "Pongal") {
            price = 50;
        } else if (foodName == "Medu Vada") {
            price = 25;
        } else if (foodName == "Upma") {
            price = 35;
        } else if (foodName == "Kesari Bath") {
            price = 30;
        } else if (foodName == "Filter Coffee") {
            price = 20;
        } else if (foodName == "Lemon Rice") {
            price = 40;
        } else if (foodName == "Curd Rice") {
            price = 35;
        } else if (foodName == "Sambar Rice") {
            price = 50;
        } else if (foodName == "Tomato Bath") {
            price = 45;
        } else if (foodName == "Vegetable Dosa") {
            price = 55;
        } else if (foodName == "Kharabath") {
            price = 30;
        } else if (foodName == "Neer Dosa") {
            price = 40;
        } else if (foodName == "Ragi Dosa") {
            price = 50;
        } else if (foodName == "Mini Idli Sambar") {
            price = 35;
        } else {
            System.out.println(price + " invalid ");
        }

        return price;
    }
}