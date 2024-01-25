package rikkei.academy;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        // Tạo một stack để lưu trữ từng từ
        Stack<String> wordStack = new Stack<>();

        // Nhập số lượng từ
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng từ: ");
        int numberOfWords = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới sau khi đọc số

        // Nhập từng từ và đưa vào stack
        for (int i = 0; i < numberOfWords; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.nextLine();
            wordStack.push(word);
        }

        // In ra từng từ theo thứ tự đảo ngược
        System.out.println("Các từ theo thứ tự đảo ngược:");

        while (!wordStack.isEmpty()) {
            System.out.println(wordStack.pop());
        }
    }
}

