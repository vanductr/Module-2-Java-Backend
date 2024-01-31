package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Câu lệnh mẫu: java.util.Scanner
        Scanner scanner = new Scanner(System.in);

        // Hiển thị: mời người dùng nhập tên()
        // Giống như cặp thẻ label-input trong HTML.
        // Câu lệnh này là thẻ label
        System.out.println("Nhập tên của bạn:");

        // Khai báo biến name, biến này sẽ nhận được giá trị từ người dùng nhập vào.
        String name = scanner.nextLine();

        // In ra lời chào có dữ liệu tên của người dùng nhập vào.
        System.out.println("Xin chào "+name);
    }
}
