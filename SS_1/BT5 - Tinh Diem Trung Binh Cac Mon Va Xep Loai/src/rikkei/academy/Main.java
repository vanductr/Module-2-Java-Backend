package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Câu lệnh scanner quen thuộc
        //
        Scanner scanner = new Scanner(System.in);


        // Khai báo các biến lưu trữ điểm các môn:
        // Toán, Lý, Hoá, Văn, Tiếng Anh
        double toan, ly, hoa, van, tiengAnh;

        // Lấy các giá trị người dùng nhập vào.
        System.out.print("Nhập điểm môn Toán: ");
        toan = scanner.nextDouble();

        System.out.print("Nhập điểm môn Lý: ");
        ly = scanner.nextDouble();

        System.out.print("Nhập điểm môn Hoá: ");
        hoa = scanner.nextDouble();

        System.out.print("Nhập điểm môn Văn: ");
        van = scanner.nextDouble();

        System.out.print("Nhập điểm môn Tiếng Anh: ");
        tiengAnh = scanner.nextDouble();

        double diemTrungBinh = (toan+ly+hoa+van+tiengAnh) / 5;

        System.out.println("Điểm trung bình của bạn là: "+diemTrungBinh);

        if (0 <= diemTrungBinh && diemTrungBinh < 5) {
            System.out.println("Xếp loại Yếu.");
        } else if (5 <= diemTrungBinh && diemTrungBinh <= 6.5) {
            System.out.println("Xếp loại Trung bình.");
        } else if (6.5 <= diemTrungBinh && diemTrungBinh < 8) {
            System.out.println("Xếp loại Khá.");
        } else if (8 <= diemTrungBinh && diemTrungBinh <9) {
            System.out.println("Xếp loại Giỏi.");
        } else if (9 <= diemTrungBinh && diemTrungBinh <= 10) {
            System.out.println("Xếp loại Xuất sắc.");
        }
    }
}









