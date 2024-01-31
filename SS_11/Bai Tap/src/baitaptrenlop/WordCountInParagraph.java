package baitaptrenlop;

import java.util.Scanner;

public class WordCountInParagraph {
    // Bài tập cho 1 đoạn văn paragraph
    // Đếm số lần xuất hiện của 1 từ nhập vào trong đoạn văn đó

    public static void main(String[] args) {
        // Nhập đoạn văn
        System.out.println("Nhập đoạn văn:");
        Scanner scanner = new Scanner(System.in);
        String paragraph = scanner.nextLine();

        // Nhập từ cần đếm
        System.out.println("Nhập từ cần đếm:");
        String targetWord = scanner.next();

        // Đếm số lần xuất hiện của từ
        int count = countOccurrences(paragraph, targetWord);

        // Hiển thị kết quả
        System.out.println("Số lần xuất hiện của từ \"" + targetWord + "\" trong đoạn văn là: " + count);
    }

    // Phương thức để đếm số lần xuất hiện của từ trong đoạn văn
    private static int countOccurrences(String paragraph, String targetWord) {
        String[] words = paragraph.split("\\s+");
        int count = 0;

        for (String word : words) {
            // Loại bỏ ký tự đặc biệt từ từ để so sánh
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "");

            if (cleanedWord.equalsIgnoreCase(targetWord)) {
                count++;
            }
        }

        return count;
    }
}
