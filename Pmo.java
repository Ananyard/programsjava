class Pmo {
    String officeName;
    PrimeMinister primeMinister;

    Pmo(String officeName, PrimeMinister primeMinister) {
        this.officeName = officeName;
        this.primeMinister = primeMinister;
    }

    void display() {
        System.out.println("Office: " + this.officeName);
        this.primeMinister.display();
    }
}