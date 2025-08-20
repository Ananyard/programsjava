class Coin {
    int coinId;
    double value;
    String currency;
    int year;
    String country;
    String material;
    String shape;
    String denomination;
    double weight;

    // Default constructor
    Coin() {
        System.out.println("Default constructor called");
    }
	Coin(int coinId, double value, String currency, int year, String country, String material, String shape) {
    this.coinId = coinId;
    this.value = value;
    this.currency = currency;
    this.year = year;
    this.country = country;
    this.material = material;
    this.shape = shape;
    System.out.println("Constructor created for Coin ID: " + coinId);
}


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
