package com.xworkx.hospital;
import com.xworkx.hospital.patient.Patient;
import com.xworkx.hospital.validation.ValidateData;
import com.xworkx.hospital.details.Details;
public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Patient patient = new Patient();
        patient.setPatientName("kol");
        patient.setPatientId(222);
        patient.setPatientDob("10 june 1989");
        patient.setLocation("dubai");
        patient.setAge(85);
        patient.setPhoneNumber(7896541230l);

        Details details = new Details();
        boolean add =details.addDetails(patient);
        System.out.println("updated details" + add);

        if (add){
            details.patientDetails();
        }

        System.out.println("main ended");
    }
}
