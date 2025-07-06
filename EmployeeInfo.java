class EmployeeInfo {
    public static void main(String[] args) {
        employeeName("Karthik");
        department("IT");
        salary(50000);
    }

    public static void employeeName(String name) {
        System.out.println("Employee Name: " + name);
    }

    public static void department(String dept) {
        System.out.println("Department: " + dept);
    }

    public static void salary(int amount) {
        System.out.println("Monthly Salary: ₹" + amount);
    }
}
