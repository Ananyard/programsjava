class SchoolTimetable {
    public static void main(String[] args) {
        subject("Math", "9:00 AM");
        subject("Science", "10:00 AM");
        subject("English", "11:00 AM");
    }

    public static void subject(String name, String time) {
        System.out.println(name + " at " + time);
    }
}
