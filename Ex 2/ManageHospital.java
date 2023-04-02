import java.util.ArrayList;

public class ManageHospital {
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;

    public ManageHospital() {
        patients = new ArrayList<Patient>();
        doctors = new ArrayList<Doctor>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

    public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
}
