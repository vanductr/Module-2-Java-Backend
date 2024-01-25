package rikkei.academy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Chuẩn hóa chuỗi: loại bỏ khoảng trắng và chuyển về chữ thường
        str = str.replaceAll("\\s", "").toLowerCase();

        // Tạo một stack và một queue để lưu trữ ký tự từ chuỗi
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Đưa từng ký tự của chuỗi vào stack và queue
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        // So sánh từng cặp ký tự từ stack và queue
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return false;
            }
        }

        // Nếu cả stack và queue đều rỗng, chuỗi là Palindrome
        return stack.isEmpty() && queue.isEmpty();
    }

    public static void main(String[] args) {
        // Chuỗi đầu vào
        String inputString = "Able was I ere I saw Elba";

        // Kiểm tra và in kết quả
        if (isPalindrome(inputString)) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi không là Palindrome.");
        }
    }
}

