class Department{

  int departmentId;
  String departmentName;
  String departmentCode;
  String headOfDepartment;
  String departmentType; 
  Doctor doctor;

Department(int departmentId, String departmentName, String departmentCode,String headOfDepartment,String departmentType,Doctor doctor){

this.departmentId = departmentId;
this.departmentName = departmentName;
this.departmentCode = departmentCode;
this.headOfDepartment = headOfDepartment;
this.departmentType = departmentType;
this.doctor = doctor;
}
public void getDepartmentInfo(){

System.out.println("Department info is fetched");
System.out.println("Department id is : " + departmentId);
System.out.println("department name is : " + departmentName);
System.out.println("head Of Department is : " + headOfDepartment);
System.out.println("department Type " + departmentType);
System.out.println("department Code is : " + departmentCode);
System.out.println();

this.doctor.getDoctorInfo();


}
}