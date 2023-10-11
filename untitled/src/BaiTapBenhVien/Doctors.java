package BaiTapBenhVien;

public class Doctors extends Humans{
    protected String position;
    protected String specialty;
    protected int worktime;

    public Doctors(String position, String specialty, int worktime) {
        this.position = position;
        this.specialty = specialty;
        this.worktime = worktime;
    }

    public Doctors() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getWorktime() {
        return worktime;
    }

    public void setWorktime(int worktime) {
        this.worktime = worktime;
    }

    @Override
    public String toString() {
        return "Doctors" +
                "\nposition: " + position +
                "\nspecialty: " + specialty +
                "\nname: " + getName() +
                "\nage: " + getAge() +
                "\nAddress: " + getAddress() +
                "\nworktime: " + worktime + " hour";
    }
}

