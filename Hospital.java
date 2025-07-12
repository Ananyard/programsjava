class Hospital {


public static void checkUp(String patientName , int age ,  long phoneNo , String email , String disease){

System.out.println("started with checkup");

Doctor.treatment(patientName,age,disease);

System.out.println("treatment is done");


}
}

