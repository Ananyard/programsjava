class School {
    public static void showTeachers() {
        String[] teacherNames = {"Mr. Ravi", "Ms. Anjali", "Mrs. Neha"};

        for (String name : teacherNames) {
            Teacher.Subjects(name);
        }
    }
}
