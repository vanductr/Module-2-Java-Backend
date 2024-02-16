package rikkei.academy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    // Phương thức đọc file thành String
    public static String readFileToString(String filePath) {
        // Khởi tạo 1 đối tượng của lớp "StringBuilder"
        // Đối tượng này: Xây dựng và thay đổi chuỗi 1 cách hiệu quả.
        StringBuilder content = new StringBuilder();

        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader reader = new BufferedReader(isr);

            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        // Đường dẫn đến tập tin
        String filePath = "/Users/tranvanduc/Documents/Tài liệu - MacBook Pro của Trần/Module 2/SS_18/Bai Tap/Bai Tap 3/src/rikkei/academy/file.txt";

        // Gọi phương thức để đọc dữ liệu từ tệp tin
        String[] fileContent = readFileToString(filePath).split("\s+");

        // In nội dung đọc được từ tệp tin
        System.out.println(Arrays.toString(fileContent));

        int maxLength = 0;
        List<String> maxLengthWords = new ArrayList<>();

        for (String string : fileContent) {
            int wordLength = string.length();
            if (wordLength > maxLength) {
                maxLength = wordLength;
                maxLengthWords.clear(); // Đặt lại danh sách nếu tìm thấy từ có độ dài lớn hơn
                maxLengthWords.add(string);
            } else if (wordLength == maxLength) {
                maxLengthWords.add(string);
            }
        }

        // In ra danh sách từ có độ dài lớn nhất và độ dài của chúng
        System.out.println("Những từ sau có độ dài lớn nhất là:");
        for (String maxLengthWord : maxLengthWords) {
            System.out.println(maxLengthWord);
        }
        System.out.println("Độ dài của chúng: " + maxLength);
    }
}
