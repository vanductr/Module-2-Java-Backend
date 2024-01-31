package rikkei.academy;


import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // Bước 1: Tạo mảng String
        String[] danhSachChuoi = {"Chuoi1", "Chuoi2", "Chuoi3", "Chuoi4", "Chuoi5"};

        // Bước 2: Tạo scanner để nhận đầu vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Bước 3: Nhập danh sách từ bàn phím và chuyển đổi thành mảng
        System.out.print("Nhập danh sách chuỗi (cách nhau bằng dấu cách): ");
        String inputString = scanner.nextLine();
        danhSachChuoi = inputString.split(" ");

        // Bước 4: Nhập chuỗi cần tìm kiếm từ bàn phím
        System.out.print("Nhập chuỗi cần tìm kiếm: ");
        String chuoiCanTim = scanner.nextLine();

        // Bước 5: Tìm kiếm tuyến tính và in kết quả
        boolean timThay = false;
        for (int i = 0; i < danhSachChuoi.length; i++) {
            if (danhSachChuoi[i].equals(chuoiCanTim)) {
                System.out.println("Chuỗi được tìm thấy tại vị trí " + i);
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy chuỗi trong danh sách.");
        }

        // Đóng scanner
        scanner.close();
    }
}
