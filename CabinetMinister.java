class CabinetMinister {
    String name;
    String portfolio;

    CabinetMinister(String name, String portfolio) {
        this.name = name;
        this.portfolio = portfolio;
    }

    void display() {
        System.out.println("Cabinet Minister: " + this.name);
        System.out.println("Portfolio: " + this.portfolio);
    }
}