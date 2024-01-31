package rikkei.academy;

import java.util.Stack;

public class PrimeNumberSequenceChecker {
    // Kiểm tra xem một số có phải là số nguyên tố hay không
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Kiểm tra xem chuỗi có phải là dãy số nguyên tố hay không
    public static boolean isPrimeNumberSequence(String input) {
        Stack<Character> charStack = new Stack<>();

        // Duyệt qua từng ký tự trong chuỗi đầu vào
        for (char ch : input.toCharArray()) {
            // Kiểm tra xem ký tự có phải là số hay không
            if (Character.isDigit(ch)) {
                charStack.push(ch);
            }
        }

        // Lấy từng ký tự từ stack và kiểm tra xem chúng có phải là số nguyên tố hay không
        while (!charStack.isEmpty()) {
            int num = Character.getNumericValue(charStack.pop());
            if (!isPrime(num)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Chuỗi đầu vào
        String inputString = "237";

        // Kiểm tra và in kết quả
        boolean result = isPrimeNumberSequence(inputString);
        if (result) {
            System.out.println("Chuỗi là dãy số nguyên tố.");
        } else {
            System.out.println("Chuỗi không phải là dãy số nguyên tố.");
        }
    }
}

