package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số a: ");
            int a = scanner.nextInt();
            System.out.print("Nhập số b: ");
            int b = scanner.nextInt();
            System.out.println("Thương của 2 số là: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Không thể chia 1 số cho 0");
        }
        scanner.close();
    }
}
