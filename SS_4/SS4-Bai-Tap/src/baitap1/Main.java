package baitap1;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Circle với bán kính khác nhau
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);
        Circle circle3 = new Circle(10.0);

        // Hiển thị thông tin và tính toán chu vi diện tích
        displayCircleInformation(circle1);
        displayCircleInformation(circle2);
        displayCircleInformation(circle3);
    }

    // Phương thức hiển thị thông tin của hình tròn
    public static void displayCircleInformation(Circle circle) {
        System.out.println("Thông tin của hình tròn:");
        System.out.println("Bán kính: " + circle.getRadius());
        System.out.println("Chu vi: " + circle.chuVi());
        System.out.println("Diện tích: " + circle.dienTich());
        System.out.println();
    }
}
