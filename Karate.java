public class Karate {
    int karateId;
    String studentName;
    String beltColor;
    int age;
    String trainerName;
    String dojoLocation;
    boolean isBlackBelt;

   
    public Karate(int karateId, String studentName, String beltColor, int age, String trainerName, String dojoLocation, boolean isBlackBelt) {
        this.karateId = karateId;
        this.studentName = studentName;
        this.beltColor = beltColor;
        this.age = age;
        this.trainerName = trainerName;
        this.dojoLocation = dojoLocation;
        this.isBlackBelt = isBlackBelt;
    }

   
    public void getKarateInfo() {
        System.out.println("----- Karate Student Info -----");
        System.out.println("ID           : " + karateId);
        System.out.println("Name         : " + studentName);
        System.out.println("Belt Color   : " + beltColor);
        System.out.println("Age          : " + age);
        System.out.println("Trainer Name : " + trainerName);
        System.out.println("Dojo Location: " + dojoLocation);
        System.out.println("Black Belt   : " + isBlackBelt);
        System.out.println("--------------------------------");
    }
}
