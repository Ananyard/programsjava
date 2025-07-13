class TailorRunner {

    public static void main(String[] args) {

        String name = Tailor.getName();
        System.out.println("Tailor Name: " + name);

        int exp = Tailor.getExperienceYears();
        System.out.println("Experience: " + exp + " years");

        String specialty = Tailor.getSpecialty();
        System.out.println("Specialty: " + specialty);

        boolean homeService = Tailor.getHomeService();
        System.out.println("Home service available? " + homeService);

        double charge = Tailor.getStitchingCharge();
        System.out.println("Stitching Charge: ₹" + charge);

        String location = Tailor.getLocation();
        System.out.println("Located in: " + location);
    }
}