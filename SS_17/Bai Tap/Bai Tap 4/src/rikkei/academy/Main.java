package rikkei.academy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Lấy dữ liệu từ bàn phím
        String inputString = "123a45b678c90";

        // Bước 2: Tạo 1 List số nguyên
        List<Integer> integerList = new ArrayList<>();

        // Bước 3: Duyệt chuỗi và chuyển đổi thành số nguyên
        for (int i = 0; i < inputString.length(); i++) {
            try {
                // Ép kiểu từng kí tự thành số nguyên
                int digit = Integer.parseInt(String.valueOf(inputString.charAt(i)));

                // Thêm từng phần tử đã được ép kiểu vào mảng
                integerList.add(digit);
            } catch (NumberFormatException e) {
                // Nếu có lỗi, thay thế bằng 0 và thông báo
                System.out.println("Xảy ra lỗi: Ký tự không phải là số nguyên, đã thay thế bằng 0.");
                integerList.add(0);
            }
        }

        // In List số nguyên
        System.out.println("List số nguyên sau khi chuyển đổi: " + integerList);
    }
}

