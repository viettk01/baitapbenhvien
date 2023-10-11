package BaiTapBenhVien;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thong tin benh vien :");
//              Doctors
        ManageHospital doctors = new ManageHospital();
        doctors.setPosition("Doctor");
        doctors.setSpecialty("Surgery");
        doctors.setName("Nguyen Van A");
        doctors.setAge(22);
        doctors.setAddress("Cao Bang");
        doctors.setWorktime(2000);

        System.out.println(doctors);
//              Patients
        ManageHospital.ManageHospitalOther partients = new ManageHospital.ManageHospitalOther();

        partients.setMedicalRecordNumber(1);
        partients.setName("Nguyen Van B");
        partients.setAge(40);
        partients.setAddress("Ha Noi");
        partients.setHospitalizedDay("22/10/2001");

        System.out.println(partients);



    }
}
