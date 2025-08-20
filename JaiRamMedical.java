class JaiRamMedical {
    int medicineId; // corrected spelling
    String medicine[];
    String storeName;
    double price;

    JaiRamMedical() {
    }

    JaiRamMedical(int medicineId, String medicine[], String storeName, double price) {
        this.medicineId = medicineId;
        this.medicine = medicine;
        this.storeName = storeName;
        this.price = price;
    }

    JaiRamMedical(int medicineId, String storeName) {
        this.medicineId = medicineId;
        this.storeName = storeName;
    }


    JaiRamMedical(double price) {
        this.price = price;
    }

    public void getMedicine() {
        System.out.println("The medicine price: " + price);
		System.out.println("The store name: " + storeName);
		
		

        if (medicine != null) {
            for (String med : medicine) {
                System.out.println(med);
            }
        } else {
            System.out.println("No medicine list available.");
        }
    }
}
