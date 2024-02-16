package rikkei.academy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MostUseWordInFile {
    public static void main(String[] args) {
        // Bước 1: Đọc nội dung từ tệp văn bản
        String filePath = "/Users/tranvanduc/Documents/Tài liệu - MacBook Pro của Trần/Module 2/SS_18/Bai Tap/Bai Tap 6/src/rikkei/academy/file.txt";
        String fileContent = readFileToString(filePath);

        // Bước 2: Tính toán tần suất xuất hiện của từng từ
        Map<String, Integer> wordFrequencyMap = calculateWordFrequency(fileContent);

        // Bước 3: Xác định từ được sử dụng nhiều nhất
        String mostUseWord = findMostUsedWord(wordFrequencyMap);

        // Bước 4: Hiển thị từ được sử dụng nhiều nhất
        System.out.println("Từ được sử dụng nhiều nhất là: " + mostUseWord +
                            " với tần suất xuất hiện là: " + wordFrequencyMap.get(mostUseWord));
    }

    private static String readFileToString(String filePath) {
        StringBuilder content = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Đã có lỗi khi đọc file: " + e.getMessage());
        }
        return content.toString();
    }

    private static Map<String, Integer> calculateWordFrequency(String content) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        String[] words = content.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase(); // Chuyển đổi thành chữ thường để phân biệt chữ hoa chữ thường
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        return wordFrequencyMap;
    }

    private static String findMostUsedWord(Map<String, Integer> wordFrequencyMap) {
        String mostUsedWord = null;
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> stringIntegerEntry : wordFrequencyMap.entrySet()) {
            if (stringIntegerEntry.getValue() > maxFrequency) {
                mostUsedWord = stringIntegerEntry.getKey();
                maxFrequency = stringIntegerEntry.getValue();
            }
        }

        return mostUsedWord;
    }
}


















