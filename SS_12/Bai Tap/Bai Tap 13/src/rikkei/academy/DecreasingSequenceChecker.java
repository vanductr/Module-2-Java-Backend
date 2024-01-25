package rikkei.academy;

import java.util.Stack;

public class DecreasingSequenceChecker {
    public static boolean isDecreasingSequence(String input) {
        Stack<Character> charStack = new Stack<>();

        // Đưa các ký tự của chuỗi vào stack
        for (char ch : input.toCharArray()) {
            charStack.push(ch);
        }

        // Khởi tạo biến flag
        boolean isDecreasing = true;

        // Duyệt qua từng ký tự trong chuỗi
        for (char ch : input.toCharArray()) {
            // So sánh với ký tự đầu tiên trong stack
            if (!charStack.isEmpty() && ch > charStack.pop()) {
                isDecreasing = false;
                break;
            }
        }

        return isDecreasing;
    }

    public static void main(String[] args) {
        // Chuỗi đầu vào
        String inputString = "54321";

        // Kiểm tra và in kết quả
        boolean result = isDecreasingSequence(inputString);
        if (result) {
            System.out.println("Chuỗi không phải là dãy giảm dần.");
        } else {
            System.out.println("Chuỗi là dãy giảm dần.");
        }
    }
}






