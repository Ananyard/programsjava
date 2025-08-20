class JaiRamMedicalRunner {
    public static void main(String[] args) {

        String medicine1[] = {"Dolo", "Paracetamol"};
        String medicine2[] = {"Moiz", "Anuloma"};

        JaiRamMedical jairam = new JaiRamMedical();
        jairam.medicine = medicine1;
        jairam.price = 99.00;
		jairam.storeName ="pp";

        JaiRamMedical jairam1 = new JaiRamMedical();
        jairam1.medicine = medicine2;
        jairam1.price = 100.0;
		jairam1.storeName = "ram";

        JaiRamMedical jairam3 = new JaiRamMedical(1, "JaiRam Medical Store");
        System.out.println("The medicine ID: " + jairam3.medicineId + ", Store name: " + jairam3.storeName);

        jairam.getMedicine();
        jairam1.getMedicine();
        
    }
}
