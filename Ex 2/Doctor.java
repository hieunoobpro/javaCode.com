public class Doctor extends Person{
    private String specialty;
    private int workHours;

    public Doctor(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Doctor(String name, int age, String gender, String specialty, int workHours) {
        super(name, age, gender);
        this.specialty = specialty;
        this.workHours = workHours;
    }

    public Doctor() {
        super();
    }

    public String getSpecialty() {
        return specialty;
    }
    public int getWorkHours() {
        return workHours;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialty='" + specialty + '\'' +
                ", workHours=" + workHours +
                getName()+
                getGender()+
                getAge()+
                '}';
    }
}
