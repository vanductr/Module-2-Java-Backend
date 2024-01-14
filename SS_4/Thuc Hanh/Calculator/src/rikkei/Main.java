package rikkei;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khởt tạo máy nhập từ lớp Scanner
        Scanner input = new Scanner(System.in);

        // Khởi tạo đối tượng từ lớp Calculator
        Calculator calculator = new Calculator();

        // Nhập giá trị cho 2 số a và b
        System.out.print("Nhập a = ");
        double a = input.nextDouble();
        System.out.print("Nhập b = ");
        double b = input.nextDouble();

        // Đặt gía trị cho 2 thuộc tính của đối tượng calculator
        calculator.setA(a);
        calculator.setB(b);

        // Hiển thị các kết quả của phép toán.
        System.out.println("Tổng của 2 số là: " + calculator.add());
        System.out.println("Hiệu của 2 số là: " + calculator.sub());
        System.out.println("Tích của 2 số là: " + calculator.multi());
        System.out.println("Thương của 2 số là: " + calculator.div());
    }
}
