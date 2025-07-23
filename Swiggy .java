class Swiggy  {
    public static double takeOrder(String foodName) {
        double price = 0.0;

        if (foodName == "Idli") {
            price = 30;
			return price;
        } else if (foodName == "Vada") {
            price = 20;
			return price;
        } else if (foodName == "Masala Dosa") {
            price = 60;
			return price;
        } else if (foodName == "Plain Dosa") {
            price = 45;
			return price;
        } else if (foodName == "Rava Dosa") {
            price = 55;
			return price;
        } else if (foodName == "Onion Uttapam") {
            price = 70;
			return price;
        } else if (foodName == "Pongal") {
            price = 50;
			return price;
        } else if (foodName == "Medu Vada") {
            price = 25;
			return price;
        } else if (foodName == "Upma") {
            price = 35;
			return price;
        } else if (foodName == "Kesari Bath") {
            price = 30;
			return price;
        } else if (foodName == "Filter Coffee") {
            price = 20;
			return price;
        } else if (foodName == "Lemon Rice") {
            price = 40;
			return price;
        } else if (foodName == "Curd Rice") {
            price = 35;
			return price;
        } else if (foodName == "Sambar Rice") {
            price = 50;
			return price;
        } else if (foodName == "Tomato Bath") {
            price = 45;
			return price;
        } else if (foodName == "Vegetable Dosa") {
            price = 55;
			return price;
        } else if (foodName == "Kharabath") {
            price = 30;
			return price;
        } else if (foodName == "Neer Dosa") {
            price = 40;
			return price;
        } else if (foodName == "Ragi Dosa") {
            price = 50;
			return price;
        } else if (foodName == "Mini Idli Sambar") {
            price = 35;
			return price;
        } else {
            System.out.println(price + " invalid ");
        }

        return price;
    }
	
				
	
}