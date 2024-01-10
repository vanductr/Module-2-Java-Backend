package rikker.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // Write your code here
        System.out.println("Trình giải phương trình tuyến tính");
        System.out.println("Cho một phương trình 'a * x + b = c', vui lòng nhập hằng số");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        if(a!=0) { // Nếu a khác 0
            double x = (c-b)/a; // Phương trình có nghiệm duy nhất (c-b)/a
            System.out.println("Nghiệm của phương trình là: x = "+x);
        } else { // Trường hợp a = 0
            if(b==c) { // Nếu b = c -> Phương trình có vô số nghiệm
                System.out.println("Phương trình có vô số nghiệm");
            } else { // Nếu b # c -> Phương trình vô nghiệm
                System.out.println("Phương trình vô nghiệm.");
            }
        }
    }
}
