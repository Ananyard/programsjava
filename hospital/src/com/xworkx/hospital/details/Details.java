package com.xworkx.hospital.details;
import com.xworkx.hospital.patient.Patient;
import com.xworkx.hospital.validation.ValidateData;
public class Details {
Patient patient;
public boolean addDetails( Patient patient){
    boolean detailsUpdated =  false;

    ValidateData validateData = new ValidateData();
    boolean validateUpdate = validateData.vavlidatePatientInfo(patient);

    if (validateUpdate){
        this.patient = patient;
        detailsUpdated = true;

    }
return detailsUpdated;
}
public void patientDetails(){
    System.out.println("patient id: " + patient.getPatientId());
    System.out.println("name of patient: " + patient.getPatientName());
    System.out.println("date of birth: " + patient.getPatientDob());
    System.out.println("location is: " + patient.getLocation());
    System.out.println("phonenumber is: " + patient.getPhoneNumber());
    System.out.println("age is " + patient.getAge());

}
}
