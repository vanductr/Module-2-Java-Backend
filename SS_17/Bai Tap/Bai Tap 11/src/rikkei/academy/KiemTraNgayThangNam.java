package rikkei.academy;

import java.util.Scanner;

public class KiemTraNgayThangNam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập ngày (1-31): ");
            int ngay = scanner.nextInt();

            System.out.print("Nhập tháng (1-12): ");
            int thang = scanner.nextInt();

            System.out.print("Nhập năm: ");
            int nam = scanner.nextInt();

            if (isValidDate(ngay, thang, nam)) {
                System.out.println("Ngày tháng năm hợp lệ.");
            } else {
                throw new Exception("Ngày - tháng - năm không hợp lệ.");
            }

        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Phương thức kiểm tra tính hợp lệ của ngày tháng năm
    private static boolean isValidDate(int ngay, int thang, int nam) {
        if (nam < 1 || thang < 1 || thang > 12 || ngay < 1) {
            return false;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Kiểm tra năm nhuận
        if (nam % 400 == 0 || (nam % 100 != 0 && nam % 4 == 0)) {
            daysInMonth[2] = 29;
        }

        return ngay <= daysInMonth[thang];
    }
}

