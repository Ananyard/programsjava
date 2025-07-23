class SweetTooth {
    public static double takeOrder(String sweetName) {
        double price = 0.0;

         if (sweetName == "Gulab Jamun") {
            price = 40;
			return price;
        } else if (sweetName == "Rasgulla") {
            price = 45;
			return price;
        } else if (sweetName == "Kaju Katli") {
            price = 120;
			return price;
        } else if (sweetName == "Mysore Pak") {
            price = 60;
			return price;
        } else if (sweetName == "Jalebi") {
            price = 50;
			return price;
        } else if (sweetName == "Motichoor Laddu") {
            price = 55;
			return price;
        } else if (sweetName == "Rasmalai") {
            price = 90;
			return price;
        } else if (sweetName == "Peda") {
            price = 70;
			return price;
        } else if (sweetName == "Badam Halwa") {
            price = 100;
			return price;
        } else if (sweetName == "Sandesh") {
            price = 80;
			return price;
        } else if (sweetName == "Kesar Barfi") {
            price = 110;
			return price;
        } else if (sweetName == "Chum Chum") {
            price = 60;
			return price;
        } else if (sweetName == "Besan Laddu") {
            price = 50;
			return price;
        } else if (sweetName == "Halwa") {
            price = 90;
			return price;
        } else if (sweetName == "Milk Cake") {
            price = 85;
			return price;
        } else if (sweetName == "Dry Fruit Laddu") {
            price = 120;
			return price;
        } else if (sweetName == "Soan Papdi") {
            price = 45;
			return price;
        } else if (sweetName == "Coconut Barfi") {
            price = 70;
			return price;
        } else if (sweetName == "Boondi Laddu") {
            price = 40;
			return price;
        } else {
            System.out.println(price + " invalid ");
        }

        return price;
    }
}
