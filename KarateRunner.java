public class KarateRunner {
    public static void main(String[] args) {

        System.out.println("Main started");

        Karate k1 = new Karate(1, "Aryan", "White", 10, "Sensei Kumar", "Bangalore", false);
        Karate k2 = new Karate(2, "Sneha", "Yellow", 12, "Sensei Kumar", "Bangalore", false);
        Karate k3 = new Karate(3, "Rahul", "Orange", 13, "Sensei Asha", "Mysore", false);
        Karate k4 = new Karate(4, "Meera", "Green", 14, "Sensei Asha", "Mysore", false);
        Karate k5 = new Karate(5, "Arjun", "Blue", 15, "Sensei Raj", "Hubli", false);
        Karate k6 = new Karate(6, "Divya", "Purple", 16, "Sensei Raj", "Hubli", false);
        Karate k7 = new Karate(7, "Vikram", "Brown", 17, "Sensei Leela", "Chennai", false);
        Karate k8 = new Karate(8, "Pooja", "Red", 18, "Sensei Leela", "Chennai", false);
        Karate k9 = new Karate(9, "Tarun", "Black", 19, "Sensei Manoj", "Pune", true);
        Karate k10 = new Karate(10, "Anjali", "Black", 20, "Sensei Manoj", "Pune", true);
        Karate k11 = new Karate(11, "Kiran", "White", 11, "Sensei Rekha", "Mangalore", false);
        Karate k12 = new Karate(12, "Lakshmi", "Yellow", 12, "Sensei Rekha", "Mangalore", false);
        Karate k13 = new Karate(13, "Nikhil", "Orange", 13, "Sensei Ravi", "Coimbatore", false);
        Karate k14 = new Karate(14, "Asha", "Green", 14, "Sensei Ravi", "Coimbatore", false);
        Karate k15 = new Karate(15, "Deepak", "Blue", 15, "Sensei Lalita", "Goa", false);
        Karate k16 = new Karate(16, "Nandini", "Purple", 16, "Sensei Lalita", "Goa", false);
        Karate k17 = new Karate(17, "Surya", "Brown", 17, "Sensei Arvind", "Hyderabad", false);
        Karate k18 = new Karate(18, "Priya", "Red", 18, "Sensei Arvind", "Hyderabad", false);
        Karate k19 = new Karate(19, "Manoj", "Black", 19, "Sensei Neha", "Delhi", true);
        Karate k20 = new Karate(20, "Sandhya", "Black", 20, "Sensei Neha", "Delhi", true);

        k1.getKarateInfo();   k2.getKarateInfo();   k3.getKarateInfo();   k4.getKarateInfo();   k5.getKarateInfo();
        k6.getKarateInfo();   k7.getKarateInfo();   k8.getKarateInfo();   k9.getKarateInfo();   k10.getKarateInfo();
        k11.getKarateInfo();  k12.getKarateInfo();  k13.getKarateInfo();  k14.getKarateInfo();  k15.getKarateInfo();
        k16.getKarateInfo();  k17.getKarateInfo();  k18.getKarateInfo();  k19.getKarateInfo();  k20.getKarateInfo();

        System.out.println("Main ended");
    }
}
