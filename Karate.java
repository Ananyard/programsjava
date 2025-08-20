public class Karate {
    public int beltRank;
    public String style;
    public int yearsOfPractice;
    public boolean hasBlackBelt;
    public String instructorName;
    public double trainingHoursPerWeek;

    public void getInfo() {
        System.out.println("Belt Rank: " + beltRank);
        System.out.println("Style: " + style);
        System.out.println("Years of Practice: " + yearsOfPractice);
        System.out.println("Has Black Belt: " + hasBlackBelt);
        System.out.println("Instructor Name: " + instructorName);
        System.out.println("Training Hours per Week: " + trainingHoursPerWeek);
        System.out.println();
    }
}
