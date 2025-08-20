class Hospital{

String hospitalName;
String location;
int hospitalId;
long phoneNumber;
int noOfDoctorsAvailable;

Department department;


Hospital(String hospitalName,String location,int hospitalId,long phoneNumber,int noOfDoctorsAvailable,Department department){

this.hospitalName = hospitalName;
this.location = location;
this.hospitalId = hospitalId;
this.phoneNumber = phoneNumber;
this.noOfDoctorsAvailable = noOfDoctorsAvailable;
this.department = department;

}
public void getHospitalInfo(){
System.out.println("Hospital info is fetched");
System.out.println("hospital id is : " + hospitalId);
System.out.println("hospital name is : " + hospitalName);
System.out.println("location is : " + location);
System.out.println("no of doctors " + noOfDoctorsAvailable);
System.out.println("phoneNumber is : " + phoneNumber);
System.out.println();

this.department.getDepartmentInfo();



}


}