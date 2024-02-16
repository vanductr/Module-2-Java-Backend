package rikkei.academy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        // Đường dẫn file cần đọc
        String filePath = "/Users/tranvanduc/Documents/Tài liệu - MacBook Pro của Trần/Module 2/SS_18/Bai Tap/Bai Tap 5/src/rikkei/academy/countries.csv";

        try {
            // Sử dụng BufferedReader để đọc từ file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Biến để đọc từng dòng trong file
            String line;

            // Đọc từng dòng và hiển thị
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Đóng BufferedReader sau khi đọc xong
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Đã có lỗi khi đọc từ file: " + e.getMessage());
        }
    }
}
