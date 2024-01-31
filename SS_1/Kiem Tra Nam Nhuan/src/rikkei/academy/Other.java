package rikkei.academy;

import java.util.Scanner;

public class Other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập số năm: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("Năm "+year+" là năm nhuận.");
        } else {
            System.out.printf("Năm "+year+" không phải năm nhuận.");
        }
    }
}
