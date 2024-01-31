package rikkei.academy;

import java.util.Stack;

public class BracketChecker {
    public static boolean checkBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        // Duyệt từng ký tự trong chuỗi đầu vào
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Nếu là dấu ngoặc mở, đưa vào stack
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            }
            // Nếu là dấu ngoặc đóng, so sánh với dấu ngoặc mở trên cùng của stack
            else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                // Nếu stack rỗng hoặc dấu ngoặc không khớp, chuỗi không đúng
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), currentChar)) {
                    return false;
                }
            }
        }

        // Nếu đã duyệt hết chuỗi và stack vẫn còn phần tử, chuỗi không đúng
        return stack.isEmpty();
    }

    // Phương thức kiểm tra xem hai dấu ngoặc có khớp nhau hay không
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        // Chuỗi đầu vào
        String inputString = "({()})";

        // Kiểm tra và in kết quả
        if (checkBrackets(inputString)) {
            System.out.println("Chuỗi ngoặc đúng.");
        } else {
            System.out.println("Chuỗi ngoặc không đúng.");
        }
    }
}

