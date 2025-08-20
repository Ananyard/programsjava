class Doctor{

int doctorId;
String doctorName;
String patientName;
String nurseName;


Doctor(int doctorId,String doctorName,String patientName,String nurseName){
this.doctorId = doctorId;
this.doctorName =doctorName;
this.patientName = patientName;
this.nurseName = nurseName;	
	
	
	

}


public void getDoctorInfo(){
System.out.println("Doctor info is fetched");
System.out.println("Dcotor id is : " + doctorId);
System.out.println("Doctor name is : " + doctorName);
System.out.println("Patient Name is : " + patientName);
System.out.println("Nurse name is : " + nurseName);



}
}