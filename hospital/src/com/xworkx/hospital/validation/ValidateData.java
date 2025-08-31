package com.xworkx.hospital.validation;
import com.xworkx.hospital.patient.Patient;
public class ValidateData {
Patient patient;
public boolean vavlidatePatientInfo(Patient patient){
boolean patientValidate = false;
boolean patientIdValidate = false;
boolean patientNameValodate = false;
boolean patientDobalidate = false ;
boolean phoneNumberValidate = false;
boolean locationValidate = false;
boolean ageValidate  = false;

if (patient.getPatientId()>0){
    patientIdValidate = true;
} else System.out.println("patient id not valid");
if (patient.getPatientName()!=null && !patient.getPatientName().isEmpty()){
    patientNameValodate = true;
} else System.out.println("patient name not valid");
if (patient.getPatientDob()!=null && !patient.getPatientDob().isEmpty()){
    patientDobalidate = true;
}else System.out.println("dob invalid");
if (patient.getLocation()!=null && !patient.getLocation().isEmpty()){
    locationValidate = true;
}else System.out.println("location invalid");
if (patient.getPhoneNumber()>0){
    phoneNumberValidate = true;
} else System.out.println("phone number is not valid");
if (patient.getAge()>0){
    ageValidate =true;
} else System.out.println("age not validate");

if (patientIdValidate && patientNameValodate && patientDobalidate && phoneNumberValidate && locationValidate && ageValidate){
    patientValidate = true;
    this.patient = patient;
}


return patientValidate;
}
}
