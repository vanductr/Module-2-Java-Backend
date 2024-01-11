package thuchanh2; // Tìm giá trị trong mảng.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khai báo 1 mảng
        String[] students = {"Ronaldo", "Messi", "Neymar", "Pobpa", "Nouer", "Muler", "Benzema", "Pique", "Ramus"};

        // Lấy tên của học sinh từ người dùng.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của học sinh: ");
        String input_name = scanner.nextLine();

        // Đặt isExist bằng false.
        boolean isExist = false;

        // Vòng for để lặp qua các phần tử trong Mảng students.
        // Phương thức .equals(): so sánh nội dung của 2 đối tượng.
        // Trả về true nếu đối tượng hiện tại có nội dung giống với đối tượng được truyền vào,
        // và false nếu không.
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của học sinh " + input_name + " trong danh sách là " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không có học sinh " + input_name + " trong danh sách.");
        }
    }
}
