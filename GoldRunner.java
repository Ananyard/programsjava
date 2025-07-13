class GoldRunner {

    public static void main(String[] args) {

        String types = Gold.getType();
        System.out.println("The gold type is " + types);

        double weights = Gold.getWeight();
        System.out.println("The weight of gold is " + weights + " grams");

        String purities = Gold.getPurity();
        System.out.println("The gold purity is " + purities);

        double pricePerGram = Gold.getPricePerGram();
        System.out.println("The price per gram is ₹" + pricePerGram);

        boolean hallmarked = Gold.getIsHallmarked();
        System.out.println("Is the gold hallmarked? " + hallmarked);

        String country = Gold.getCountry();
        System.out.println("The gold is from " + country);
    }
}
