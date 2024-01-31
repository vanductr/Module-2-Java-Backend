package rikkei.academy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseStrings {
    public static void main(String[] args) {
        // Bước 1: Tạo danh sách chuỗi
        List<String> stringList = Arrays.asList("abc", "def", "ghi", "jkl", "mno");

        // Bước 2: Sử dụng Stream API và phương thức map() để chuyển các chuỗi thành chữ in hoa
        List<String> uppercaseList = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // In danh sách chuỗi in hoa
        System.out.println("Danh sách chuỗi in hoa: " + uppercaseList);
    }
}

