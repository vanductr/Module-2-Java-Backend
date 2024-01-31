package bai_tap_8;

import java.util.Scanner;

public class Baitap8 {
    public static void main(String[] args) {
        // Bước 1: Nhập chuỗi từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();

        // Bước 2: Nhập ký tự cần đếm
        System.out.print("Nhập ký tự cần đếm: ");
        char targetChar = scanner.next().charAt(0);

        // Bước 3: Đếm số lần xuất hiện của ký tự
        int count = demSoLanXuatHien(inputString, targetChar);

        // Bước 4: Hiển thị kết quả
        System.out.println("Số lần xuất hiện của ký tự '" + targetChar + "' trong chuỗi là: " + count);
    }

    // Phương thức đếm số lần xuất hiện của ký tự trong chuỗi
    public static int demSoLanXuatHien(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
}
