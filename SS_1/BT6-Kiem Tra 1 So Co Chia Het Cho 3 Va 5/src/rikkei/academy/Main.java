package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner huyền thoại
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập 1 số tự nhiên bất kỳ: ");
        double soTuNhien = scanner.nextDouble();

        String soHienThi = "";

        if(soTuNhien % 3 == 0 && soTuNhien % 5 == 0) {
            soHienThi = "Chia hết cho cả 3 và 5";
        } else if (soTuNhien % 3 == 0 && soTuNhien % 5 != 0) {
            soHienThi = "Chỉ chia hết cho 3";
        } else if (soTuNhien % 3 != 0 && soTuNhien % 5 == 0) {
            soHienThi = "Chỉ chia hết cho 5";
        } else {
            soHienThi = "Không chia hết cho 3 , cũng không chia hết cho 5";
        }

        System.out.print(soTuNhien + " là số " + soHienThi);
    }
}
