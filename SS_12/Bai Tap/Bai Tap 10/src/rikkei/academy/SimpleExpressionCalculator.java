package rikkei.academy;

import java.util.Stack;

public class SimpleExpressionCalculator {
    public static double calculateExpression(String expression) {
        Stack<Double> numberStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Nếu là số, đưa vào stack số
                StringBuilder numberBuilder = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    numberBuilder.append(expression.charAt(i));
                    i++;
                }
                i--; // Giảm lại i vì đã tăng ở cuối vòng lặp
                double number = Double.parseDouble(numberBuilder.toString());
                numberStack.push(number);
            } else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                // Nếu là toán tử, đưa vào stack toán tử
                while (!operatorStack.isEmpty() && hasHigherPrecedence(operatorStack.peek(), currentChar)) {
                    applyOperation(numberStack, operatorStack);
                }
                operatorStack.push(currentChar);
            }
        }

        // Áp dụng các phép toán còn lại trong stack
        while (!operatorStack.isEmpty()) {
            applyOperation(numberStack, operatorStack);
        }

        // Kết quả cuối cùng nằm ở đỉnh của stack số
        return numberStack.pop();
    }

    private static void applyOperation(Stack<Double> numberStack, Stack<Character> operatorStack) {
        char operator = operatorStack.pop();
        double operand2 = numberStack.pop();
        double operand1 = numberStack.pop();

        switch (operator) {
            case '+':
                numberStack.push(operand1 + operand2);
                break;
            case '-':
                numberStack.push(operand1 - operand2);
                break;
            case '*':
                numberStack.push(operand1 * operand2);
                break;
            case '/':
                numberStack.push(operand1 / operand2);
                break;
        }
    }

    private static boolean hasHigherPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Biểu thức đầu vào
        String expression = "3 + 5 * 10 / 2";

        // Tính toán và in kết quả
        double result = calculateExpression(expression);
        System.out.println("Kết quả của biểu thức là: " + result);
    }
}

