class Blinkit {
    public static double takeOrder(String itemName) {
        double price = 0.0;

        if (itemName == "Milk") {
            price = 50;
        } else if (itemName == "Bread") {
            price = 30;
        } else if (itemName == "Eggs") {
            price = 60;
        } else if (itemName == "Rice 1kg") {
            price = 70;
        } else if (itemName == "Atta 1kg") {
            price = 55;
        } else if (itemName == "Cooking Oil 1L") {
            price = 130;
        } else if (itemName == "Toor Dal 1kg") {
            price = 90;
        } else if (itemName == "Salt") {
            price = 20;
        } else if (itemName == "Sugar") {
            price = 45;
        } else if (itemName == "Tea Powder") {
            price = 110;
        } else if (itemName == "Maggi Pack") {
            price = 15;
        } else if (itemName == "Biscuits") {
            price = 25;
        } else if (itemName == "Peanuts") {
            price = 35;
        } else if (itemName == "Wheat Rava") {
            price = 40;
        } else if (itemName == "Toothpaste") {
            price = 60;
        } else if (itemName == "Toilet Paper") {
            price = 35;
        } else if (itemName == "Washing Powder") {
            price = 120;
        } else if (itemName == "Shampoo") {
            price = 95;
        } else if (itemName == "Handwash") {
            price = 55;
        } else {
            System.out.println(price + " invalid ");
        }

        return price;
    }
}
