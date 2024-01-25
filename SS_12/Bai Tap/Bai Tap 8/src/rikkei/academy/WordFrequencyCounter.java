package rikkei.academy;

import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập văn bản
        System.out.println("Nhập văn bản:");
        String inputText = scanner.nextLine();

        // Tạo TreeMap để lưu trữ từ và số lần xuất hiện
        TreeMap<String, Integer> wordFrequencyMap = new TreeMap<>();

        // Xử lý văn bản và đếm số lần xuất hiện của từng từ
        String[] words = inputText.split("\\s+"); // Tách từng từ bằng khoảng trắng
        for (String word : words) {
            // Chuyển tất cả thành chữ thường để đảm bảo tính nhất quán
            word = word.toLowerCase();

            // Kiểm tra xem từ đã có trong map hay chưa
            if (wordFrequencyMap.containsKey(word)) {
                // Nếu có, tăng số lần xuất hiện lên 1
                wordFrequencyMap.put(word, wordFrequencyMap.get(word) + 1);
            } else {
                // Nếu chưa có, thêm vào map với số lần xuất hiện là 1
                wordFrequencyMap.put(word, 1);
            }
        }

        // Hiển thị kết quả
        System.out.println("\nSố lần xuất hiện của từng từ (theo thứ tự chữ cái):");
        for (String word : wordFrequencyMap.keySet()) {
            System.out.println(word + ": " + wordFrequencyMap.get(word) + " lần");
        }
    }
}
