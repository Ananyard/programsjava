class BlazerRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Blazer blazer1 = new Blazer(); // default constructor
        Blazer blazer2 = new Blazer(101, "S");
        Blazer blazer3 = new Blazer("Zara", 1499.0);
        Blazer blazer4 = new Blazer("Black", "Velvet", "Female");

       
        Blazer blazer5 = new Blazer(105, "M", "Blue", "Cotton", "Arrow", 1599.0, "Male");
        Blazer blazer6 = new Blazer(106, "L", "Red", "Linen", "Van Heusen", 1899.0, "Female");

       
        blazer1.getBlazerInfo();
        blazer2.getBlazerInfo();
        blazer3.getBlazerInfo();
        blazer4.getBlazerInfo();
        blazer5.getBlazerInfo();
        blazer6.getBlazerInfo();

        System.out.println("Main ended");
    }
}
