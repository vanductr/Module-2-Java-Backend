package rikkei.academy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập số nguyên a: ");
                a = scanner.nextInt();
                System.out.print("Nhập số nguyên b: ");
                b = scanner.nextInt();
                System.out.println("Tổng của 2 số là: " + (a + b));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Xảy ra lỗi: " + e.getMessage());
                System.out.println("Giá trị nhập vào không phải là số nguyên.");
                System.out.println("Hãy nhập lại đúng số nguyên.");
                scanner.next(); // Loại bỏ giá trị đầu vào không hợp lệ
            }
        }
        scanner.close(); // Đóng scanner sau khi sử dụng
    }
}
