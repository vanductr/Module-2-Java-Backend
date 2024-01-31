package rikkei.academy;

import java.util.Scanner;

public class LongestSubstringSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();

        // Tìm chuỗi con có độ dài lớn nhất
        String longestSubstring = findLongestSubstring(inputString);

        // Sắp xếp chuỗi con theo độ dài giảm dần
        String sortedLongestSubstring = sortStringByLength(longestSubstring);

        // In ra kết quả
        System.out.println("Chuỗi con có độ dài lớn nhất (đã sắp xếp): " + sortedLongestSubstring);

        scanner.close();
    }

    private static String findLongestSubstring(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return "";
        }

        String[] words = inputString.split("\\s+");
        String longestSubstring = "";

        for (String word : words) {
            if (word.length() > longestSubstring.length()) {
                longestSubstring = word;
            }
        }

        return longestSubstring;
    }

    private static String sortStringByLength(String str) {
        // Chuyển chuỗi thành mảng các từ
        String[] words = str.split("\\s+");

        // Sắp xếp mảng các từ theo độ dài giảm dần
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() < words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        // Ghép lại mảng các từ thành chuỗi
        StringBuilder sortedString = new StringBuilder();
        for (String word : words) {
            sortedString.append(word).append(" ");
        }

        return sortedString.toString().trim();
    }
}





