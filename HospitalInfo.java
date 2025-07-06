class HospitalInfo {
    public static void main(String[] args) {
        doctor("Dr. Meena", "Cardiology");
        doctor("Dr. Ravi", "Orthopedics");
        availableBeds(15);
    }

    public static void doctor(String name, String dept) {
        System.out.println(name + " - " + dept);
    }

    public static void availableBeds(int count) {
        System.out.println("Available Beds: " + count);
    }
}
