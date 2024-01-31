package baitap1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red"); // Khởi tạo đối tượng từ lớp 'Hình tròn'
        System.out.println("Hình tròn: " + circle);
        System.out.println("Diện tích hình tròn: " + circle.getArea());

        Cylinder cylinder = new Cylinder(3.0, "Blue", 8.0); // Khởi tạo đối tượng từ lớp 'Hình trụ'
        System.out.println("Hình trụ: " + cylinder);
        System.out.println("Thể tích hình trụ: " + cylinder.getVolume());
    }
}
