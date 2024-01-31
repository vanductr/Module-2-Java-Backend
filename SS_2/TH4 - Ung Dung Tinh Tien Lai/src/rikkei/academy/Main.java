package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0; // Tiền gửi
        int month = 1;  // Tháng gửi
        double interestRate = 1.0; // Tỉ lệ lãi suất
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi: ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng muốn gửi: ");
        month = input.nextInt();
        System.out.println("Tỉ lệ lãi suất của ngân hàng x%/năm, chỉ cần nhập x:");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng tiền lãi là: " + totalInterest);
    }
}
