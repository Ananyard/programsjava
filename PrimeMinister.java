class PrimeMinister {
    String name;
    CabinetMinister cabinetMinister;

    PrimeMinister(String name, CabinetMinister cabinetMinister) {
        this.name = name;
        this.cabinetMinister = cabinetMinister;
    }

    void display() {
        System.out.println("Prime Minister: " + this.name);
        this.cabinetMinister.display();
    }
}