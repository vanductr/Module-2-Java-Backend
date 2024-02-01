package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập độ dài các cạnh của tam giác:");

            System.out.print("Cạnh a: ");
            double a = scanner.nextDouble();

            System.out.print("Cạnh b: ");
            double b = scanner.nextDouble();

            System.out.print("Cạnh c: ");
            double c = scanner.nextDouble();

            kiemTraTamGiac(a, b, c);
            System.out.println("Tam giác hợp lệ.");

        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void kiemTraTamGiac(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalTriangleException("Tam giác không hợp lệ.");
        }
    }
}
class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}
