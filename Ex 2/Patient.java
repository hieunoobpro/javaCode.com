import java.util.Date;

public class Patient extends Person{
    private int patientID;
    private String admissionDate;

    public Patient(String name, int age, String gender, int patientID, String admissionDate) {
        super(name, age, gender);
        this.patientID = patientID;
        this.admissionDate = admissionDate;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }
}
