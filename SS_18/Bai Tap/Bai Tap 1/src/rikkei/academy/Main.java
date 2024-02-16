package rikkei.academy;

import java.io.*;
import java.util.Arrays;

public class Main {
    // Bước 2: Tạo hàm đọc file và trả ra String
    public static String readDataFromFile(String path) {
        StringBuilder content = new StringBuilder();

        try {
            FileInputStream fis = new FileInputStream(path); // FileInputStrem: Mở tệp tin
            InputStreamReader isr = new InputStreamReader(fis); // InputStreamReader: chuyển đổi
                                                        // dữ liệu từ dạng byte sang dạng kí tự
            BufferedReader reader = new BufferedReader(isr); // BufferedReader: Đọc nội dung

            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

//            String line = reader.readLine();
//            content.append(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void main(String[] args) {
        String testString = readDataFromFile("/Users/tranvanduc/Documents/Tài liệu - MacBook Pro của Trần/Module 2/SS_18/Bai Tap/Bai Tap 1/src/rikkei/academy/file.txt");
        System.out.println(testString);

        // convert String ở bước 2 thành mảng string, mỗi từ là 1 phần tử
        String[] wordsArr = testString.split("\\s+");
        System.out.println(Arrays.toString(wordsArr));

        // Bước 4: Tính độ dài của Mảng
        System.out.println("Độ dài của Mảng là: " + wordsArr.length);
    }
}
