package thuchanh4; // Chương trình chuyển đổi nhiệt độ.

import java.util.Scanner;

public class Thuchanh4 {
    public static void main(String[] args) {
        // Scanner lấy giá trị của người dùng nhập vào
        Scanner scanner = new Scanner(System.in);

        double fahrenheit; // Khai báo biến lấy độ F
        double celsius; // Khai báo biến lấy độ C
        int choice; // Lấy giá trị người dùng nhập vào.

        do {
            System.out.println("Menu.");
            System.out.println("1. Đổi độ F thành độ C");
            System.out.println("2. Đổi độ C thành độ F");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhập độ F");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Độ F sang độ C là: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Nhập độ C");
                    celsius = scanner.nextInt();
                    System.out.println("Độ C sang độ f là: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    // Phương thức chuyển đổi độ C sang độ F
    // Công thức Toán học để chuyển đổi từ độ C sang độ F là:
    // Độ C = (5.0 / 9) * (Độ F - 32)
    // => Độ F = Độ C / (5.0 / 9) + 32
    // => Độ F = (9 / 5.0) * Độ C + 32
    // Cấu trúc cú pháp của 1 phương thức trong Java.
    // Phạm vi truy cập: là mức độ truy cập của phương thức
    // public, private, protected hoặc không gì cả
    // static: thuộc về lớp chứ không phải đối tượng cụ thể. Nghĩa là có thể gọi phương thức này mà không cần tạo 1 thể hiện lớp
    // double: Kiểu trả về.
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32; // Công thức tính độ F sau khi suy ra công thức được tính từ độ C
        return fahrenheit; // Trả về độ F sau khi đã được tính toán
    }

    // Xây dựng phương thức chuyển đổi độ C sang độ F.
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius; // Trả về độ C sau khi nhận được độ F và tính toán.
    }
}























