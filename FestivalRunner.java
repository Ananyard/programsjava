class FestivalRunner {
    public static void main(String[] fest) {

        System.out.println("main started");

        Festivals f1 = new Festivals(1, "Diwali", "Pan India", "Victory of Light over Darkness", true, 5);
        Festivals f2 = new Festivals(2, "Holi", "North India", "Colors and Spring", true, 2);
        Festivals f3 = new Festivals(3, "Pongal", "Tamil Nadu", "Harvest Festival", true, 4);
        Festivals f4 = new Festivals(4, "Bihu", "Assam", "Agricultural Celebration", false, 7);
        Festivals f5 = new Festivals(5, "Onam", "Kerala", "King Mahabali", false, 10);
        Festivals f6 = new Festivals(6, "Durga Puja", "West Bengal", "Goddess Durga", true, 5);
        Festivals f7 = new Festivals(7, "Ganesh Chaturthi", "Maharashtra", "Lord Ganesha", false, 10);
        Festivals f8 = new Festivals(8, "Ramzan Eid", "Pan India", "End of Ramadan", true, 1);
        Festivals f9 = new Festivals(9, "Christmas", "Pan India", "Birth of Jesus", true, 1);
        Festivals f10 = new Festivals(10, "Lohri", "Punjab", "Harvest and Bonfire", false, 1);
        Festivals f11 = new Festivals(11, "Raksha Bandhan", "North India", "Bond of Siblings", false, 1);
        Festivals f12 = new Festivals(12, "Karva Chauth", "North India", "Married Women's Fasting", false, 1);
        Festivals f13 = new Festivals(13, "Makar Sankranti", "Multiple States", "Sun God", false, 1);
        Festivals f14 = new Festivals(14, "Vaisakhi", "Punjab", "Harvest & Sikh New Year", false, 1);
        Festivals f15 = new Festivals(15, "Eid al-Adha", "Pan India", "Sacrifice and Faith", true, 1);
        Festivals f16 = new Festivals(16, "Ugadi", "Andhra Pradesh, Karnataka", "New Year Celebration", false, 1);
        Festivals f17 = new Festivals(17, "Navratri", "All over India", "Nine Nights of Goddess Durga", false, 9);
        Festivals f18 = new Festivals(18, "Guru Nanak Jayanti", "Punjab, North India", "Guru Nanak Dev Ji", true, 1);
        Festivals f19 = new Festivals(19, "Mahashivratri", "Pan India", "Lord Shiva", false, 1);
        Festivals f20 = new Festivals(20, "Janmashtami", "North India", "Lord Krishna's Birth", false, 1);

        f1.getInfo();
        f2.getInfo();
        f3.getInfo();
        f4.getInfo();
        f5.getInfo();
        f6.getInfo();
        f7.getInfo();
        f8.getInfo();
        f9.getInfo();
        f10.getInfo();
        f11.getInfo();
        f12.getInfo();
        f13.getInfo();
        f14.getInfo();
        f15.getInfo();
        f16.getInfo();
        f17.getInfo();
        f18.getInfo();
        f19.getInfo();
        f20.getInfo();

        System.out.println("main ended");
    }
}
