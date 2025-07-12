class Doctor {
    public static void treatment(String patientName, int age, String disease){
        System.out.println("Doctor started treatment");
        Nurse.assist(patientName, age, disease);
        System.out.println("Doctor completed treatment");
		        
    }
}
