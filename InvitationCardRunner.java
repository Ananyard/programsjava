public class InvitationCardRunner {
    public static void main(String[] args) {

        System.out.println("main started");

        InvitationCard c1 = new InvitationCard(101, "Wedding", "Gold", "Velvet", "Anil", 25.0, true);
        InvitationCard c2 = new InvitationCard(102, "Birthday", "Pink", "Paper", "Kavya", 15.0, false);
        InvitationCard c3 = new InvitationCard(103, "Baby Shower", "Blue", "Fabric", "Divya", 18.5, true);
        InvitationCard c4 = new InvitationCard(104, "Anniversary", "Red", "Silk", "Ravi", 22.0, false);
        InvitationCard c5 = new InvitationCard(105, "Housewarming", "Orange", "Handmade Paper", "Sita", 20.0, true);
        InvitationCard c6 = new InvitationCard(106, "Engagement", "Silver", "Glossy", "Megha", 30.0, false);
        InvitationCard c7 = new InvitationCard(107, "Graduation", "Green", "Matte", "Vikas", 12.0, true);
        InvitationCard c8 = new InvitationCard(108, "Farewell", "Purple", "Paper", "Rekha", 14.0, false);
        InvitationCard c9 = new InvitationCard(109, "Baby Naming", "Yellow", "Cotton", "Latha", 17.5, true);
        InvitationCard c10 = new InvitationCard(110, "Retirement", "Brown", "Eco Paper", "Rajesh", 19.0, false);
        InvitationCard c11 = new InvitationCard(111, "Wedding Reception", "Ivory", "Silk Paper", "Anita", 28.0, true);
        InvitationCard c12 = new InvitationCard(112, "Get Together", "Cream", "Canvas", "Shyam", 13.0, false);
        InvitationCard c13 = new InvitationCard(113, "Festival", "Maroon", "Satin", "Nandini", 16.0, true);
        InvitationCard c14 = new InvitationCard(114, "Puberty Ceremony", "White", "Silk", "Harsha", 23.0, true);
        InvitationCard c15 = new InvitationCard(115, "Engagement", "Beige", "Glossy Card", "Radha", 21.0, false);
        InvitationCard c16 = new InvitationCard(116, "Baptism", "Sky Blue", "Textured Paper", "Reena", 26.0, true);
        InvitationCard c17 = new InvitationCard(117, "First Communion", "Lavender", "Linen", "Nisha", 24.0, false);
        InvitationCard c18 = new InvitationCard(118, "Reception", "Turquoise", "Fabric Paper", "Deepak", 29.0, true);
        InvitationCard c19 = new InvitationCard(119, "Thread Ceremony", "Indigo", "Brocade", "Surya", 32.0, false);
        InvitationCard c20 = new InvitationCard(120, "Graduation Party", "Teal", "Art Paper", "Sneha", 20.0, true);

        c1.getInfo();  c2.getInfo();  c3.getInfo();  c4.getInfo();  c5.getInfo();
        c6.getInfo();  c7.getInfo();  c8.getInfo();  c9.getInfo();  c10.getInfo();
        c11.getInfo(); c12.getInfo(); c13.getInfo(); c14.getInfo(); c15.getInfo();
        c16.getInfo(); c17.getInfo(); c18.getInfo(); c19.getInfo(); c20.getInfo();

        System.out.println("main ended");
    }
}
