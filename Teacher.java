class Teacher {
    public static void Subjects(String teacherName) {
        System.out.println("Teacher: " + teacherName);

        String[] subjects = {"Math", "English", "Science"};
        System.out.println("Subjects taught:");
        for (String subject : subjects) {
            System.out.println(subject);
        }
        System.out.println(); // spacing
    }
}
