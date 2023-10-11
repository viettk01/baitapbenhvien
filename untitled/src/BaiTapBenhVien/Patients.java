package BaiTapBenhVien;

public class Patients extends Humans{
    private final String position;
    private int medicalRecordNumber;
    private String hospitalizedDay;

    public Patients(String position, int medicalRecordNumber, String hospitalizedDay) {
        super();
        this.position = position;
        this.medicalRecordNumber = medicalRecordNumber;
        this.hospitalizedDay = hospitalizedDay;
    }

    public Patients(String position) {
        this.position = position;
    }

    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(int medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getHospitalizedDay() {
        return hospitalizedDay;
    }

    public void setHospitalizedDay(String hospitalizedDay) {
        this.hospitalizedDay = hospitalizedDay;
    }

    @Override
    public String toString() {
        return "\nPatients" +
                "\nmedicalRecordNumber: " + medicalRecordNumber +
                "\nhospitalizedDay: '" + hospitalizedDay + '\'' +
                "\nname: " + getName() +
                "\nage: " + getAge() +
                "\nAddress: " + getAddress();

    }
}
