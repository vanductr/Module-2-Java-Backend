package baitap4;

import java.util.ArrayList;
import java.util.List;

public class StringListExample {
    public static void main(String[] args) {
        // Bước 1: Tạo một chuỗi
        String inputString = "Rekkei Academy để nông dân biết code";

        // Bước 2: Tạo List có kiểu dữ liệu là String
        List<String> stringList = new ArrayList<>();

        // Bước 3: Chuyển đổi chuỗi thành List String và gán vào List tạo ở Bước 2
        String[] words = inputString.split("\\s+");
        for (String word : words) {
            stringList.add(word);
        }

        // Bước 4: Duyệt list và in ra các phần tử có độ dài lớn hơn 3 ký tự
        System.out.println("Các chuỗi có độ dài lớn hơn 3 ký tự:");
        for (String str : stringList) {
            if (str.length() > 3) {
                System.out.println(str);
            }
        }
    }
}

