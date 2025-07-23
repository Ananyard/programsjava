class UberEats {
    public static double takeOrder(String foodName) {
        double price = 0.0;
 if (foodName == "Burger") {
            price = 90;
			return price;
        } else if (foodName == "Pizza") {
            price = 150;
			return price;
        } else if (foodName == "French Fries") {
            price = 60;
			return price;
        } else if (foodName == "Fried Chicken") {
            price = 130;
			return price;
        } else if (foodName == "Hot Dog") {
            price = 80;
			return price;
        } else if (foodName == "Nuggets") {
            price = 70;
			return price;
        } else if (foodName == "Onion Rings") {
            price = 65;
			return price;
        } else if (foodName == "Cheese Sandwich") {
            price = 50;
			return price;
        } else if (foodName == "Tacos") {
            price = 110;
			return price;
        } else if (foodName == "Pasta") {
            price = 120;
			return price;
        } else if (foodName == "Garlic Bread") {
            price = 45;
			return price;
        } else if (foodName == "Veg Roll") {
            price = 55;
			return price;
        } else if (foodName == "Spring Rolls") {
            price = 70;
			return price;
        } else if (foodName == "Momoz") {
            price = 60;
			return price;
        } else if (foodName == "Cheesy Nachos") {
            price = 95;
			return price;
        } else if (foodName == "Paneer Wrap") {
            price = 80;
			return price;
        } else if (foodName == "Club Sandwich") {
            price = 90;
			return price;
        } else if (foodName == "Chilli Potato") {
            price = 65;
			return price;
        } else if (foodName == "Corn Cheese Balls") {
            price = 75;
			return price;
        } else if (foodName == "Chocolate Shake") {
            price = 50;
			return price;
        } else {
            System.out.println(price + " invalid ");
        }

        return price;
    }
}