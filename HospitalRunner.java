class HospitalRunner{

public static void main(String[] doc){
	
Doctor doctor = new Doctor(986,"num","unknown","someone");

Department department =  new Department( 25,"neurologist", "ch10","anu","checkup",doctor);

Hospital hospital = new Hospital("Vijaya","manglaore",205,9876321045l,50,department);










hospital.getHospitalInfo();




}

}