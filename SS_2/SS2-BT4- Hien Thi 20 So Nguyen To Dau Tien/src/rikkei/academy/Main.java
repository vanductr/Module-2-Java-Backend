package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Nhập số lượng số nguyên tố cần hiển thị
        Scanner input = new Scanner(System.in);

        System.out.println("Bạn cần in ra bao nhiêu số nguyên tố đầu tiên: ");
        int numbers = input.nextInt();

        // Bước 2: Khai báo và khởi tạo biến count
        int count = 0;

        // Bước 3: Khai báo và khởi tạo biến N
        int N = 2;

        // Bước 4: Hiển thị các số nguyên tố
        while (count < numbers) {
            // Kiểm tra xem N có phải là số nguyên tố hay không
            if (isPrime(N)) {
                // Nếu là số nguyên tố, in ra và tăng count lên 1
                System.out.print(N + " ");
                count++;
            }

            // Tăng giá trị của N lên 1 để kiểm tra số tiếp
            N++;
        }

        // Đóng Scanner
        input.close();
    }

    // Phương thức kiểm tra số nguyên tố
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
















