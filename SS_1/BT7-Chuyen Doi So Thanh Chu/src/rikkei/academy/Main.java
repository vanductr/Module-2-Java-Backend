package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner thần thoại
        Scanner scanner = new Scanner(System.in);

        // Hướng dẫn người dùng nhập vào
        System.out.println("Nhập số nguyên từ 0 đến 9 để xem cách đọc của nó.");

        // Lấy thông tin người dùng nhập vào.
        int number = scanner.nextInt();

        switch (number) {
            case 0:
                System.out.println("Số "+ number + " được đọc là Số không.");
                break;
            case 1:
                System.out.println("Số "+ number + " được đọc là Số một.");
                break;
            case 2:
                System.out.println("Số "+ number + " được đọc là Số hai.");
                break;
            case 3:
                System.out.println("Số "+ number + " được đọc là Số ba.");
                break;
            case 4:
                System.out.println("Số "+ number + " được đọc là Số bốn.");
                break;
            case 5:
                System.out.println("Số "+ number + " được đọc là Số năm.");
                break;
            case 6:
                System.out.println("Số "+ number + " được đọc là Số sáu.");
                break;
            case 7:
                System.out.println("Số "+ number + " được đọc là Số bảy.");
                break;
            case 8:
                System.out.println("Số "+ number + " được đọc là Số tám.");
                break;
            case 9:
                System.out.println("Số "+ number + " được đọc là Số chín.");
                break;
            default:
                System.out.println("Số được nhập không hợp lệ, hãy nhập từ 0 đến 9.");
        }
    }
}
