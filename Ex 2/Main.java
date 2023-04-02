import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Nguyễn Duy Hiếu", 21, "Male", "Phẫu thuật", 8);
        Patient patient = new Patient("Đạt", 25, "Male", 12345,"02/04/2023");
        System.out.println("Tên bác sĩ: " + doctor.getName());
        System.out.println("Tuoi: " + doctor.getAge());
        System.out.println("Gioi tinh: " + doctor.getGender());
        System.out.println("Chuyen nganh: " + doctor.getSpecialty());
        System.out.println("So gio lam viec: " + doctor.getWorkHours());
        System.out.println("-----------------------------------------------");
        System.out.println("Ten benh nhan: " + patient.getName());
        System.out.println("Tuoi: " + patient.getAge());
        System.out.println("Gioi tinh: " + patient.getGender());
        System.out.println("Ma benh nhan: " + patient.getPatientID());
        System.out.println("Ngay nhap vien: " + patient.getAdmissionDate());
}
}