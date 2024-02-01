package rikkei.academy;

import java.util.Scanner;

public class TinhDienTichHinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                double banKinh;

                System.out.print("Nhập bán kính hình tròn: ");
                banKinh = scanner.nextDouble();

                if (banKinh < 0) {
                    throw new Exception("Bán kính không thể là số âm. Vui lòng nhập lại.");
                }

                double dienTich = tinhDienTichHinhTron(banKinh);
                System.out.println("Diện tích hình tròn là: " + dienTich);
                break;

            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    // Phương thức tính diện tích hình tròn
    private static double tinhDienTichHinhTron(double banKinh) {
        return Math.PI * Math.pow(banKinh, 2);
    }
}

