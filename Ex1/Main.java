import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //khởi tạo một object hcn thuộc class HinhChuNhat để sử dụng các thuộc tính trong class này
        rectangle hcn = new rectangle();
        square hv = new square();
        Scanner scanner = new Scanner(System.in);
        //yêu cầu người dùng nhập vào chiều dài và chiều rộng
        System.out.println("Nhập thông tin hình chữ nhật: ");
        System.out.println("Nhập vào chiều dài : ");
        hcn.setLength(scanner.nextDouble());
        System.out.println("Nhập vào chiều rộng : ");
        hcn.setWidth(scanner.nextDouble());
        System.out.println("Nhập thông tin hình vuông: ");
        System.out.println("Độ dài cạnh hình vuông : ");
        hv.setSide(scanner.nextDouble());
        //gọi hàm tính chu vi và diện tích ở class HinhChuNhat bằng cách sử dụng object vừa mới được tạo là hcn
        System.out.println("Chu vi hình chữ nhật là : " + hcn.area());
        System.out.println("Diện tích hình chữ nhật là : " + hcn.perimeter());
        System.out.println("Chu vi hình vuông là : " + hv.area());
        System.out.println("Diện tích hình chữ nhật là: " + hv.perimeter());
        System.out.println("----------------------end----------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}