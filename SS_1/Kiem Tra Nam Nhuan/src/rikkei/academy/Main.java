package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // Write your code here
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập số năm: ");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("Năm "+year+" là năm nhuận.");
                } else {
                    System.out.printf("Năm "+year+" không phải là năm nhuận.");
                }
            } else {
                System.out.printf("Năm "+year+" là năm nhuận.");
            }
        } else {
            System.out.printf("Năm "+year+" không phải là năm nhuận.");
        }
    }
}
