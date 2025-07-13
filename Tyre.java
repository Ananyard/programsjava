class Tyre {
    static String brand = "MRF";
    static int diameterInches = 16;
    static String type = "Tubeless";
    static boolean isRadial = true;
    static double price = 4500.0;
    static String vehicleType = "Car";

    static String getBrand() { 
	return brand; 
	}
    static int getDiameterInches() { 
	return diameterInches;
	}
    static String getType() { 
	return type;
	}
    static boolean getIsRadial() { 
	return isRadial;
	}
    static double getPrice() {
		return price; }
    static String getVehicleType() { 
	return vehicleType; 
	}
}