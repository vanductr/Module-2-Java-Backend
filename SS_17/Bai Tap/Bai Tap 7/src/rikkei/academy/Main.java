package rikkei.academy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập số a: ");
                int a = scanner.nextInt();
                System.out.print("Nhập số b: ");
                int b = scanner.nextInt();
                int max = a;
                if (a < b) {
                    max = b;
                }
                System.out.print("Số lớn nhất trong 2 số là: " + max);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Hãy nhập số nguyên!!!");
                scanner.next();
            }
        }
    }
}
