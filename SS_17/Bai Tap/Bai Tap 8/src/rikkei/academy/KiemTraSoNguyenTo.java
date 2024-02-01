package rikkei.academy;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số nguyên: ");
            int number = scanner.nextInt();

            if (isPrime(number)) {
                System.out.println(number + " là số nguyên tố.");
            } else {
                throw new Exception("Không phải là số nguyên tố.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    // Phương thức kiểm tra số nguyên tố
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
