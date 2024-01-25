package rikkei.academy;

import java.util.Stack;

public class BracketChecker {
    public static boolean checkBrackets(String expression) {
        // Tạo một Stack để lưu trữ dấu ngoặc
        Stack<Character> bracketStack = new Stack<>();

        // Duyệt từng ký tự trong biểu thức
        for (char sym : expression.toCharArray()) {
            if (sym == '(' || sym == '[' || sym == '{') {
                // Nếu là dấu ngoặc trái, đưa vào Stack
                bracketStack.push(sym);
            } else if (sym == ')' || sym == ']' || sym == '}') {
                // Nếu là dấu ngoặc phải
                if (bracketStack.isEmpty()) {
                    // Nếu Stack rỗng, không có dấu ngoặc trái tương ứng, trả về false
                    return false;
                }

                // Lấy dấu ngoặc trái từ Stack
                char left = bracketStack.pop();

                // Kiểm tra khớp dấu ngoặc trái và phải
                if ((left == '(' && sym != ')') || (left == '[' && sym != ']') || (left == '{' && sym != '}')) {
                    return false;
                }
            }
        }

        // Nếu Stack không rỗng sau khi duyệt hết biểu thức, trả về false
        return bracketStack.isEmpty();
    }

    public static void main(String[] args) {
        // Biểu thức đầu vào
        String expression = "((a + b) * (c - d))";

        // Kiểm tra và in kết quả
        if (checkBrackets(expression)) {
            System.out.println("Biểu thức có sử dụng đúng dấu ngoặc.");
        } else {
            System.out.println("Biểu thức không sử dụng đúng dấu ngoặc.");
        }
    }
}

