class FestivalRunner {
    public static void main(String[] fest) {

        System.out.println("main started");

        Festivals f1 = new Festivals();
        f1.festId = 1;
        f1.name = "Diwali";
        f1.region = "Pan India";
        f1.mainDeityOrTheme = "Victory of Light over Darkness";
        f1.isNationalHoliday = true;
        f1.durationDays = 5;
        f1.getInfo();

        Festivals f2 = new Festivals();
        f2.festId = 2;
        f2.name = "Holi";
        f2.region = "North India";
        f2.mainDeityOrTheme = "Colors and Spring";
        f2.isNationalHoliday = true;
        f2.durationDays = 2;
        f2.getInfo();

        Festivals f3 = new Festivals();
        f3.festId = 3;
        f3.name = "Pongal";
        f3.region = "Tamil Nadu";
        f3.mainDeityOrTheme = "Harvest Festival";
        f3.isNationalHoliday = true;
        f3.durationDays = 4;
        f3.getInfo();

        Festivals f4 = new Festivals();
        f4.festId = 4;
        f4.name = "Bihu";
        f4.region = "Assam";
        f4.mainDeityOrTheme = "Agricultural Celebration";
        f4.isNationalHoliday = false;
        f4.durationDays = 7;
        f4.getInfo();

        Festivals f5 = new Festivals();
        f5.festId = 5;
        f5.name = "Onam";
        f5.region = "Kerala";
        f5.mainDeityOrTheme = "King Mahabali";
        f5.isNationalHoliday = false;
        f5.durationDays = 10;
        f5.getInfo();

        Festivals f6 = new Festivals();
        f6.festId = 6;
        f6.name = "Durga Puja";
        f6.region = "West Bengal";
        f6.mainDeityOrTheme = "Goddess Durga";
        f6.isNationalHoliday = true;
        f6.durationDays = 5;
        f6.getInfo();

        Festivals f7 = new Festivals();
        f7.festId = 7;
        f7.name = "Ganesh Chaturthi";
        f7.region = "Maharashtra";
        f7.mainDeityOrTheme = "Lord Ganesha";
        f7.isNationalHoliday = false;
        f7.durationDays = 10;
        f7.getInfo();

        Festivals f8 = new Festivals();
        f8.festId = 8;
        f8.name = "Ramzan Eid";
        f8.region = "Pan India";
        f8.mainDeityOrTheme = "End of Ramadan";
        f8.isNationalHoliday = true;
        f8.durationDays = 1;
        f8.getInfo();

        Festivals f9 = new Festivals();
        f9.festId = 9;
        f9.name = "Christmas";
        f9.region = "Pan India";
        f9.mainDeityOrTheme = "Birth of Jesus";
        f9.isNationalHoliday = true;
        f9.durationDays = 1;
        f9.getInfo();

        Festivals f10 = new Festivals();
        f10.festId = 10;
        f10.name = "Lohri";
        f10.region = "Punjab";
        f10.mainDeityOrTheme = "Harvest and Bonfire";
        f10.isNationalHoliday = false;
        f10.durationDays = 1;
        f10.getInfo();

        Festivals f11 = new Festivals();
        f11.festId = 11;
        f11.name = "Raksha Bandhan";
        f11.region = "North India";
        f11.mainDeityOrTheme = "Bond of Siblings";
        f11.isNationalHoliday = false;
        f11.durationDays = 1;
        f11.getInfo();

        Festivals f12 = new Festivals();
        f12.festId = 12;
        f12.name = "Karva Chauth";
        f12.region = "North India";
        f12.mainDeityOrTheme = "Married Women's Fasting";
        f12.isNationalHoliday = false;
        f12.durationDays = 1;
        f12.getInfo();

        Festivals f13 = new Festivals();
        f13.festId = 13;
        f13.name = "Makar Sankranti";
        f13.region = "Multiple States";
        f13.mainDeityOrTheme = "Sun God";
        f13.isNationalHoliday = false;
        f13.durationDays = 1;
        f13.getInfo();

        Festivals f14 = new Festivals();
        f14.festId = 14;
        f14.name = "Vaisakhi";
        f14.region = "Punjab";
        f14.mainDeityOrTheme = "Harvest & Sikh New Year";
        f14.isNationalHoliday = false;
        f14.durationDays = 1;
        f14.getInfo();

        Festivals f15 = new Festivals();
        f15.festId = 15;
        f15.name = "Eid al-Adha";
        f15.region = "Pan India";
        f15.mainDeityOrTheme = "Sacrifice and Faith";
        f15.isNationalHoliday = true;
        f15.durationDays = 1;
        f15.getInfo();

        Festivals f16 = new Festivals();
        f16.festId = 16;
        f16.name = "Ugadi";
        f16.region = "Andhra Pradesh, Karnataka";
        f16.mainDeityOrTheme = "New Year Celebration";
        f16.isNationalHoliday = false;
        f16.durationDays = 1;
        f16.getInfo();

        Festivals f17 = new Festivals();
        f17.festId = 17;
        f17.name = "Navratri";
        f17.region = "All over India";
        f17.mainDeityOrTheme = "Nine Nights of Goddess Durga";
        f17.isNationalHoliday = false;
        f17.durationDays = 9;
        f17.getInfo();

        Festivals f18 = new Festivals();
        f18.festId = 18;
        f18.name = "Guru Nanak Jayanti";
        f18.region = "Punjab, North India";
        f18.mainDeityOrTheme = "Guru Nanak Dev Ji";
        f18.isNationalHoliday = true;
        f18.durationDays = 1;
        f18.getInfo();

        Festivals f19 = new Festivals();
        f19.festId = 19;
        f19.name = "Mahashivratri";
        f19.region = "Pan India";
        f19.mainDeityOrTheme = "Lord Shiva";
        f19.isNationalHoliday = false;
        f19.durationDays = 1;
        f19.getInfo();

        Festivals f20 = new Festivals();
        f20.festId = 20;
        f20.name = "Janmashtami";
        f20.region = "North India";
        f20.mainDeityOrTheme = "Lord Krishna's Birth";
        f20.isNationalHoliday = false;
        f20.durationDays = 1;
        f20.getInfo();

        System.out.println("main ended");
    }
}
