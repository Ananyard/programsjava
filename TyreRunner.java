class TyreRunner {
    public static void main(String[] args) {
        String brand = Tyre.getBrand();
        System.out.println("Tyre Brand: " + brand);

        int diameter = Tyre.getDiameterInches();
        System.out.println("Diameter (inches): " + diameter);

        String type = Tyre.getType();
        System.out.println("Tyre Type: " + type);

        boolean radial = Tyre.getIsRadial();
        System.out.println("Is Radial? " + radial);

        double price = Tyre.getPrice();
        System.out.println("Tyre Price: ₹" + price);

        String vehicle = Tyre.getVehicleType();
        System.out.println("For Vehicle: " + vehicle);
    }
}
