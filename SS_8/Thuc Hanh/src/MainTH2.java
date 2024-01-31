import thuchanh2.Car;
import thuchanh2.Motorcycle;

public class MainTH2 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng từ các lớp con
        Car car1 = new Car("Toyota", "black");
        Car car2 = new Car("Ford", "while");

        // Truy cập các phương thức của lớp cha như set/get
        System.out.println("Hãng của xe thứ nhất là: " + car1.getBrand());

        car1.setColor("yellow"); // Thiết lập lại giá trị cho thuộc tính color

        // Hiển thị thông tin của xe ô tô
        System.out.println(car1);
        System.out.println(car2);

        // Khởi tạo các đối tượng xe máy
        Motorcycle motor1 = new Motorcycle("Honda", "red-while");
        Motorcycle motor2 = new Motorcycle("Vinfast", "blue");

        // Tuy trong class Motorcycle không khởi tạo các thuộc tính brand và color
        // nhưng vẫn có thể lấy được các thuộc tính này. Vì nó đã được khai báo trong class
        // Vehicle. Đây được gọi là mối quan hệ cha - con giữa 2 class.
        // Hiển thị thông tin của xe máy
        System.out.println(motor1);
        System.out.println(motor2);
    }
}
