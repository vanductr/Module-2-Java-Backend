package rikkei.academy;

import java.util.Scanner;

public class TinhFibonacci {
    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số n: ");
            double n = scanner.nextDouble();
            scanner.nextLine();

            if (n <= 0 || n != (int) n) {
                throw new Exception("n phải là số nguyên dương.");
            }

            int result = fibonacci((int) n);
            System.out.println("Số Fibonacci thứ " + (int) n + " là: " + result);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }


    // Phương thức tính số Fibonacci
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
