package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Câu lệnh Scanner huyền thoại
        Scanner input = new Scanner(System.in);

        int start, end;

        // Hướng dẫn người dùng nhập vào số bắt đầu
        System.out.println("Hãy nhập số bắt đầu: ");
        start = input.nextInt();

        // Hướng dẫn người dùng nhập vào số kết thúc
        System.out.println("Hãy nhập số kết thúc: ");
        end = input.nextInt();

        double total = 0;

        for (int i = start; i <= end; i++) {
            if(i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng bạn vừa nhập là: " + total);
    }
}
