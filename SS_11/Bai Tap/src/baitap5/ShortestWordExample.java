package baitap5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestWordExample {
    public static void main(String[] args) {
        // Bước 1: Tạo một chuỗi (đoạn văn hoặc câu)
        String inputString = "Viết chương trình cho sẵn một đoạn văn hoặc một câu và tìm ra chữ ngắn nhất trong câu";

        // Bước 2: Chuyển đổi chuỗi thành List các từ
        List<String> wordList = Arrays.asList(inputString.split("\\s+"));

        // Bước 3: Tạo một List String để lưu trữ các từ có độ dài nhỏ nhất
        List<String> shortestWords = new ArrayList<>();

        // Bước 4: Duyệt list để tìm các từ có độ dài nhỏ nhất
        int minLength = Integer.MAX_VALUE;
        for (String word : wordList) {
            int wordLength = word.length();
            if (wordLength < minLength) {
                // Nếu tìm thấy từ có độ dài nhỏ hơn, cập nhật minLength và làm mới danh sách shortestWords
                minLength = wordLength;
                shortestWords.clear();
                shortestWords.add(word);
            } else if (wordLength == minLength) {
                // Nếu tìm thấy từ có độ dài bằng minLength, thêm vào danh sách shortestWords
                shortestWords.add(word);
            }
        }

        // Bước 5: In ra kết quả
        System.out.println("Các từ ngắn nhất trong câu:");
        System.out.println(shortestWords);
    }
}

