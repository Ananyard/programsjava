class PmoRunner {
    public static void main(String[] args) {
        CabinetMinister minister = new CabinetMinister("Nirmala Sitharaman", "Finance");
        PrimeMinister pm = new PrimeMinister("Narendra Modi", minister);
        Pmo pmo = new Pmo("PMO India", pm);
        pmo.display();
    }
}