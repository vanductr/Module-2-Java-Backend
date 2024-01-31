package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến tỷ gía
        // Kiểu khai báo double.
        double rate = 23000; // 1 Dola = 23,000 VNĐ.

        // Nhập giá trị Usd từ người dùng
        // Hướng dẫn người dùng nhập vào đây:
        System.out.print("Mời nhập số tiền USD:");

        // Khai báo biến để nhận gía trị của người dùng.
        // Sử dụng scanner.nextDouble(); - Kiểu khai báo double
        double usdValue = scanner.nextDouble();

        // In ra số tiền VNĐ đã được tính toán.
        System.out.println(usdValue+" Dola bằng với "+ usdValue * rate + "VNĐ");
    }
}
