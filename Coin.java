class Coin {
    int coinId;
    double value;
    String currency;
    String year;
    String country;
    String material;
    String shape;

    void getCoinInfo() {
        System.out.println("Coin ID: " + coinId);
        System.out.println("Value: " + value);
        System.out.println("Currency: " + currency);
        System.out.println("Year: " + year);
        System.out.println("Country: " + country);
        System.out.println("Material: " + material);
        System.out.println("Shape: " + shape);
        System.out.println("-----------------------------");
    }
}
